package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProvisioningTemplateRequest extends StObject {
  
  /**
    * The description of the provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.undefined
  
  /**
    * True to enable the provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Creates a pre-provisioning hook template. Only supports template of type FLEET_PROVISIONING. For more information about provisioning template types, see type.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.undefined
  
  /**
    * The role ARN for the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: RoleArn
  
  /**
    * Metadata which can be used to manage the provisioning template.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The JSON formatted contents of the provisioning template.
    */
  var templateBody: TemplateBody
  
  /**
    * The name of the provisioning template.
    */
  var templateName: TemplateName
  
  /**
    * The type you define in a provisioning template. You can create a template with only one type. You can't change the template type after its creation. The default value is FLEET_PROVISIONING. For more information about provisioning template, see: Provisioning template. 
    */
  var `type`: js.UndefOr[TemplateType] = js.undefined
}
object CreateProvisioningTemplateRequest {
  
  inline def apply(provisioningRoleArn: RoleArn, templateBody: TemplateBody, templateName: TemplateName): CreateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(provisioningRoleArn = provisioningRoleArn.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateRequest]
  }
  
  extension [Self <: CreateProvisioningTemplateRequest](x: Self) {
    
    inline def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPreProvisioningHook(value: ProvisioningHook): Self = StObject.set(x, "preProvisioningHook", value.asInstanceOf[js.Any])
    
    inline def setPreProvisioningHookUndefined: Self = StObject.set(x, "preProvisioningHook", js.undefined)
    
    inline def setProvisioningRoleArn(value: RoleArn): Self = StObject.set(x, "provisioningRoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
