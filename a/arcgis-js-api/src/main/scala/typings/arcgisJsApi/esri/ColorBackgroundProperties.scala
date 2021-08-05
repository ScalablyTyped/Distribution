package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorBackgroundProperties extends StObject {
  
  /**
    * The color of the background.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-background-ColorBackground.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object ColorBackgroundProperties {
  
  inline def apply(): ColorBackgroundProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorBackgroundProperties]
  }
  
  extension [Self <: ColorBackgroundProperties](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
  }
}
