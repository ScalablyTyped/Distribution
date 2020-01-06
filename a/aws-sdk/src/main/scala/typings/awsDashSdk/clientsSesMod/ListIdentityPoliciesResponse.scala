package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoliciesResponse extends js.Object {
  /**
    * A list of names of policies that apply to the specified identity.
    */
  var PolicyNames: PolicyNameList = js.native
}

object ListIdentityPoliciesResponse {
  @scala.inline
  def apply(PolicyNames: PolicyNameList): ListIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal(PolicyNames = PolicyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListIdentityPoliciesResponse]
  }
}

