package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudyWeatherProperties extends StObject {
  
  /**
    * Specifies the amount of cloud cover in the sky for a certain weather type.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-CloudyWeather.html#cloudCover)
    */
  var cloudCover: js.UndefOr[Double] = js.undefined
}
object CloudyWeatherProperties {
  
  inline def apply(): CloudyWeatherProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudyWeatherProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudyWeatherProperties] (val x: Self) extends AnyVal {
    
    inline def setCloudCover(value: Double): Self = StObject.set(x, "cloudCover", value.asInstanceOf[js.Any])
    
    inline def setCloudCoverUndefined: Self = StObject.set(x, "cloudCover", js.undefined)
  }
}
