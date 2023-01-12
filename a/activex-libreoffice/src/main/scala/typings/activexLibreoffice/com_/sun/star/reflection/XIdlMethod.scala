package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects an IDL interface method. */
trait XIdlMethod
  extends StObject
     with XIdlMember {
  
  /**
    * Returns the declared exceptions types of the reflected method.
    * @returns declared exception types of reflected method
    */
  val ExceptionTypes: SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the method mode in which calls are run, i.e. either oneway or twoway. Method mode oneway denotes that a call may be run asynchronously (thus
    * having no out parameters or return value)
    * @returns method mode of reflected method
    */
  val Mode: MethodMode
  
  /**
    * Returns formal parameter information of the reflected method in order of IDL declaration. Parameter information reflects the parameter's access mode
    * (in, out, inout), the parameter's name and formal type.
    * @returns parameter information of reflected method
    */
  val ParameterInfos: SafeArray[ParamInfo]
  
  /**
    * Returns the formal parameter types of the reflected method in order of IDL declaration.
    * @returns formal parameter types of reflected method
    */
  val ParameterTypes: SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the return type of the reflected method.
    * @returns return type of reflected method
    */
  val ReturnType: XIdlClass[Any]
  
  /**
    * Returns the declared exceptions types of the reflected method.
    * @returns declared exception types of reflected method
    */
  def getExceptionTypes(): SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the method mode in which calls are run, i.e. either oneway or twoway. Method mode oneway denotes that a call may be run asynchronously (thus
    * having no out parameters or return value)
    * @returns method mode of reflected method
    */
  def getMode(): MethodMode
  
  /**
    * Returns formal parameter information of the reflected method in order of IDL declaration. Parameter information reflects the parameter's access mode
    * (in, out, inout), the parameter's name and formal type.
    * @returns parameter information of reflected method
    */
  def getParameterInfos(): SafeArray[ParamInfo]
  
  /**
    * Returns the formal parameter types of the reflected method in order of IDL declaration.
    * @returns formal parameter types of reflected method
    */
  def getParameterTypes(): SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the return type of the reflected method.
    * @returns return type of reflected method
    */
  def getReturnType(): XIdlClass[Any]
  
  /**
    * Invokes the reflected method on a given object with the given parameters. The parameters may be widening converted to fit their exact IDL type,
    * meaning no loss of information.
    * @param obj object to call on
    * @param args arguments passed to the method
    * @returns return value of the method call (may be empty for methods returning void)
    * @throws IllegalArgumentException if the given object is a nuull reference or does not support the reflected method's interface
    * @throws IllegalArgumentException if the given number of arguments differ from the expected number or the given arguments' types differ from the expected
    * @throws InvocationTargetException if the reflected method that has been invoked has thrown an exception. The original exception will be wrapped up and si
    */
  def invoke(obj: Any, args: js.Array[SeqEquiv[Any]]): Any
}
object XIdlMethod {
  
  inline def apply(
    DeclaringClass: XIdlClass[Any],
    ExceptionTypes: SafeArray[XIdlClass[Any]],
    Mode: MethodMode,
    Name: String,
    ParameterInfos: SafeArray[ParamInfo],
    ParameterTypes: SafeArray[XIdlClass[Any]],
    ReturnType: XIdlClass[Any],
    acquire: () => Unit,
    getDeclaringClass: () => XIdlClass[Any],
    getExceptionTypes: () => SafeArray[XIdlClass[Any]],
    getMode: () => MethodMode,
    getName: () => String,
    getParameterInfos: () => SafeArray[ParamInfo],
    getParameterTypes: () => SafeArray[XIdlClass[Any]],
    getReturnType: () => XIdlClass[Any],
    invoke: (Any, js.Array[SeqEquiv[Any]]) => Any,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XIdlMethod = {
    val __obj = js.Dynamic.literal(DeclaringClass = DeclaringClass.asInstanceOf[js.Any], ExceptionTypes = ExceptionTypes.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParameterInfos = ParameterInfos.asInstanceOf[js.Any], ParameterTypes = ParameterTypes.asInstanceOf[js.Any], ReturnType = ReturnType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getExceptionTypes = js.Any.fromFunction0(getExceptionTypes), getMode = js.Any.fromFunction0(getMode), getName = js.Any.fromFunction0(getName), getParameterInfos = js.Any.fromFunction0(getParameterInfos), getParameterTypes = js.Any.fromFunction0(getParameterTypes), getReturnType = js.Any.fromFunction0(getReturnType), invoke = js.Any.fromFunction2(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdlMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XIdlMethod] (val x: Self) extends AnyVal {
    
    inline def setExceptionTypes(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "ExceptionTypes", value.asInstanceOf[js.Any])
    
    inline def setGetExceptionTypes(value: () => SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "getExceptionTypes", js.Any.fromFunction0(value))
    
    inline def setGetMode(value: () => MethodMode): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
    
    inline def setGetParameterInfos(value: () => SafeArray[ParamInfo]): Self = StObject.set(x, "getParameterInfos", js.Any.fromFunction0(value))
    
    inline def setGetParameterTypes(value: () => SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "getParameterTypes", js.Any.fromFunction0(value))
    
    inline def setGetReturnType(value: () => XIdlClass[Any]): Self = StObject.set(x, "getReturnType", js.Any.fromFunction0(value))
    
    inline def setInvoke(value: (Any, js.Array[SeqEquiv[Any]]) => Any): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
    
    inline def setMode(value: MethodMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setParameterInfos(value: SafeArray[ParamInfo]): Self = StObject.set(x, "ParameterInfos", value.asInstanceOf[js.Any])
    
    inline def setParameterTypes(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "ParameterTypes", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: XIdlClass[Any]): Self = StObject.set(x, "ReturnType", value.asInstanceOf[js.Any])
  }
}
