package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryMiBRequest extends StObject {
  
  /**
    * The memory maximum in MiB.
    */
  var Max: js.UndefOr[NullablePositiveInteger] = js.undefined
  
  /**
    * The memory minimum in MiB.
    */
  var Min: NullablePositiveInteger
}
object MemoryMiBRequest {
  
  inline def apply(Min: NullablePositiveInteger): MemoryMiBRequest = {
    val __obj = js.Dynamic.literal(Min = Min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryMiBRequest]
  }
  
  extension [Self <: MemoryMiBRequest](x: Self) {
    
    inline def setMax(value: NullablePositiveInteger): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: NullablePositiveInteger): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
  }
}
