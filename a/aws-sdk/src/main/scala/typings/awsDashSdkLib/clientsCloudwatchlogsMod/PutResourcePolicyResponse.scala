package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutResourcePolicyResponse extends js.Object {
  /**
    * The new policy.
    */
  var resourcePolicy: js.UndefOr[ResourcePolicy] = js.undefined
}

object PutResourcePolicyResponse {
  @scala.inline
  def apply(resourcePolicy: ResourcePolicy = null): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicy != null) __obj.updateDynamic("resourcePolicy")(resourcePolicy)
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
}

