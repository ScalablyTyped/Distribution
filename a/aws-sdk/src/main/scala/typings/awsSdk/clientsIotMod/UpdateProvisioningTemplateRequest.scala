package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisioningTemplateRequest extends StObject {
  
  /**
    * The ID of the default provisioning template version.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.undefined
  
  /**
    * The description of the provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.undefined
  
  /**
    * True to enable the provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Updates the pre-provisioning hook template. Only supports template of type FLEET_PROVISIONING. For more information about provisioning template types, see type.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.undefined
  
  /**
    * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Removes pre-provisioning hook template.
    */
  var removePreProvisioningHook: js.UndefOr[RemoveHook] = js.undefined
  
  /**
    * The name of the provisioning template.
    */
  var templateName: TemplateName
}
object UpdateProvisioningTemplateRequest {
  
  inline def apply(templateName: TemplateName): UpdateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningTemplateRequest]
  }
  
  extension [Self <: UpdateProvisioningTemplateRequest](x: Self) {
    
    inline def setDefaultVersionId(value: TemplateVersionId): Self = StObject.set(x, "defaultVersionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionIdUndefined: Self = StObject.set(x, "defaultVersionId", js.undefined)
    
    inline def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPreProvisioningHook(value: ProvisioningHook): Self = StObject.set(x, "preProvisioningHook", value.asInstanceOf[js.Any])
    
    inline def setPreProvisioningHookUndefined: Self = StObject.set(x, "preProvisioningHook", js.undefined)
    
    inline def setProvisioningRoleArn(value: RoleArn): Self = StObject.set(x, "provisioningRoleArn", value.asInstanceOf[js.Any])
    
    inline def setProvisioningRoleArnUndefined: Self = StObject.set(x, "provisioningRoleArn", js.undefined)
    
    inline def setRemovePreProvisioningHook(value: RemoveHook): Self = StObject.set(x, "removePreProvisioningHook", value.asInstanceOf[js.Any])
    
    inline def setRemovePreProvisioningHookUndefined: Self = StObject.set(x, "removePreProvisioningHook", js.undefined)
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
