package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleMapping extends StObject {
  
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
  
  inline def apply(Type: RoleMappingType): RoleMapping = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoleMapping] (val x: Self) extends AnyVal {
    
    inline def setAmbiguousRoleResolution(value: AmbiguousRoleResolutionType): Self = StObject.set(x, "AmbiguousRoleResolution", value.asInstanceOf[js.Any])
    
    inline def setAmbiguousRoleResolutionUndefined: Self = StObject.set(x, "AmbiguousRoleResolution", js.undefined)
    
    inline def setRulesConfiguration(value: RulesConfigurationType): Self = StObject.set(x, "RulesConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRulesConfigurationUndefined: Self = StObject.set(x, "RulesConfiguration", js.undefined)
    
    inline def setType(value: RoleMappingType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
