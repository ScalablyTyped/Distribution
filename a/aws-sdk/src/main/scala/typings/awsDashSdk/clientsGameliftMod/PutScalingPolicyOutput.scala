package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutScalingPolicyOutput extends js.Object {
  /**
    * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object PutScalingPolicyOutput {
  @scala.inline
  def apply(Name: NonZeroAndMaxString = null): PutScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[PutScalingPolicyOutput]
  }
}

