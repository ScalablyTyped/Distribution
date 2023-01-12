package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDetail extends StObject {
  
  var Arn: js.UndefOr[arnType] = js.undefined
  
  /**
    * A list of the managed policies attached to the user.
    */
  var AttachedManagedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the user was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of IAM groups that the user is in.
    */
  var GroupList: js.UndefOr[groupNameListType] = js.undefined
  
  /**
    * The path to the user. For more information about paths, see IAM identifiers in the IAM User Guide.
    */
  var Path: js.UndefOr[pathType] = js.undefined
  
  /**
    * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions boundaries for IAM identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
  
  /**
    * A list of tags that are associated with the user. For more information about tagging, see Tagging IAM resources in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
  
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM identifiers in the IAM User Guide.
    */
  var UserId: js.UndefOr[idType] = js.undefined
  
  /**
    * The friendly name identifying the user.
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
  
  /**
    * A list of the inline policies embedded in the user.
    */
  var UserPolicyList: js.UndefOr[policyDetailListType] = js.undefined
}
object UserDetail {
  
  inline def apply(): UserDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserDetail] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAttachedManagedPolicies(value: attachedPoliciesListType): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    inline def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    inline def setAttachedManagedPoliciesVarargs(value: AttachedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value*))
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setGroupList(value: groupNameListType): Self = StObject.set(x, "GroupList", value.asInstanceOf[js.Any])
    
    inline def setGroupListUndefined: Self = StObject.set(x, "GroupList", js.undefined)
    
    inline def setGroupListVarargs(value: groupNameType*): Self = StObject.set(x, "GroupList", js.Array(value*))
    
    inline def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPermissionsBoundary(value: AttachedPermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserId(value: idType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setUserPolicyList(value: policyDetailListType): Self = StObject.set(x, "UserPolicyList", value.asInstanceOf[js.Any])
    
    inline def setUserPolicyListUndefined: Self = StObject.set(x, "UserPolicyList", js.undefined)
    
    inline def setUserPolicyListVarargs(value: PolicyDetail*): Self = StObject.set(x, "UserPolicyList", js.Array(value*))
  }
}
