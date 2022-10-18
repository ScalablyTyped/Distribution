package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryMiBRequest extends StObject {
  
  /**
    * The maximum amount of memory, in MiB. To specify no maximum limit, omit this parameter.
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum amount of memory, in MiB. To specify no minimum limit, specify 0.
    */
  var Min: Integer
}
object MemoryMiBRequest {
  
  inline def apply(Min: Integer): MemoryMiBRequest = {
    val __obj = js.Dynamic.literal(Min = Min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryMiBRequest]
  }
  
  extension [Self <: MemoryMiBRequest](x: Self) {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
  }
}
