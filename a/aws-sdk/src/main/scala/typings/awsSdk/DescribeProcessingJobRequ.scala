package typings.awsSdk

import typings.awsSdk.sagemakerMod.ProcessingJobName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeProcessingJobRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeProcessingJobRequ extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
    */
  var ProcessingJobName: typings.awsSdk.sagemakerMod.ProcessingJobName = js.native
}

object DescribeProcessingJobRequ {
  @scala.inline
  def apply(ProcessingJobName: ProcessingJobName, $waiter: WaiterConfiguration = null): DescribeProcessingJobRequ = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobRequ]
  }
}

