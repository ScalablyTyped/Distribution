package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideGround
  extends StObject
     with AnonymousAccessor {
  
  /**
    * Ground opacity
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#ground)
    */
  var opacity: js.UndefOr[Double] = js.undefined
}
object SlideGround {
  
  inline def apply(
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ Any, SlideGround]]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], SlideGround]])
  ): SlideGround = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideGround]
  }
  
  extension [Self <: SlideGround](x: Self) {
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
