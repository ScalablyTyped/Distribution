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
    val __obj = js.Dynamic.literal(DefaultEnumValue = DefaultEnumValue, EnumNames = EnumNames, EnumValues = EnumValues, Name = Name, TypeClass = TypeClass, acquire = acquire, getDefaultEnumValue = getDefaultEnumValue, getEnumNames = getEnumNames, getEnumValues = getEnumValues, getName = getName, getTypeClass = getTypeClass, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XEnumTypeDescription]
  }
}

