package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLevel extends StObject {
  
  /**
    * A container for the bucket-level activity metrics for S3 Storage Lens.
    */
  var ActivityMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.ActivityMetrics] = js.undefined
  
  /**
    * A container for bucket-level advanced cost-optimization metrics for S3 Storage Lens.
    */
  var AdvancedCostOptimizationMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.AdvancedCostOptimizationMetrics] = js.undefined
  
  /**
    * A container for bucket-level advanced data-protection metrics for S3 Storage Lens.
    */
  var AdvancedDataProtectionMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.AdvancedDataProtectionMetrics] = js.undefined
  
  /**
    * A container for bucket-level detailed status code metrics for S3 Storage Lens.
    */
  var DetailedStatusCodesMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.DetailedStatusCodesMetrics] = js.undefined
  
  /**
    * A container for the prefix-level metrics for S3 Storage Lens. 
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
    
    inline def setAdvancedCostOptimizationMetrics(value: AdvancedCostOptimizationMetrics): Self = StObject.set(x, "AdvancedCostOptimizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setAdvancedCostOptimizationMetricsUndefined: Self = StObject.set(x, "AdvancedCostOptimizationMetrics", js.undefined)
    
    inline def setAdvancedDataProtectionMetrics(value: AdvancedDataProtectionMetrics): Self = StObject.set(x, "AdvancedDataProtectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setAdvancedDataProtectionMetricsUndefined: Self = StObject.set(x, "AdvancedDataProtectionMetrics", js.undefined)
    
    inline def setDetailedStatusCodesMetrics(value: DetailedStatusCodesMetrics): Self = StObject.set(x, "DetailedStatusCodesMetrics", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusCodesMetricsUndefined: Self = StObject.set(x, "DetailedStatusCodesMetrics", js.undefined)
    
    inline def setPrefixLevel(value: PrefixLevel): Self = StObject.set(x, "PrefixLevel", value.asInstanceOf[js.Any])
    
    inline def setPrefixLevelUndefined: Self = StObject.set(x, "PrefixLevel", js.undefined)
  }
}
