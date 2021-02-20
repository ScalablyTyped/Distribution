package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.custom_payload
import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
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
  implicit class DialogflowV1MessageGooglePayloadMutableBuilder[Self <: DialogflowV1MessageGooglePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: ApiClientObjectMap[_]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
