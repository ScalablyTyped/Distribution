package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to specify the type of {@link XSheetCondition} . */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait ConditionOperator extends js.Object

object ConditionOperator {
  /** the value has to be between the two specified values. */
  @scala.inline
  def BETWEEN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** value has to be equal to the specified value. */
  @scala.inline
  def EQUAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** the specified formula has to give a non-zero result. */
  @scala.inline
  def FORMULA: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  @scala.inline
  def GREATER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  @scala.inline
  def GREATER_EQUAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  @scala.inline
  def LESS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  @scala.inline
  def LESS_EQUAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  @scala.inline
  def NONE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** the value has to be outside of the two specified values. */
  @scala.inline
  def NOT_BETWEEN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  @scala.inline
  def NOT_EQUAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

