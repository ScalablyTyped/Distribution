package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CloudyWeatherPropertiesty
import typings.arcgisJsApi.anon.FoggyWeatherPropertiestyp
import typings.arcgisJsApi.anon.RainyWeatherPropertiestyp
import typings.arcgisJsApi.anon.SnowyWeatherPropertiestyp
import typings.arcgisJsApi.anon.SunLightingPropertiestype
import typings.arcgisJsApi.anon.SunnyWeatherPropertiestyp
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewEnvironmentProperties
  extends StObject
     with Object {
  
  /**
    * Atmosphere conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphere: js.UndefOr[SceneViewEnvironmentAtmosphereProperties] = js.undefined
  
  /**
    * Indicates whether atmosphere visualization is enabled.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var background: js.UndefOr[BackgroundProperties] = js.undefined
  
  /**
    * Indicates the type of lighting in the scene.
    *
    * @default SunLighting
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var lighting: js.UndefOr[SunLightingPropertiestype | typings.arcgisJsApi.anon.VirtualLightingProperties] = js.undefined
  
  /**
    * Indicates whether stars visualization is enabled.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var starsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the type of weather visualization in the scene.
    *
    * @default SunnyWeather
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var weather: js.UndefOr[
    SunnyWeatherPropertiestyp | CloudyWeatherPropertiesty | RainyWeatherPropertiestyp | SnowyWeatherPropertiestyp | FoggyWeatherPropertiestyp
  ] = js.undefined
}
object SceneViewEnvironmentProperties {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewEnvironmentProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewEnvironmentProperties]
  }
  
  extension [Self <: SceneViewEnvironmentProperties](x: Self) {
    
    inline def setAtmosphere(value: SceneViewEnvironmentAtmosphereProperties): Self = StObject.set(x, "atmosphere", value.asInstanceOf[js.Any])
    
    inline def setAtmosphereEnabled(value: Boolean): Self = StObject.set(x, "atmosphereEnabled", value.asInstanceOf[js.Any])
    
    inline def setAtmosphereEnabledUndefined: Self = StObject.set(x, "atmosphereEnabled", js.undefined)
    
    inline def setAtmosphereUndefined: Self = StObject.set(x, "atmosphere", js.undefined)
    
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
