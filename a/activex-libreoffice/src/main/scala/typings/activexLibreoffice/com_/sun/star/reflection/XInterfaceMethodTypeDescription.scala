package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an interface method type. The type class of this type is TypeClass_INTERFACE_METHOD. */
trait XInterfaceMethodTypeDescription extends XInterfaceMemberTypeDescription {
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  val Exceptions: SafeArray[XTypeDescription]
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  val Parameters: SafeArray[XMethodParameter]
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  val ReturnType: XTypeDescription
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  def getExceptions(): SafeArray[XTypeDescription]
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  def getParameters(): SafeArray[XMethodParameter]
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  def getReturnType(): XTypeDescription
  /**
    * Returns true, if this method is declared oneway.
    * @returns true, if this method is declared oneway
    */
  def isOneway(): Boolean
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
}

