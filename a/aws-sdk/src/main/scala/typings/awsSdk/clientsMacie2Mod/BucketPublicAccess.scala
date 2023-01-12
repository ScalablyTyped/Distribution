package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketPublicAccess extends StObject {
  
  /**
    *  Specifies whether the bucket is publicly accessible due to the combination of permissions settings that apply to the bucket. Possible values are: NOT_PUBLIC - The bucket isn't publicly accessible. PUBLIC - The bucket is publicly accessible. UNKNOWN - Amazon Macie can't determine whether the bucket is publicly accessible.
    */
  var effectivePermission: js.UndefOr[EffectivePermission] = js.undefined
  
  /**
    * The account-level and bucket-level permissions settings for the bucket.
    */
  var permissionConfiguration: js.UndefOr[BucketPermissionConfiguration] = js.undefined
}
object BucketPublicAccess {
  
  inline def apply(): BucketPublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPublicAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketPublicAccess] (val x: Self) extends AnyVal {
    
    inline def setEffectivePermission(value: EffectivePermission): Self = StObject.set(x, "effectivePermission", value.asInstanceOf[js.Any])
    
    inline def setEffectivePermissionUndefined: Self = StObject.set(x, "effectivePermission", js.undefined)
    
    inline def setPermissionConfiguration(value: BucketPermissionConfiguration): Self = StObject.set(x, "permissionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPermissionConfigurationUndefined: Self = StObject.set(x, "permissionConfiguration", js.undefined)
  }
}
