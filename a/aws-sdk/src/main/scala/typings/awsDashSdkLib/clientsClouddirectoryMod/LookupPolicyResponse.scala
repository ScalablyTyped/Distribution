package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupPolicyResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
    */
  var PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined
}

object LookupPolicyResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PolicyToPathList: PolicyToPathList = null): LookupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PolicyToPathList != null) __obj.updateDynamic("PolicyToPathList")(PolicyToPathList)
    __obj.asInstanceOf[LookupPolicyResponse]
  }
}

