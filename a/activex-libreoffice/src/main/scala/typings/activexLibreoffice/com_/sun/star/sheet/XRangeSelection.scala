package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to let the user to select a cell range.
  * @see com.sun.star.sheet.SpreadsheetView
  */
trait XRangeSelection extends XInterface {
  /** aborts the range selection. */
  def abortRangeSelection(): Unit
  /** adds a listener that is notified when the selected range is changed. */
  def addRangeSelectionChangeListener(aListener: XRangeSelectionChangeListener): Unit
  /** adds a listener that is notified when range selection is completed or aborted. */
  def addRangeSelectionListener(aListener: XRangeSelectionListener): Unit
  /** removes the specified listener. */
  def removeRangeSelectionChangeListener(aListener: XRangeSelectionChangeListener): Unit
  /** removes the specified listener. */
  def removeRangeSelectionListener(aListener: XRangeSelectionListener): Unit
  /**
    * starts the range selection.
    * @param aArguments the {@link RangeSelectionArguments} that specify how the range selection is done.
    */
  def startRangeSelection(aArguments: SeqEquiv[PropertyValue]): Unit
}

object XRangeSelection {
  @scala.inline
  def apply(
    abortRangeSelection: () => Unit,
    acquire: () => Unit,
    addRangeSelectionChangeListener: XRangeSelectionChangeListener => Unit,
    addRangeSelectionListener: XRangeSelectionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRangeSelectionChangeListener: XRangeSelectionChangeListener => Unit,
    removeRangeSelectionListener: XRangeSelectionListener => Unit,
    startRangeSelection: SeqEquiv[PropertyValue] => Unit
  ): XRangeSelection = {
    val __obj = js.Dynamic.literal(abortRangeSelection = js.Any.fromFunction0(abortRangeSelection), acquire = js.Any.fromFunction0(acquire), addRangeSelectionChangeListener = js.Any.fromFunction1(addRangeSelectionChangeListener), addRangeSelectionListener = js.Any.fromFunction1(addRangeSelectionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRangeSelectionChangeListener = js.Any.fromFunction1(removeRangeSelectionChangeListener), removeRangeSelectionListener = js.Any.fromFunction1(removeRangeSelectionListener), startRangeSelection = js.Any.fromFunction1(startRangeSelection))
    __obj.asInstanceOf[XRangeSelection]
  }
}

