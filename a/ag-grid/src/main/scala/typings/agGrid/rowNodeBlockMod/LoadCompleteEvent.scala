package typings.agGrid.rowNodeBlockMod

import typings.agGrid.eventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadCompleteEvent extends AgEvent {
  var lastRow: Double
  var page: RowNodeBlock
  var success: Boolean
}

object LoadCompleteEvent {
  @scala.inline
  def apply(lastRow: Double, page: RowNodeBlock, success: Boolean, `type`: String): LoadCompleteEvent = {
    val __obj = js.Dynamic.literal(lastRow = lastRow.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadCompleteEvent]
  }
}

