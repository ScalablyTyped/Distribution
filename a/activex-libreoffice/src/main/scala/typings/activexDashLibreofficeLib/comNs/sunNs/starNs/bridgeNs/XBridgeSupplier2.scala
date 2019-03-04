package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for creating bridges to other object models.
  *
  * The created bridges are transparent to the user. That is, if one maps an interface into the target model, then the resulting target interface is a
  * bridge implementation, that is not being noticed by an user. During a call on that interface, the bridge is invoked to convert the arguments and carry
  * out a call according to the rules of the source model. Return values are automatically mapped to the types of the target model.
  *
  * Simple types are mapped to simple target types. That is, there is no additional bridging code involved when those types are being used.
  *
  * Sometimes a bridge cannot be created, depending on whether a programm uses the {@link XBridgeSupplier2} interface remotely. Assuming one wants to
  * bridge an OLE Automation object to UNO by calling createBridge on a proxy, then the UNO remote bridge would not recognise that the Any argument
  * contains an IDispatch interface. Therefore it cannot marshal it as COM requires it and the bridgeing would fail. To prevent this, implementations of
  * this interface should be aware of this scenario and if necessary take the appropriate steps. The process ID argument to the createBridge function
  * represents the calling process and may be used by the implementation to determine if it is being accessed remotely.
  *
  * All objects, whether they are part of the UNO object model or not, are carried in an `any` . The representation of this object is heavily
  * model-dependent and has to be specified in the following list:
  *
  * **UNO:  **: The any carries normal UNO types, which can be any base type, struct, sequence, enum or interface.;
  *
  * **OLE:  **: The any carries an `unsigned long` (on 32-bit systems) or an `unsigned hyper` (on 64-bit systems), which is interpreted as a variant
  * pointer. The any does not control the lifetime of the represented variant. That implies that the caller has the responsibility of freeing the OLE
  * resources represented by the any value.;
  *
  * **JAVA:  **: not specified yet.;
  *
  * **CORBA:  **: not specified yet.
  *
  *
  *
  * Any implementation can supply its own bridges to other object models by implementing this interface and returning the bridge when the method {@link
  * XBridgeSupplier2.createBridge()} is called with itself as the first parameter.
  * @see com.sun.star.bridge.OleBridgeSupplier2
  */
trait XBridgeSupplier2
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** creates a bridge to provide an object of one object model with another. */
  def createBridge(
    aModelDepObject: js.Any,
    aProcessId: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    nSourceModelType: scala.Double,
    nDestModelType: scala.Double
  ): js.Any
}

object XBridgeSupplier2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createBridge: js.Function4[
      js.Any, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Double, 
      scala.Double, 
      js.Any
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBridgeSupplier2 = {
    val __obj = js.Dynamic.literal(acquire = acquire, createBridge = createBridge, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBridgeSupplier2]
  }
}

