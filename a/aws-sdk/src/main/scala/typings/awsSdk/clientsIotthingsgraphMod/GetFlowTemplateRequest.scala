package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFlowTemplateRequest extends StObject {
  
  /**
    * The ID of the workflow. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn
  
  /**
    * The number of the workflow revision to retrieve.
    */
  var revisionNumber: js.UndefOr[Version] = js.undefined
}
object GetFlowTemplateRequest {
  
  inline def apply(id: Urn): GetFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlowTemplateRequest]
  }
  
  extension [Self <: GetFlowTemplateRequest](x: Self) {
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumber(value: Version): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
  }
}
