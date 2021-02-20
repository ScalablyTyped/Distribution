package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.CINEMA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cinema extends StObject {
  
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema = js.native
  
  var deep_type: CINEMA = js.native
}
object Cinema {
  
  @scala.inline
  def apply(cinema: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema, deep_type: CINEMA): Cinema = {
    val __obj = js.Dynamic.literal(cinema = cinema.asInstanceOf[js.Any], deep_type = deep_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cinema]
  }
  
  @scala.inline
  implicit class CinemaMutableBuilder[Self <: Cinema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCinema(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema): Self = StObject.set(x, "cinema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeep_type(value: CINEMA): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
  }
}
