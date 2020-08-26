package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an interface method type. The type class of this type is TypeClass_INTERFACE_METHOD. */
@js.native
trait XInterfaceMethodTypeDescription extends XInterfaceMemberTypeDescription {
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  val Exceptions: SafeArray[XTypeDescription] = js.native
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  val Parameters: SafeArray[XMethodParameter] = js.native
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  val ReturnType: XTypeDescription = js.native
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  def getExceptions(): SafeArray[XTypeDescription] = js.native
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  def getParameters(): SafeArray[XMethodParameter] = js.native
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  def getReturnType(): XTypeDescription = js.native
  /**
    * Returns true, if this method is declared oneway.
    * @returns true, if this method is declared oneway
    */
  def isOneway(): Boolean = js.native
}

object XInterfaceMethodTypeDescription {
  @scala.inline
  def apply(
    Exceptions: SafeArray[XTypeDescription],
    MemberName: String,
    Name: String,
    Parameters: SafeArray[XMethodParameter],
    Position: Double,
    ReturnType: XTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getExceptions: () => SafeArray[XTypeDescription],
    getMemberName: () => String,
    getName: () => String,
    getParameters: () => SafeArray[XMethodParameter],
    getPosition: () => Double,
    getReturnType: () => XTypeDescription,
    getTypeClass: () => TypeClass,
    isOneway: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInterfaceMethodTypeDescription = {
    val __obj = js.Dynamic.literal(Exceptions = Exceptions.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], ReturnType = ReturnType.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getExceptions = js.Any.fromFunction0(getExceptions), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getParameters = js.Any.fromFunction0(getParameters), getPosition = js.Any.fromFunction0(getPosition), getReturnType = js.Any.fromFunction0(getReturnType), getTypeClass = js.Any.fromFunction0(getTypeClass), isOneway = js.Any.fromFunction0(isOneway), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterfaceMethodTypeDescription]
  }
  @scala.inline
  implicit class XInterfaceMethodTypeDescriptionOps[Self <: XInterfaceMethodTypeDescription] (val x: Self) extends AnyVal {
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
    def setExceptions(value: SafeArray[XTypeDescription]): Self = this.set("Exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: SafeArray[XMethodParameter]): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: XTypeDescription): Self = this.set("ReturnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetExceptions(value: () => SafeArray[XTypeDescription]): Self = this.set("getExceptions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameters(value: () => SafeArray[XMethodParameter]): Self = this.set("getParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setGetReturnType(value: () => XTypeDescription): Self = this.set("getReturnType", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOneway(value: () => Boolean): Self = this.set("isOneway", js.Any.fromFunction0(value))
  }
  
}

