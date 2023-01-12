package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInAppTemplateRequest extends StObject {
  
  var InAppTemplateRequest: typings.awsSdk.clientsPinpointMod.InAppTemplateRequest
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string
}
object CreateInAppTemplateRequest {
  
  inline def apply(InAppTemplateRequest: InAppTemplateRequest, TemplateName: string): CreateInAppTemplateRequest = {
    val __obj = js.Dynamic.literal(InAppTemplateRequest = InAppTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInAppTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInAppTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setInAppTemplateRequest(value: InAppTemplateRequest): Self = StObject.set(x, "InAppTemplateRequest", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
