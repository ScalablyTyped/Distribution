package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClassificationJobRequest extends StObject {
  
  /**
    * The unique identifier for the classification job.
    */
  var jobId: string
}
object DescribeClassificationJobRequest {
  
  inline def apply(jobId: string): DescribeClassificationJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClassificationJobRequest]
  }
  
  extension [Self <: DescribeClassificationJobRequest](x: Self) {
    
    inline def setJobId(value: string): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
