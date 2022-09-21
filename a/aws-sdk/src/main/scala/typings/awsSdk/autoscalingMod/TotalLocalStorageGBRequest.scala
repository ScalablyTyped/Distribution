package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalLocalStorageGBRequest extends StObject {
  
  /**
    * The storage maximum in GB.
    */
  var Max: js.UndefOr[NullablePositiveDouble] = js.undefined
  
  /**
    * The storage minimum in GB.
    */
  var Min: js.UndefOr[NullablePositiveDouble] = js.undefined
}
object TotalLocalStorageGBRequest {
  
  inline def apply(): TotalLocalStorageGBRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalLocalStorageGBRequest]
  }
  
  extension [Self <: TotalLocalStorageGBRequest](x: Self) {
    
    inline def setMax(value: NullablePositiveDouble): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: NullablePositiveDouble): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
