package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VCpuCountRequest extends StObject {
  
  /**
    * The maximum number of vCPUs.
    */
  var Max: js.UndefOr[NullablePositiveInteger] = js.undefined
  
  /**
    * The minimum number of vCPUs.
    */
  var Min: NullablePositiveInteger
}
object VCpuCountRequest {
  
  inline def apply(Min: NullablePositiveInteger): VCpuCountRequest = {
    val __obj = js.Dynamic.literal(Min = Min.asInstanceOf[js.Any])
    __obj.asInstanceOf[VCpuCountRequest]
  }
  
  extension [Self <: VCpuCountRequest](x: Self) {
    
    inline def setMax(value: NullablePositiveInteger): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: NullablePositiveInteger): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
  }
}
