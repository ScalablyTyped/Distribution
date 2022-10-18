package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobForDevicesRequest extends StObject {
  
  /**
    * IDs of target devices.
    */
  var DeviceIds: DeviceIdList
  
  /**
    * Configuration settings for a software update job.
    */
  var DeviceJobConfig: js.UndefOr[typings.awsSdk.clientsPanoramaMod.DeviceJobConfig] = js.undefined
  
  /**
    * The type of job to run.
    */
  var JobType: typings.awsSdk.clientsPanoramaMod.JobType
}
object CreateJobForDevicesRequest {
  
  inline def apply(DeviceIds: DeviceIdList, JobType: JobType): CreateJobForDevicesRequest = {
    val __obj = js.Dynamic.literal(DeviceIds = DeviceIds.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobForDevicesRequest]
  }
  
  extension [Self <: CreateJobForDevicesRequest](x: Self) {
    
    inline def setDeviceIds(value: DeviceIdList): Self = StObject.set(x, "DeviceIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdsVarargs(value: DeviceId*): Self = StObject.set(x, "DeviceIds", js.Array(value*))
    
    inline def setDeviceJobConfig(value: DeviceJobConfig): Self = StObject.set(x, "DeviceJobConfig", value.asInstanceOf[js.Any])
    
    inline def setDeviceJobConfigUndefined: Self = StObject.set(x, "DeviceJobConfig", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
  }
}
