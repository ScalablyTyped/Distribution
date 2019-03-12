package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** factory to create interprocess bridges. */
trait XBridgeFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the sequence of all named and unnamed UNO interprocess bridges that are instantiated at the time the call is made. */
  val ExistingBridges: stdLib.SafeArray[XBridge]
  /**
    * tries to create a UNO interprocess bridge.
    * @param sName The name of the bridge. This allows other components to reuse an already created bridge (using getBridge). If empty, an anonymous bridge is
    * @param sProtocol The protocol, that will be used on the connection (e.g., urp) plus additional comma separated name=value protocol properties.
    * @param aConnection The connection, which is used to transfer the calls. The bridge expects to own the connection, thus it will close the connection, in
    * @param anInstanceProvider gets called, when a request from remote comes in. You can pass a null reference in case you don't want to export any objects.
    * @throws BridgeExistsException There is already a bridge registered with this name. Use getBridge instead.
    * @throws IllegalArgumentException The protocol is unknown or the connection is null.
    */
  def createBridge(
    sName: java.lang.String,
    sProtocol: java.lang.String,
    aConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs.XConnection,
    anInstanceProvider: XInstanceProvider
  ): XBridge
  /**
    * tries to get a bridge by this name.
    *
    * Cannot be retrieved, when the bridge got disposed before.
    * @returns An existing remote bridge or a null reference.
    */
  def getBridge(sName: java.lang.String): XBridge
  /** returns the sequence of all named and unnamed UNO interprocess bridges that are instantiated at the time the call is made. */
  def getExistingBridges(): stdLib.SafeArray[XBridge]
}

object XBridgeFactory {
  @scala.inline
  def apply(
    ExistingBridges: stdLib.SafeArray[XBridge],
    acquire: () => scala.Unit,
    createBridge: (java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs.XConnection, XInstanceProvider) => XBridge,
    getBridge: java.lang.String => XBridge,
    getExistingBridges: () => stdLib.SafeArray[XBridge],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XBridgeFactory = {
    val __obj = js.Dynamic.literal(ExistingBridges = ExistingBridges, acquire = js.Any.fromFunction0(acquire), createBridge = js.Any.fromFunction4(createBridge), getBridge = js.Any.fromFunction1(getBridge), getExistingBridges = js.Any.fromFunction0(getExistingBridges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBridgeFactory]
  }
}

