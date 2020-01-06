package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroup extends js.Object {
  /**
    * The name of the AutoScalingGroup . 
    */
  var Name: js.UndefOr[ResourceId] = js.native
}

object AutoScalingGroup {
  @scala.inline
  def apply(Name: ResourceId = null): AutoScalingGroup = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroup]
  }
}

