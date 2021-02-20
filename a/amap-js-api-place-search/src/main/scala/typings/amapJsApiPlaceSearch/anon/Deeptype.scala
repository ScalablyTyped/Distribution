package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Dining
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.DINING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deeptype extends StObject {
  
  var deep_type: DINING = js.native
  
  /**
    * @deprecated 餐饮类深度信息
    */
  var dining: Dining = js.native
}
object Deeptype {
  
  @scala.inline
  def apply(deep_type: DINING, dining: Dining): Deeptype = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], dining = dining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deeptype]
  }
  
  @scala.inline
  implicit class DeeptypeMutableBuilder[Self <: Deeptype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeep_type(value: DINING): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDining(value: Dining): Self = StObject.set(x, "dining", value.asInstanceOf[js.Any])
  }
}
