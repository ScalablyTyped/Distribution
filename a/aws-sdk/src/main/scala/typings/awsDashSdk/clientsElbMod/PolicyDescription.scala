package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDescription extends js.Object {
  /**
    * The policy attributes.
    */
  var PolicyAttributeDescriptions: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyAttributeDescriptions] = js.undefined
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyName] = js.undefined
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyTypeName] = js.undefined
}

object PolicyDescription {
  @scala.inline
  def apply(
    PolicyAttributeDescriptions: PolicyAttributeDescriptions = null,
    PolicyName: PolicyName = null,
    PolicyTypeName: PolicyTypeName = null
  ): PolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (PolicyAttributeDescriptions != null) __obj.updateDynamic("PolicyAttributeDescriptions")(PolicyAttributeDescriptions)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    if (PolicyTypeName != null) __obj.updateDynamic("PolicyTypeName")(PolicyTypeName)
    __obj.asInstanceOf[PolicyDescription]
  }
}

