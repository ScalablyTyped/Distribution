package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedJobTemplateSummary extends StObject {
  
  /**
    * The description for a managed template.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * A list of environments that are supported with the managed job template.
    */
  var environments: js.UndefOr[Environments] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for a managed template.
    */
  var templateArn: js.UndefOr[JobTemplateArn] = js.undefined
  
  /**
    * The unique Name for a managed template.
    */
  var templateName: js.UndefOr[ManagedJobTemplateName] = js.undefined
  
  /**
    * The version for a managed template.
    */
  var templateVersion: js.UndefOr[ManagedTemplateVersion] = js.undefined
}
object ManagedJobTemplateSummary {
  
  inline def apply(): ManagedJobTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedJobTemplateSummary]
  }
  
  extension [Self <: ManagedJobTemplateSummary](x: Self) {
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironments(value: Environments): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: Environment*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setTemplateArn(value: JobTemplateArn): Self = StObject.set(x, "templateArn", value.asInstanceOf[js.Any])
    
    inline def setTemplateArnUndefined: Self = StObject.set(x, "templateArn", js.undefined)
    
    inline def setTemplateName(value: ManagedJobTemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
    
    inline def setTemplateVersion(value: ManagedTemplateVersion): Self = StObject.set(x, "templateVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionUndefined: Self = StObject.set(x, "templateVersion", js.undefined)
  }
}
