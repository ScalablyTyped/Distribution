package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.connection.XConnection
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** factory to create interprocess bridges. */
trait XBridgeFactory
  extends StObject
     with XInterface {
  
  /** returns the sequence of all named and unnamed UNO interprocess bridges that are instantiated at the time the call is made. */
  val ExistingBridges: SafeArray[XBridge]
  
  /**
    * tries to create a UNO interprocess bridge.
    * @param sName The name of the bridge. This allows other components to reuse an already created bridge (using getBridge). If empty, an anonymous bridge is
    * @param sProtocol The protocol, that will be used on the connection (e.g., urp) plus additional comma separated name=value protocol properties.
    * @param aConnection The connection, which is used to transfer the calls. The bridge expects to own the connection, thus it will close the connection, in
    * @param anInstanceProvider gets called, when a request from remote comes in. You can pass a null reference in case you don't want to export any objects.
    * @throws BridgeExistsException There is already a bridge registered with this name. Use getBridge instead.
    * @throws IllegalArgumentException The protocol is unknown or the connection is null.
    */
  def createBridge(sName: String, sProtocol: String, aConnection: XConnection, anInstanceProvider: XInstanceProvider): XBridge
  
  /**
    * tries to get a bridge by this name.
    *
    * Cannot be retrieved, when the bridge got disposed before.
    * @returns An existing remote bridge or a null reference.
    */
  def getBridge(sName: String): XBridge
  
  /** returns the sequence of all named and unnamed UNO interprocess bridges that are instantiated at the time the call is made. */
  def getExistingBridges(): SafeArray[XBridge]
}
object XBridgeFactory {
  
  inline def apply(
    ExistingBridges: SafeArray[XBridge],
    acquire: () => Unit,
    createBridge: (String, String, XConnection, XInstanceProvider) => XBridge,
    getBridge: String => XBridge,
    getExistingBridges: () => SafeArray[XBridge],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XBridgeFactory = {
    val __obj = js.Dynamic.literal(ExistingBridges = ExistingBridges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createBridge = js.Any.fromFunction4(createBridge), getBridge = js.Any.fromFunction1(getBridge), getExistingBridges = js.Any.fromFunction0(getExistingBridges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBridgeFactory]
  }
  
  extension [Self <: XBridgeFactory](x: Self) {
    
    inline def setCreateBridge(value: (String, String, XConnection, XInstanceProvider) => XBridge): Self = StObject.set(x, "createBridge", js.Any.fromFunction4(value))
    
    inline def setExistingBridges(value: SafeArray[XBridge]): Self = StObject.set(x, "ExistingBridges", value.asInstanceOf[js.Any])
    
    inline def setGetBridge(value: String => XBridge): Self = StObject.set(x, "getBridge", js.Any.fromFunction1(value))
    
    inline def setGetExistingBridges(value: () => SafeArray[XBridge]): Self = StObject.set(x, "getExistingBridges", js.Any.fromFunction0(value))
  }
}
