package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceSpec extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var EnvironmentArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.EnvironmentArn] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[AppInstanceType] = js.native
}

object ResourceSpec {
  @scala.inline
  def apply(EnvironmentArn: EnvironmentArn = null, InstanceType: AppInstanceType = null): ResourceSpec = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentArn != null) __obj.updateDynamic("EnvironmentArn")(EnvironmentArn.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSpec]
  }
}

