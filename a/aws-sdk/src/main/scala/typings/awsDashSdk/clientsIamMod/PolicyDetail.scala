package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDetail extends js.Object {
  /**
    * The policy document.
    */
  var PolicyDocument: js.UndefOr[policyDocumentType] = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.native
}

object PolicyDetail {
  @scala.inline
  def apply(PolicyDocument: policyDocumentType = null, PolicyName: policyNameType = null): PolicyDetail = {
    val __obj = js.Dynamic.literal()
    if (PolicyDocument != null) __obj.updateDynamic("PolicyDocument")(PolicyDocument.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDetail]
  }
}

