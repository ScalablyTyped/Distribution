package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceTemplateRequest extends StObject {
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string
  
  var VoiceTemplateRequest: typings.awsSdk.clientsPinpointMod.VoiceTemplateRequest
}
object CreateVoiceTemplateRequest {
  
  inline def apply(TemplateName: string, VoiceTemplateRequest: VoiceTemplateRequest): CreateVoiceTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any], VoiceTemplateRequest = VoiceTemplateRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceTemplateRequest]
  }
  
  extension [Self <: CreateVoiceTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setVoiceTemplateRequest(value: VoiceTemplateRequest): Self = StObject.set(x, "VoiceTemplateRequest", value.asInstanceOf[js.Any])
  }
}
