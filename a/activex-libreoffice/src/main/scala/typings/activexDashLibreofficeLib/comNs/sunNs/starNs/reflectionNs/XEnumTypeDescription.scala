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
  val EnumNames: stdLib.SafeArray[java.lang.String]
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  val EnumValues: stdLib.SafeArray[scala.Double]
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  def getDefaultEnumValue(): scala.Double
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  def getEnumNames(): stdLib.SafeArray[java.lang.String]
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  def getEnumValues(): stdLib.SafeArray[scala.Double]
}

object XEnumTypeDescription {
  @scala.inline
  def apply(
    DefaultEnumValue: scala.Double,
    EnumNames: stdLib.SafeArray[java.lang.String],
    EnumValues: stdLib.SafeArray[scala.Double],
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: () => scala.Unit,
    getDefaultEnumValue: () => scala.Double,
    getEnumNames: () => stdLib.SafeArray[java.lang.String],
    getEnumValues: () => stdLib.SafeArray[scala.Double],
    getName: () => java.lang.String,
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XEnumTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultEnumValue = DefaultEnumValue, EnumNames = EnumNames, EnumValues = EnumValues, Name = Name, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getDefaultEnumValue = js.Any.fromFunction0(getDefaultEnumValue), getEnumNames = js.Any.fromFunction0(getEnumNames), getEnumValues = js.Any.fromFunction0(getEnumValues), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEnumTypeDescription]
  }
}

