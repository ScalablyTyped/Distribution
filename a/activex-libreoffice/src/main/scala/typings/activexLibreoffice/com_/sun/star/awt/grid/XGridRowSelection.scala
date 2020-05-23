package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interfaces provides access to the selection of row for {@link UnoControlGrid} .
  * @since LibreOffice 3.4
  */
trait XGridRowSelection extends js.Object {
  /**
    * Returns the indices of all selected rows.
    * @returns a sequence of indices.
    */
  val SelectedRows: SafeArray[Double]
  /**
    * Adds a listener for the {@link GridSelectionEvent} posted after the grid changes.
    * @param listener the listener to add.
    */
  def addSelectionListener(listener: XGridSelectionListener): Unit
  /** Deselects all selected rows. */
  def deselectAllRows(): Unit
  /**
    * removes the selection for a given row
    * @param RowIndex denotes the index of the row to deselect
    */
  def deselectRow(RowIndex: Double): Unit
  /**
    * Returns the indices of all selected rows.
    * @returns a sequence of indices.
    */
  def getSelectedRows(): SafeArray[Double]
  /**
    * Returns whether rows are selected.
    * @returns `TRUE` if and only if at least one row is selected.
    */
  def hasSelectedRows(): Boolean
  /**
    * Returns whether a specific row is selected.
    * @param RowIndex the index of a row. If the value does not denote a valid row index, i.e. is smaller than `0` or greater than the number of rows, this is
    * @returns `TRUE` if and only if there is a row with the given index, and it is selected currently.
    */
  def isRowSelected(RowIndex: Double): Boolean
  /**
    * Removes a listener previously added with {@link addSelectionListener()} .
    * @param listener the listener to remove.
    */
  def removeSelectionListener(listener: XGridSelectionListener): Unit
  /** Selects all rows. */
  def selectAllRows(): Unit
  /**
    * selects a given row
    * @param RowIndex denotes the index of the row to select
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `RowIndex` does not denote a valid row index
    */
  def selectRow(RowIndex: Double): Unit
}

object XGridRowSelection {
  @scala.inline
  def apply(
    SelectedRows: SafeArray[Double],
    addSelectionListener: XGridSelectionListener => Unit,
    deselectAllRows: () => Unit,
    deselectRow: Double => Unit,
    getSelectedRows: () => SafeArray[Double],
    hasSelectedRows: () => Boolean,
    isRowSelected: Double => Boolean,
    removeSelectionListener: XGridSelectionListener => Unit,
    selectAllRows: () => Unit,
    selectRow: Double => Unit
  ): XGridRowSelection = {
    val __obj = js.Dynamic.literal(SelectedRows = SelectedRows.asInstanceOf[js.Any], addSelectionListener = js.Any.fromFunction1(addSelectionListener), deselectAllRows = js.Any.fromFunction0(deselectAllRows), deselectRow = js.Any.fromFunction1(deselectRow), getSelectedRows = js.Any.fromFunction0(getSelectedRows), hasSelectedRows = js.Any.fromFunction0(hasSelectedRows), isRowSelected = js.Any.fromFunction1(isRowSelected), removeSelectionListener = js.Any.fromFunction1(removeSelectionListener), selectAllRows = js.Any.fromFunction0(selectAllRows), selectRow = js.Any.fromFunction1(selectRow))
    __obj.asInstanceOf[XGridRowSelection]
  }
}

