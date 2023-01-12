package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePushTemplateRequest extends StObject {
  
  var PushNotificationTemplateRequest: typings.awsSdk.clientsPinpointMod.PushNotificationTemplateRequest
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string
}
object CreatePushTemplateRequest {
  
  inline def apply(PushNotificationTemplateRequest: PushNotificationTemplateRequest, TemplateName: string): CreatePushTemplateRequest = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateRequest = PushNotificationTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePushTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePushTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setPushNotificationTemplateRequest(value: PushNotificationTemplateRequest): Self = StObject.set(x, "PushNotificationTemplateRequest", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
