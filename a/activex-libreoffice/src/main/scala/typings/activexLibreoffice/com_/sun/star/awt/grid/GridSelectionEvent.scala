package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XGridControl} to notify changes in its row selection.
  * @see XGridRowSelection
  * @see XGridSelectionListener
  */
@js.native
trait GridSelectionEvent extends EventObject {
  /** denotes the indexes of the columns being selected at the time the event was fired. */
  var SelectedColumnIndexes: SafeArray[Double] = js.native
  /** denotes the indexes of the rows being selected at the time the event was fired. */
  var SelectedRowIndexes: SafeArray[Double] = js.native
}

object GridSelectionEvent {
  @scala.inline
  def apply(
    SelectedColumnIndexes: SafeArray[Double],
    SelectedRowIndexes: SafeArray[Double],
    Source: XInterface
  ): GridSelectionEvent = {
    val __obj = js.Dynamic.literal(SelectedColumnIndexes = SelectedColumnIndexes.asInstanceOf[js.Any], SelectedRowIndexes = SelectedRowIndexes.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSelectionEvent]
  }
  @scala.inline
  implicit class GridSelectionEventOps[Self <: GridSelectionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelectedColumnIndexes(value: SafeArray[Double]): Self = this.set("SelectedColumnIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedRowIndexes(value: SafeArray[Double]): Self = this.set("SelectedRowIndexes", value.asInstanceOf[js.Any])
  }
  
}

