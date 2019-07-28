package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentityPoliciesResponse extends js.Object {
  /**
    * A list of names of policies that apply to the specified identity.
    */
  var PolicyNames: PolicyNameList
}

object ListIdentityPoliciesResponse {
  @scala.inline
  def apply(PolicyNames: PolicyNameList): ListIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal(PolicyNames = PolicyNames)
  
    __obj.asInstanceOf[ListIdentityPoliciesResponse]
  }
}

