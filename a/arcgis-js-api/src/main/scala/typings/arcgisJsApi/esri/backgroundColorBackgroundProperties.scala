package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait backgroundColorBackgroundProperties
  extends StObject
     with BackgroundProperties {
  
  /**
    * The color of the background.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object backgroundColorBackgroundProperties {
  
  inline def apply(): backgroundColorBackgroundProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[backgroundColorBackgroundProperties]
  }
  
  extension [Self <: backgroundColorBackgroundProperties](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
