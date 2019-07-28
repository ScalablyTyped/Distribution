package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServiceAccessPoliciesResponse extends js.Object {
  /**
    * The access rules configured for the domain specified in the request.
    */
  var AccessPolicies: AccessPoliciesStatus
}

object DescribeServiceAccessPoliciesResponse {
  @scala.inline
  def apply(AccessPolicies: AccessPoliciesStatus): DescribeServiceAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies)
  
    __obj.asInstanceOf[DescribeServiceAccessPoliciesResponse]
  }
}

