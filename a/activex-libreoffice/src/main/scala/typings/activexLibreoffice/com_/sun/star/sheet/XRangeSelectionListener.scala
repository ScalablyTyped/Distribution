package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows notification when range selection is completed or aborted.
  * @see com.sun.star.sheet.XRangeSelection
  */
@js.native
trait XRangeSelectionListener extends XEventListener {
  /** is called when range selection is aborted. */
  def aborted(aEvent: RangeSelectionEvent): Unit = js.native
  /** is called when range selection is completed. */
  def done(aEvent: RangeSelectionEvent): Unit = js.native
}

object XRangeSelectionListener {
  @scala.inline
  def apply(
    aborted: RangeSelectionEvent => Unit,
    acquire: () => Unit,
    disposing: EventObject => Unit,
    done: RangeSelectionEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRangeSelectionListener = {
    val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction1(aborted), acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), done = js.Any.fromFunction1(done), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRangeSelectionListener]
  }
  @scala.inline
  implicit class XRangeSelectionListenerOps[Self <: XRangeSelectionListener] (val x: Self) extends AnyVal {
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
    def setAborted(value: RangeSelectionEvent => Unit): Self = this.set("aborted", js.Any.fromFunction1(value))
    @scala.inline
    def setDone(value: RangeSelectionEvent => Unit): Self = this.set("done", js.Any.fromFunction1(value))
  }
  
}

