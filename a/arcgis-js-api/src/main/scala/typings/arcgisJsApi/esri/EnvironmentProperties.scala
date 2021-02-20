package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentProperties extends StObject {
  
  /**
    * Specifies whether the atmosphere should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#atmosphereEnabled)
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#background)
    */
  var background: js.UndefOr[BackgroundProperties] = js.native
  
  /**
    * Settings for defining the lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#lighting)
    */
  var lighting: js.UndefOr[LightingProperties] = js.native
  
  /**
    * Specifies whether stars should be displayed in the sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#starsEnabled)
    */
  var starsEnabled: js.UndefOr[Boolean] = js.native
}
object EnvironmentProperties {
  
  @scala.inline
  def apply(): EnvironmentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentProperties]
  }
  
  @scala.inline
  implicit class EnvironmentPropertiesMutableBuilder[Self <: EnvironmentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtmosphereEnabled(value: Boolean): Self = StObject.set(x, "atmosphereEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtmosphereEnabledUndefined: Self = StObject.set(x, "atmosphereEnabled", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundProperties): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setLighting(value: LightingProperties): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
    
    @scala.inline
    def setStarsEnabled(value: Boolean): Self = StObject.set(x, "starsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarsEnabledUndefined: Self = StObject.set(x, "starsEnabled", js.undefined)
  }
}
