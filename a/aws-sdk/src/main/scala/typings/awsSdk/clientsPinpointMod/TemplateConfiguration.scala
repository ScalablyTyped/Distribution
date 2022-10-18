package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateConfiguration extends StObject {
  
  /**
    * The email template to use for the message.
    */
  var EmailTemplate: js.UndefOr[Template] = js.undefined
  
  /**
    * The push notification template to use for the message.
    */
  var PushTemplate: js.UndefOr[Template] = js.undefined
  
  /**
    * The SMS template to use for the message.
    */
  var SMSTemplate: js.UndefOr[Template] = js.undefined
  
  /**
    * The voice template to use for the message. This object isn't supported for campaigns.
    */
  var VoiceTemplate: js.UndefOr[Template] = js.undefined
}
object TemplateConfiguration {
  
  inline def apply(): TemplateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateConfiguration]
  }
  
  extension [Self <: TemplateConfiguration](x: Self) {
    
    inline def setEmailTemplate(value: Template): Self = StObject.set(x, "EmailTemplate", value.asInstanceOf[js.Any])
    
    inline def setEmailTemplateUndefined: Self = StObject.set(x, "EmailTemplate", js.undefined)
    
    inline def setPushTemplate(value: Template): Self = StObject.set(x, "PushTemplate", value.asInstanceOf[js.Any])
    
    inline def setPushTemplateUndefined: Self = StObject.set(x, "PushTemplate", js.undefined)
    
    inline def setSMSTemplate(value: Template): Self = StObject.set(x, "SMSTemplate", value.asInstanceOf[js.Any])
    
    inline def setSMSTemplateUndefined: Self = StObject.set(x, "SMSTemplate", js.undefined)
    
    inline def setVoiceTemplate(value: Template): Self = StObject.set(x, "VoiceTemplate", value.asInstanceOf[js.Any])
    
    inline def setVoiceTemplateUndefined: Self = StObject.set(x, "VoiceTemplate", js.undefined)
  }
}
