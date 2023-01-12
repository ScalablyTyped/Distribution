package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrackersRequest extends StObject {
  
  /**
    * An optional limit for the number of resources returned in a single call.  Default value: 100 
    */
  var MaxResults: js.UndefOr[ListTrackersRequestMaxResultsInteger] = js.undefined
  
  /**
    * The pagination token specifying which page of results to return in the response. If no token is provided, the default page is the first page.  Default value: null 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListTrackersRequest {
  
  inline def apply(): ListTrackersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrackersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTrackersRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListTrackersRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
