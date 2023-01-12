package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamPolicyDetails extends StObject {
  
  /**
    * The number of users, groups, and roles that the policy is attached to.
    */
  var AttachmentCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * When the policy was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the default version of the policy.
    */
  var DefaultVersionId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A description of the policy.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the policy can be attached to a user, group, or role.
    */
  var IsAttachable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path to the policy.
    */
  var Path: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of users and roles that use the policy to set the permissions boundary.
    */
  var PermissionsBoundaryUsageCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The unique identifier of the policy.
    */
  var PolicyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * List of versions of the policy.
    */
  var PolicyVersionList: js.UndefOr[AwsIamPolicyVersionList] = js.undefined
  
  /**
    * When the policy was most recently updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdateDate: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamPolicyDetails {
  
  inline def apply(): AwsIamPolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamPolicyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsIamPolicyDetails] (val x: Self) extends AnyVal {
    
    inline def setAttachmentCount(value: Integer): Self = StObject.set(x, "AttachmentCount", value.asInstanceOf[js.Any])
    
    inline def setAttachmentCountUndefined: Self = StObject.set(x, "AttachmentCount", js.undefined)
    
    inline def setCreateDate(value: NonEmptyString): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDefaultVersionId(value: NonEmptyString): Self = StObject.set(x, "DefaultVersionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionIdUndefined: Self = StObject.set(x, "DefaultVersionId", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsAttachable(value: Boolean): Self = StObject.set(x, "IsAttachable", value.asInstanceOf[js.Any])
    
    inline def setIsAttachableUndefined: Self = StObject.set(x, "IsAttachable", js.undefined)
    
    inline def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPermissionsBoundaryUsageCount(value: Integer): Self = StObject.set(x, "PermissionsBoundaryUsageCount", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUsageCountUndefined: Self = StObject.set(x, "PermissionsBoundaryUsageCount", js.undefined)
    
    inline def setPolicyId(value: NonEmptyString): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    inline def setPolicyVersionList(value: AwsIamPolicyVersionList): Self = StObject.set(x, "PolicyVersionList", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionListUndefined: Self = StObject.set(x, "PolicyVersionList", js.undefined)
    
    inline def setPolicyVersionListVarargs(value: AwsIamPolicyVersion*): Self = StObject.set(x, "PolicyVersionList", js.Array(value*))
    
    inline def setUpdateDate(value: NonEmptyString): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateUndefined: Self = StObject.set(x, "UpdateDate", js.undefined)
  }
}
