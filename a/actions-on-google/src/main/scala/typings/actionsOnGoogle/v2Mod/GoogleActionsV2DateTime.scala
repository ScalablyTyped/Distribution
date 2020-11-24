package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.argumentArgumentMod._Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2DateTime extends _Argument {
  
  /**
    * Date value
    */
  var date: js.UndefOr[GoogleTypeDate] = js.native
  
  /**
    * Time value
    */
  var time: js.UndefOr[GoogleTypeTimeOfDay] = js.native
}
object GoogleActionsV2DateTime {
  
  @scala.inline
  def apply(): GoogleActionsV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTime]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DateTimeOps[Self <: GoogleActionsV2DateTime] (val x: Self) extends AnyVal {
    
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
    def setDate(value: GoogleTypeDate): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setTime(value: GoogleTypeTimeOfDay): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
