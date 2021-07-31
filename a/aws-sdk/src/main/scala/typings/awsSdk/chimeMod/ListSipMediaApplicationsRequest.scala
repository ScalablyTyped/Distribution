package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSipMediaApplicationsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListSipMediaApplicationsRequest {
  
  @scala.inline
  def apply(): ListSipMediaApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSipMediaApplicationsRequest]
  }
  
  @scala.inline
  implicit class ListSipMediaApplicationsRequestMutableBuilder[Self <: ListSipMediaApplicationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
