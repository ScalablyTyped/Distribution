package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Indicates, that it was tried to create a remote bridge with a name, which already existed. */
type BridgeExistsException = Exception

/**
  * allows to create new or access existing interprocess bridges.
  *
  * It enumerates at the servicemanager all services supporting the meta service {@link com.sun.star.bridge.Bridge} to get all known, possible protocols.
  * @see com.sun.star.bridge.Bridge
  */
type BridgeFactory = XBridgeFactory2

/**
  * registers UNO objects as COM objects.
  *
  * That is, COM class factories are registered with COM at runtime. The required EXE server is the application which deploys this service. In order to
  * access the factories by COM API functions, there need to be proper registry entries. This service does not provide for writing those entries.
  *
  * The instantiation of the registered objects can be carried out by any ordinary mechanism which is used in a certain language to create COM components.
  * For example, CreateObject in Visual Basic, CoCreateInstance in C++.
  *
  * Currently only a factory for the service com.sun.star.long.MultiServiceFactory is registered by this service. The CLSID is
  * {82154420-0FBF-11d4-8313-005004526AB4} and the ProgId is com.sun.star.ServiceManager.
  *
  * {@link OleApplicationRegistration} does not provide any particular interface because the UNO objects are registered while instantiating this service
  * and deregistered if the implementation, which makes use of this service, is being released.
  * @deprecated Deprecated
  */
type OleApplicationRegistration = XInterface

/**
  * makes it possible to generate OLE bridges to UNO objects and vice versa.
  *
  * The service implements the {@link XBridgeSupplier} interface and handles the model types {@link ModelDependent.UNO} and {@link ModelDependent.OLE} .
  * The service does not specify any requirements on registering OLE objects and class factories.
  * @deprecated Deprecated
  */
type OleBridgeSupplier = XBridgeSupplier

/**
  * maps UNO types to oleautomation types and vice versa.
  *
  * The {@link XBridgeSupplier2} interface provides the function `createBridge` which maps a value of an UNO or Automation type to the desired target
  * type. If an UNO interface was mapped to IDispatch, then all objects (interfaces, structs) and other types which are obtained from that Automation
  * object are automatically mapped to the corresponding Automation types. Hence, if one provides an initial object which forms the root of all other
  * objects, such as a service manager, then only that object needs to be explicitly mapped by a call to `createBridge` . The same holds true if an
  * automation object is mapped to an UNO interface. ;
  *
  * The Automation types `VT_CY` and `VT_DATE` are not supported. For Automation objects to be mapped they have to implement IDispatch interface. Other
  * COM interfaces, except for IUnknown, are not supported.UNO interfaces and structs are mapped to IDispatch.
  *
  * The service implements the {@link XBridgeSupplier2} interface and handles the model types {@link com.sun.star.bridge.ModelDependent.UNO} and {@link
  * com.sun.star.bridge.ModelDependent.OLE} . The service does not specify any requirements for registering OLE objects and class factories.
  * @deprecated Deprecated
  */
type OleBridgeSupplier2 = XBridgeSupplier2

/**
  * maps UNO types to COM types and vice versa. It is optimized for use in a remote szenario.
  *
  * The functionality is basically the same as {@link com.sun.star.bridge.OleBridgeSupplier2} . However, the implementation should be optimized for remote
  * access. For example, it could try to reduce the calls into the remote process. Also it could create components on its own behalf in the remote
  * process, if this increases performance.
  * @deprecated Deprecated
  */
type OleBridgeSupplierVar1 = OleBridgeSupplier2

/**
  * makes it possible to create COM objects as UNO objects.
  *
  * A COM object must have a ProgId since the ProgId is used as argument for XMultiServiceFactory::createInstance. The only interfaces which are mapped
  * are `IUnknown` and `IDispatch` . The created UNO objects support {@link com.sun.star.script.XInvocation} if the original COM objects support
  * IDispatch.
  *
  * The optional parameters of the method {@link com.sun.star.lang.XMultiServiceFactory.createInstanceWithArguments()} are reserved for future use; at
  * this time they are ignored.
  * @deprecated Deprecated
  */
type OleObjectFactory = XMultiServiceFactory

/** provides the ability to access remote processes, resolving them by an UNO url. ; */
type UnoUrlResolver = XUnoUrlResolver
