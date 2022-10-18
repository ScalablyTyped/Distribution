package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryGiBPerVCpuRequest extends StObject {
  
  /**
    * The memory maximum in GiB.
    */
  var Max: js.UndefOr[NullablePositiveDouble] = js.undefined
  
  /**
    * The memory minimum in GiB.
    */
  var Min: js.UndefOr[NullablePositiveDouble] = js.undefined
}
object MemoryGiBPerVCpuRequest {
  
  inline def apply(): MemoryGiBPerVCpuRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryGiBPerVCpuRequest]
  }
  
  extension [Self <: MemoryGiBPerVCpuRequest](x: Self) {
    
    inline def setMax(value: NullablePositiveDouble): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: NullablePositiveDouble): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
