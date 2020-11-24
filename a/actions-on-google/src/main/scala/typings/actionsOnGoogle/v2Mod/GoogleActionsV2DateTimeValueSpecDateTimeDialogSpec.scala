package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec extends js.Object {
  
  /**
    * This is used to create prompt to ask for date only.
    * For example: What date are you looking for?
    */
  var requestDateText: js.UndefOr[String] = js.native
  
  /**
    * This is used to create initial prompt by datetime sub-dialog.
    * Example question: \"What date and time do you want?\"
    */
  var requestDatetimeText: js.UndefOr[String] = js.native
  
  /**
    * This is used to create prompt to ask for time only.
    * For example: What time?
    */
  var requestTimeText: js.UndefOr[String] = js.native
}
object GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DateTimeValueSpecDateTimeDialogSpecOps[Self <: GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec] (val x: Self) extends AnyVal {
    
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
    def setRequestDateText(value: String): Self = this.set("requestDateText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDateText: Self = this.set("requestDateText", js.undefined)
    
    @scala.inline
    def setRequestDatetimeText(value: String): Self = this.set("requestDatetimeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDatetimeText: Self = this.set("requestDatetimeText", js.undefined)
    
    @scala.inline
    def setRequestTimeText(value: String): Self = this.set("requestTimeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeText: Self = this.set("requestTimeText", js.undefined)
  }
}
