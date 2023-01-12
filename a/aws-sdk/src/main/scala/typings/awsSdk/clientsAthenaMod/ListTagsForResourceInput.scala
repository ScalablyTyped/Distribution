package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The maximum number of results to be returned per request that lists the tags for the resource.
    */
  var MaxResults: js.UndefOr[MaxTagsCount] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results for this request, where the request lists the tags for the resource with the specified ARN.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Lists the tags for the resource with the specified ARN.
    */
  var ResourceARN: AmazonResourceName
}
object ListTagsForResourceInput {
  
  inline def apply(ResourceARN: AmazonResourceName): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxTagsCount): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
