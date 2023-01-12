package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLevelPermissions extends StObject {
  
  /**
    * The permissions settings of the access control list (ACL) for the bucket. This value is null if an ACL hasn't been defined for the bucket.
    */
  var accessControlList: js.UndefOr[AccessControlList] = js.undefined
  
  /**
    * The block public access settings for the bucket.
    */
  var blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.undefined
  
  /**
    * The permissions settings of the bucket policy for the bucket. This value is null if a bucket policy hasn't been defined for the bucket.
    */
  var bucketPolicy: js.UndefOr[BucketPolicy] = js.undefined
}
object BucketLevelPermissions {
  
  inline def apply(): BucketLevelPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLevelPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketLevelPermissions] (val x: Self) extends AnyVal {
    
    inline def setAccessControlList(value: AccessControlList): Self = StObject.set(x, "accessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "accessControlList", js.undefined)
    
    inline def setBlockPublicAccess(value: BlockPublicAccess): Self = StObject.set(x, "blockPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAccessUndefined: Self = StObject.set(x, "blockPublicAccess", js.undefined)
    
    inline def setBucketPolicy(value: BucketPolicy): Self = StObject.set(x, "bucketPolicy", value.asInstanceOf[js.Any])
    
    inline def setBucketPolicyUndefined: Self = StObject.set(x, "bucketPolicy", js.undefined)
  }
}
