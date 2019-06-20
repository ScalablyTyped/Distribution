package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify if a table operation is applied to columns, rows, or both columns and rows. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait TableOperationMode extends js.Object

object TableOperationMode {
  /**
    * is applied to rows and columns. <p>In this mode, the row and the column contain values. A formula
    *
    * using both row and column values is specified separately.</p>
    */
  @scala.inline
  def BOTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * the field is used as a column field.
    *
    * is applied to the columns. <p>In this mode, the column contains values and the row
    *
    * contains formulas.</p>
    */
  @scala.inline
  def COLUMN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * the field is used as a row field.
    *
    * is applied to the rows. <p>In this mode, the row contains values and the column
    *
    * contains formulas.</p>
    */
  @scala.inline
  def ROW: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

