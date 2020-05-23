package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of cells that can possibly be merged or unmerged. */
trait XMergeableCellRange extends XInterface {
  /** @returns `TRUE` if all cells from this range can be merged to one or `FALSE` otherwise. */
  def isMergeable(): Boolean
  /**
    * merges the area specified by this range.
    * @throws com::sun::star::lang::NoSupportException if a merge is not possible for this range. You can use {@link isMergeable()} to check if a merge is possible.
    */
  def merge(): Unit
  /**
    * splits the cells in this range. This will be done by inserting rows and columns if needed or unmerging cells that are already split.
    * @param Columns this is the number of columns that will be added to each cell. Zero means no new columns
    * @param Rows this is the number of rows that will be added to each cell. Zero means no new rows
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the parameters is less than zero.
    * @throws com::sun::star::lang::NoSupportException if a split is not possible for this range.
    */
  def split(Columns: Double, Rows: Double): Unit
}

object XMergeableCellRange {
  @scala.inline
  def apply(
    acquire: () => Unit,
    isMergeable: () => Boolean,
    merge: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    split: (Double, Double) => Unit
  ): XMergeableCellRange = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isMergeable = js.Any.fromFunction0(isMergeable), merge = js.Any.fromFunction0(merge), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), split = js.Any.fromFunction2(split))
    __obj.asInstanceOf[XMergeableCellRange]
  }
}

