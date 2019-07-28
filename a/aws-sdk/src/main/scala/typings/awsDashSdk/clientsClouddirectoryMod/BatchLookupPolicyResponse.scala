package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchLookupPolicyResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
    */
  var PolicyToPathList: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.PolicyToPathList] = js.undefined
}

object BatchLookupPolicyResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PolicyToPathList: PolicyToPathList = null): BatchLookupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PolicyToPathList != null) __obj.updateDynamic("PolicyToPathList")(PolicyToPathList)
    __obj.asInstanceOf[BatchLookupPolicyResponse]
  }
}

