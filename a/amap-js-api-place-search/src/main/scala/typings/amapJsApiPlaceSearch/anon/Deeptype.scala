package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Dining
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.DINING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deeptype extends StObject {
  
  var deep_type: DINING
  
  /**
    * @deprecated 餐饮类深度信息
    */
  var dining: Dining
}
object Deeptype {
  
  inline def apply(dining: Dining): Deeptype = {
    val __obj = js.Dynamic.literal(deep_type = "DINING", dining = dining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deeptype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deeptype] (val x: Self) extends AnyVal {
    
    inline def setDeep_type(value: DINING): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
    
    inline def setDining(value: Dining): Self = StObject.set(x, "dining", value.asInstanceOf[js.Any])
  }
}
