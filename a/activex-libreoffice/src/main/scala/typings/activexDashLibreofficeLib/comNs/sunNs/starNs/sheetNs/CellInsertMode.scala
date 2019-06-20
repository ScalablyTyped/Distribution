package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to specify how cells are moved when new cells are inserted. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
*/
trait CellInsertMode extends js.Object

object CellInsertMode {
  /**
    * entire columns to the right of the deleted cells are moved left.
    *
    * entire columns to the right of the inserted cells are moved right.
    */
  @scala.inline
  def COLUMNS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** the cells below the inserted cells are moved down. */
  @scala.inline
  def DOWN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
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
  /**
    * selects the right border.
    *
    * the cells to the right of the inserted cells are moved right.
    */
  @scala.inline
  def RIGHT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * entire rows below the deleted cells are moved up.
    *
    * entire rows below the inserted cells are moved down.
    */
  @scala.inline
  def ROWS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

