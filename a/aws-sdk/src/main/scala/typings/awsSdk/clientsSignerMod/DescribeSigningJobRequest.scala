package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSigningJobRequest extends StObject {
  
  /**
    * The ID of the signing job on input.
    */
  var jobId: JobId
}
object DescribeSigningJobRequest {
  
  inline def apply(jobId: JobId): DescribeSigningJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSigningJobRequest]
  }
  
  extension [Self <: DescribeSigningJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
