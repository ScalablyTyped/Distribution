package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFeaturedResultsSetsRequest extends StObject {
  
  /**
    * The identifier of the index used for featuring results.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The maximum number of featured results sets to return.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListFeaturedResultsSetsRequest] = js.undefined
  
  /**
    * If the response is truncated, Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of featured results sets.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListFeaturedResultsSetsRequest {
  
  inline def apply(IndexId: IndexId): ListFeaturedResultsSetsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFeaturedResultsSetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFeaturedResultsSetsRequest] (val x: Self) extends AnyVal {
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsIntegerForListFeaturedResultsSetsRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
