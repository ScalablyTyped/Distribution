package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.SCENIC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scenic extends StObject {
  
  var deep_type: SCENIC = js.native
  
  /**
    * @deprecated 景点类深度信息
    */
  var scenic: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic = js.native
}
object Scenic {
  
  @scala.inline
  def apply(deep_type: SCENIC, scenic: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Scenic = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], scenic = scenic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenic]
  }
  
  @scala.inline
  implicit class ScenicMutableBuilder[Self <: Scenic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeep_type(value: SCENIC): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenic(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Scenic): Self = StObject.set(x, "scenic", value.asInstanceOf[js.Any])
  }
}
