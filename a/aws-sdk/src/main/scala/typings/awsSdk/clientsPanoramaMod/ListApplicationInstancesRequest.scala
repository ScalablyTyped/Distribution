package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationInstancesRequest extends StObject {
  
  /**
    * The application instances' device ID.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsPanoramaMod.DeviceId] = js.undefined
  
  /**
    * The maximum number of application instances to return in one page of results.
    */
  var MaxResults: js.UndefOr[MaxSize25] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
  
  /**
    * Only include instances with a specific status.
    */
  var StatusFilter: js.UndefOr[typings.awsSdk.clientsPanoramaMod.StatusFilter] = js.undefined
}
object ListApplicationInstancesRequest {
  
  inline def apply(): ListApplicationInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationInstancesRequest]
  }
  
  extension [Self <: ListApplicationInstancesRequest](x: Self) {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setMaxResults(value: MaxSize25): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusFilter(value: StatusFilter): Self = StObject.set(x, "StatusFilter", value.asInstanceOf[js.Any])
    
    inline def setStatusFilterUndefined: Self = StObject.set(x, "StatusFilter", js.undefined)
  }
}
