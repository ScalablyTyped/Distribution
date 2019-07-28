package typings.agDashGrid.distLibRowModelsCacheRowNodeBlockMod

import typings.agDashGrid.distLibEventsMod.AgEvent
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
    val __obj = js.Dynamic.literal(lastRow = lastRow, page = page, success = success)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LoadCompleteEvent]
  }
}

