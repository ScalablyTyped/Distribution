package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.undefined
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
}

object Policy {
  @scala.inline
  def apply(policyArn: PolicyArn = null, policyName: PolicyName = null): Policy = {
    val __obj = js.Dynamic.literal()
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn)
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    __obj.asInstanceOf[Policy]
  }
}

