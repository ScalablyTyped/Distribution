package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageScanFindingsRequest extends StObject {
  
  /**
    * An array of name value pairs that you can use to filter your results. You can use the following filters to streamline results:    imageBuildVersionArn     imagePipelineArn     vulnerabilityId     severity    If you don't request a filter, then all findings in your account are listed.
    */
  var filters: js.UndefOr[ImageScanFindingsFilterList] = js.undefined
  
  /**
    * The maximum items to return in a request.
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImageScanFindingsRequest {
  
  inline def apply(): ListImageScanFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageScanFindingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImageScanFindingsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: ImageScanFindingsFilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ImageScanFindingsFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
