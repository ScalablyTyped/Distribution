package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VCpuCountRange extends StObject {
  
  /**
    * The maximum number of vCPUs. If this parameter is not specified, there is no maximum limit.
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum number of vCPUs. If the value is 0, there is no minimum limit.
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object VCpuCountRange {
  
  inline def apply(): VCpuCountRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VCpuCountRange]
  }
  
  extension [Self <: VCpuCountRange](x: Self) {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
