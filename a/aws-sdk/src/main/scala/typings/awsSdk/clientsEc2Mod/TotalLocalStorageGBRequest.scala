package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalLocalStorageGBRequest extends StObject {
  
  /**
    * The maximum amount of total local storage, in GB. To specify no maximum limit, omit this parameter.
    */
  var Max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum amount of total local storage, in GB. To specify no minimum limit, omit this parameter.
    */
  var Min: js.UndefOr[Double] = js.undefined
}
object TotalLocalStorageGBRequest {
  
  inline def apply(): TotalLocalStorageGBRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalLocalStorageGBRequest]
  }
  
  extension [Self <: TotalLocalStorageGBRequest](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
