package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeManagedJobTemplateResponse extends StObject {
  
  /**
    * The unique description of a managed template.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * The document schema for a managed job template.
    */
  var document: js.UndefOr[JobDocument] = js.undefined
  
  /**
    * A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a managed template.   documentParameters can only be used when creating jobs from Amazon Web Services managed templates. This parameter can't be used with custom job templates or to create jobs from them. 
    */
  var documentParameters: js.UndefOr[DocumentParameters] = js.undefined
  
  /**
    * A list of environments that are supported with the managed job template.
    */
  var environments: js.UndefOr[Environments] = js.undefined
  
  /**
    * The unique Amazon Resource Name (ARN) of the managed template.
    */
  var templateArn: js.UndefOr[JobTemplateArn] = js.undefined
  
  /**
    * The unique name of a managed template, such as AWS-Reboot.
    */
  var templateName: js.UndefOr[ManagedJobTemplateName] = js.undefined
  
  /**
    * The version for a managed template.
    */
  var templateVersion: js.UndefOr[ManagedTemplateVersion] = js.undefined
}
object DescribeManagedJobTemplateResponse {
  
  inline def apply(): DescribeManagedJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeManagedJobTemplateResponse]
  }
  
  extension [Self <: DescribeManagedJobTemplateResponse](x: Self) {
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocument(value: JobDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentParameters(value: DocumentParameters): Self = StObject.set(x, "documentParameters", value.asInstanceOf[js.Any])
    
    inline def setDocumentParametersUndefined: Self = StObject.set(x, "documentParameters", js.undefined)
    
    inline def setDocumentParametersVarargs(value: DocumentParameter*): Self = StObject.set(x, "documentParameters", js.Array(value*))
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
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
