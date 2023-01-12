package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorCount extends StObject {
  
  /**
    * The maximum number of accelerators. If this parameter is not specified, there is no maximum limit.
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum number of accelerators. If this parameter is not specified, there is no minimum limit.
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object AcceleratorCount {
  
  inline def apply(): AcceleratorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceleratorCount] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
