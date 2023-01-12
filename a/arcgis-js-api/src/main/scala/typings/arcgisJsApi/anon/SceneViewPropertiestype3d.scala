package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`3d`
import typings.arcgisJsApi.arcgisJsApiStrings.global
import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.large
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.low
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.arcgisJsApi.arcgisJsApiStrings.small
import typings.arcgisJsApi.arcgisJsApiStrings.xlarge
import typings.arcgisJsApi.arcgisJsApiStrings.xsmall
import typings.arcgisJsApi.esri.AreaMeasurementAnalysisProperties
import typings.arcgisJsApi.esri.BasemapViewProperties
import typings.arcgisJsApi.esri.BreakpointsOwnerBreakpoints
import typings.arcgisJsApi.esri.CameraProperties
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.DefaultUIProperties
import typings.arcgisJsApi.esri.DimensionAnalysisProperties
import typings.arcgisJsApi.esri.DirectLineMeasurementAnalysisProperties
import typings.arcgisJsApi.esri.Error
import typings.arcgisJsApi.esri.ExtentProperties
import typings.arcgisJsApi.esri.GraphicProperties
import typings.arcgisJsApi.esri.LayerViewProperties
import typings.arcgisJsApi.esri.LineOfSightAnalysisProperties
import typings.arcgisJsApi.esri.MapProperties
import typings.arcgisJsApi.esri.NavigationProperties
import typings.arcgisJsApi.esri.PopupProperties
import typings.arcgisJsApi.esri.SceneViewConstraintsProperties
import typings.arcgisJsApi.esri.SceneViewEnvironmentProperties
import typings.arcgisJsApi.esri.SceneViewHighlightOptionsProperties
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import typings.arcgisJsApi.esri.TimeExtentProperties
import typings.arcgisJsApi.esri.ViewAnimationProperties
import typings.arcgisJsApi.esri.ViewPadding
import typings.arcgisJsApi.esri.ViewpointProperties
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SceneViewProperties & {  type :'3d'} */
trait SceneViewPropertiestype3d extends StObject {
  
