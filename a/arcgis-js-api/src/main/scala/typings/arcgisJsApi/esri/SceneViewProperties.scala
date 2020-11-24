package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.global
import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.low
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewProperties
  extends ViewProperties
     with BreakpointsOwnerProperties {
  
  /**
    * Allows the view to be partially or fully transparent when composited with the webpage elements behind it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#alphaCompositingEnabled)
    */
  var alphaCompositingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The observation point from which the visible portion (or perspective) of the SceneView is determined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera)
    */
  var camera: js.UndefOr[CameraProperties] = js.native
  
  /**
    * Represents the view's center point; when setting the center you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing at longitude/latitude pair (`[-100.4593, 36.9014]`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center)
    */
  var center: js.UndefOr[PointProperties | js.Array[Double]] = js.native
  
  /**
    * Represents an optional clipping area used to define the visible [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * Specifies constraints for [Camera tilt](esri-Camera.html#tilt) and altitude that may be applied to the SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var constraints: js.UndefOr[SceneViewConstraintsProperties] = js.native
  
  /**
    * Specifies various properties of the environment's visualization in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var environment: js.UndefOr[SceneViewEnvironmentProperties] = js.native
  
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[SceneViewHighlightOptionsProperties] = js.native
  
  /**
    * SceneView can draw scenes in three different quality modes: `high`, `medium` and `low`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#qualityProfile)
    */
  var qualityProfile: js.UndefOr[low | medium | high] = js.native
  
  /**
    * Represents an approximation of the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The viewing mode (`local` or `global`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode)
    */
  var viewingMode: js.UndefOr[global | local] = js.native
  
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.native
  
  /**
    * Represents the level of detail (LOD) at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: js.UndefOr[Double] = js.native
}
object SceneViewProperties {
  
  @scala.inline
  def apply(): SceneViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewProperties]
  }
  
  @scala.inline
  implicit class SceneViewPropertiesOps[Self <: SceneViewProperties] (val x: Self) extends AnyVal {
    
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
    def setAlphaCompositingEnabled(value: Boolean): Self = this.set("alphaCompositingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaCompositingEnabled: Self = this.set("alphaCompositingEnabled", js.undefined)
    
    @scala.inline
    def setCamera(value: CameraProperties): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: Double*): Self = this.set("center", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: PointProperties | js.Array[Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setClippingArea(value: ExtentProperties): Self = this.set("clippingArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippingArea: Self = this.set("clippingArea", js.undefined)
    
    @scala.inline
    def setConstraints(value: SceneViewConstraintsProperties): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setEnvironment(value: SceneViewEnvironmentProperties): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setHighlightOptions(value: SceneViewHighlightOptionsProperties): Self = this.set("highlightOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightOptions: Self = this.set("highlightOptions", js.undefined)
    
    @scala.inline
    def setQualityProfile(value: low | medium | high): Self = this.set("qualityProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityProfile: Self = this.set("qualityProfile", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setViewingMode(value: global | local): Self = this.set("viewingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewingMode: Self = this.set("viewingMode", js.undefined)
    
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = this.set("viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewpoint: Self = this.set("viewpoint", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
