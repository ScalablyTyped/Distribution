package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec extends js.Object {
  
  /**
    * This is the question asked by confirmation sub-dialog. For example \"Are
    * you sure about that?\"
    */
  var requestConfirmationText: js.UndefOr[String] = js.native
}
object GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpecOps[Self <: GoogleActionsV2ConfirmationValueSpecConfirmationDialogSpec] (val x: Self) extends AnyVal {
    
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
    def setRequestConfirmationText(value: String): Self = this.set("requestConfirmationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestConfirmationText: Self = this.set("requestConfirmationText", js.undefined)
  }
}
