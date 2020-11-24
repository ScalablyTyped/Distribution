package typings.agGrid.rowNodeBlockMod

import typings.agGrid.eventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadCompleteEvent extends AgEvent {
  
  var lastRow: Double = js.native
  
  var page: RowNodeBlock = js.native
  
  var success: Boolean = js.native
}
object LoadCompleteEvent {
  
  @scala.inline
  def apply(lastRow: Double, page: RowNodeBlock, success: Boolean, `type`: String): LoadCompleteEvent = {
    val __obj = js.Dynamic.literal(lastRow = lastRow.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadCompleteEvent]
  }
  
  @scala.inline
  implicit class LoadCompleteEventOps[Self <: LoadCompleteEvent] (val x: Self) extends AnyVal {
    
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
    def setLastRow(value: Double): Self = this.set("lastRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: RowNodeBlock): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
