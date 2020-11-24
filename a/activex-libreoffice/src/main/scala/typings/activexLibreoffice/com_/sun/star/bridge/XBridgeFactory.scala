package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.connection.XConnection
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** factory to create interprocess bridges. */
@js.native
trait XBridgeFactory extends XInterface {
  
  /** returns the sequence of all named and unnamed UNO interprocess bridges that are instantiated at the time the call is made. */
  val ExistingBridges: SafeArray[XBridge] = js.native
  
  /**
    * tries to create a UNO interprocess bridge.
    * @param sName The name of the bridge. This allows other components to reuse an already created bridge (using getBridge). If empty, an anonymous bridge is
    * @param sProtocol The protocol, that will be used on the connection (e.g., urp) plus additional comma separated name=value protocol properties.
    * @param aConnection The connection, which is used to transfer the calls. The bridge expects to own the connection, thus it will close the connection, in
    * @param anInstanceProvider gets called, when a request from remote comes in. You can pass a null reference in case you don't want to export any objects.
    * @throws BridgeExistsException There is already a bridge registered with this name. Use getBridge instead.
    * @throws IllegalArgumentException The protocol is unknown or the connection is null.
    */
  def createBridge(sName: String, sProtocol: String, aConnection: XConnection, anInstanceProvider: XInstanceProvider): XBridge = js.native
  
  /**
    * tries to get a bridge by this name.
    *
    * Cannot be retrieved, when the bridge got disposed before.
    * @returns An existing remote bridge or a null reference.
    */
  def getBridge(sName: String): XBridge = js.native
  
  /** returns the sequence of all named and unnamed UNO interprocess bridges that are instantiated at the time the call is made. */
  def getExistingBridges(): SafeArray[XBridge] = js.native
}
object XBridgeFactory {
  
  @scala.inline
  def apply(
    ExistingBridges: SafeArray[XBridge],
    acquire: () => Unit,
    createBridge: (String, String, XConnection, XInstanceProvider) => XBridge,
    getBridge: String => XBridge,
    getExistingBridges: () => SafeArray[XBridge],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBridgeFactory = {
    val __obj = js.Dynamic.literal(ExistingBridges = ExistingBridges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createBridge = js.Any.fromFunction4(createBridge), getBridge = js.Any.fromFunction1(getBridge), getExistingBridges = js.Any.fromFunction0(getExistingBridges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBridgeFactory]
  }
  
  @scala.inline
  implicit class XBridgeFactoryOps[Self <: XBridgeFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExistingBridges(value: SafeArray[XBridge]): Self = this.set("ExistingBridges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateBridge(value: (String, String, XConnection, XInstanceProvider) => XBridge): Self = this.set("createBridge", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetBridge(value: String => XBridge): Self = this.set("getBridge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExistingBridges(value: () => SafeArray[XBridge]): Self = this.set("getExistingBridges", js.Any.fromFunction0(value))
  }
}
