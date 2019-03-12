package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XGridControl} to notify changes in its row selection.
  * @see XGridRowSelection
  * @see XGridSelectionListener
  */
trait GridSelectionEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** denotes the indexes of the columns being selected at the time the event was fired. */
  var SelectedColumnIndexes: stdLib.SafeArray[scala.Double]
  /** denotes the indexes of the rows being selected at the time the event was fired. */
  var SelectedRowIndexes: stdLib.SafeArray[scala.Double]
}

object GridSelectionEvent {
  @scala.inline
  def apply(
    SelectedColumnIndexes: stdLib.SafeArray[scala.Double],
    SelectedRowIndexes: stdLib.SafeArray[scala.Double],
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): GridSelectionEvent = {
    val __obj = js.Dynamic.literal(SelectedColumnIndexes = SelectedColumnIndexes, SelectedRowIndexes = SelectedRowIndexes, Source = Source)
  
    __obj.asInstanceOf[GridSelectionEvent]
  }
}

