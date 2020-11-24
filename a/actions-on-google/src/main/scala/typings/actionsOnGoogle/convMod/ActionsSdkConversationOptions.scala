package typings.actionsOnGoogle.convMod

import typings.actionsOnGoogle.conversationConversationMod.ConversationBaseOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsSdkConversationOptions[TConvData, TUserStorage] extends ConversationBaseOptions[TConvData, TUserStorage] {
  
  /** @public */
  var body: js.UndefOr[GoogleActionsV2AppRequest] = js.native
}
object ActionsSdkConversationOptions {
  
  @scala.inline
  def apply[TConvData, TUserStorage](): ActionsSdkConversationOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsSdkConversationOptions[TConvData, TUserStorage]]
  }
  
  @scala.inline
  implicit class ActionsSdkConversationOptionsOps[Self <: ActionsSdkConversationOptions[_, _], TConvData, TUserStorage] (val x: Self with (ActionsSdkConversationOptions[TConvData, TUserStorage])) extends AnyVal {
    
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
    def setBody(value: GoogleActionsV2AppRequest): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
}
