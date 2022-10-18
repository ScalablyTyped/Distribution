package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The maximum number of locations to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsDatasyncMod.MaxResults] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin the next list of locations.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDatasyncMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags to list.
    */
  var ResourceArn: TaggableResourceArn
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceArn: TaggableResourceArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArn(value: TaggableResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
