package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeICD10CMInferenceJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend Medical generated for the job. The StartICD10CMInferenceJob operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.clientsComprehendmedicalMod.JobId
}
object DescribeICD10CMInferenceJobRequest {
  
  inline def apply(JobId: JobId): DescribeICD10CMInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeICD10CMInferenceJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeICD10CMInferenceJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
