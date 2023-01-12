package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateTemplateRequest extends StObject {
  
  /**
    * The ID of the application associated with the CloudFormation template.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  
  /**
    * The format for generating the CloudFormation template.
    */
  var templateFormat: js.UndefOr[OutputFormat] = js.undefined
}
object GenerateTemplateRequest {
  
  inline def apply(): GenerateTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setTemplateFormat(value: OutputFormat): Self = StObject.set(x, "templateFormat", value.asInstanceOf[js.Any])
    
    inline def setTemplateFormatUndefined: Self = StObject.set(x, "templateFormat", js.undefined)
  }
}
