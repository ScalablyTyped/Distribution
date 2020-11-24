package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2DateTimeValueSpec extends js.Object {
  
  /**
    * Control datetime prompts.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec] = js.native
}
object GoogleActionsV2DateTimeValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2DateTimeValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTimeValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DateTimeValueSpecOps[Self <: GoogleActionsV2DateTimeValueSpec] (val x: Self) extends AnyVal {
    
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
    def setDialogSpec(value: GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec): Self = this.set("dialogSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogSpec: Self = this.set("dialogSpec", js.undefined)
  }
}
