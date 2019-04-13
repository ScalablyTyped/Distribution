package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResourcePolicyRequest extends js.Object {
  /**
    * The hash value returned when this policy was set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.undefined
}

object DeleteResourcePolicyRequest {
  @scala.inline
  def apply(PolicyHashCondition: HashString = null): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (PolicyHashCondition != null) __obj.updateDynamic("PolicyHashCondition")(PolicyHashCondition)
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
}

