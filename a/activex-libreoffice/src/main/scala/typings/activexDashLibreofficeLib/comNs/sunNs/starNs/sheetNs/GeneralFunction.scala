package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify a function to be calculated from values. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12`
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
  def AUTO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** average of all numerical values is calculated. */
  @scala.inline
  def AVERAGE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** all values, including non-numerical values, are counted. */
  @scala.inline
  def COUNT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** numerical values are counted. */
  @scala.inline
  def COUNTNUMS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  /** maximum value of all numerical values is calculated. */
  @scala.inline
  def MAX: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** minimum value of all numerical values is calculated. */
  @scala.inline
  def MIN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
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
  /** product of all numerical values is calculated. */
  @scala.inline
  def PRODUCT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** standard deviation is calculated based on a sample. */
  @scala.inline
  def STDEV: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  /** standard deviation is calculated based on the entire population. */
  @scala.inline
  def STDEVP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10` = this.cast(10)
  /** sum of all numerical values is calculated. */
  @scala.inline
  def SUM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** variance is calculated based on a sample. */
  @scala.inline
  def VAR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11` = this.cast(11)
  /** variance is calculated based on the entire population. */
  @scala.inline
  def VARP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12` = this.cast(12)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

