package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentClassificationJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.clientsComprehendMod.JobId
}
object DescribeDocumentClassificationJobRequest {
  
  inline def apply(JobId: JobId): DescribeDocumentClassificationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentClassificationJobRequest]
  }
  
  extension [Self <: DescribeDocumentClassificationJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
