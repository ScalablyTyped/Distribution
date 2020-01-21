package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draw extends Accessor {
  /**
    * A reference to the active [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html). An instance of the draw action is created when [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#activeAction)
    */
  var activeAction: DrawAction = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the draw to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#view)
    */
  var view: MapView = js.native
  /**
    * Complete the current active drawing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
  /**
    * Creates an instance of the requested draw action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create)
    *
    * @param drawAction
    * Name of the [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html) to create. See the table below for a list of possible values and type of draw action it creates.  **Possible Values:** point | multipoint | polyline | polygon | rectangle | circle | ellipse
    *
    * Geometry type | Draw action instance
    * ------------- | --------------------
    * point         | [PointDrawAction](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html)
    * multipoint    | [MultipointDrawAction](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html) (only supported in [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html))
    * polyline      | [PolylineDrawAction](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html)
    * polygon       | [PolygonDrawAction](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html)
    * rectangle, circle, ellipse | [SegmentDrawAction](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html)
    * @param drawOptions Object of the drawing options for the geometry to be created.
    * @param drawOptions.mode
    * The drawing mode. The drawing mode applies only when creating `polygon`, `polyline`, `segment` draw actions.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline` draw actions.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` and `segment` draw actions. Default for `segment` draw actions.
    * click | Vertices are added when the pointer is clicked.
    *
    */
  def create(drawAction: String): DrawAction = js.native
  def create(drawAction: String, drawOptions: DrawCreateDrawOptions): DrawAction = js.native
  /**
    * Resets the drawing by clearing the active action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#reset)
    *
    *
    */
  def reset(): Unit = js.native
}

@JSGlobal("__esri.Draw")
@js.native
object Draw extends TopLevel[DrawConstructor]

