package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectivePolicy extends js.Object {
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.undefined
  /**
    * The IAM policy document.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
}

object EffectivePolicy {
  @scala.inline
  def apply(policyArn: PolicyArn = null, policyDocument: PolicyDocument = null, policyName: PolicyName = null): EffectivePolicy = {
    val __obj = js.Dynamic.literal()
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn)
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument)
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    __obj.asInstanceOf[EffectivePolicy]
  }
}

