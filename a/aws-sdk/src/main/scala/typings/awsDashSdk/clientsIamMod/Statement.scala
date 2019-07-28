package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statement extends js.Object {
  /**
    * The row and column of the end of a Statement in an IAM policy.
    */
  var EndPosition: js.UndefOr[Position] = js.undefined
  /**
    * The identifier of the policy that was provided as an input.
    */
  var SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.undefined
  /**
    * The type of the policy.
    */
  var SourcePolicyType: js.UndefOr[PolicySourceType] = js.undefined
  /**
    * The row and column of the beginning of the Statement in an IAM policy.
    */
  var StartPosition: js.UndefOr[Position] = js.undefined
}

object Statement {
  @scala.inline
  def apply(
    EndPosition: Position = null,
    SourcePolicyId: PolicyIdentifierType = null,
    SourcePolicyType: PolicySourceType = null,
    StartPosition: Position = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    if (EndPosition != null) __obj.updateDynamic("EndPosition")(EndPosition)
    if (SourcePolicyId != null) __obj.updateDynamic("SourcePolicyId")(SourcePolicyId)
    if (SourcePolicyType != null) __obj.updateDynamic("SourcePolicyType")(SourcePolicyType.asInstanceOf[js.Any])
    if (StartPosition != null) __obj.updateDynamic("StartPosition")(StartPosition)
    __obj.asInstanceOf[Statement]
  }
}

