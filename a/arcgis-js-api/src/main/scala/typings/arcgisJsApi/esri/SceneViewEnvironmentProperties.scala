package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewEnvironmentProperties extends Object {
  
  /**
    * Atmosphere conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphere: js.UndefOr[SceneViewEnvironmentAtmosphereProperties] = js.native
  
  /**
    * Indicates whether atmosphere visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var background: js.UndefOr[BackgroundProperties] = js.native
  
  /**
    * Lighting conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var lighting: js.UndefOr[SceneViewEnvironmentLightingProperties] = js.native
  
  /**
    * Indicates whether stars visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var starsEnabled: js.UndefOr[Boolean] = js.native
}
object SceneViewEnvironmentProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewEnvironmentProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewEnvironmentProperties]
  }
  
  @scala.inline
  implicit class SceneViewEnvironmentPropertiesMutableBuilder[Self <: SceneViewEnvironmentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtmosphere(value: SceneViewEnvironmentAtmosphereProperties): Self = StObject.set(x, "atmosphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtmosphereEnabled(value: Boolean): Self = StObject.set(x, "atmosphereEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtmosphereEnabledUndefined: Self = StObject.set(x, "atmosphereEnabled", js.undefined)
    
    @scala.inline
    def setAtmosphereUndefined: Self = StObject.set(x, "atmosphere", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundProperties): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setLighting(value: SceneViewEnvironmentLightingProperties): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
    
    @scala.inline
    def setStarsEnabled(value: Boolean): Self = StObject.set(x, "starsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarsEnabledUndefined: Self = StObject.set(x, "starsEnabled", js.undefined)
  }
}
