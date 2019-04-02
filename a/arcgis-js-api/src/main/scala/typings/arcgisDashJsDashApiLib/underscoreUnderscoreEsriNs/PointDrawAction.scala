package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDrawAction extends DrawAction {
  /**
    * An array of x,y coordinates for the [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html#coordinates)
    */
  val coordinates: js.Array[scala.Double] = js.native
  /**
    * Completes drawing the [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html#event:draw-complete) event. Call this method if the drawing logic needs to be completed other than by double-clicking or pressing the "C" key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html#complete)
    *
    *
    */
  def complete(): scala.Unit = js.native
}

@JSGlobal("__esri.PointDrawAction")
@js.native
class PointDrawActionCls () extends PointDrawAction {
  def this(properties: PointDrawActionProperties) = this()
}

