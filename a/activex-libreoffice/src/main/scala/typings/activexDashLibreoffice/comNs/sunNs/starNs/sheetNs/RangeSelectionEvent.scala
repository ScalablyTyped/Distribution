package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an event from range selection.
  * @see com.sun.star.sheet.XRangeSelectionListener
  * @see com.sun.star.sheet.XRangeSelectionChangeListener
  */
trait RangeSelectionEvent extends EventObject {
  /** contains a textual representation of the selected range. */
  var RangeDescriptor: String
}

object RangeSelectionEvent {
  @scala.inline
  def apply(RangeDescriptor: String, Source: XInterface): RangeSelectionEvent = {
    val __obj = js.Dynamic.literal(RangeDescriptor = RangeDescriptor, Source = Source)
  
    __obj.asInstanceOf[RangeSelectionEvent]
  }
}

