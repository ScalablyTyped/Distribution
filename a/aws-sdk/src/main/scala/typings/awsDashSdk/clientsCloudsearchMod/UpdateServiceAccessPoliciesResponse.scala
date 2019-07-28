package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServiceAccessPoliciesResponse extends js.Object {
  /**
    * The access rules configured for the domain.
    */
  var AccessPolicies: AccessPoliciesStatus
}

object UpdateServiceAccessPoliciesResponse {
  @scala.inline
  def apply(AccessPolicies: AccessPoliciesStatus): UpdateServiceAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies)
  
    __obj.asInstanceOf[UpdateServiceAccessPoliciesResponse]
  }
}

