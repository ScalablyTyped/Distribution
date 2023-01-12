package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsOptimizedInfo extends StObject {
  
  /**
    * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
    */
  var BaselineBandwidthInMbps: js.UndefOr[typings.awsSdk.clientsEc2Mod.BaselineBandwidthInMbps] = js.undefined
  
  /**
    * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
    */
  var BaselineIops: js.UndefOr[typings.awsSdk.clientsEc2Mod.BaselineIops] = js.undefined
  
  /**
    * The baseline throughput performance for an EBS-optimized instance type, in MB/s.
    */
  var BaselineThroughputInMBps: js.UndefOr[typings.awsSdk.clientsEc2Mod.BaselineThroughputInMBps] = js.undefined
  
  /**
    * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
    */
  var MaximumBandwidthInMbps: js.UndefOr[typings.awsSdk.clientsEc2Mod.MaximumBandwidthInMbps] = js.undefined
  
  /**
    * The maximum input/output storage operations per second for an EBS-optimized instance type.
    */
  var MaximumIops: js.UndefOr[typings.awsSdk.clientsEc2Mod.MaximumIops] = js.undefined
  
  /**
    * The maximum throughput performance for an EBS-optimized instance type, in MB/s.
    */
  var MaximumThroughputInMBps: js.UndefOr[typings.awsSdk.clientsEc2Mod.MaximumThroughputInMBps] = js.undefined
}
object EbsOptimizedInfo {
  
  inline def apply(): EbsOptimizedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsOptimizedInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EbsOptimizedInfo] (val x: Self) extends AnyVal {
    
    inline def setBaselineBandwidthInMbps(value: BaselineBandwidthInMbps): Self = StObject.set(x, "BaselineBandwidthInMbps", value.asInstanceOf[js.Any])
    
    inline def setBaselineBandwidthInMbpsUndefined: Self = StObject.set(x, "BaselineBandwidthInMbps", js.undefined)
    
    inline def setBaselineIops(value: BaselineIops): Self = StObject.set(x, "BaselineIops", value.asInstanceOf[js.Any])
    
    inline def setBaselineIopsUndefined: Self = StObject.set(x, "BaselineIops", js.undefined)
    
    inline def setBaselineThroughputInMBps(value: BaselineThroughputInMBps): Self = StObject.set(x, "BaselineThroughputInMBps", value.asInstanceOf[js.Any])
    
    inline def setBaselineThroughputInMBpsUndefined: Self = StObject.set(x, "BaselineThroughputInMBps", js.undefined)
    
    inline def setMaximumBandwidthInMbps(value: MaximumBandwidthInMbps): Self = StObject.set(x, "MaximumBandwidthInMbps", value.asInstanceOf[js.Any])
    
    inline def setMaximumBandwidthInMbpsUndefined: Self = StObject.set(x, "MaximumBandwidthInMbps", js.undefined)
    
    inline def setMaximumIops(value: MaximumIops): Self = StObject.set(x, "MaximumIops", value.asInstanceOf[js.Any])
    
    inline def setMaximumIopsUndefined: Self = StObject.set(x, "MaximumIops", js.undefined)
    
    inline def setMaximumThroughputInMBps(value: MaximumThroughputInMBps): Self = StObject.set(x, "MaximumThroughputInMBps", value.asInstanceOf[js.Any])
    
    inline def setMaximumThroughputInMBpsUndefined: Self = StObject.set(x, "MaximumThroughputInMBps", js.undefined)
  }
}
