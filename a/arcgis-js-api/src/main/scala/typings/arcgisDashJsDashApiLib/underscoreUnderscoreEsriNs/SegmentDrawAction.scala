package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDrawAction extends DrawAction {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked. SegmentDrawActions are created from 2 vertices.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode)
    *
    * @default freehand
    */
  var mode: java.lang.String = js.native
  /**
    * Two-dimensional array of numbers representing the coordinates of each vertex comprising the geometry being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#vertices)
    */
  val vertices: js.Array[js.Array[scala.Double]] = js.native
  /**
    * Completes drawing the polygon geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#event-draw-complete) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#complete)
    *
    *
    */
  def complete(): scala.Unit = js.native
}

@JSGlobal("__esri.SegmentDrawAction")
@js.native
class SegmentDrawActionCls () extends SegmentDrawAction {
  def this(properties: SegmentDrawActionProperties) = this()
}

