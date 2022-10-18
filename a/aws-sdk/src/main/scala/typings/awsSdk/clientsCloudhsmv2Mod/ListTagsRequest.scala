package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsRequest extends StObject {
  
  /**
    * The maximum number of tags to return in the response. When there are more tags than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[MaxSize] = js.undefined
  
  /**
    * The NextToken value that you received in the previous response. Use this value to get more tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.NextToken] = js.undefined
  
  /**
    * The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use DescribeClusters.
    */
  var ResourceId: typings.awsSdk.clientsCloudhsmv2Mod.ResourceId
}
object ListTagsRequest {
  
  inline def apply(ResourceId: ResourceId): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  extension [Self <: ListTagsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
