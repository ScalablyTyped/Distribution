package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.global
import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.low
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneView
  extends View
     with BreakpointsOwner {
  
  /**
    * Allows the view to be partially or fully transparent when composited with the webpage elements behind it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#alphaCompositingEnabled)
    */
  var alphaCompositingEnabled: Boolean = js.native
  
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent)
    */
  var extent: Extent = js.native
  
  /**
    * Sets the view to a given target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    */
  def goTo(target: GoToTarget3D): js.Promise[_] = js.native
  def goTo(target: GoToTarget3D, options: GoToOptions3D): js.Promise[_] = js.native
  
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
  var highlightOptions: SceneViewHighlightOptions = js.native
  
  /**
    * Returns graphics that intersect the specified screen coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)
    */
  def hitTest(screenPoint: SceneViewScreenPoint): js.Promise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: SceneViewScreenPoint, options: SceneViewHitTestOptions): js.Promise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent): js.Promise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent, options: SceneViewHitTestOptions): js.Promise[SceneViewHitTestResult] = js.native
  
  def on(`type`: String, modifiersOrHandler: js.Array[String], handler: EventHandler): IHandle = js.native
  def on(`type`: String, modifiersOrHandler: EventHandler, handler: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Array[String], handler: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: EventHandler, handler: EventHandler): IHandle = js.native
  
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
    * The viewing mode (`local` or `global`).
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
    * Represents the level of detail (LOD) at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: Double = js.native
}
