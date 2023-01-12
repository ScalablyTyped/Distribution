package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oleautomation {
  
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
    * is the UNO representation of the Automation type `CY` , also know as `CURRENCY` .
    *
    * A `CY` could actually be represented as `hyper` in UNO and therefore a typedef from `hyper` to a currency type would do. But a typedef cannot be
    * expressed in all language bindings. In the case where no typedefs are supported the actual type is used. That is, a typedef'd currency type would be
    * represented as `long` in Java. The information that the `long` is a currency type is lost.
    *
    * When calling Automation objects from UNO the distinction between `hyper` and a currency type is important. Therefore {@link Currency} is declared as
    * struct.
    * @since OOo 1.1.2
    */
  trait Currency extends StObject {
    
    /** corresponds to the Automation type `CY` . */
    var Value: Double
  }
  object Currency {
    
    inline def apply(Value: Double): Currency = {
      val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is the UNO representation of the Automation type `DATE` .
    *
    * A `DATE` could actually be representd as `double` in UNO and therefore a typedef from `double` to a date type would do. But a typedef cannot be
    * expressed in all language bindings. In the case where no typedefs are supported the actual type is used. That is, a typedef'd date type would be
    * represented as `double` in Java. The information that the `double` is a date type is lost.
    *
    * When calling Automation objects from UNO the distinction between `double` and date type is important. Therefore {@link Date} is declared as struct.
    * @since OOo 1.1.2
    */
  trait Date extends StObject {
    
    /** corresponds to the Automation type `DATE` . */
    var Value: Double
  }
  object Date {
    
    inline def apply(Value: Double): Date = {
      val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is the UNO representation of the Automation type `DECIMAL` .
    * @since OOo 1.1.2
    */
  trait Decimal extends StObject {
    
    /** corresponds to `DECIMAL.Hi32` . */
    var HighValue: Double
    
    /** corresponds to `DECIMAL.Lo32` . */
    var LowValue: Double
    
    /** corresponds to `DECIMAL.Mid32` . */
    var MiddleValue: Double
    
    /** corresponds to `DECIMAL.scale` . */
    var Scale: Double
    
    /** corresponds to `DECIMAL.sign` . */
    var Sign: Double
  }
  object Decimal {
    
    inline def apply(HighValue: Double, LowValue: Double, MiddleValue: Double, Scale: Double, Sign: Double): Decimal = {
      val __obj = js.Dynamic.literal(HighValue = HighValue.asInstanceOf[js.Any], LowValue = LowValue.asInstanceOf[js.Any], MiddleValue = MiddleValue.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], Sign = Sign.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decimal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decimal] (val x: Self) extends AnyVal {
      
      inline def setHighValue(value: Double): Self = StObject.set(x, "HighValue", value.asInstanceOf[js.Any])
      
      inline def setLowValue(value: Double): Self = StObject.set(x, "LowValue", value.asInstanceOf[js.Any])
      
      inline def setMiddleValue(value: Double): Self = StObject.set(x, "MiddleValue", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "Scale", value.asInstanceOf[js.Any])
      
      inline def setSign(value: Double): Self = StObject.set(x, "Sign", value.asInstanceOf[js.Any])
    }
  }
  
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
    * represents a named argument in a call to a method of an Automation object.
    *
    * The Automation bridge accepts values of {@link NamedArgument} when a call to an Automation object is made. The call is done through the {@link
    * com.sun.star.script.XInvocation.invoke()} method, which takes all arguments in a sequence of anys. Usually the order of the arguments must correspond
    * to the order of arguments in the Automation method. By using instances of {@link NamedArgument} the arguments in the sequence can be unordered. The
    * Automation object being called must support named arguments, otherwise the call fails.
    * @since OOo 1.1.2
    */
  trait NamedArgument extends StObject {
    
    /** The name of the argument, for which {@link NamedArgument.Value} is intended. */
    var Name: String
    
    /** The value of the argument whoose name is the one as contained in the member {@link Name} . */
    var Value: Any
  }
  object NamedArgument {
    
    inline def apply(Name: String, Value: Any): NamedArgument = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedArgument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamedArgument] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * contains a value that is used as argument in a "property put&quot operation on a Automation object.
    *
    * If a Automation object is converted into a UNO object by a scripting bridge, such as {@link com.sun.star.bridge.oleautomation.BridgeSupplier} , then
    * it is accessed through the {@link com.sun.star.script.XInvocation} interface. The methods {@link com.sun.star.script.XInvocation.setValue()} and
    * {@link com.sun.star.script.XInvocation.getValue()} are used to access properties which do not have additional arguments. To access a property with
    * additional arguments, the method {@link com.sun.star.script.XInvocation.invoke()} has to be used. The method implementation must decide, if the
    * property is to be written or read so it can perform the proper operation on the Automation object. To make this decision, the caller has to provide
    * the information if the current call is intended to be a write or read operation. This is done by providing either instances of {@link
    * PropertyPutArgument} or PropertyGetArgument as arguments to com::sun::star::script::XInvocation::Invoke.
    * @since OOo 1.1.2
    */
  trait PropertyPutArgument extends StObject {
    
    /** contains the actual argument. */
    var Value: Any
  }
  object PropertyPutArgument {
    
    inline def apply(Value: Any): PropertyPutArgument = {
      val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyPutArgument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyPutArgument] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is the UNO representation of the Automation type SCODE.
    *
    * A `SCODE` is used to express errors in Automation. In UNO it could be represented by a `long` and therefore a typedef from `long` to a particular
    * error type would do. But a typedef cannot be expressed in all language bindings. In the case where no typedefs are supported the actual type is used.
    * That is, a typedef'd error type would be represented as `int` in Java. The information that the `int` is an error type is lost.
    *
    * When calling Automation objects from UNO the distinction between error type and `long` is important. Therefore the Scode is declared as struct.
    * @since OOo 1.1.2
    */
  trait SCode extends StObject {
    
    var Value: Double
  }
  object SCode {
    
    inline def apply(Value: Double): SCode = {
      val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SCode] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
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
