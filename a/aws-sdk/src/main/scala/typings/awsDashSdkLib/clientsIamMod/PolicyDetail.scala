package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDetail extends js.Object {
  /**
    * The policy document.
    */
  var PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
}

object PolicyDetail {
  @scala.inline
  def apply(PolicyDocument: policyDocumentType = null, PolicyName: policyNameType = null): PolicyDetail = {
    val __obj = js.Dynamic.literal()
    if (PolicyDocument != null) __obj.updateDynamic("PolicyDocument")(PolicyDocument)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    __obj.asInstanceOf[PolicyDetail]
  }
}

