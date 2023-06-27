package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoggyWeatherProperties extends StObject {
  
  /**
  		 * Specifies the amount of fog used in the scene.
  		 *
  		 * @default 0.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-FoggyWeather.html#fogStrength)
  		 */
  var fogStrength: js.UndefOr[Double] = js.undefined
}
object FoggyWeatherProperties {
  
  inline def apply(): FoggyWeatherProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoggyWeatherProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoggyWeatherProperties] (val x: Self) extends AnyVal {
    
    inline def setFogStrength(value: Double): Self = StObject.set(x, "fogStrength", value.asInstanceOf[js.Any])
    
    inline def setFogStrengthUndefined: Self = StObject.set(x, "fogStrength", js.undefined)
  }
}
