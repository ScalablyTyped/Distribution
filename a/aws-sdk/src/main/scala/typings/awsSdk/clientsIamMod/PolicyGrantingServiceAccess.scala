package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyGrantingServiceAccess extends StObject {
  
  /**
    * The name of the entity (user or role) to which the inline policy is attached. This field is null for managed policies. For more information about these policy types, see Managed policies and inline policies in the IAM User Guide.
    */
  var EntityName: js.UndefOr[entityNameType] = js.undefined
  
  /**
    * The type of entity (user or role) that used the policy to access the service to which the inline policy is attached. This field is null for managed policies. For more information about these policy types, see Managed policies and inline policies in the IAM User Guide.
    */
  var EntityType: js.UndefOr[policyOwnerEntityType] = js.undefined
  
  var PolicyArn: js.UndefOr[arnType] = js.undefined
  
  /**
    * The policy name.
    */
  var PolicyName: policyNameType
  
  /**
    * The policy type. For more information about these policy types, see Managed policies and inline policies in the IAM User Guide.
    */
  var PolicyType: policyType
}
object PolicyGrantingServiceAccess {
  
  inline def apply(PolicyName: policyNameType, PolicyType: policyType): PolicyGrantingServiceAccess = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], PolicyType = PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGrantingServiceAccess]
  }
  
  extension [Self <: PolicyGrantingServiceAccess](x: Self) {
    
    inline def setEntityName(value: entityNameType): Self = StObject.set(x, "EntityName", value.asInstanceOf[js.Any])
    
    inline def setEntityNameUndefined: Self = StObject.set(x, "EntityName", js.undefined)
    
    inline def setEntityType(value: policyOwnerEntityType): Self = StObject.set(x, "EntityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "EntityType", js.undefined)
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    inline def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyType(value: policyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
  }
}
