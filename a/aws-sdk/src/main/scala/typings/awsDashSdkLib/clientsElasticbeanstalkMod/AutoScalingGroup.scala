package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingGroup extends js.Object {
  /**
    * The name of the AutoScalingGroup . 
    */
  var Name: js.UndefOr[ResourceId] = js.undefined
}

object AutoScalingGroup {
  @scala.inline
  def apply(Name: ResourceId = null): AutoScalingGroup = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[AutoScalingGroup]
  }
}

