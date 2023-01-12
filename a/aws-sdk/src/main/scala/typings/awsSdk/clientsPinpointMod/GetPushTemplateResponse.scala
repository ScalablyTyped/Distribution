package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPushTemplateResponse extends StObject {
  
  var PushNotificationTemplateResponse: typings.awsSdk.clientsPinpointMod.PushNotificationTemplateResponse
}
object GetPushTemplateResponse {
  
  inline def apply(PushNotificationTemplateResponse: PushNotificationTemplateResponse): GetPushTemplateResponse = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateResponse = PushNotificationTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPushTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPushTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setPushNotificationTemplateResponse(value: PushNotificationTemplateResponse): Self = StObject.set(x, "PushNotificationTemplateResponse", value.asInstanceOf[js.Any])
  }
}
