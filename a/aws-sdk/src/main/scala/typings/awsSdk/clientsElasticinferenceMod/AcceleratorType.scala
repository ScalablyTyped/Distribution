package typings.awsSdk.clientsElasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorType extends StObject {
  
  /**
    *  The name of the Elastic Inference Accelerator type. 
    */
  var acceleratorTypeName: js.UndefOr[AcceleratorTypeName] = js.undefined
  
  /**
    *  The memory information of the Elastic Inference Accelerator type. 
    */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.undefined
  
  /**
    *  The throughput information of the Elastic Inference Accelerator type. 
    */
  var throughputInfo: js.UndefOr[ThroughputInfoList] = js.undefined
}
object AcceleratorType {
  
  inline def apply(): AcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceleratorType] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorTypeName(value: AcceleratorTypeName): Self = StObject.set(x, "acceleratorTypeName", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeNameUndefined: Self = StObject.set(x, "acceleratorTypeName", js.undefined)
    
    inline def setMemoryInfo(value: MemoryInfo): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
    
    inline def setThroughputInfo(value: ThroughputInfoList): Self = StObject.set(x, "throughputInfo", value.asInstanceOf[js.Any])
    
    inline def setThroughputInfoUndefined: Self = StObject.set(x, "throughputInfo", js.undefined)
    
    inline def setThroughputInfoVarargs(value: KeyValuePair*): Self = StObject.set(x, "throughputInfo", js.Array(value*))
  }
}
