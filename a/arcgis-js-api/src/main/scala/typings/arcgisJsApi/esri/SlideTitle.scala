package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideTitle
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#title)
    */
  var text: js.UndefOr[String] = js.undefined
}
object SlideTitle {
  
  inline def apply(
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ Any, SlideTitle]]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], SlideTitle]])
  ): SlideTitle = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideTitle]
  }
  
  extension [Self <: SlideTitle](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
