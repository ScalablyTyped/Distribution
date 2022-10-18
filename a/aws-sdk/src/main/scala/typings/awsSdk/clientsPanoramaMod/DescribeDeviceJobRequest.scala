package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceJobRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var JobId: typings.awsSdk.clientsPanoramaMod.JobId
}
object DescribeDeviceJobRequest {
  
  inline def apply(JobId: JobId): DescribeDeviceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceJobRequest]
  }
  
  extension [Self <: DescribeDeviceJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
