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

