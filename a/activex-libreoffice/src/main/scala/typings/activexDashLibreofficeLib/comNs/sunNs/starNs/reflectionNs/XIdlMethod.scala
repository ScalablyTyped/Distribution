package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an IDL interface method. */
trait XIdlMethod extends XIdlMember {
  /**
    * Returns the declared exceptions types of the reflected method.
    * @returns declared exception types of reflected method
    */
  val ExceptionTypes: stdLib.SafeArray[XIdlClass[_]]
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
  val ParameterInfos: stdLib.SafeArray[ParamInfo]
  /**
    * Returns the formal parameter types of the reflected method in order of IDL declaration.
    * @returns formal parameter types of reflected method
    */
  val ParameterTypes: stdLib.SafeArray[XIdlClass[_]]
  /**
    * Returns the return type of the reflected method.
    * @returns return type of reflected method
    */
  val ReturnType: XIdlClass[_]
  /**
    * Returns the declared exceptions types of the reflected method.
    * @returns declared exception types of reflected method
    */
  def getExceptionTypes(): stdLib.SafeArray[XIdlClass[_]]
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
  def getParameterInfos(): stdLib.SafeArray[ParamInfo]
  /**
    * Returns the formal parameter types of the reflected method in order of IDL declaration.
    * @returns formal parameter types of reflected method
    */
  def getParameterTypes(): stdLib.SafeArray[XIdlClass[_]]
  /**
    * Returns the return type of the reflected method.
    * @returns return type of reflected method
    */
  def getReturnType(): XIdlClass[_]
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
  def invoke(obj: js.Any, args: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]): js.Any
}

object XIdlMethod {
  @scala.inline
  def apply(
    DeclaringClass: XIdlClass[_],
    ExceptionTypes: stdLib.SafeArray[XIdlClass[_]],
    Mode: MethodMode,
    Name: java.lang.String,
    ParameterInfos: stdLib.SafeArray[ParamInfo],
    ParameterTypes: stdLib.SafeArray[XIdlClass[_]],
    ReturnType: XIdlClass[_],
    acquire: () => scala.Unit,
    getDeclaringClass: () => XIdlClass[_],
    getExceptionTypes: () => stdLib.SafeArray[XIdlClass[_]],
    getMode: () => MethodMode,
    getName: () => java.lang.String,
    getParameterInfos: () => stdLib.SafeArray[ParamInfo],
    getParameterTypes: () => stdLib.SafeArray[XIdlClass[_]],
    getReturnType: () => XIdlClass[_],
    invoke: (js.Any, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XIdlMethod = {
    val __obj = js.Dynamic.literal(DeclaringClass = DeclaringClass, ExceptionTypes = ExceptionTypes, Mode = Mode, Name = Name, ParameterInfos = ParameterInfos, ParameterTypes = ParameterTypes, ReturnType = ReturnType, acquire = js.Any.fromFunction0(acquire), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getExceptionTypes = js.Any.fromFunction0(getExceptionTypes), getMode = js.Any.fromFunction0(getMode), getName = js.Any.fromFunction0(getName), getParameterInfos = js.Any.fromFunction0(getParameterInfos), getParameterTypes = js.Any.fromFunction0(getParameterTypes), getReturnType = js.Any.fromFunction0(getReturnType), invoke = js.Any.fromFunction2(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIdlMethod]
  }
}

