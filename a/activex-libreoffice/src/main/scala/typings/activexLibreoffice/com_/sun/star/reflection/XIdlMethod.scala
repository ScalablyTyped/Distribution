package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an IDL interface method. */
@js.native
trait XIdlMethod extends XIdlMember {
  /**
    * Returns the declared exceptions types of the reflected method.
    * @returns declared exception types of reflected method
    */
  val ExceptionTypes: SafeArray[XIdlClass[_]] = js.native
  /**
    * Returns the method mode in which calls are run, i.e. either oneway or twoway. Method mode oneway denotes that a call may be run asynchronously (thus
    * having no out parameters or return value)
    * @returns method mode of reflected method
    */
  val Mode: MethodMode = js.native
  /**
    * Returns formal parameter information of the reflected method in order of IDL declaration. Parameter information reflects the parameter's access mode
    * (in, out, inout), the parameter's name and formal type.
    * @returns parameter information of reflected method
    */
  val ParameterInfos: SafeArray[ParamInfo] = js.native
  /**
    * Returns the formal parameter types of the reflected method in order of IDL declaration.
    * @returns formal parameter types of reflected method
    */
  val ParameterTypes: SafeArray[XIdlClass[_]] = js.native
  /**
    * Returns the return type of the reflected method.
    * @returns return type of reflected method
    */
  val ReturnType: XIdlClass[_] = js.native
  /**
    * Returns the declared exceptions types of the reflected method.
    * @returns declared exception types of reflected method
    */
  def getExceptionTypes(): SafeArray[XIdlClass[_]] = js.native
  /**
    * Returns the method mode in which calls are run, i.e. either oneway or twoway. Method mode oneway denotes that a call may be run asynchronously (thus
    * having no out parameters or return value)
    * @returns method mode of reflected method
    */
  def getMode(): MethodMode = js.native
  /**
    * Returns formal parameter information of the reflected method in order of IDL declaration. Parameter information reflects the parameter's access mode
    * (in, out, inout), the parameter's name and formal type.
    * @returns parameter information of reflected method
    */
  def getParameterInfos(): SafeArray[ParamInfo] = js.native
  /**
    * Returns the formal parameter types of the reflected method in order of IDL declaration.
    * @returns formal parameter types of reflected method
    */
  def getParameterTypes(): SafeArray[XIdlClass[_]] = js.native
  /**
    * Returns the return type of the reflected method.
    * @returns return type of reflected method
    */
  def getReturnType(): XIdlClass[_] = js.native
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
  def invoke(obj: js.Any, args: js.Array[SeqEquiv[_]]): js.Any = js.native
}

object XIdlMethod {
  @scala.inline
  def apply(
    DeclaringClass: XIdlClass[_],
    ExceptionTypes: SafeArray[XIdlClass[_]],
    Mode: MethodMode,
    Name: String,
    ParameterInfos: SafeArray[ParamInfo],
    ParameterTypes: SafeArray[XIdlClass[_]],
    ReturnType: XIdlClass[_],
    acquire: () => Unit,
    getDeclaringClass: () => XIdlClass[_],
    getExceptionTypes: () => SafeArray[XIdlClass[_]],
    getMode: () => MethodMode,
    getName: () => String,
    getParameterInfos: () => SafeArray[ParamInfo],
    getParameterTypes: () => SafeArray[XIdlClass[_]],
    getReturnType: () => XIdlClass[_],
    invoke: (js.Any, js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIdlMethod = {
    val __obj = js.Dynamic.literal(DeclaringClass = DeclaringClass.asInstanceOf[js.Any], ExceptionTypes = ExceptionTypes.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParameterInfos = ParameterInfos.asInstanceOf[js.Any], ParameterTypes = ParameterTypes.asInstanceOf[js.Any], ReturnType = ReturnType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getExceptionTypes = js.Any.fromFunction0(getExceptionTypes), getMode = js.Any.fromFunction0(getMode), getName = js.Any.fromFunction0(getName), getParameterInfos = js.Any.fromFunction0(getParameterInfos), getParameterTypes = js.Any.fromFunction0(getParameterTypes), getReturnType = js.Any.fromFunction0(getReturnType), invoke = js.Any.fromFunction2(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIdlMethod]
  }
  @scala.inline
  implicit class XIdlMethodOps[Self <: XIdlMethod] (val x: Self) extends AnyVal {
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
    def setExceptionTypes(value: SafeArray[XIdlClass[_]]): Self = this.set("ExceptionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: MethodMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterInfos(value: SafeArray[ParamInfo]): Self = this.set("ParameterInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterTypes(value: SafeArray[XIdlClass[_]]): Self = this.set("ParameterTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: XIdlClass[_]): Self = this.set("ReturnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetExceptionTypes(value: () => SafeArray[XIdlClass[_]]): Self = this.set("getExceptionTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMode(value: () => MethodMode): Self = this.set("getMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameterInfos(value: () => SafeArray[ParamInfo]): Self = this.set("getParameterInfos", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameterTypes(value: () => SafeArray[XIdlClass[_]]): Self = this.set("getParameterTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetReturnType(value: () => XIdlClass[_]): Self = this.set("getReturnType", js.Any.fromFunction0(value))
    @scala.inline
    def setInvoke(value: (js.Any, js.Array[SeqEquiv[_]]) => js.Any): Self = this.set("invoke", js.Any.fromFunction2(value))
  }
  
}

