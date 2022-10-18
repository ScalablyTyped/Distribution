package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketConfiguration extends StObject {
  
  /**
    * Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is created in the US East (N. Virginia) Region (us-east-1).
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
