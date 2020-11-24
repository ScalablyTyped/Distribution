package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3Action extends js.Object {
  
  /**
    * Metadata associated with an action.
    */
  var actionMetadata: js.UndefOr[GoogleActionsOrdersV3ActionActionMetadata] = js.native
  
  /**
    * Action to take.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
  
  /**
    * Title or label of the action, displayed to the user.
    * Max allowed length is 100 chars.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Required: Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3ActionType] = js.native
}
object GoogleActionsOrdersV3Action {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Action]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3ActionOps[Self <: GoogleActionsOrdersV3Action] (val x: Self) extends AnyVal {
    
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
    def setActionMetadata(value: GoogleActionsOrdersV3ActionActionMetadata): Self = this.set("actionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionMetadata: Self = this.set("actionMetadata", js.undefined)
    
    @scala.inline
    def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = this.set("openUrlAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenUrlAction: Self = this.set("openUrlAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3ActionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
