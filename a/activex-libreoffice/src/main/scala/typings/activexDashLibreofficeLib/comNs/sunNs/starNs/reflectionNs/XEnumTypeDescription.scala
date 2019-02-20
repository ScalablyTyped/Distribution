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

