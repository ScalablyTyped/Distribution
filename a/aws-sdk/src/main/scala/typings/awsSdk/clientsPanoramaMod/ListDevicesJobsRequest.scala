package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesJobsRequest extends StObject {
  
  /**
    * Filter results by the job's target device ID.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsPanoramaMod.DeviceId] = js.undefined
  
  /**
    * The maximum number of device jobs to return in one page of results.
    */
  var MaxResults: js.UndefOr[MaxSize25] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
}
object ListDevicesJobsRequest {
  
  inline def apply(): ListDevicesJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDevicesJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setMaxResults(value: MaxSize25): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
