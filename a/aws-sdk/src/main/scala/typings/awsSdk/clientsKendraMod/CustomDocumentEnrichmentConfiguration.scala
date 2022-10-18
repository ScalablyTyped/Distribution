package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDocumentEnrichmentConfiguration extends StObject {
  
  /**
    * Configuration information to alter document attributes or metadata fields and content when ingesting documents into Amazon Kendra.
    */
  var InlineConfigurations: js.UndefOr[InlineCustomDocumentEnrichmentConfigurationList] = js.undefined
  
  /**
    * Configuration information for invoking a Lambda function in Lambda on the structured documents with their metadata and text extracted. You can use a Lambda function to apply advanced logic for creating, modifying, or deleting document metadata and content. For more information, see Advanced data manipulation.
    */
  var PostExtractionHookConfiguration: js.UndefOr[HookConfiguration] = js.undefined
  
  /**
    * Configuration information for invoking a Lambda function in Lambda on the original or raw documents before extracting their metadata and text. You can use a Lambda function to apply advanced logic for creating, modifying, or deleting document metadata and content. For more information, see Advanced data manipulation.
    */
  var PreExtractionHookConfiguration: js.UndefOr[HookConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a role with permission to run PreExtractionHookConfiguration and PostExtractionHookConfiguration for altering document metadata and content during the document ingestion process. For more information, see IAM roles for Amazon Kendra.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
}
object CustomDocumentEnrichmentConfiguration {
  
  inline def apply(): CustomDocumentEnrichmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDocumentEnrichmentConfiguration]
  }
  
  extension [Self <: CustomDocumentEnrichmentConfiguration](x: Self) {
    
    inline def setInlineConfigurations(value: InlineCustomDocumentEnrichmentConfigurationList): Self = StObject.set(x, "InlineConfigurations", value.asInstanceOf[js.Any])
    
    inline def setInlineConfigurationsUndefined: Self = StObject.set(x, "InlineConfigurations", js.undefined)
    
    inline def setInlineConfigurationsVarargs(value: InlineCustomDocumentEnrichmentConfiguration*): Self = StObject.set(x, "InlineConfigurations", js.Array(value*))
    
    inline def setPostExtractionHookConfiguration(value: HookConfiguration): Self = StObject.set(x, "PostExtractionHookConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPostExtractionHookConfigurationUndefined: Self = StObject.set(x, "PostExtractionHookConfiguration", js.undefined)
    
    inline def setPreExtractionHookConfiguration(value: HookConfiguration): Self = StObject.set(x, "PreExtractionHookConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPreExtractionHookConfigurationUndefined: Self = StObject.set(x, "PreExtractionHookConfiguration", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
