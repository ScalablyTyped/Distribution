package typings.arcgisJsApi.esri

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
  
  inline def apply(): SlideTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideTitle]
  }
  
  extension [Self <: SlideTitle](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
