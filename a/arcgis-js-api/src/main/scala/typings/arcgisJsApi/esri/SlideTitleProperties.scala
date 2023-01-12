package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideTitleProperties extends StObject {
  
  /**
    * The title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#title)
    */
  var text: js.UndefOr[String] = js.undefined
}
object SlideTitleProperties {
  
  inline def apply(): SlideTitleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideTitleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideTitleProperties] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
