package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
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
    * Lighting conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var lighting: js.UndefOr[SceneViewEnvironmentLighting] = js.undefined
  
  /**
    * Indicates whether stars visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var starsEnabled: js.UndefOr[Boolean] = js.undefined
}
object SceneViewEnvironment {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewEnvironment]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], SceneViewEnvironment]])
  ): SceneViewEnvironment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewEnvironment]
  }
  
  extension [Self <: SceneViewEnvironment](x: Self) {
    
    inline def setAtmosphere(value: SceneViewEnvironmentAtmosphere): Self = StObject.set(x, "atmosphere", value.asInstanceOf[js.Any])
    
    inline def setAtmosphereEnabled(value: Boolean): Self = StObject.set(x, "atmosphereEnabled", value.asInstanceOf[js.Any])
    
    inline def setAtmosphereEnabledUndefined: Self = StObject.set(x, "atmosphereEnabled", js.undefined)
    
    inline def setAtmosphereUndefined: Self = StObject.set(x, "atmosphere", js.undefined)
    
    inline def setBackground(value: Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setLighting(value: SceneViewEnvironmentLighting): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    inline def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
    
    inline def setStarsEnabled(value: Boolean): Self = StObject.set(x, "starsEnabled", value.asInstanceOf[js.Any])
    
    inline def setStarsEnabledUndefined: Self = StObject.set(x, "starsEnabled", js.undefined)
  }
}
