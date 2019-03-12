package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an interface method type. The type class of this type is TypeClass_INTERFACE_METHOD. */
trait XInterfaceMethodTypeDescription extends XInterfaceMemberTypeDescription {
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  val Exceptions: stdLib.SafeArray[XTypeDescription]
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  val Parameters: stdLib.SafeArray[XMethodParameter]
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  val ReturnType: XTypeDescription
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  def getExceptions(): stdLib.SafeArray[XTypeDescription]
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  def getParameters(): stdLib.SafeArray[XMethodParameter]
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  def getReturnType(): XTypeDescription
  /**
    * Returns true, if this method is declared oneway.
    * @returns true, if this method is declared oneway
    */
  def isOneway(): scala.Boolean
}

object XInterfaceMethodTypeDescription {
  @scala.inline
  def apply(
    Exceptions: stdLib.SafeArray[XTypeDescription],
    MemberName: java.lang.String,
    Name: java.lang.String,
    Parameters: stdLib.SafeArray[XMethodParameter],
    Position: scala.Double,
    ReturnType: XTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: () => scala.Unit,
    getExceptions: () => stdLib.SafeArray[XTypeDescription],
    getMemberName: () => java.lang.String,
    getName: () => java.lang.String,
    getParameters: () => stdLib.SafeArray[XMethodParameter],
    getPosition: () => scala.Double,
    getReturnType: () => XTypeDescription,
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    isOneway: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XInterfaceMethodTypeDescription = {
    val __obj = js.Dynamic.literal(Exceptions = Exceptions, MemberName = MemberName, Name = Name, Parameters = Parameters, Position = Position, ReturnType = ReturnType, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getExceptions = js.Any.fromFunction0(getExceptions), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getParameters = js.Any.fromFunction0(getParameters), getPosition = js.Any.fromFunction0(getPosition), getReturnType = js.Any.fromFunction0(getReturnType), getTypeClass = js.Any.fromFunction0(getTypeClass), isOneway = js.Any.fromFunction0(isOneway), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInterfaceMethodTypeDescription]
  }
}

