package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViolationDetail extends StObject {
  
  /**
    * The Amazon Web Services account that the violation details were requested for.
    */
  var MemberAccount: AWSAccountId
  
  /**
    * The ID of the Firewall Manager policy that the violation details were requested for.
    */
  var PolicyId: typings.awsSdk.clientsFmsMod.PolicyId
  
  /**
    * Brief description for the requested resource.
    */
  var ResourceDescription: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The resource ID that the violation details were requested for.
    */
  var ResourceId: typings.awsSdk.clientsFmsMod.ResourceId
  
  /**
    * The ResourceTag objects associated with the resource.
    */
  var ResourceTags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The resource type that the violation details were requested for.
    */
  var ResourceType: typings.awsSdk.clientsFmsMod.ResourceType
  
  /**
    * List of violations for the requested resource.
    */
  var ResourceViolations: typings.awsSdk.clientsFmsMod.ResourceViolations
}
object ViolationDetail {
  
  inline def apply(
    MemberAccount: AWSAccountId,
    PolicyId: PolicyId,
    ResourceId: ResourceId,
    ResourceType: ResourceType,
    ResourceViolations: ResourceViolations
  ): ViolationDetail = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResourceViolations = ResourceViolations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolationDetail]
  }
  
  extension [Self <: ViolationDetail](x: Self) {
    
    inline def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setResourceDescription(value: LengthBoundedString): Self = StObject.set(x, "ResourceDescription", value.asInstanceOf[js.Any])
    
    inline def setResourceDescriptionUndefined: Self = StObject.set(x, "ResourceDescription", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceTags(value: TagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: Tag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceViolations(value: ResourceViolations): Self = StObject.set(x, "ResourceViolations", value.asInstanceOf[js.Any])
    
    inline def setResourceViolationsVarargs(value: ResourceViolation*): Self = StObject.set(x, "ResourceViolations", js.Array(value*))
  }
}