  /**
    * Collection containing a flat list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) related to the basemap, operational layers, and group layers in this view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#allLayerViews)
    */
  var allLayerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.undefined
  
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
    * Represents an ongoing view animation initialized by [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#animation)
    */
  var animation: js.UndefOr[ViewAnimationProperties] = js.undefined
  
  /**
    * Represents the view for a single basemap after it has been added to the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#basemapView)
    */
  var basemapView: js.UndefOr[BasemapViewProperties] = js.undefined
  
  /**
    * A convenience property used for defining the breakpoints on the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) and [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    */
  var breakpoints: js.UndefOr[BreakpointsOwnerBreakpoints] = js.undefined
  
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
    * The `id` or node representing the DOM element containing the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
    */
  var container: js.UndefOr[HTMLDivElement | String] = js.undefined
  
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
    * A fatal [error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) returned when the view loses its WebGL context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#fatalError)
    */
  var fatalError: js.UndefOr[Error] = js.undefined
  
  /**
    * Applies a display filter on the view for a specific set of floor levels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#floors)
    */
  var floors: js.UndefOr[CollectionProperties[String]] = js.undefined
  
  /**
    * Allows for adding [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) directly to the default graphics in the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics)
    */
  var graphics: js.UndefOr[CollectionProperties[GraphicProperties]] = js.undefined
  
  /**
    * A convenience property indicating the general size of the view's height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint)
    */
  var heightBreakpoint: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[SceneViewHighlightOptionsProperties] = js.undefined
  
  /**
    * A collection containing a hierarchical list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of the [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#layerViews)
    */
  var layerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.undefined
  
  /**
    * An instance of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) object to display in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map)
    */
  var map: js.UndefOr[MapProperties] = js.undefined
  
  /**
    * Options to configure the navigation behavior of the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#navigation)
    */
  var navigation: js.UndefOr[NavigationProperties] = js.undefined
  
  /**
    * Use the padding property to make the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center), and [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent), etc.
    *
    * @default {left: 0, top: 0, right: 0, bottom: 0}
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#padding)
    */
  var padding: js.UndefOr[ViewPadding] = js.undefined
  
  /**
    * A Popup object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#map).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#popup)
    */
  var popup: js.UndefOr[PopupProperties] = js.undefined
  
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
    * The spatial reference of the view.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The view's time extent.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  var `type`: `3d`
  
  /**
    * Exposes the default widgets available in the view and allows you to toggle them on and off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
    */
  var ui: js.UndefOr[DefaultUIProperties] = js.undefined
  
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
    * A convenience property indicating the general size of the view's width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint)
    */
  var widthBreakpoint: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  
  /**
    * Represents the level of detail (LOD) at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object SceneViewPropertiestype3d {
  
  inline def apply(): SceneViewPropertiestype3d = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("3d")
    __obj.asInstanceOf[SceneViewPropertiestype3d]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewPropertiestype3d] (val x: Self) extends AnyVal {
    
    inline def setAllLayerViews(value: CollectionProperties[LayerViewProperties]): Self = StObject.set(x, "allLayerViews", value.asInstanceOf[js.Any])
    
    inline def setAllLayerViewsUndefined: Self = StObject.set(x, "allLayerViews", js.undefined)
    
    inline def setAllLayerViewsVarargs(value: LayerViewProperties*): Self = StObject.set(x, "allLayerViews", js.Array(value*))
    
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
    
    inline def setAnimation(value: ViewAnimationProperties): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBasemapView(value: BasemapViewProperties): Self = StObject.set(x, "basemapView", value.asInstanceOf[js.Any])
    
    inline def setBasemapViewUndefined: Self = StObject.set(x, "basemapView", js.undefined)
    
    inline def setBreakpoints(value: BreakpointsOwnerBreakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setCamera(value: CameraProperties): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCenter(value: PointPropertiestypepoint | js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setClippingArea(value: ExtentProperties): Self = StObject.set(x, "clippingArea", value.asInstanceOf[js.Any])
    
    inline def setClippingAreaUndefined: Self = StObject.set(x, "clippingArea", js.undefined)
    
    inline def setConstraints(value: SceneViewConstraintsProperties): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setContainer(value: HTMLDivElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setEnvironment(value: SceneViewEnvironmentProperties): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setFatalError(value: Error): Self = StObject.set(x, "fatalError", value.asInstanceOf[js.Any])
    
    inline def setFatalErrorUndefined: Self = StObject.set(x, "fatalError", js.undefined)
    
    inline def setFloors(value: CollectionProperties[String]): Self = StObject.set(x, "floors", value.asInstanceOf[js.Any])
    
    inline def setFloorsUndefined: Self = StObject.set(x, "floors", js.undefined)
    
    inline def setFloorsVarargs(value: String*): Self = StObject.set(x, "floors", js.Array(value*))
    
    inline def setGraphics(value: CollectionProperties[GraphicProperties]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    inline def setGraphicsUndefined: Self = StObject.set(x, "graphics", js.undefined)
    
    inline def setGraphicsVarargs(value: GraphicProperties*): Self = StObject.set(x, "graphics", js.Array(value*))
    
    inline def setHeightBreakpoint(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "heightBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setHeightBreakpointUndefined: Self = StObject.set(x, "heightBreakpoint", js.undefined)
    
    inline def setHighlightOptions(value: SceneViewHighlightOptionsProperties): Self = StObject.set(x, "highlightOptions", value.asInstanceOf[js.Any])
    
    inline def setHighlightOptionsUndefined: Self = StObject.set(x, "highlightOptions", js.undefined)
    
    inline def setLayerViews(value: CollectionProperties[LayerViewProperties]): Self = StObject.set(x, "layerViews", value.asInstanceOf[js.Any])
    
    inline def setLayerViewsUndefined: Self = StObject.set(x, "layerViews", js.undefined)
    
    inline def setLayerViewsVarargs(value: LayerViewProperties*): Self = StObject.set(x, "layerViews", js.Array(value*))
    
    inline def setMap(value: MapProperties): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setNavigation(value: NavigationProperties): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPopup(value: PopupProperties): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setQualityProfile(value: low | medium | high): Self = StObject.set(x, "qualityProfile", value.asInstanceOf[js.Any])
    
    inline def setQualityProfileUndefined: Self = StObject.set(x, "qualityProfile", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setType(value: `3d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUi(value: DefaultUIProperties): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    
    inline def setViewingMode(value: global | local): Self = StObject.set(x, "viewingMode", value.asInstanceOf[js.Any])
    
    inline def setViewingModeUndefined: Self = StObject.set(x, "viewingMode", js.undefined)
    
    inline def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
    
    inline def setWidthBreakpoint(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "widthBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setWidthBreakpointUndefined: Self = StObject.set(x, "widthBreakpoint", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
