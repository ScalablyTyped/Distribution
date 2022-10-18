package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var Address: js.UndefOr[String] = js.undefined
  
  var CachePeriodInMinutes: js.UndefOr[Double] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setCachePeriodInMinutes(value: Double): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
    
    inline def setCachePeriodInMinutesUndefined: Self = StObject.set(x, "CachePeriodInMinutes", js.undefined)
  }
}
