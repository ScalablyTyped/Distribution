package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketConfiguration extends StObject {
  
  /**
    * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia) Region (us-east-1), you do not need to specify the location.   This is not supported by Amazon S3 on Outposts buckets. 
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
}
object CreateBucketConfiguration {
  
  inline def apply(): CreateBucketConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketConfiguration]
  }
  
  extension [Self <: CreateBucketConfiguration](x: Self) {
    
    inline def setLocationConstraint(value: BucketLocationConstraint): Self = StObject.set(x, "LocationConstraint", value.asInstanceOf[js.Any])
    
    inline def setLocationConstraintUndefined: Self = StObject.set(x, "LocationConstraint", js.undefined)
  }
}
