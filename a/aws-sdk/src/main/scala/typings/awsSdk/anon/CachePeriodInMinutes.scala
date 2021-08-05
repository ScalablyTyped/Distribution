package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachePeriodInMinutes extends StObject {
  
  var Address: js.UndefOr[String] = js.undefined
  
  var CachePeriodInMinutes: js.UndefOr[Double] = js.undefined
}
object CachePeriodInMinutes {
  
  inline def apply(): CachePeriodInMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachePeriodInMinutes]
  }
  
  extension [Self <: CachePeriodInMinutes](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setCachePeriodInMinutes(value: Double): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
    
    inline def setCachePeriodInMinutesUndefined: Self = StObject.set(x, "CachePeriodInMinutes", js.undefined)
  }
}
