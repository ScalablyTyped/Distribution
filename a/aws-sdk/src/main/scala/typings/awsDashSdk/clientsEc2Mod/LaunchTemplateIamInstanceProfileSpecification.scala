package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateIamInstanceProfileSpecification extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * The name of the instance profile.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object LaunchTemplateIamInstanceProfileSpecification {
  @scala.inline
  def apply(Arn: String = null, Name: String = null): LaunchTemplateIamInstanceProfileSpecification = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[LaunchTemplateIamInstanceProfileSpecification]
  }
}

