package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows notification when range selection is completed or aborted.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait XRangeSelectionListener extends XEventListener {
  /** is called when range selection is aborted. */
  def aborted(aEvent: RangeSelectionEvent): Unit
  /** is called when range selection is completed. */
  def done(aEvent: RangeSelectionEvent): Unit
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
}

