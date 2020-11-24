package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewEnvironmentLightingProperties extends Object {
  
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var ambientOcclusionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var cameraTrackingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The current date and time of the simulated sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var date: js.UndefOr[DateProperties] = js.native
  
  /**
    * Indicates whether to show shadows cast by the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether polygons that use [WaterSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html) display reflections of surrounding terrain, buildings and other 3D objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var waterReflectionEnabled: js.UndefOr[Boolean] = js.native
}
object SceneViewEnvironmentLightingProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewEnvironmentLightingProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewEnvironmentLightingProperties]
  }
  
  @scala.inline
  implicit class SceneViewEnvironmentLightingPropertiesOps[Self <: SceneViewEnvironmentLightingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmbientOcclusionEnabled(value: Boolean): Self = this.set("ambientOcclusionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmbientOcclusionEnabled: Self = this.set("ambientOcclusionEnabled", js.undefined)
    
    @scala.inline
    def setCameraTrackingEnabled(value: Boolean): Self = this.set("cameraTrackingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraTrackingEnabled: Self = this.set("cameraTrackingEnabled", js.undefined)
    
    @scala.inline
    def setDate(value: DateProperties): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDirectShadowsEnabled(value: Boolean): Self = this.set("directShadowsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectShadowsEnabled: Self = this.set("directShadowsEnabled", js.undefined)
    
    @scala.inline
    def setWaterReflectionEnabled(value: Boolean): Self = this.set("waterReflectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterReflectionEnabled: Self = this.set("waterReflectionEnabled", js.undefined)
  }
}
