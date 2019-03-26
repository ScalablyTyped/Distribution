package typings
package agDashGridLib.distLibRowModelsCacheRowNodeBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadCompleteEvent
  extends agDashGridLib.distLibEventsMod.AgEvent {
  var lastRow: scala.Double
  var page: RowNodeBlock
  var success: scala.Boolean
}

object LoadCompleteEvent {
  @scala.inline
  def apply(lastRow: scala.Double, page: RowNodeBlock, success: scala.Boolean, `type`: java.lang.String): LoadCompleteEvent = {
    val __obj = js.Dynamic.literal(lastRow = lastRow, page = page, success = success)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LoadCompleteEvent]
  }
}

