package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketPermissionConfiguration extends StObject {
  
  /**
    * The account-level permissions settings that apply to the bucket.
    */
  var accountLevelPermissions: js.UndefOr[AccountLevelPermissions] = js.undefined
  
  /**
    * The bucket-level permissions settings for the bucket.
    */
  var bucketLevelPermissions: js.UndefOr[BucketLevelPermissions] = js.undefined
}
object BucketPermissionConfiguration {
  
  inline def apply(): BucketPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPermissionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketPermissionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAccountLevelPermissions(value: AccountLevelPermissions): Self = StObject.set(x, "accountLevelPermissions", value.asInstanceOf[js.Any])
    
    inline def setAccountLevelPermissionsUndefined: Self = StObject.set(x, "accountLevelPermissions", js.undefined)
    
    inline def setBucketLevelPermissions(value: BucketLevelPermissions): Self = StObject.set(x, "bucketLevelPermissions", value.asInstanceOf[js.Any])
    
    inline def setBucketLevelPermissionsUndefined: Self = StObject.set(x, "bucketLevelPermissions", js.undefined)
  }
}
