package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.Uik
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the interface for creating bridges to other object models.
  *
  * Because bridges sometimes can not be generated in an address space, the implementation needs to check the address space of the caller by comparing the
  * machine and process ID against its own. These IDs are provided by the UNO runtime.
  *
  * All objects, whether they are part of the UNO object model or not, are carried in an `any` . The representation of this object is heavily
  * model-dependent and has to be specified in the following list:
  *
  * **UNO:  **: The any carries normal UNO types, which can be any base type, struct, sequence, enum, or interface.;
  *
  * **OLE:  **: The any carries an `unsigned long` (on 32-bit systems) or an `unsigned hyper` (on 64-bit systems), which is interpreted as a variant
  * pointer. The any does not control the lifetime of the represented variant. That implies that the caller has the responsibility of freeing the OLE
  * resources represented by the any value.;
  *
  * **JAVA:  **: not yet specified.;
  *
  * **CORBA:  **: not yet specified.
  *
  *
  *
  * Any implementation can supply its own bridges to other object models by implementing this interface and returning the bridge when the method is called
  * with itself as the first parameter.
  * @deprecated Deprecated
  * @see com.sun.star.bridge.OleBridgeSupplier
  */
@js.native
trait XBridgeSupplier extends XInterface {
  
  /** creates a bridge to provide an object of one object model with another. */
  def createBridge(
    modelDepObject: js.Any,
    MachineId: Uik,
    ProcessId: Double,
    sourceModelType: Double,
    destModelType: Double
  ): js.Any = js.native
}
object XBridgeSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createBridge: (js.Any, Uik, Double, Double, Double) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBridgeSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createBridge = js.Any.fromFunction5(createBridge), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBridgeSupplier]
  }
  
  @scala.inline
  implicit class XBridgeSupplierOps[Self <: XBridgeSupplier] (val x: Self) extends AnyVal {
    
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
    def setCreateBridge(value: (js.Any, Uik, Double, Double, Double) => js.Any): Self = this.set("createBridge", js.Any.fromFunction5(value))
  }
}
