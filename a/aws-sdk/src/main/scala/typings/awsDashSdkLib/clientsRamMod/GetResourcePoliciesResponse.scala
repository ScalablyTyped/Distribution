package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourcePoliciesResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * A key policy document, in JSON format.
    */
  var policies: js.UndefOr[PolicyList] = js.undefined
}

object GetResourcePoliciesResponse {
  @scala.inline
  def apply(nextToken: String = null, policies: PolicyList = null): GetResourcePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    __obj.asInstanceOf[GetResourcePoliciesResponse]
  }
}

