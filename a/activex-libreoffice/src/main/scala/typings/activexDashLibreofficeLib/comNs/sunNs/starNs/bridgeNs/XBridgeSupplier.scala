package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait XBridgeSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** creates a bridge to provide an object of one object model with another. */
  def createBridge(
    modelDepObject: js.Any,
    MachineId: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik,
    ProcessId: scala.Double,
    sourceModelType: scala.Double,
    destModelType: scala.Double
  ): js.Any
}

object XBridgeSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createBridge: js.Function5[
      js.Any, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Any
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBridgeSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire, createBridge = createBridge, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBridgeSupplier]
  }
}

