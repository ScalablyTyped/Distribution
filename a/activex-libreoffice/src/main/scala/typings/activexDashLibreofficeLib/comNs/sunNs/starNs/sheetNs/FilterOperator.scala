package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of a single condition in a filter descriptor. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
*/
trait FilterOperator extends js.Object

object FilterOperator {
  /** selects a specified percentage of entries with the lowest values. */
  @scala.inline
  def BOTTOM_PERCENT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11` = this.cast(11)
  /** selects a specified number of entries with the lowest values. */
  @scala.inline
  def BOTTOM_VALUES: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10` = this.cast(10)
  /** selects empty entries. */
  @scala.inline
  def EMPTY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** value has to be equal to the specified value. */
  @scala.inline
  def EQUAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  @scala.inline
  def GREATER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  @scala.inline
  def GREATER_EQUAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  @scala.inline
  def LESS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  @scala.inline
  def LESS_EQUAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** selects non-empty entries. */
  @scala.inline
  def NOT_EMPTY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  @scala.inline
  def NOT_EQUAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** selects a specified percentage of entries with the greatest values. */
  @scala.inline
  def TOP_PERCENT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  /** selects a specified number of entries with the greatest values. */
  @scala.inline
  def TOP_VALUES: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

