package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1Status extends js.Object {
  
  var code: js.UndefOr[Double] = js.native
  
  var errorType: js.UndefOr[String] = js.native
  
  var webhookTimedOut: js.UndefOr[Boolean] = js.native
}
object DialogflowV1Status {
  
  @scala.inline
  def apply(): DialogflowV1Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Status]
  }
  
  @scala.inline
  implicit class DialogflowV1StatusOps[Self <: DialogflowV1Status] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorType: Self = this.set("errorType", js.undefined)
    
    @scala.inline
    def setWebhookTimedOut(value: Boolean): Self = this.set("webhookTimedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookTimedOut: Self = this.set("webhookTimedOut", js.undefined)
  }
}
