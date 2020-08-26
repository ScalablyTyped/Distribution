package typings.awsSdk.anon

import typings.awsSdk.sagemakerMod.ProcessingJobName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeProcessingJobRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
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
  def apply(ProcessingJobName: ProcessingJobName): DescribeProcessingJobRequ = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobRequ]
  }
  @scala.inline
  implicit class DescribeProcessingJobRequOps[Self <: DescribeProcessingJobRequ] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProcessingJobName(value: ProcessingJobName): Self = this.set("ProcessingJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

