package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionConfiguration extends StObject {
  
  /**
    * Contains information about the account level permissions on the S3 bucket.
    */
  var AccountLevelPermissions: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.AccountLevelPermissions] = js.undefined
  
  /**
    * Contains information about the bucket level permissions for the S3 bucket.
    */
  var BucketLevelPermissions: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.BucketLevelPermissions] = js.undefined
}
object PermissionConfiguration {
  
  inline def apply(): PermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAccountLevelPermissions(value: AccountLevelPermissions): Self = StObject.set(x, "AccountLevelPermissions", value.asInstanceOf[js.Any])
    
    inline def setAccountLevelPermissionsUndefined: Self = StObject.set(x, "AccountLevelPermissions", js.undefined)
    
    inline def setBucketLevelPermissions(value: BucketLevelPermissions): Self = StObject.set(x, "BucketLevelPermissions", value.asInstanceOf[js.Any])
    
    inline def setBucketLevelPermissionsUndefined: Self = StObject.set(x, "BucketLevelPermissions", js.undefined)
  }
}
