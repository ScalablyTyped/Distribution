package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectPoliciesResponse extends js.Object {
  /**
    * A list of policy ObjectIdentifiers, that are attached to the object.
    */
  var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListObjectPoliciesResponse {
  @scala.inline
  def apply(AttachedPolicyIds: ObjectIdentifierList = null, NextToken: NextToken = null): ListObjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedPolicyIds != null) __obj.updateDynamic("AttachedPolicyIds")(AttachedPolicyIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListObjectPoliciesResponse]
  }
}

