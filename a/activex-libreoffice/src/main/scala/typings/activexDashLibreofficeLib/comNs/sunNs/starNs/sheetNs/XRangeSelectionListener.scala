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
    aborted: js.Function1[RangeSelectionEvent, scala.Unit],
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    done: js.Function1[RangeSelectionEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRangeSelectionListener = {
    val __obj = js.Dynamic.literal(aborted = aborted, acquire = acquire, disposing = disposing, done = done, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XRangeSelectionListener]
  }
}

