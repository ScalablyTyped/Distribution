package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`3d`
import typings.arcgisJsApi.arcgisJsApiStrings.global
import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.low
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneView
  extends StObject
     with View
     with BreakpointsOwner {
  
  /**
    * Allows the view to be partially or fully transparent when composited with the webpage elements behind it.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#alphaCompositingEnabled)
    */
  var alphaCompositingEnabled: Boolean = js.native
  
  /**
    * Allows for adding analyses directly to the default analyses in the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#analyses)
    */
  var analyses: Collection[
    DimensionAnalysis | DirectLineMeasurementAnalysis | AreaMeasurementAnalysis | SliceAnalysis | LineOfSightAnalysis
  ] = js.native
  
  /**
    * The observation point from which the visible portion (or perspective) of the SceneView is determined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera)
    */
  var camera: Camera = js.native
  
  /**
    * Represents the view's center point; when setting the center you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing at longitude/latitude pair (`[-100.4593, 36.9014]`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center)
    */
  var center: Point = js.native
  
  /**
    * Represents an optional clipping area used to define the visible [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clippingArea)
    */
  var clippingArea: Extent = js.native
  
  /**
    * Specifies constraints for [Camera tilt](esri-Camera.html#tilt) and altitude that may be applied to the SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var constraints: SceneViewConstraints = js.native
  
  /**
    * Specifies various properties of the environment's visualization in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var environment: SceneViewEnvironment = js.native
  
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent)
    */
  var extent: Extent = js.native
  
  /**
    * Applies a display filter on the view for a specific set of floor levels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#floors)
    */
  var floors: Collection[String] = js.native
  
  /**
    * Sets the view to a given target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  def goTo(target: GoToTarget3D): js.Promise[Any] = js.native
  def goTo(target: GoToTarget3D, options: GoToOptions3D): js.Promise[Any] = js.native
  
  /**
    * The view for the ground of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#groundView)
    */
  val groundView: GroundView = js.native
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var highlightOptions: HighlightOptions = js.native
  
  /**
    * Returns [hit test results](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult) from each layer that intersects the specified screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)
    */
  def hitTest(screenPoint: SceneViewScreenPoint): js.Promise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: SceneViewScreenPoint, options: SceneViewHitTestOptions): js.Promise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent): js.Promise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent, options: SceneViewHitTestOptions): js.Promise[SceneViewHitTestResult] = js.native
  
  /**
    * This property contains performance information in a SceneView like global memory usage and additional details for layers about memory consumption and number of features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#performanceInfo)
    */
  val performanceInfo: SceneViewPerformanceInfo = js.native
  
  /**
    * SceneView can draw scenes in three different quality modes: `high`, `medium` and `low`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#qualityProfile)
    */
  var qualityProfile: low | medium | high = js.native
  
  /**
    * Represents an approximation of the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale)
    */
  var scale: Double = js.native
  
  /**
    * Create a screenshot of the current view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  def takeScreenshot(): js.Promise[SceneViewScreenshot] = js.native
  def takeScreenshot(options: SceneViewTakeScreenshotOptions): js.Promise[SceneViewScreenshot] = js.native
  
  /**
    * Converts the given screen point to a [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toMap)
    */
  def toMap(screenPoint: SceneViewScreenPoint): Point = js.native
  def toMap(screenPoint: SceneViewScreenPoint, options: SceneViewToMapOptions): Point = js.native
  def toMap(screenPoint: MouseEvent): Point = js.native
  def toMap(screenPoint: MouseEvent, options: SceneViewToMapOptions): Point = js.native
  
  /**
    * Converts the given [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) to a screen point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toScreen)
    */
  def toScreen(point: Point): SceneViewScreenPoint = js.native
  
  /**
    * The type of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#type)
    */
  @JSName("type")
  val type_SceneView: `3d` = js.native
  
  /**
    * The viewing mode (`local` or `global`).
    *
    * @default global
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode)
    */
  var viewingMode: global | local = js.native
  
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
  
  /**
    * Gets the analysis view created for the given analysis object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#whenAnalysisView)
    */
  def whenAnalysisView(analysis: AreaMeasurementAnalysis): js.Promise[AreaMeasurementAnalysisView3D] = js.native
  /**
    * Gets the analysis view created for the given analysis object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#whenAnalysisView)
    */
  def whenAnalysisView(analysis: DimensionAnalysis): js.Promise[DimensionAnalysisView] = js.native
  /**
    * Gets the analysis view created for the given analysis object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#whenAnalysisView)
    */
  def whenAnalysisView(analysis: DirectLineMeasurementAnalysis): js.Promise[DirectLineMeasurementAnalysisView3D] = js.native
  /**
    * Gets the analysis view created for the given analysis object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#whenAnalysisView)
    */
  def whenAnalysisView(analysis: LineOfSightAnalysis): js.Promise[LineOfSightAnalysisView3D] = js.native
  /**
    * Gets the analysis view created for the given analysis object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#whenAnalysisView)
    */
  def whenAnalysisView(analysis: SliceAnalysis): js.Promise[SliceAnalysisView3D] = js.native
  
  /**
    * Represents the level of detail (LOD) at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: Double = js.native
}
