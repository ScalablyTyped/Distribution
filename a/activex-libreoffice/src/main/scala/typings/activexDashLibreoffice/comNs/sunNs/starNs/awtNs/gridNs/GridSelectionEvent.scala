package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.gridNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XGridControl} to notify changes in its row selection.
  * @see XGridRowSelection
  * @see XGridSelectionListener
  */
trait GridSelectionEvent extends EventObject {
  /** denotes the indexes of the columns being selected at the time the event was fired. */
  var SelectedColumnIndexes: SafeArray[Double]
  /** denotes the indexes of the rows being selected at the time the event was fired. */
  var SelectedRowIndexes: SafeArray[Double]
}

object GridSelectionEvent {
  @scala.inline
  def apply(
    SelectedColumnIndexes: SafeArray[Double],
    SelectedRowIndexes: SafeArray[Double],
    Source: XInterface
  ): GridSelectionEvent = {
    val __obj = js.Dynamic.literal(SelectedColumnIndexes = SelectedColumnIndexes, SelectedRowIndexes = SelectedRowIndexes, Source = Source)
  
    __obj.asInstanceOf[GridSelectionEvent]
  }
}

