package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an enum type. */
trait XEnumTypeDescription extends XTypeDescription {
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  val DefaultEnumValue: scala.Double
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  val EnumNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  val EnumValues: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  def getDefaultEnumValue(): scala.Double
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  def getEnumNames(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  def getEnumValues(): activexDashInteropLib.SafeArray[scala.Double]
}

object XEnumTypeDescription {
  @scala.inline
  def apply(
    DefaultEnumValue: scala.Double,
    EnumNames: activexDashInteropLib.SafeArray[java.lang.String],
    EnumValues: activexDashInteropLib.SafeArray[scala.Double],
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getDefaultEnumValue: js.Function0[scala.Double],
    getEnumNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getEnumValues: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getName: js.Function0[java.lang.String],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEnumTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultEnumValue")(DefaultEnumValue)
    __obj.updateDynamic("EnumNames")(EnumNames)
    __obj.updateDynamic("EnumValues")(EnumValues)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDefaultEnumValue")(getDefaultEnumValue)
    __obj.updateDynamic("getEnumNames")(getEnumNames)
    __obj.updateDynamic("getEnumValues")(getEnumValues)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XEnumTypeDescription]
  }
}

