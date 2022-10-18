package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * (Optional) Specifies the maximum number of tag objects to return in the response. The default value is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsEfsMod.MaxResults] = js.undefined
  
  /**
    * (Optional) You can use NextToken in a subsequent request to fetch the next page of access point descriptions if the response payload was paginated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and access points using this API endpoint.
    */
  var ResourceId: typings.awsSdk.clientsEfsMod.ResourceId
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceId: ResourceId): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
