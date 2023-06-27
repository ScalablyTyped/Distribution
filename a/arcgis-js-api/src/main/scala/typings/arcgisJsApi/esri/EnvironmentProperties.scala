package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CloudyWeatherPropertiesty
import typings.arcgisJsApi.anon.FoggyWeatherPropertiestyp
import typings.arcgisJsApi.anon.RainyWeatherPropertiestyp
import typings.arcgisJsApi.anon.SnowyWeatherPropertiestyp
import typings.arcgisJsApi.anon.SunLightingPropertiestype
import typings.arcgisJsApi.anon.SunnyWeatherPropertiestyp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentProperties extends StObject {
  
  /**
  		 * Specifies whether the atmosphere should be displayed.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#atmosphereEnabled)
  		 */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#background)
  		 */
  var background: js.UndefOr[BackgroundProperties] = js.undefined
  
  /**
  		 * Settings for defining the lighting of the scene.
  		 *
  		 * @default SunLighting
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#lighting)
  		 */
  var lighting: js.UndefOr[SunLightingPropertiestype | typings.arcgisJsApi.anon.VirtualLightingProperties] = js.undefined
  
  /**
  		 * Specifies whether stars should be displayed in the sky.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#starsEnabled)
  		 */
  var starsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates the type of weather visualization in the scene.
  		 *
  		 * @default SunnyWeather
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#weather)
  		 */
  var weather: js.UndefOr[
    SunnyWeatherPropertiestyp | CloudyWeatherPropertiesty | RainyWeatherPropertiestyp | SnowyWeatherPropertiestyp | FoggyWeatherPropertiestyp
  ] = js.undefined
}
object EnvironmentProperties {
  
  inline def apply(): EnvironmentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentProperties] (val x: Self) extends AnyVal {
    
    inline def setAtmosphereEnabled(value: Boolean): Self = StObject.set(x, "atmosphereEnabled", value.asInstanceOf[js.Any])
    
    inline def setAtmosphereEnabledUndefined: Self = StObject.set(x, "atmosphereEnabled", js.undefined)
    
    inline def setBackground(value: BackgroundProperties): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setLighting(value: SunLightingPropertiestype | typings.arcgisJsApi.anon.VirtualLightingProperties): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    inline def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
    
    inline def setStarsEnabled(value: Boolean): Self = StObject.set(x, "starsEnabled", value.asInstanceOf[js.Any])
    
    inline def setStarsEnabledUndefined: Self = StObject.set(x, "starsEnabled", js.undefined)
    
    inline def setWeather(
      value: SunnyWeatherPropertiestyp | CloudyWeatherPropertiesty | RainyWeatherPropertiestyp | SnowyWeatherPropertiestyp | FoggyWeatherPropertiestyp
    ): Self = StObject.set(x, "weather", value.asInstanceOf[js.Any])
    
    inline def setWeatherUndefined: Self = StObject.set(x, "weather", js.undefined)
  }
}
