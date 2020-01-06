package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProcessingJobRequest extends js.Object {
  /**
    * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
    */
  var ProcessingJobName: typings.awsDashSdk.clientsSagemakerMod.ProcessingJobName = js.native
}

object DescribeProcessingJobRequest {
  @scala.inline
  def apply(ProcessingJobName: ProcessingJobName): DescribeProcessingJobRequest = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeProcessingJobRequest]
  }
}

