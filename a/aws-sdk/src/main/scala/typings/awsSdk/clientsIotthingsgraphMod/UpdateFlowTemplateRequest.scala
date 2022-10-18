package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowTemplateRequest extends StObject {
  
  /**
    * The version of the user's namespace. If no value is specified, the latest version is used by default. Use the GetFlowTemplateRevisions if you want to find earlier revisions of the flow to update.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The DefinitionDocument that contains the updated workflow definition.
    */
  var definition: DefinitionDocument
  
  /**
    * The ID of the workflow to be updated. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn
}
object UpdateFlowTemplateRequest {
  
  inline def apply(definition: DefinitionDocument, id: Urn): UpdateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowTemplateRequest]
  }
  
  extension [Self <: UpdateFlowTemplateRequest](x: Self) {
    
    inline def setCompatibleNamespaceVersion(value: Version): Self = StObject.set(x, "compatibleNamespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setCompatibleNamespaceVersionUndefined: Self = StObject.set(x, "compatibleNamespaceVersion", js.undefined)
    
    inline def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
