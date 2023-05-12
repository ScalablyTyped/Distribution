package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.bottom_
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.left_
import typings.arcgisJsApi.arcgisJsApiStrings.right_
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapView
  extends StObject
     with View
     with BreakpointsOwner {
  
  /**
    * The background color of the MapView.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#background)
    */
  var background: ColorBackground = js.native
  
  /**
    * Represents the view's center point; when setting the center, you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing a longitude/latitude pair (`[-100.4593, 36.9014]`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center)
    */
  var center: Point = js.native
  
  /**
    * Specifies constraints to [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale), [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom), and [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) that may be applied to the MapView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var constraints: MapViewConstraints = js.native
  
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent)
    */
  var extent: Extent = js.native
  
  /**
    * Applies a display filter on the view for a specific set of floor levels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#floors)
    */
  var floors: Collection[String] = js.native
  
  /**
    * Sets the view to a given target.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    */
  def goTo(target: GoToTarget2D): js.Promise[Any] = js.native
  def goTo(target: GoToTarget2D, options: GoToOptions2D): js.Promise[Any] = js.native
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var highlightOptions: HighlightOptions = js.native
  
  /**
    * Returns [hit test results](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult) from each layer that intersects the specified screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest)
    */
  def hitTest(screenPoint: MapViewScreenPoint): js.Promise[HitTestResult] = js.native
  def hitTest(screenPoint: MapViewScreenPoint, options: MapViewHitTestOptions): js.Promise[HitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent): js.Promise[HitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent, options: MapViewHitTestOptions): js.Promise[HitTestResult] = js.native
  
  /**
    * Defines which anchor stays still while resizing the browser window.
    *
    * @default center
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resizeAlign)
    */
  var resizeAlign: center_ | left_ | right_ | top_ | bottom_ | `top-left` | `top-right` | `bottom-left` | `bottom-right` = js.native
  
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation)
    */
  var rotation: Double = js.native
  
  /**
    * Represents the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale)
    */
  var scale: Double = js.native
  
  /**
    * Indicates if the MapView's [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#spatialReference) can be changed after it is initialized.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#spatialReferenceLocked)
    */
  var spatialReferenceLocked: Boolean = js.native
  
  /**
    * Create a screenshot of the current view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    */
  def takeScreenshot(): js.Promise[Screenshot] = js.native
  def takeScreenshot(options: MapViewTakeScreenshotOptions): js.Promise[Screenshot] = js.native
  
  /**
    * Converts the given screen point to a [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#toMap)
    */
  def toMap(screenPoint: MapViewScreenPoint): Point = js.native
  def toMap(screenPoint: MouseEvent): Point = js.native
  
  /**
    * Converts the given [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) to a screen point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#toScreen)
    */
  def toScreen(point: Point): MapViewScreenPoint = js.native
  
  /**
    * The dimension of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#type)
    */
  @JSName("type")
  val type_MapView: `2d` = js.native
  
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
  
  /**
    * Represents the level of detail (LOD) at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom)
    */
  var zoom: Double = js.native
}
