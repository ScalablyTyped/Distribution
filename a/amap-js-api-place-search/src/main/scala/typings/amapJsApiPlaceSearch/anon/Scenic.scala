package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.SCENIC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scenic extends StObject {
  
  var deep_type: SCENIC
  
  /**
    * @deprecated 景点类深度信息
    */
  var scenic: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic
}
object Scenic {
  
  inline def apply(scenic: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Scenic = {
    val __obj = js.Dynamic.literal(deep_type = "SCENIC", scenic = scenic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scenic] (val x: Self) extends AnyVal {
    
    inline def setDeep_type(value: SCENIC): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
    
    inline def setScenic(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Self = StObject.set(x, "scenic", value.asInstanceOf[js.Any])
  }
}
