package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyGrantingServiceAccess extends js.Object {
  /**
    * The name of the entity (user or role) to which the inline policy is attached. This field is null for managed policies. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  var EntityName: js.UndefOr[entityNameType] = js.undefined
  /**
    * The type of entity (user or role) that used the policy to access the service to which the inline policy is attached. This field is null for managed policies. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  var EntityType: js.UndefOr[policyOwnerEntityType] = js.undefined
  var PolicyArn: js.UndefOr[arnType] = js.undefined
  /**
    * The policy name.
    */
  var PolicyName: policyNameType
  /**
    * The policy type. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  var PolicyType: policyType
}

object PolicyGrantingServiceAccess {
  @scala.inline
  def apply(
    PolicyName: policyNameType,
    PolicyType: policyType,
    EntityName: entityNameType = null,
    EntityType: policyOwnerEntityType = null,
    PolicyArn: arnType = null
  ): PolicyGrantingServiceAccess = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName, PolicyType = PolicyType.asInstanceOf[js.Any])
    if (EntityName != null) __obj.updateDynamic("EntityName")(EntityName)
    if (EntityType != null) __obj.updateDynamic("EntityType")(EntityType.asInstanceOf[js.Any])
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn)
    __obj.asInstanceOf[PolicyGrantingServiceAccess]
  }
}

