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
@js.native
trait XRangeSelection extends XInterface {
  /** aborts the range selection. */
  def abortRangeSelection(): Unit = js.native
  /** adds a listener that is notified when the selected range is changed. */
  def addRangeSelectionChangeListener(aListener: XRangeSelectionChangeListener): Unit = js.native
  /** adds a listener that is notified when range selection is completed or aborted. */
  def addRangeSelectionListener(aListener: XRangeSelectionListener): Unit = js.native
  /** removes the specified listener. */
  def removeRangeSelectionChangeListener(aListener: XRangeSelectionChangeListener): Unit = js.native
  /** removes the specified listener. */
  def removeRangeSelectionListener(aListener: XRangeSelectionListener): Unit = js.native
  /**
    * starts the range selection.
    * @param aArguments the {@link RangeSelectionArguments} that specify how the range selection is done.
    */
  def startRangeSelection(aArguments: SeqEquiv[PropertyValue]): Unit = js.native
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
  @scala.inline
  implicit class XRangeSelectionOps[Self <: XRangeSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbortRangeSelection(value: () => Unit): Self = this.set("abortRangeSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setAddRangeSelectionChangeListener(value: XRangeSelectionChangeListener => Unit): Self = this.set("addRangeSelectionChangeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddRangeSelectionListener(value: XRangeSelectionListener => Unit): Self = this.set("addRangeSelectionListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveRangeSelectionChangeListener(value: XRangeSelectionChangeListener => Unit): Self = this.set("removeRangeSelectionChangeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveRangeSelectionListener(value: XRangeSelectionListener => Unit): Self = this.set("removeRangeSelectionListener", js.Any.fromFunction1(value))
    @scala.inline
    def setStartRangeSelection(value: SeqEquiv[PropertyValue] => Unit): Self = this.set("startRangeSelection", js.Any.fromFunction1(value))
  }
  
}

