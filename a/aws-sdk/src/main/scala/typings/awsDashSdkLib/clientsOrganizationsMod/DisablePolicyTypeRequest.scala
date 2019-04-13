package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisablePolicyTypeRequest extends js.Object {
  /**
    * The policy type that you want to disable in this root.
    */
  var PolicyType: awsDashSdkLib.clientsOrganizationsMod.PolicyType
  /**
    * The unique identifier (ID) of the root in which you want to disable a policy type. You can get the ID from the ListRoots operation. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lower-case letters or digits.
    */
  var RootId: awsDashSdkLib.clientsOrganizationsMod.RootId
}

object DisablePolicyTypeRequest {
  @scala.inline
  def apply(PolicyType: PolicyType, RootId: RootId): DisablePolicyTypeRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any], RootId = RootId)
  
    __obj.asInstanceOf[DisablePolicyTypeRequest]
  }
}

