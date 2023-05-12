package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P95Metrics extends StObject {
  
  /**
    * The IOPS peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak value during a 1-hour interval.
    */
  var IOPS: js.UndefOr[typings.awsSdk.clientsDatasyncMod.IOPS] = js.undefined
  
  /**
    * The latency peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak value during a 1-hour interval.
    */
  var Latency: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Latency] = js.undefined
  
  /**
    * The throughput peaks for an on-premises storage system resource. Each data point represents the 95th percentile peak value during a 1-hour interval.
    */
  var Throughput: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Throughput] = js.undefined
}
object P95Metrics {
  
  inline def apply(): P95Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[P95Metrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: P95Metrics] (val x: Self) extends AnyVal {
    
    inline def setIOPS(value: IOPS): Self = StObject.set(x, "IOPS", value.asInstanceOf[js.Any])
    
    inline def setIOPSUndefined: Self = StObject.set(x, "IOPS", js.undefined)
    
    inline def setLatency(value: Latency): Self = StObject.set(x, "Latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "Latency", js.undefined)
    
    inline def setThroughput(value: Throughput): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
  }
}
