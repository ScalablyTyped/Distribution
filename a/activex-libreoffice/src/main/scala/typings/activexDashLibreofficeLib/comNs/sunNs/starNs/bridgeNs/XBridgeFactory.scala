package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** factory to create interprocess bridges. */
trait XBridgeFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the sequence of all named and unnamed UNO interprocess bridges that are instantiated at the time the call is made. */
  val ExistingBridges: activexDashInteropLib.SafeArray[XBridge]
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
  def getExistingBridges(): activexDashInteropLib.SafeArray[XBridge]
}

