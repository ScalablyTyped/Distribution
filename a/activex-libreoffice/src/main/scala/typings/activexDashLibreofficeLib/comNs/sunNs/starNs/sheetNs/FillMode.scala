package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify the series type used to fill cells. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait FillMode extends js.Object

object FillMode {
  /**
    * specifies the use of a user-defined list. <p>The cells are filled using a user-defined series.</p>
    *
    *
    *
    * function is determined automatically. <p>If the values are all numerical, SUM is used, otherwise COUNT.</p>
    */
  @scala.inline
  def AUTO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /**
    * specifies an arithmetic series for date values. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by a specified number of days</p>
    * @@see com::sun::star::sheet::FillDateMode  any date value matching the specified condition is valid.
    */
  @scala.inline
  def DATE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * specifies a geometric series. <p>Cell by cell, the value used to fill the cells is multiplied
    *
    * by a specified value.</p>
    */
  @scala.inline
  def GROWTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * specifies an arithmetic series. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by an additive value.</p>
    */
  @scala.inline
  def LINEAR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** specifies a constant series. <p>All cells are filled with the same value.</p> */
  @scala.inline
  def SIMPLE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

