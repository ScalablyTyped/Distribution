package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamUserDetails extends StObject {
  
  /**
    * A list of the managed policies that are attached to the user.
    */
  var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.undefined
  
  /**
    * Indicates when the user was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of IAM groups that the user belongs to.
    */
  var GroupList: js.UndefOr[StringList] = js.undefined
  
  /**
    * The path to the user.
    */
  var Path: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The permissions boundary for the user.
    */
  var PermissionsBoundary: js.UndefOr[AwsIamPermissionsBoundary] = js.undefined
  
  /**
    * The unique identifier for the user.
    */
  var UserId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the user.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of inline policies that are embedded in the user.
    */
  var UserPolicyList: js.UndefOr[AwsIamUserPolicyList] = js.undefined
}
object AwsIamUserDetails {
  
  inline def apply(): AwsIamUserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamUserDetails]
  }
  
  extension [Self <: AwsIamUserDetails](x: Self) {
    
    inline def setAttachedManagedPolicies(value: AwsIamAttachedManagedPolicyList): Self = StObject.set(x, "AttachedManagedPolicies", value.asInstanceOf[js.Any])
    
    inline def setAttachedManagedPoliciesUndefined: Self = StObject.set(x, "AttachedManagedPolicies", js.undefined)
    
    inline def setAttachedManagedPoliciesVarargs(value: AwsIamAttachedManagedPolicy*): Self = StObject.set(x, "AttachedManagedPolicies", js.Array(value*))
    
    inline def setCreateDate(value: NonEmptyString): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setGroupList(value: StringList): Self = StObject.set(x, "GroupList", value.asInstanceOf[js.Any])
    
    inline def setGroupListUndefined: Self = StObject.set(x, "GroupList", js.undefined)
    
    inline def setGroupListVarargs(value: NonEmptyString*): Self = StObject.set(x, "GroupList", js.Array(value*))
    
    inline def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPermissionsBoundary(value: AwsIamPermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
    
    inline def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    inline def setUserName(value: NonEmptyString): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setUserPolicyList(value: AwsIamUserPolicyList): Self = StObject.set(x, "UserPolicyList", value.asInstanceOf[js.Any])
    
    inline def setUserPolicyListUndefined: Self = StObject.set(x, "UserPolicyList", js.undefined)
    
    inline def setUserPolicyListVarargs(value: AwsIamUserPolicy*): Self = StObject.set(x, "UserPolicyList", js.Array(value*))
  }
}
