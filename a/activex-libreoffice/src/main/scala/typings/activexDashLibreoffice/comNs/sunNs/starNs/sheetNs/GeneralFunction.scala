package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`12`
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

/** used to specify a function to be calculated from values. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`12`
*/
trait GeneralFunction extends js.Object

object GeneralFunction {
  /**
    * specifies the use of a user-defined list. <p>The cells are filled using a user-defined series.</p>
    *
    *
    *
    * function is determined automatically. <p>If the values are all numerical, SUM is used, otherwise COUNT.</p>
    */
  @scala.inline
  def AUTO: `1` = this.cast(1)
  /** average of all numerical values is calculated. */
  @scala.inline
  def AVERAGE: `4` = this.cast(4)
  /** all values, including non-numerical values, are counted. */
  @scala.inline
  def COUNT: `3` = this.cast(3)
  /** numerical values are counted. */
  @scala.inline
  def COUNTNUMS: `8` = this.cast(8)
  /** maximum value of all numerical values is calculated. */
  @scala.inline
  def MAX: `5` = this.cast(5)
  /** minimum value of all numerical values is calculated. */
  @scala.inline
  def MIN: `6` = this.cast(6)
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
  def NONE: `0` = this.cast(0)
  /** product of all numerical values is calculated. */
  @scala.inline
  def PRODUCT: `7` = this.cast(7)
  /** standard deviation is calculated based on a sample. */
  @scala.inline
  def STDEV: `9` = this.cast(9)
  /** standard deviation is calculated based on the entire population. */
  @scala.inline
  def STDEVP: `10` = this.cast(10)
  /** sum of all numerical values is calculated. */
  @scala.inline
  def SUM: `2` = this.cast(2)
  /** variance is calculated based on a sample. */
  @scala.inline
  def VAR: `11` = this.cast(11)
  /** variance is calculated based on the entire population. */
  @scala.inline
  def VARP: `12` = this.cast(12)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

