package typings.awsSdk.anon

import typings.awsSdk.sagemakerMod.TrainingJobName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeTrainingJobRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeTrainingJobReques extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the training job.
    */
  var TrainingJobName: typings.awsSdk.sagemakerMod.TrainingJobName = js.native
}

object DescribeTrainingJobReques {
  @scala.inline
  def apply(TrainingJobName: TrainingJobName, $waiter: WaiterConfiguration = null): DescribeTrainingJobReques = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrainingJobReques]
  }
}

