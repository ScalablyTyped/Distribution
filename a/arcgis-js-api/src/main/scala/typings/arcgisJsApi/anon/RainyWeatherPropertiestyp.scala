package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.rainy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.RainyWeatherProperties & {  type :'rainy'} */
trait RainyWeatherPropertiestyp extends StObject {
  
  /**
  		 * Specifies the amount of cloud cover in the sky for a certain weather type.
  		 *
  		 * @default 0.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-RainyWeather.html#cloudCover)
  		 */
  var cloudCover: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specifies the amount of falling rain.
  		 *
  		 * @default 0.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-RainyWeather.html#precipitation)
  		 */
  var precipitation: js.UndefOr[Double] = js.undefined
  
  var `type`: rainy
}
object RainyWeatherPropertiestyp {
  
  inline def apply(): RainyWeatherPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rainy")
    __obj.asInstanceOf[RainyWeatherPropertiestyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RainyWeatherPropertiestyp] (val x: Self) extends AnyVal {
    
    inline def setCloudCover(value: Double): Self = StObject.set(x, "cloudCover", value.asInstanceOf[js.Any])
    
    inline def setCloudCoverUndefined: Self = StObject.set(x, "cloudCover", js.undefined)
    
    inline def setPrecipitation(value: Double): Self = StObject.set(x, "precipitation", value.asInstanceOf[js.Any])
    
    inline def setPrecipitationUndefined: Self = StObject.set(x, "precipitation", js.undefined)
    
    inline def setType(value: rainy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
