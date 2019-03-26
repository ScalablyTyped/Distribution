package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonDrawAction extends DrawAction {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged.
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-draw-PolygonDrawAction.html#mode)
    *
    * @default hybrid
    */
  var mode: java.lang.String = js.native
  /**
    * Two-dimensional array of numbers representing the coordinates of each vertex comprising the geometry being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-draw-PolygonDrawAction.html#vertices)
    */
  val vertices: js.Array[js.Array[scala.Double]] = js.native
  /**
    * Completes drawing the polygon geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-draw-PolygonDrawAction.html#event:draw-complete) event. Call this method if the drawing logic needs to be completed other than by double-clicking or pressing the "C" key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-draw-PolygonDrawAction.html#complete)
    *
    *
    */
  def complete(): scala.Unit = js.native
}

@JSGlobal("__esri.PolygonDrawAction")
@js.native
class PolygonDrawActionCls () extends PolygonDrawAction {
  def this(properties: PolygonDrawActionProperties) = this()
}

