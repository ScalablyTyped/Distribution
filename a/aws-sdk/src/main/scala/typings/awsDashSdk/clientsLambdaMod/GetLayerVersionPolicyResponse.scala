package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLayerVersionPolicyResponse extends js.Object {
  /**
    * The policy document.
    */
  var Policy: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
}

object GetLayerVersionPolicyResponse {
  @scala.inline
  def apply(Policy: String = null, RevisionId: String = null): GetLayerVersionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    __obj.asInstanceOf[GetLayerVersionPolicyResponse]
  }
}

