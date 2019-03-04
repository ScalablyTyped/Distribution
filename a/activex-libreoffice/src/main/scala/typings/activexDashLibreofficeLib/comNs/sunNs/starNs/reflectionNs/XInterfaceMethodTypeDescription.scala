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
  val Exceptions: activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  val Parameters: activexDashInteropLib.SafeArray[XMethodParameter]
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  val ReturnType: XTypeDescription
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  def getExceptions(): activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  def getParameters(): activexDashInteropLib.SafeArray[XMethodParameter]
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
    Exceptions: activexDashInteropLib.SafeArray[XTypeDescription],
    MemberName: java.lang.String,
    Name: java.lang.String,
    Parameters: activexDashInteropLib.SafeArray[XMethodParameter],
    Position: scala.Double,
    ReturnType: XTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getExceptions: js.Function0[activexDashInteropLib.SafeArray[XTypeDescription]],
    getMemberName: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParameters: js.Function0[activexDashInteropLib.SafeArray[XMethodParameter]],
    getPosition: js.Function0[scala.Double],
    getReturnType: js.Function0[XTypeDescription],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    isOneway: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInterfaceMethodTypeDescription = {
    val __obj = js.Dynamic.literal(Exceptions = Exceptions, MemberName = MemberName, Name = Name, Parameters = Parameters, Position = Position, ReturnType = ReturnType, TypeClass = TypeClass, acquire = acquire, getExceptions = getExceptions, getMemberName = getMemberName, getName = getName, getParameters = getParameters, getPosition = getPosition, getReturnType = getReturnType, getTypeClass = getTypeClass, isOneway = isOneway, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInterfaceMethodTypeDescription]
  }
}

