package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.sunny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SunnyWeatherProperties & {  type :'sunny'} */
trait SunnyWeatherPropertiestyp extends StObject {
  
  /**
    * Specifies the amount of cloud cover in the sky for a certain weather type.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunnyWeather.html#cloudCover)
    */
  var cloudCover: js.UndefOr[Double] = js.undefined
  
  var `type`: sunny
}
object SunnyWeatherPropertiestyp {
  
  inline def apply(): SunnyWeatherPropertiestyp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("sunny")
    __obj.asInstanceOf[SunnyWeatherPropertiestyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SunnyWeatherPropertiestyp] (val x: Self) extends AnyVal {
    
    inline def setCloudCover(value: Double): Self = StObject.set(x, "cloudCover", value.asInstanceOf[js.Any])
    
    inline def setCloudCoverUndefined: Self = StObject.set(x, "cloudCover", js.undefined)
    
    inline def setType(value: sunny): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
