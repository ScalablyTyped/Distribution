package typings.awsSdk

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

