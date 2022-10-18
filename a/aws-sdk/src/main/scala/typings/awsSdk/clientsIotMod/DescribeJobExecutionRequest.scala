package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobExecutionRequest extends StObject {
  
  /**
    * A string (consisting of the digits "0" through "9" which is used to specify a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
  
  /**
    * The name of the thing on which the job execution is running.
    */
  var thingName: ThingName
}
object DescribeJobExecutionRequest {
  
  inline def apply(jobId: JobId, thingName: ThingName): DescribeJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobExecutionRequest]
  }
  
  extension [Self <: DescribeJobExecutionRequest](x: Self) {
    
    inline def setExecutionNumber(value: ExecutionNumber): Self = StObject.set(x, "executionNumber", value.asInstanceOf[js.Any])
    
    inline def setExecutionNumberUndefined: Self = StObject.set(x, "executionNumber", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
