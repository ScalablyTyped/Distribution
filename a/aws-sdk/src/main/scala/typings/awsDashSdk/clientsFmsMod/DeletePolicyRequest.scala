package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePolicyRequest extends js.Object {
  /**
    * If True, the request will also perform a clean-up process that will:   Delete rule groups created by AWS Firewall Manager   Remove web ACLs from in-scope resources   Delete web ACLs that contain no rules or rule groups   After the cleanup, in-scope resources will no longer be protected by web ACLs in this policy. Protection of out-of-scope resources will remain unchanged. Scope is determined by tags and accounts associated with the policy. When creating the policy, if you specified that only resources in specific accounts or with specific tags be protected by the policy, those resources are in-scope. All others are out of scope. If you did not specify tags or accounts, all resources are in-scope. 
    */
  var DeleteAllPolicyResources: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the policy that you want to delete. PolicyId is returned by PutPolicy and by ListPolicies.
    */
  var PolicyId: typings.awsDashSdk.clientsFmsMod.PolicyId
}

object DeletePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId, DeleteAllPolicyResources: js.UndefOr[scala.Boolean] = js.undefined): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
    if (!js.isUndefined(DeleteAllPolicyResources)) __obj.updateDynamic("DeleteAllPolicyResources")(DeleteAllPolicyResources)
    __obj.asInstanceOf[DeletePolicyRequest]
  }
}

