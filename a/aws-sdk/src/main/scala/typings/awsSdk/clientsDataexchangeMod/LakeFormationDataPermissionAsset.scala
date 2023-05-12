package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LakeFormationDataPermissionAsset extends StObject {
  
  /**
    * Details about the AWS Lake Formation data permission.
    */
  var LakeFormationDataPermissionDetails: typings.awsSdk.clientsDataexchangeMod.LakeFormationDataPermissionDetails
  
  /**
    * The data permission type.
    */
  var LakeFormationDataPermissionType: typings.awsSdk.clientsDataexchangeMod.LakeFormationDataPermissionType
  
  /**
    * The permissions granted to the subscribers on the resource.
    */
  var Permissions: ListOfLFPermissions
  
  /**
    * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake Formation data permissions.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.RoleArn] = js.undefined
}
object LakeFormationDataPermissionAsset {
  
  inline def apply(
    LakeFormationDataPermissionDetails: LakeFormationDataPermissionDetails,
    LakeFormationDataPermissionType: LakeFormationDataPermissionType,
    Permissions: ListOfLFPermissions
  ): LakeFormationDataPermissionAsset = {
    val __obj = js.Dynamic.literal(LakeFormationDataPermissionDetails = LakeFormationDataPermissionDetails.asInstanceOf[js.Any], LakeFormationDataPermissionType = LakeFormationDataPermissionType.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LakeFormationDataPermissionAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LakeFormationDataPermissionAsset] (val x: Self) extends AnyVal {
    
    inline def setLakeFormationDataPermissionDetails(value: LakeFormationDataPermissionDetails): Self = StObject.set(x, "LakeFormationDataPermissionDetails", value.asInstanceOf[js.Any])
    
    inline def setLakeFormationDataPermissionType(value: LakeFormationDataPermissionType): Self = StObject.set(x, "LakeFormationDataPermissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: ListOfLFPermissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: LFPermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
