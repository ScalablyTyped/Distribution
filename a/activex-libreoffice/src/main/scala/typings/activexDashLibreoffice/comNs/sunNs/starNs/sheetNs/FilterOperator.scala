package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of a single condition in a filter descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
*/
trait FilterOperator extends js.Object

object FilterOperator {
  /** selects a specified percentage of entries with the lowest values. */
  @scala.inline
  def BOTTOM_PERCENT: `11` = this.cast(11)
  /** selects a specified number of entries with the lowest values. */
  @scala.inline
  def BOTTOM_VALUES: `10` = this.cast(10)
  /** selects empty entries. */
  @scala.inline
  def EMPTY: `0` = this.cast(0)
  /** value has to be equal to the specified value. */
  @scala.inline
  def EQUAL: `2` = this.cast(2)
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  @scala.inline
  def GREATER: `4` = this.cast(4)
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  @scala.inline
  def GREATER_EQUAL: `5` = this.cast(5)
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  @scala.inline
  def LESS: `6` = this.cast(6)
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  @scala.inline
  def LESS_EQUAL: `7` = this.cast(7)
  /** selects non-empty entries. */
  @scala.inline
  def NOT_EMPTY: `1` = this.cast(1)
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  @scala.inline
  def NOT_EQUAL: `3` = this.cast(3)
  /** selects a specified percentage of entries with the greatest values. */
  @scala.inline
  def TOP_PERCENT: `9` = this.cast(9)
  /** selects a specified number of entries with the greatest values. */
  @scala.inline
  def TOP_VALUES: `8` = this.cast(8)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

