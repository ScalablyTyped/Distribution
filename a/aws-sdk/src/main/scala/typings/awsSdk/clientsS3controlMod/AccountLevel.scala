package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLevel extends StObject {
  
  /**
    * A container for S3 Storage Lens activity metrics.
    */
  var ActivityMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.ActivityMetrics] = js.undefined
  
  /**
    * A container for S3 Storage Lens advanced cost-optimization metrics.
    */
  var AdvancedCostOptimizationMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.AdvancedCostOptimizationMetrics] = js.undefined
  
  /**
    * A container for S3 Storage Lens advanced data-protection metrics.
    */
  var AdvancedDataProtectionMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.AdvancedDataProtectionMetrics] = js.undefined
  
  /**
    * A container for the S3 Storage Lens bucket-level configuration.
    */
  var BucketLevel: typings.awsSdk.clientsS3controlMod.BucketLevel
  
  /**
    * A container for detailed status code metrics. 
    */
  var DetailedStatusCodesMetrics: js.UndefOr[typings.awsSdk.clientsS3controlMod.DetailedStatusCodesMetrics] = js.undefined
}
object AccountLevel {
  
  inline def apply(BucketLevel: BucketLevel): AccountLevel = {
    val __obj = js.Dynamic.literal(BucketLevel = BucketLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountLevel] (val x: Self) extends AnyVal {
    
    inline def setActivityMetrics(value: ActivityMetrics): Self = StObject.set(x, "ActivityMetrics", value.asInstanceOf[js.Any])
    
    inline def setActivityMetricsUndefined: Self = StObject.set(x, "ActivityMetrics", js.undefined)
    
    inline def setAdvancedCostOptimizationMetrics(value: AdvancedCostOptimizationMetrics): Self = StObject.set(x, "AdvancedCostOptimizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setAdvancedCostOptimizationMetricsUndefined: Self = StObject.set(x, "AdvancedCostOptimizationMetrics", js.undefined)
    
    inline def setAdvancedDataProtectionMetrics(value: AdvancedDataProtectionMetrics): Self = StObject.set(x, "AdvancedDataProtectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setAdvancedDataProtectionMetricsUndefined: Self = StObject.set(x, "AdvancedDataProtectionMetrics", js.undefined)
    
    inline def setBucketLevel(value: BucketLevel): Self = StObject.set(x, "BucketLevel", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusCodesMetrics(value: DetailedStatusCodesMetrics): Self = StObject.set(x, "DetailedStatusCodesMetrics", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusCodesMetricsUndefined: Self = StObject.set(x, "DetailedStatusCodesMetrics", js.undefined)
  }
}
