package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateIamInstanceProfileSpecificationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The name of the instance profile.
    */
  var Name: js.UndefOr[String] = js.native
}

object LaunchTemplateIamInstanceProfileSpecificationRequest {
  @scala.inline
  def apply(Arn: String = null, Name: String = null): LaunchTemplateIamInstanceProfileSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateIamInstanceProfileSpecificationRequest]
  }
}

