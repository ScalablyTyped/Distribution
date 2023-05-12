package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTemplateDefinitionResponse extends StObject {
  
  /**
    * The definition of the template. A definition is the data model of all features in a Dashboard, Template, or Analysis.
    */
  var Definition: js.UndefOr[TemplateVersionDefinition] = js.undefined
  
  /**
    * Errors associated with the template version.
    */
  var Errors: js.UndefOr[TemplateErrorList] = js.undefined
  
  /**
    * The descriptive name of the template.
    */
  var Name: js.UndefOr[TemplateName] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * Status associated with the template.    CREATION_IN_PROGRESS     CREATION_SUCCESSFUL     CREATION_FAILED     UPDATE_IN_PROGRESS     UPDATE_SUCCESSFUL     UPDATE_FAILED     DELETED   
    */
  var ResourceStatus: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ResourceStatus] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The ID of the template described.
    */
  var TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
  
  /**
    * The ARN of the theme of the template.
    */
  var ThemeArn: js.UndefOr[Arn] = js.undefined
}
object DescribeTemplateDefinitionResponse {
  
  inline def apply(): DescribeTemplateDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTemplateDefinitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTemplateDefinitionResponse] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: TemplateVersionDefinition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setErrors(value: TemplateErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: TemplateError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setResourceStatus(value: ResourceStatus): Self = StObject.set(x, "ResourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusUndefined: Self = StObject.set(x, "ResourceStatus", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTemplateId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
    
    inline def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    inline def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
  }
}
