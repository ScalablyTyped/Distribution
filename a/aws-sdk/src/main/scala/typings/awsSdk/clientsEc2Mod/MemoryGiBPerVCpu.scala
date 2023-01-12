package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryGiBPerVCpu extends StObject {
  
  /**
    * The maximum amount of memory per vCPU, in GiB. If this parameter is not specified, there is no maximum limit.
    */
  var Max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum amount of memory per vCPU, in GiB. If this parameter is not specified, there is no minimum limit.
    */
  var Min: js.UndefOr[Double] = js.undefined
}
object MemoryGiBPerVCpu {
  
  inline def apply(): MemoryGiBPerVCpu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryGiBPerVCpu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryGiBPerVCpu] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
