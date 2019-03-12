package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows notification when range selection is completed or aborted.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait XRangeSelectionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called when range selection is aborted. */
  def aborted(aEvent: RangeSelectionEvent): scala.Unit
  /** is called when range selection is completed. */
  def done(aEvent: RangeSelectionEvent): scala.Unit
}

object XRangeSelectionListener {
  @scala.inline
  def apply(
    aborted: RangeSelectionEvent => scala.Unit,
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    done: RangeSelectionEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XRangeSelectionListener = {
    val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction1(aborted), acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), done = js.Any.fromFunction1(done), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XRangeSelectionListener]
  }
}

