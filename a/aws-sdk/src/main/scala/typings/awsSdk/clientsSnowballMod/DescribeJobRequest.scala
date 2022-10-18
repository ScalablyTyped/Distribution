package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobRequest extends StObject {
  
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.clientsSnowballMod.JobId
}
object DescribeJobRequest {
  
  inline def apply(JobId: JobId): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRequest]
  }
  
  extension [Self <: DescribeJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
