package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetResourceAccessForBucketRequest extends StObject {
  
  /**
    * The access setting. The following access settings are available:    allow - Allows access to the bucket and its objects.    deny - Denies access to the bucket and its objects. Use this setting to remove access for a resource previously set to allow.  
    */
  var access: ResourceBucketAccess
  
  /**
    * The name of the bucket for which to set access to another Lightsail resource.
    */
  var bucketName: BucketName
  
  /**
    * The name of the Lightsail instance for which to set bucket access. The instance must be in a running or stopped state.
    */
  var resourceName: ResourceName
}
object SetResourceAccessForBucketRequest {
  
  inline def apply(access: ResourceBucketAccess, bucketName: BucketName, resourceName: ResourceName): SetResourceAccessForBucketRequest = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetResourceAccessForBucketRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetResourceAccessForBucketRequest] (val x: Self) extends AnyVal {
    
    inline def setAccess(value: ResourceBucketAccess): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}
