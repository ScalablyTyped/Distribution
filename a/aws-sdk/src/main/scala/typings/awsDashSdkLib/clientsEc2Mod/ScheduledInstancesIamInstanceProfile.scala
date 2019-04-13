package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledInstancesIamInstanceProfile extends js.Object {
  /**
    * The Amazon Resource Name (ARN).
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * The name.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object ScheduledInstancesIamInstanceProfile {
  @scala.inline
  def apply(Arn: String = null, Name: String = null): ScheduledInstancesIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ScheduledInstancesIamInstanceProfile]
  }
}

