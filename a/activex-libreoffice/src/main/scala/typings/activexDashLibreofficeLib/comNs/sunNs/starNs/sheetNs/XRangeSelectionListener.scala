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

