package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCrawlersRequest extends StObject {
  
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object ListCrawlersRequest {
  
  inline def apply(): ListCrawlersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCrawlersRequest]
  }
  
  extension [Self <: ListCrawlersRequest](x: Self) {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
