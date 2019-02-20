package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated, UNOIDL does not have a union concept.
  * @deprecated Deprecated
  */
trait XUnionTypeDescription extends XTypeDescription {
  /**
    * Returns the default discriminant value.
    * @returns default discriminant value
    */
  val DefaultDiscriminant: js.Any
  /**
    * Returns the type of the default value.
    * @returns type of the default value
    */
  val DefaultMemberType: XTypeDescription
  /**
    * Returns the (ordinal) discriminant type.
    * @returns type of the discriminant
    */
  val DiscriminantType: XTypeDescription
  /**
    * Returns discriminants of all members in order of IDL declaration.
    * @returns discriminants of all members
    */
  val Discriminants: activexDashInteropLib.SafeArray[_]
  /**
    * Returns names of all members in order of IDL declaration.
    * @returns names of all members
    */
  val MemberNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns types of all members in order of IDL declaration.
    * @returns types of all members
    */
  val MemberTypes: activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns the default discriminant value.
    * @returns default discriminant value
    */
  def getDefaultDiscriminant(): js.Any
  /**
    * Returns the type of the default value.
    * @returns type of the default value
    */
  def getDefaultMemberType(): XTypeDescription
  /**
    * Returns the (ordinal) discriminant type.
    * @returns type of the discriminant
    */
  def getDiscriminantType(): XTypeDescription
  /**
    * Returns discriminants of all members in order of IDL declaration.
    * @returns discriminants of all members
    */
  def getDiscriminants(): activexDashInteropLib.SafeArray[_]
  /**
    * Returns names of all members in order of IDL declaration.
    * @returns names of all members
    */
  def getMemberNames(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns types of all members in order of IDL declaration.
    * @returns types of all members
    */
  def getMemberTypes(): activexDashInteropLib.SafeArray[XTypeDescription]
}

