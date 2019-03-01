package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an event from range selection.
  * @see com.sun.star.sheet.XRangeSelectionListener
  * @see com.sun.star.sheet.XRangeSelectionChangeListener
  */
trait RangeSelectionEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** contains a textual representation of the selected range. */
  var RangeDescriptor: java.lang.String
}

object RangeSelectionEvent {
  @scala.inline
  def apply(
    RangeDescriptor: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): RangeSelectionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RangeDescriptor")(RangeDescriptor)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[RangeSelectionEvent]
  }
}

