package typings.activexDashLibreoffice.comNs.sunNs.starNs.bridgeNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.bridgeNs.XBridgeSupplier2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oleautomationNs {
  /**
    * registers UNO objects as COM objects.
    *
    * That is, COM class factories are registered with COM at runtime. The required EXE server is the application which deploys this service. In order to
    * access the factories by COM API functions, there need to be proper registry entries. This service does not provide for writing those entries.
    *
    * The instantiation of the registered objects can be carried out by any ordinary mechanism which is used in a certain language to create COM components.
    * For example, `CreateObject` in Visual Basic, `CoCreateInstance` in C++.
    *
    * Currently only a factory for the service {@link com.sun.star.lang.MultiServiceFactory} is registered by this service. The CLSID is
    * {82154420-0FBF-11d4-8313-005004526AB4} and the ProgId is com.sun.star.ServiceManager.
    *
    * {@link ApplicationRegistration} does not provide any particular interface because the UNO objects are registered while instantiating this service and
    * deregistered if the implementation, which makes use of this service, is being released.
    */
  type ApplicationRegistration = XInterface
  /**
    * maps UNO types to oleautomation types and vice versa.
    *
    * The function {@link com.sun.star.bridge.XBridgeSupplier2.createBridge()} maps a value of a UNO or Automation type to the desired target type. If a UNO
    * interface was mapped to `IDispatch` , then all objects (interfaces, structs) and other types which are obtained from that Automation object are
    * automatically mapped to the corresponding Automation types. Hence, if one provides an initial object which forms the root of all other objects, such
    * as a service manager, then only that object needs to be explicitly mapped by a call to {@link com.sun.star.bridge.XBridgeSupplier2.createBridge()} .
    * The same holds true if an automation object is mapped to an UNO interface.
    *
    * For Automation objects to be mapped they have to implement `IDispatch` interface. Other COM interfaces, except for `IUnknown` , are not supported. UNO
    * interfaces and structs are mapped to `IDispatch` .
    *
    * The service implements the {@link com.sun.star.bridge.XBridgeSupplier2} interface and handles the model types {@link
    * com.sun.star.bridge.ModelDependent.UNO} and {@link com.sun.star.bridge.ModelDependent.OLE} . The service does not specify any requirements for
    * registering OLE objects and class factories.
    */
  type BridgeSupplier = XBridgeSupplier2
  /**
    * makes it possible to create COM objects as UNO objects.
    *
    * A COM object must have a ProgId since the ProgId is used as argument for {@link com.sun.star.lang.XMultiServiceFactory.createInstance()} . The only
    * interfaces which are mapped are `IUnknown` and `IDispatch` . The created UNO objects support {@link com.sun.star.script.XInvocation} if the original
    * COM objects support `IDispatch` .
    *
    * The optional parameters of the method {@link com.sun.star.lang.XMultiServiceFactory.createInstanceWithArguments()} are reserved for future use; at
    * this time they are ignored.
    */
  type Factory = XMultiServiceFactory
  /**
    * a tagging interface for UNO objects which represent Automation objects.
    *
    * If a Automation object is bridged into the UNO environment, then the resulting UNO object does not distinguish itself from any other ordinary UNO
    * object. However, it may be desirable to have that distinction regardless, if a UNO client needs to take particular Automation specific characteristics
    * into account. By providing {@link XAutomationObject} an object declares to be representing an Automation object.
    * @since OOo 1.1.2
    */
  type XAutomationObject = XInterface
}
