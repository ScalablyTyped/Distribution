package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokePermissionsRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The permissions revoked to the principal on the resource. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  var Permissions: PermissionList
  
  /**
    * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions to other principals.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.undefined
  
  /**
    * The principal to be revoked permissions on the resource.
    */
  var Principal: DataLakePrincipal
  
  /**
    * The resource to which permissions are to be revoked.
    */
  var Resource: typings.awsSdk.clientsLakeformationMod.Resource
}
object RevokePermissionsRequest {
  
  inline def apply(Permissions: PermissionList, Principal: DataLakePrincipal, Resource: Resource): RevokePermissionsRequest = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokePermissionsRequest]
  }
  
  extension [Self <: RevokePermissionsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setPermissionsWithGrantOption(value: PermissionList): Self = StObject.set(x, "PermissionsWithGrantOption", value.asInstanceOf[js.Any])
    
    inline def setPermissionsWithGrantOptionUndefined: Self = StObject.set(x, "PermissionsWithGrantOption", js.undefined)
    
    inline def setPermissionsWithGrantOptionVarargs(value: Permission*): Self = StObject.set(x, "PermissionsWithGrantOption", js.Array(value*))
    
    inline def setPrincipal(value: DataLakePrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
