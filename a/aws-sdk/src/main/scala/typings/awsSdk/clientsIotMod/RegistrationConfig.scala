package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationConfig extends StObject {
  
  /**
    * The ARN of the role.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The template body.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.undefined
  
  /**
    * The name of the provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.undefined
}
object RegistrationConfig {
  
  inline def apply(): RegistrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationConfig]
  }
  
  extension [Self <: RegistrationConfig](x: Self) {
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
  }
}
