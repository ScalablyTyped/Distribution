package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.PointPropertiestypepoint
import typings.arcgisJsApi.anon.SliceAnalysisPropertiesty
import typings.arcgisJsApi.arcgisJsApiStrings.global
import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.low
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewProperties
  extends StObject
     with ViewProperties
     with BreakpointsOwnerProperties {
  
  /**
    * Allows the view to be partially or fully transparent when composited with the webpage elements behind it.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#alphaCompositingEnabled)
    */
  var alphaCompositingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows for adding analyses directly to the default analyses in the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#analyses)
    */
  var analyses: js.UndefOr[
    CollectionProperties[
      DimensionAnalysisProperties | DirectLineMeasurementAnalysisProperties | AreaMeasurementAnalysisProperties | SliceAnalysisPropertiesty | LineOfSightAnalysisProperties
    ]
  ] = js.undefined
  
  /**
    * The observation point from which the visible portion (or perspective) of the SceneView is determined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera)
    */
  var camera: js.UndefOr[CameraProperties] = js.undefined
  
  /**
    * Represents the view's center point; when setting the center you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing at longitude/latitude pair (`[-100.4593, 36.9014]`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center)
    */
  var center: js.UndefOr[PointPropertiestypepoint | js.Array[Double]] = js.undefined
  
  /**
    * Represents an optional clipping area used to define the visible [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * Specifies constraints for [Camera tilt](esri-Camera.html#tilt) and altitude that may be applied to the SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var constraints: js.UndefOr[SceneViewConstraintsProperties] = js.undefined
  
  /**
    * Specifies various properties of the environment's visualization in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var environment: js.UndefOr[SceneViewEnvironmentProperties] = js.undefined
  
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * Applies a display filter on the view for a specific set of floor levels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#floors)
    */
  var floors: js.UndefOr[CollectionProperties[String]] = js.undefined
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[SceneViewHighlightOptionsProperties] = js.undefined
  
  /**
    * SceneView can draw scenes in three different quality modes: `high`, `medium` and `low`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#qualityProfile)
    */
  var qualityProfile: js.UndefOr[low | medium | high] = js.undefined
  
  /**
    * Represents an approximation of the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * The viewing mode (`local` or `global`).
    *
    * @default global
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode)
    */
  var viewingMode: js.UndefOr[global | local] = js.undefined
  
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
  
  /**
    * Represents the level of detail (LOD) at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object SceneViewProperties {
  
  inline def apply(): SceneViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewProperties] (val x: Self) extends AnyVal {
    
    inline def setAlphaCompositingEnabled(value: Boolean): Self = StObject.set(x, "alphaCompositingEnabled", value.asInstanceOf[js.Any])
    
    inline def setAlphaCompositingEnabledUndefined: Self = StObject.set(x, "alphaCompositingEnabled", js.undefined)
    
    inline def setAnalyses(
      value: CollectionProperties[
          DimensionAnalysisProperties | DirectLineMeasurementAnalysisProperties | AreaMeasurementAnalysisProperties | SliceAnalysisPropertiesty | LineOfSightAnalysisProperties
        ]
    ): Self = StObject.set(x, "analyses", value.asInstanceOf[js.Any])
    
    inline def setAnalysesUndefined: Self = StObject.set(x, "analyses", js.undefined)
    
    inline def setAnalysesVarargs(
      value: (DimensionAnalysisProperties | DirectLineMeasurementAnalysisProperties | AreaMeasurementAnalysisProperties | SliceAnalysisPropertiesty | LineOfSightAnalysisProperties)*
    ): Self = StObject.set(x, "analyses", js.Array(value*))
    
    inline def setCamera(value: CameraProperties): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCenter(value: PointPropertiestypepoint | js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setClippingArea(value: ExtentProperties): Self = StObject.set(x, "clippingArea", value.asInstanceOf[js.Any])
    
    inline def setClippingAreaUndefined: Self = StObject.set(x, "clippingArea", js.undefined)
    
    inline def setConstraints(value: SceneViewConstraintsProperties): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setEnvironment(value: SceneViewEnvironmentProperties): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setFloors(value: CollectionProperties[String]): Self = StObject.set(x, "floors", value.asInstanceOf[js.Any])
    
    inline def setFloorsUndefined: Self = StObject.set(x, "floors", js.undefined)
    
    inline def setFloorsVarargs(value: String*): Self = StObject.set(x, "floors", js.Array(value*))
    
    inline def setHighlightOptions(value: SceneViewHighlightOptionsProperties): Self = StObject.set(x, "highlightOptions", value.asInstanceOf[js.Any])
    
    inline def setHighlightOptionsUndefined: Self = StObject.set(x, "highlightOptions", js.undefined)
    
    inline def setQualityProfile(value: low | medium | high): Self = StObject.set(x, "qualityProfile", value.asInstanceOf[js.Any])
    
    inline def setQualityProfileUndefined: Self = StObject.set(x, "qualityProfile", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setViewingMode(value: global | local): Self = StObject.set(x, "viewingMode", value.asInstanceOf[js.Any])
    
    inline def setViewingModeUndefined: Self = StObject.set(x, "viewingMode", js.undefined)
    
    inline def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
