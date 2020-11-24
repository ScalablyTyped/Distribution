package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.custom_payload
import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageGooglePayload
  extends DialogflowV1BaseGoogleMessage[custom_payload]
     with DialogflowV1Message {
  
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.native
}
object DialogflowV1MessageGooglePayload {
  
  @scala.inline
  def apply(platform: google): DialogflowV1MessageGooglePayload = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageGooglePayload]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageGooglePayloadOps[Self <: DialogflowV1MessageGooglePayload] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: ApiClientObjectMap[_]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
