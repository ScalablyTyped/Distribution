package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRelatedResourcesForAuditFindingResponse extends StObject {
  
  /**
    * A token that can be used to retrieve the next set of results, or null for the first API call.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The related resources.
    */
  var relatedResources: js.UndefOr[RelatedResources] = js.undefined
}
object ListRelatedResourcesForAuditFindingResponse {
  
  inline def apply(): ListRelatedResourcesForAuditFindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRelatedResourcesForAuditFindingResponse]
  }
  
  extension [Self <: ListRelatedResourcesForAuditFindingResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRelatedResources(value: RelatedResources): Self = StObject.set(x, "relatedResources", value.asInstanceOf[js.Any])
    
    inline def setRelatedResourcesUndefined: Self = StObject.set(x, "relatedResources", js.undefined)
    
    inline def setRelatedResourcesVarargs(value: RelatedResource*): Self = StObject.set(x, "relatedResources", js.Array(value*))
  }
}
