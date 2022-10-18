package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclude extends StObject {
  
  /**
    * A container for the S3 Storage Lens bucket excludes.
    */
  var Buckets: js.UndefOr[typings.awsSdk.clientsS3controlMod.Buckets] = js.undefined
  
  /**
    * A container for the S3 Storage Lens Region excludes.
    */
  var Regions: js.UndefOr[typings.awsSdk.clientsS3controlMod.Regions] = js.undefined
}
object Exclude {
  
  inline def apply(): Exclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exclude]
  }
  
  extension [Self <: Exclude](x: Self) {
    
    inline def setBuckets(value: Buckets): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
    
    inline def setBucketsVarargs(value: S3BucketArnString*): Self = StObject.set(x, "Buckets", js.Array(value*))
    
    inline def setRegions(value: Regions): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: S3AWSRegion*): Self = StObject.set(x, "Regions", js.Array(value*))
  }
}
