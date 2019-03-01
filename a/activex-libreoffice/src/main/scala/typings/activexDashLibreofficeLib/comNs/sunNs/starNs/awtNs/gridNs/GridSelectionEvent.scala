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
  var SelectedColumnIndexes: activexDashInteropLib.SafeArray[scala.Double]
  /** denotes the indexes of the rows being selected at the time the event was fired. */
  var SelectedRowIndexes: activexDashInteropLib.SafeArray[scala.Double]
}

object GridSelectionEvent {
  @scala.inline
  def apply(
    SelectedColumnIndexes: activexDashInteropLib.SafeArray[scala.Double],
    SelectedRowIndexes: activexDashInteropLib.SafeArray[scala.Double],
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): GridSelectionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SelectedColumnIndexes")(SelectedColumnIndexes)
    __obj.updateDynamic("SelectedRowIndexes")(SelectedRowIndexes)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[GridSelectionEvent]
  }
}

