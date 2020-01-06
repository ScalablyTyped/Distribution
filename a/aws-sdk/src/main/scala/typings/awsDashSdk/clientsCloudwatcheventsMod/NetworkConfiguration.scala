package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfiguration extends js.Object {
  /**
    * Use this structure to specify the VPC subnets and security groups for the task and whether a public IP address is to be used. This structure is relevant only for ECS tasks that use the awsvpc network mode.
    */
  var awsvpcConfiguration: js.UndefOr[AwsVpcConfiguration] = js.native
}

object NetworkConfiguration {
  @scala.inline
  def apply(awsvpcConfiguration: AwsVpcConfiguration = null): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    if (awsvpcConfiguration != null) __obj.updateDynamic("awsvpcConfiguration")(awsvpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConfiguration]
  }
}

