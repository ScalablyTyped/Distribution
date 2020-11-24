package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3Time extends js.Object {
  
  /**
    * Represents an order-event time like reservation time, delivery time and so
    * on. Could be a duration (start & end time), just the date, date time etc.
    * Refer https://en.wikipedia.org/wiki/ISO_8601 for all supported formats.
    */
  var timeIso8601: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3Time {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3Time = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Time]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3TimeOps[Self <: GoogleActionsOrdersV3Time] (val x: Self) extends AnyVal {
    
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
    def setTimeIso8601(value: String): Self = this.set("timeIso8601", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeIso8601: Self = this.set("timeIso8601", js.undefined)
  }
}
