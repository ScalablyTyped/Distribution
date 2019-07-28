package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServiceAccessPoliciesRequest extends js.Object {
  /**
    * The access rules you want to configure. These rules replace any existing rules. 
    */
  var AccessPolicies: PolicyDocument
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
}

object UpdateServiceAccessPoliciesRequest {
  @scala.inline
  def apply(AccessPolicies: PolicyDocument, DomainName: DomainName): UpdateServiceAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies, DomainName = DomainName)
  
    __obj.asInstanceOf[UpdateServiceAccessPoliciesRequest]
  }
}

