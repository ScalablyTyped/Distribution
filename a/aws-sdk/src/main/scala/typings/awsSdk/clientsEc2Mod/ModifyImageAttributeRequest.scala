package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyImageAttributeRequest extends StObject {
  
  /**
    * The name of the attribute to modify. Valid values: description | launchPermission 
    */
  var Attribute: js.UndefOr[String] = js.undefined
  
  /**
    * A new description for the AMI.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.clientsEc2Mod.ImageId
  
  /**
    * A new launch permission for the AMI.
    */
  var LaunchPermission: js.UndefOr[LaunchPermissionModifications] = js.undefined
  
  /**
    * The operation type. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var OperationType: js.UndefOr[typings.awsSdk.clientsEc2Mod.OperationType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an organization. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var OrganizationArns: js.UndefOr[OrganizationArnStringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an organizational unit (OU). This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var OrganizationalUnitArns: js.UndefOr[OrganizationalUnitArnStringList] = js.undefined
  
  /**
    * Not supported.
    */
  var ProductCodes: js.UndefOr[ProductCodeStringList] = js.undefined
  
  /**
    * The user groups. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserGroups: js.UndefOr[UserGroupStringList] = js.undefined
  
  /**
    * The Amazon Web Services account IDs. This parameter can be used only when the Attribute parameter is launchPermission.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.undefined
  
  /**
    * The value of the attribute being modified. This parameter can be used only when the Attribute parameter is description.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object ModifyImageAttributeRequest {
  
  inline def apply(ImageId: ImageId): ModifyImageAttributeRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyImageAttributeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyImageAttributeRequest] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setDescription(value: AttributeValue): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setLaunchPermission(value: LaunchPermissionModifications): Self = StObject.set(x, "LaunchPermission", value.asInstanceOf[js.Any])
    
    inline def setLaunchPermissionUndefined: Self = StObject.set(x, "LaunchPermission", js.undefined)
    
    inline def setOperationType(value: OperationType): Self = StObject.set(x, "OperationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "OperationType", js.undefined)
    
    inline def setOrganizationArns(value: OrganizationArnStringList): Self = StObject.set(x, "OrganizationArns", value.asInstanceOf[js.Any])
    
    inline def setOrganizationArnsUndefined: Self = StObject.set(x, "OrganizationArns", js.undefined)
    
    inline def setOrganizationArnsVarargs(value: String*): Self = StObject.set(x, "OrganizationArns", js.Array(value*))
    
    inline def setOrganizationalUnitArns(value: OrganizationalUnitArnStringList): Self = StObject.set(x, "OrganizationalUnitArns", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitArnsUndefined: Self = StObject.set(x, "OrganizationalUnitArns", js.undefined)
    
    inline def setOrganizationalUnitArnsVarargs(value: String*): Self = StObject.set(x, "OrganizationalUnitArns", js.Array(value*))
    
    inline def setProductCodes(value: ProductCodeStringList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: String*): Self = StObject.set(x, "ProductCodes", js.Array(value*))
    
    inline def setUserGroups(value: UserGroupStringList): Self = StObject.set(x, "UserGroups", value.asInstanceOf[js.Any])
    
    inline def setUserGroupsUndefined: Self = StObject.set(x, "UserGroups", js.undefined)
    
    inline def setUserGroupsVarargs(value: String*): Self = StObject.set(x, "UserGroups", js.Array(value*))
    
    inline def setUserIds(value: UserIdStringList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    inline def setUserIdsVarargs(value: String*): Self = StObject.set(x, "UserIds", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
