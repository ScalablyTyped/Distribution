package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSigningProfilesRequest extends StObject {
  
  /**
    * Designates whether to include profiles with the status of CANCELED.
    */
  var includeCanceled: js.UndefOr[bool] = js.undefined
  
  /**
    * The maximum number of profiles to be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Filters results to return only signing jobs initiated for a specified signing platform.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * Filters results to return only signing jobs with statuses in the specified list.
    */
  var statuses: js.UndefOr[Statuses] = js.undefined
}
object ListSigningProfilesRequest {
  
  inline def apply(): ListSigningProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningProfilesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSigningProfilesRequest] (val x: Self) extends AnyVal {
    
    inline def setIncludeCanceled(value: bool): Self = StObject.set(x, "includeCanceled", value.asInstanceOf[js.Any])
    
    inline def setIncludeCanceledUndefined: Self = StObject.set(x, "includeCanceled", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    inline def setStatuses(value: Statuses): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: SigningProfileStatus*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
