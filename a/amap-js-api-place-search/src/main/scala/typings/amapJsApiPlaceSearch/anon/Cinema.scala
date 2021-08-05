package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.CINEMA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cinema extends StObject {
  
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema
  
  var deep_type: CINEMA
}
object Cinema {
  
  inline def apply(cinema: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema): Cinema = {
    val __obj = js.Dynamic.literal(cinema = cinema.asInstanceOf[js.Any], deep_type = "CINEMA")
    __obj.asInstanceOf[Cinema]
  }
  
  extension [Self <: Cinema](x: Self) {
    
    inline def setCinema(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema): Self = StObject.set(x, "cinema", value.asInstanceOf[js.Any])
    
    inline def setDeep_type(value: CINEMA): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
  }
}
