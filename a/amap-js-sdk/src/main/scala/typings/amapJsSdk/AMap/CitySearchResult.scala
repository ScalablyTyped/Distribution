package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitySearchResult extends StObject {
  
  var bounds: Bounds
  
  var city: String
}
object CitySearchResult {
  
  inline def apply(bounds: Bounds, city: String): CitySearchResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitySearchResult]
  }
  
  extension [Self <: CitySearchResult](x: Self) {
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
  }
}
