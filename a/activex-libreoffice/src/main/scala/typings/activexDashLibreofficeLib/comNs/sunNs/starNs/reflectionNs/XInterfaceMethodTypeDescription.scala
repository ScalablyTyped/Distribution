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

