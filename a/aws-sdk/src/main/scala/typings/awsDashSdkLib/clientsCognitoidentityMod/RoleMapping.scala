package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleMapping extends js.Object {
  /**
    * If you specify Token or Rules as the Type, AmbiguousRoleResolution is required. Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type.
    */
  var AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType] = js.undefined
  /**
    * The rules to be used for mapping users to roles. If you specify Rules as the role mapping type, RulesConfiguration is required.
    */
  var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined
  /**
    * The role mapping type. Token will use cognito:roles and cognito:preferred_role claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the token to map to a role.
    */
  var Type: RoleMappingType
}

object RoleMapping {
  @scala.inline
  def apply(
    Type: RoleMappingType,
    AmbiguousRoleResolution: AmbiguousRoleResolutionType = null,
    RulesConfiguration: RulesConfigurationType = null
  ): RoleMapping = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (AmbiguousRoleResolution != null) __obj.updateDynamic("AmbiguousRoleResolution")(AmbiguousRoleResolution.asInstanceOf[js.Any])
    if (RulesConfiguration != null) __obj.updateDynamic("RulesConfiguration")(RulesConfiguration)
    __obj.asInstanceOf[RoleMapping]
  }
}

