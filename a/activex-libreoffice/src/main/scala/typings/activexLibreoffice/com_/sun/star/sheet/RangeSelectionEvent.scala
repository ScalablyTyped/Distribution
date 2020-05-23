package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(RangeDescriptor = RangeDescriptor.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectionEvent]
  }
}

