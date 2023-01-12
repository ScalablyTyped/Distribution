package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.foggy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.FoggyWeatherProperties & {  type :'foggy'} */
trait FoggyWeatherPropertiestyp extends StObject {
  
  /**
    * Specifies the amount of fog used in the scene.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-FoggyWeather.html#fogStrength)
    */
  var fogStrength: js.UndefOr[Double] = js.undefined
  
  var `type`: foggy
}
object FoggyWeatherPropertiestyp {
  
  inline def apply(): FoggyWeatherPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("foggy")
    __obj.asInstanceOf[FoggyWeatherPropertiestyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoggyWeatherPropertiestyp] (val x: Self) extends AnyVal {
    
    inline def setFogStrength(value: Double): Self = StObject.set(x, "fogStrength", value.asInstanceOf[js.Any])
    
    inline def setFogStrengthUndefined: Self = StObject.set(x, "fogStrength", js.undefined)
    
    inline def setType(value: foggy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
