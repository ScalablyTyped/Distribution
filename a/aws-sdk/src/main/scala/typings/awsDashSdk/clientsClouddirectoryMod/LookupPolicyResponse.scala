package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupPolicyResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
  /**
    * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
    */
  var PolicyToPathList: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.PolicyToPathList] = js.native
}

object LookupPolicyResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PolicyToPathList: PolicyToPathList = null): LookupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PolicyToPathList != null) __obj.updateDynamic("PolicyToPathList")(PolicyToPathList.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupPolicyResponse]
  }
}

