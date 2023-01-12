package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProcessingJobRequest extends StObject {
  
  /**
    * The name of the processing job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var ProcessingJobName: typings.awsSdk.clientsSagemakerMod.ProcessingJobName
}
object DescribeProcessingJobRequest {
  
  inline def apply(ProcessingJobName: ProcessingJobName): DescribeProcessingJobRequest = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProcessingJobRequest] (val x: Self) extends AnyVal {
    
    inline def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
  }
}
