package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLevel extends StObject {
  
  /**
    * A container for the bucket-level activity metrics for Amazon S3 Storage Lens
    */
  var ActivityMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.ActivityMetrics] = js.undefined
  
  /**
    * A container for the bucket-level prefix-level metrics for S3 Storage Lens
    */
  var PrefixLevel: js.UndefOr[typings.awsSdk.clientsS3controlMod.PrefixLevel] = js.undefined
}
object BucketLevel {
  
  inline def apply(): BucketLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketLevel] (val x: Self) extends AnyVal {
    
    inline def setActivityMetrics(value: ActivityMetrics): Self = StObject.set(x, "ActivityMetrics", value.asInstanceOf[js.Any])
    
    inline def setActivityMetricsUndefined: Self = StObject.set(x, "ActivityMetrics", js.undefined)
    
    inline def setPrefixLevel(value: PrefixLevel): Self = StObject.set(x, "PrefixLevel", value.asInstanceOf[js.Any])
    
    inline def setPrefixLevelUndefined: Self = StObject.set(x, "PrefixLevel", js.undefined)
  }
}
