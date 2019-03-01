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

object XUnionTypeDescription {
  @scala.inline
  def apply(
    DefaultDiscriminant: js.Any,
    DefaultMemberType: XTypeDescription,
    DiscriminantType: XTypeDescription,
    Discriminants: activexDashInteropLib.SafeArray[_],
    MemberNames: activexDashInteropLib.SafeArray[java.lang.String],
    MemberTypes: activexDashInteropLib.SafeArray[XTypeDescription],
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getDefaultDiscriminant: js.Function0[js.Any],
    getDefaultMemberType: js.Function0[XTypeDescription],
    getDiscriminantType: js.Function0[XTypeDescription],
    getDiscriminants: js.Function0[activexDashInteropLib.SafeArray[_]],
    getMemberNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getMemberTypes: js.Function0[activexDashInteropLib.SafeArray[XTypeDescription]],
    getName: js.Function0[java.lang.String],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUnionTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultDiscriminant")(DefaultDiscriminant)
    __obj.updateDynamic("DefaultMemberType")(DefaultMemberType)
    __obj.updateDynamic("DiscriminantType")(DiscriminantType)
    __obj.updateDynamic("Discriminants")(Discriminants)
    __obj.updateDynamic("MemberNames")(MemberNames)
    __obj.updateDynamic("MemberTypes")(MemberTypes)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDefaultDiscriminant")(getDefaultDiscriminant)
    __obj.updateDynamic("getDefaultMemberType")(getDefaultMemberType)
    __obj.updateDynamic("getDiscriminantType")(getDiscriminantType)
    __obj.updateDynamic("getDiscriminants")(getDiscriminants)
    __obj.updateDynamic("getMemberNames")(getMemberNames)
    __obj.updateDynamic("getMemberTypes")(getMemberTypes)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XUnionTypeDescription]
  }
}

