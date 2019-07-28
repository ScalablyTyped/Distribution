package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListObjectPoliciesResponse extends js.Object {
  /**
    * A list of policy ObjectIdentifiers, that are attached to the object.
    */
  var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}

object BatchListObjectPoliciesResponse {
  @scala.inline
  def apply(AttachedPolicyIds: ObjectIdentifierList = null, NextToken: NextToken = null): BatchListObjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedPolicyIds != null) __obj.updateDynamic("AttachedPolicyIds")(AttachedPolicyIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchListObjectPoliciesResponse]
  }
}

