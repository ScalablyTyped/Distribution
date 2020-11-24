package typings.actionsOnGoogle.dialogflowConvMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAssistantResponse extends js.Object {
  
  var expectUserResponse: js.UndefOr[Boolean] = js.native
  
  var isSsml: js.UndefOr[Boolean] = js.native
  
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
  
  var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.native
  
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.native
  
  var systemIntent: js.UndefOr[SystemIntent] = js.native
  
  var userStorage: js.UndefOr[String] = js.native
}
object GoogleAssistantResponse {
  
  @scala.inline
  def apply(): GoogleAssistantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAssistantResponse]
  }
  
  @scala.inline
  implicit class GoogleAssistantResponseOps[Self <: GoogleAssistantResponse] (val x: Self) extends AnyVal {
    
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
    def setExpectUserResponse(value: Boolean): Self = this.set("expectUserResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectUserResponse: Self = this.set("expectUserResponse", js.undefined)
    
    @scala.inline
    def setIsSsml(value: Boolean): Self = this.set("isSsml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSsml: Self = this.set("isSsml", js.undefined)
    
    @scala.inline
    def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = this.set("noInputPrompts", js.Array(value :_*))
    
    @scala.inline
    def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = this.set("noInputPrompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoInputPrompts: Self = this.set("noInputPrompts", js.undefined)
    
    @scala.inline
    def setRichResponse(value: GoogleActionsV2RichResponse): Self = this.set("richResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRichResponse: Self = this.set("richResponse", js.undefined)
    
    @scala.inline
    def setSpeechBiasingHintsVarargs(value: String*): Self = this.set("speechBiasingHints", js.Array(value :_*))
    
    @scala.inline
    def setSpeechBiasingHints(value: js.Array[String]): Self = this.set("speechBiasingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechBiasingHints: Self = this.set("speechBiasingHints", js.undefined)
    
    @scala.inline
    def setSystemIntent(value: SystemIntent): Self = this.set("systemIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemIntent: Self = this.set("systemIntent", js.undefined)
    
    @scala.inline
    def setUserStorage(value: String): Self = this.set("userStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStorage: Self = this.set("userStorage", js.undefined)
  }
}
