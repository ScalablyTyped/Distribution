package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewEnvironment
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * Atmosphere conditions of the scene.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
  		 */
  var atmosphere: js.UndefOr[SceneViewEnvironmentAtmosphere] = js.undefined
  
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
  var background: js.UndefOr[Background] = js.undefined
  
  /**
  		 * Indicates the type of lighting in the scene.
  		 *
  		 * @default SunLighting
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
  		 */
  var lighting: js.UndefOr[SunLighting | VirtualLighting] = js.undefined
  
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
  var weather: js.UndefOr[SunnyWeather | CloudyWeather | RainyWeather | SnowyWeather | FoggyWeather] = js.undefined
}
object SceneViewEnvironment {
  
  inline def apply(): SceneViewEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewEnvironment] (val x: Self) extends AnyVal {
    
    inline def setAtmosphere(value: SceneViewEnvironmentAtmosphere): Self = StObject.set(x, "atmosphere", value.asInstanceOf[js.Any])
    
    inline def setAtmosphereEnabled(value: Boolean): Self = StObject.set(x, "atmosphereEnabled", value.asInstanceOf[js.Any])
    
    inline def setAtmosphereEnabledUndefined: Self = StObject.set(x, "atmosphereEnabled", js.undefined)
    
    inline def setAtmosphereUndefined: Self = StObject.set(x, "atmosphere", js.undefined)
    
    inline def setBackground(value: Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setLighting(value: SunLighting | VirtualLighting): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    inline def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
    
    inline def setStarsEnabled(value: Boolean): Self = StObject.set(x, "starsEnabled", value.asInstanceOf[js.Any])
    
    inline def setStarsEnabledUndefined: Self = StObject.set(x, "starsEnabled", js.undefined)
    
    inline def setWeather(value: SunnyWeather | CloudyWeather | RainyWeather | SnowyWeather | FoggyWeather): Self = StObject.set(x, "weather", value.asInstanceOf[js.Any])
    
    inline def setWeatherUndefined: Self = StObject.set(x, "weather", js.undefined)
  }
}
