package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLevelPermissions extends StObject {
  
  /**
    * Contains information on how Access Control Policies are applied to the bucket.
    */
  var AccessControlList: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.AccessControlList] = js.undefined
  
  /**
    * Contains information on which account level S3 Block Public Access settings are applied to the S3 bucket.
    */
  var BlockPublicAccess: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.BlockPublicAccess] = js.undefined
  
  /**
    * Contains information on the bucket policies for the S3 bucket.
    */
  var BucketPolicy: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.BucketPolicy] = js.undefined
}
object BucketLevelPermissions {
  
  inline def apply(): BucketLevelPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLevelPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketLevelPermissions] (val x: Self) extends AnyVal {
    
    inline def setAccessControlList(value: AccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setBlockPublicAccess(value: BlockPublicAccess): Self = StObject.set(x, "BlockPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAccessUndefined: Self = StObject.set(x, "BlockPublicAccess", js.undefined)
    
    inline def setBucketPolicy(value: BucketPolicy): Self = StObject.set(x, "BucketPolicy", value.asInstanceOf[js.Any])
    
    inline def setBucketPolicyUndefined: Self = StObject.set(x, "BucketPolicy", js.undefined)
  }
}
