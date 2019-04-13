package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachedPolicy extends js.Object {
  var PolicyArn: js.UndefOr[arnType] = js.undefined
  /**
    * The friendly name of the attached policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
}

object AttachedPolicy {
  @scala.inline
  def apply(PolicyArn: arnType = null, PolicyName: policyNameType = null): AttachedPolicy = {
    val __obj = js.Dynamic.literal()
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    __obj.asInstanceOf[AttachedPolicy]
  }
}

