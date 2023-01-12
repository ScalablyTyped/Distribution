package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProvisioningTemplateVersionRequest extends StObject {
  
  /**
    * Sets a fleet provision template version as the default version.
    */
  var setAsDefault: js.UndefOr[SetAsDefault] = js.undefined
  
  /**
    * The JSON formatted contents of the provisioning template.
    */
  var templateBody: TemplateBody
  
  /**
    * The name of the provisioning template.
    */
  var templateName: TemplateName
}
object CreateProvisioningTemplateVersionRequest {
  
  inline def apply(templateBody: TemplateBody, templateName: TemplateName): CreateProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProvisioningTemplateVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setSetAsDefault(value: SetAsDefault): Self = StObject.set(x, "setAsDefault", value.asInstanceOf[js.Any])
    
    inline def setSetAsDefaultUndefined: Self = StObject.set(x, "setAsDefault", js.undefined)
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
