package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SunnyWeatherProperties extends StObject {
  
  /**
    * Specifies the amount of cloud cover in the sky for a certain weather type.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunnyWeather.html#cloudCover)
    */
  var cloudCover: js.UndefOr[Double] = js.undefined
}
object SunnyWeatherProperties {
  
  inline def apply(): SunnyWeatherProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SunnyWeatherProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SunnyWeatherProperties] (val x: Self) extends AnyVal {
    
    inline def setCloudCover(value: Double): Self = StObject.set(x, "cloudCover", value.asInstanceOf[js.Any])
    
    inline def setCloudCoverUndefined: Self = StObject.set(x, "cloudCover", js.undefined)
  }
}
