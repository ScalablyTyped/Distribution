package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an interface attribute type.
  *
  * This type is superseded by {@link XInterfaceAttributeTypeDescription2} , which supports extended attributes.
  *
  * The type class of this type is TypeClass_INTERFACE_ATTRIBUTE.
  */
trait XInterfaceAttributeTypeDescription extends XInterfaceMemberTypeDescription {
  /**
    * Returns the type of the attribute.
    * @returns type of attribute
    */
  val Type: XTypeDescription
  /**
    * Returns the type of the attribute.
    * @returns type of attribute
    */
  def getType(): XTypeDescription
  /**
    * Returns true, if this attribute is read-only.
    * @returns true, if attribute is read-only
    */
  def isReadOnly(): scala.Boolean
}

object XInterfaceAttributeTypeDescription {
  @scala.inline
  def apply(
    MemberName: java.lang.String,
    Name: java.lang.String,
    Position: scala.Double,
    Type: XTypeDescription,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getMemberName: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[scala.Double],
    getType: js.Function0[XTypeDescription],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    isReadOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInterfaceAttributeTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MemberName")(MemberName)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMemberName")(getMemberName)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription]
  }
}

