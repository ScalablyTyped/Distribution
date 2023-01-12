package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeatherVisibleElements extends StObject {
  
  /**
    * When set to `false`, the header is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html#VisibleElements)
    */
  var header: js.UndefOr[Boolean] = js.undefined
}
object WeatherVisibleElements {
  
  inline def apply(): WeatherVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeatherVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeatherVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
