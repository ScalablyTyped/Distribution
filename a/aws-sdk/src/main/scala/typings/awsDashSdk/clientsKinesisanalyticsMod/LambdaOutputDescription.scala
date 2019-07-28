package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaOutputDescription extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.ResourceARN] = js.undefined
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsMod.RoleARN] = js.undefined
}

object LambdaOutputDescription {
  @scala.inline
  def apply(ResourceARN: ResourceARN = null, RoleARN: RoleARN = null): LambdaOutputDescription = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    __obj.asInstanceOf[LambdaOutputDescription]
  }
}

