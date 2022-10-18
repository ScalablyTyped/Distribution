package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsResponse extends StObject {
  
  /**
    * The token for the next set of retrievable results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The number of query results that Amazon Web Services returns at a time.
    */
  var ReturnSize: PageSize
  
  /**
    * The tags that match your request.
    */
  var Tags: TagList
  
  /**
    * The total number of query results.
    */
  var TotalSize: PageSize
}
object GetTagsResponse {
  
  inline def apply(ReturnSize: PageSize, Tags: TagList, TotalSize: PageSize): GetTagsResponse = {
    val __obj = js.Dynamic.literal(ReturnSize = ReturnSize.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], TotalSize = TotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsResponse]
  }
  
  extension [Self <: GetTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setReturnSize(value: PageSize): Self = StObject.set(x, "ReturnSize", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Entity*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTotalSize(value: PageSize): Self = StObject.set(x, "TotalSize", value.asInstanceOf[js.Any])
  }
}
