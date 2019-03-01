package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of cells that can possibly be merged or unmerged. */
trait XMergeableCellRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns `TRUE` if all cells from this range can be merged to one or `FALSE` otherwise. */
  def isMergeable(): scala.Boolean
  /**
    * merges the area specified by this range.
    * @throws com::sun::star::lang::NoSupportException if a merge is not possible for this range. You can use {@link isMergeable()} to check if a merge is possible.
    */
  def merge(): scala.Unit
  /**
    * splits the cells in this range. This will be done by inserting rows and columns if needed or unmerging cells that are already split.
    * @param Columns this is the number of columns that will be added to each cell. Zero means no new columns
    * @param Rows this is the number of rows that will be added to each cell. Zero means no new rows
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the parameters is less than zero.
    * @throws com::sun::star::lang::NoSupportException if a split is not possible for this range.
    */
  def split(Columns: scala.Double, Rows: scala.Double): scala.Unit
}

object XMergeableCellRange {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    isMergeable: js.Function0[scala.Boolean],
    merge: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    split: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XMergeableCellRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("isMergeable")(isMergeable)
    __obj.updateDynamic("merge")(merge)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[XMergeableCellRange]
  }
}

