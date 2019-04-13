package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyResponse extends js.Object {
  /**
    * The resource-based policy.
    */
  var Policy: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
}

object GetPolicyResponse {
  @scala.inline
  def apply(Policy: String = null, RevisionId: String = null): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    __obj.asInstanceOf[GetPolicyResponse]
  }
}

