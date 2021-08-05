package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * The formatted string content to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html#text)
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextContentProperties {
  
  inline def apply(): TextContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextContentProperties]
  }
  
  extension [Self <: TextContentProperties](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
