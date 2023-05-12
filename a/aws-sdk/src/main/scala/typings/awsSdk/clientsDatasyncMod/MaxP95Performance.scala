package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxP95Performance extends StObject {
  
  /**
    * Peak IOPS unrelated to read and write operations.
    */
  var IopsOther: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak IOPS related to read operations.
    */
  var IopsRead: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak total IOPS on your on-premises storage system resource.
    */
  var IopsTotal: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak IOPS related to write operations.
    */
  var IopsWrite: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak latency for operations unrelated to read and write operations.
    */
  var LatencyOther: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak latency for read operations.
    */
  var LatencyRead: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak latency for write operations.
    */
  var LatencyWrite: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak throughput unrelated to read and write operations.
    */
  var ThroughputOther: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak throughput related to read operations.
    */
  var ThroughputRead: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak total throughput on your on-premises storage system resource.
    */
  var ThroughputTotal: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * Peak throughput related to write operations.
    */
  var ThroughputWrite: js.UndefOr[NonNegativeDouble] = js.undefined
}
object MaxP95Performance {
  
  inline def apply(): MaxP95Performance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxP95Performance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxP95Performance] (val x: Self) extends AnyVal {
    
    inline def setIopsOther(value: NonNegativeDouble): Self = StObject.set(x, "IopsOther", value.asInstanceOf[js.Any])
    
    inline def setIopsOtherUndefined: Self = StObject.set(x, "IopsOther", js.undefined)
    
    inline def setIopsRead(value: NonNegativeDouble): Self = StObject.set(x, "IopsRead", value.asInstanceOf[js.Any])
    
    inline def setIopsReadUndefined: Self = StObject.set(x, "IopsRead", js.undefined)
    
    inline def setIopsTotal(value: NonNegativeDouble): Self = StObject.set(x, "IopsTotal", value.asInstanceOf[js.Any])
    
    inline def setIopsTotalUndefined: Self = StObject.set(x, "IopsTotal", js.undefined)
    
    inline def setIopsWrite(value: NonNegativeDouble): Self = StObject.set(x, "IopsWrite", value.asInstanceOf[js.Any])
    
    inline def setIopsWriteUndefined: Self = StObject.set(x, "IopsWrite", js.undefined)
    
    inline def setLatencyOther(value: NonNegativeDouble): Self = StObject.set(x, "LatencyOther", value.asInstanceOf[js.Any])
    
    inline def setLatencyOtherUndefined: Self = StObject.set(x, "LatencyOther", js.undefined)
    
    inline def setLatencyRead(value: NonNegativeDouble): Self = StObject.set(x, "LatencyRead", value.asInstanceOf[js.Any])
    
    inline def setLatencyReadUndefined: Self = StObject.set(x, "LatencyRead", js.undefined)
    
    inline def setLatencyWrite(value: NonNegativeDouble): Self = StObject.set(x, "LatencyWrite", value.asInstanceOf[js.Any])
    
    inline def setLatencyWriteUndefined: Self = StObject.set(x, "LatencyWrite", js.undefined)
    
    inline def setThroughputOther(value: NonNegativeDouble): Self = StObject.set(x, "ThroughputOther", value.asInstanceOf[js.Any])
    
    inline def setThroughputOtherUndefined: Self = StObject.set(x, "ThroughputOther", js.undefined)
    
    inline def setThroughputRead(value: NonNegativeDouble): Self = StObject.set(x, "ThroughputRead", value.asInstanceOf[js.Any])
    
    inline def setThroughputReadUndefined: Self = StObject.set(x, "ThroughputRead", js.undefined)
    
    inline def setThroughputTotal(value: NonNegativeDouble): Self = StObject.set(x, "ThroughputTotal", value.asInstanceOf[js.Any])
    
    inline def setThroughputTotalUndefined: Self = StObject.set(x, "ThroughputTotal", js.undefined)
    
    inline def setThroughputWrite(value: NonNegativeDouble): Self = StObject.set(x, "ThroughputWrite", value.asInstanceOf[js.Any])
    
    inline def setThroughputWriteUndefined: Self = StObject.set(x, "ThroughputWrite", js.undefined)
  }
}
