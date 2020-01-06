package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaOutputDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination Lambda function.
    */
  var ResourceARN: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ResourceARN = js.native
  /**
    * The ARN of the IAM role that Kinesis Data Analytics can assume to write to the destination function.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RoleARN] = js.native
}

object LambdaOutputDescription {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN = null): LambdaOutputDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaOutputDescription]
  }
}

