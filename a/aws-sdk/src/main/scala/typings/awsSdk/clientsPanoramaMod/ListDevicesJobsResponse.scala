package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesJobsResponse extends StObject {
  
  /**
    * A list of jobs.
    */
  var DeviceJobs: js.UndefOr[DeviceJobList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
}
object ListDevicesJobsResponse {
  
  inline def apply(): ListDevicesJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDevicesJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceJobs(value: DeviceJobList): Self = StObject.set(x, "DeviceJobs", value.asInstanceOf[js.Any])
    
    inline def setDeviceJobsUndefined: Self = StObject.set(x, "DeviceJobs", js.undefined)
    
    inline def setDeviceJobsVarargs(value: DeviceJob*): Self = StObject.set(x, "DeviceJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
