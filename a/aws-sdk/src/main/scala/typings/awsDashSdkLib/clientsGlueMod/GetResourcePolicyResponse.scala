package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourcePolicyResponse extends js.Object {
  /**
    * The date and time at which the policy was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Contains the hash value associated with this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.undefined
  /**
    * Contains the requested policy document, in JSON format.
    */
  var PolicyInJson: js.UndefOr[PolicyJsonString] = js.undefined
  /**
    * The date and time at which the policy was last updated.
    */
  var UpdateTime: js.UndefOr[Timestamp] = js.undefined
}

object GetResourcePolicyResponse {
  @scala.inline
  def apply(
    CreateTime: Timestamp = null,
    PolicyHash: HashString = null,
    PolicyInJson: PolicyJsonString = null,
    UpdateTime: Timestamp = null
  ): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime)
    if (PolicyHash != null) __obj.updateDynamic("PolicyHash")(PolicyHash)
    if (PolicyInJson != null) __obj.updateDynamic("PolicyInJson")(PolicyInJson)
    if (UpdateTime != null) __obj.updateDynamic("UpdateTime")(UpdateTime)
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
}

