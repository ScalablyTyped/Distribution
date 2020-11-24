package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2FinalResponse extends js.Object {
  
  /**
    * Rich response when user is not required to provide an input.
    */
  var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.native
  
  /**
    * Spoken response when user is not required to provide an input.
    */
  var speechResponse: js.UndefOr[GoogleActionsV2SpeechResponse] = js.native
}
object GoogleActionsV2FinalResponse {
  
  @scala.inline
  def apply(): GoogleActionsV2FinalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2FinalResponse]
  }
  
  @scala.inline
  implicit class GoogleActionsV2FinalResponseOps[Self <: GoogleActionsV2FinalResponse] (val x: Self) extends AnyVal {
    
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
    def setRichResponse(value: GoogleActionsV2RichResponse): Self = this.set("richResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRichResponse: Self = this.set("richResponse", js.undefined)
    
    @scala.inline
    def setSpeechResponse(value: GoogleActionsV2SpeechResponse): Self = this.set("speechResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechResponse: Self = this.set("speechResponse", js.undefined)
  }
}
