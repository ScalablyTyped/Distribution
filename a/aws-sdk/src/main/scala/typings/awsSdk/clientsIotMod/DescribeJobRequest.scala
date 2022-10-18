package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobRequest extends StObject {
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
}
object DescribeJobRequest {
  
  inline def apply(jobId: JobId): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRequest]
  }
  
  extension [Self <: DescribeJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
