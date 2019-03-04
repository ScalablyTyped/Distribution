package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows notification when the selected range is changed.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait XRangeSelectionChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called when the selected range is changed while range selection is active. */
  def descriptorChanged(aEvent: RangeSelectionEvent): scala.Unit
}

object XRangeSelectionChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    descriptorChanged: js.Function1[RangeSelectionEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRangeSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, descriptorChanged = descriptorChanged, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XRangeSelectionChangeListener]
  }
}

