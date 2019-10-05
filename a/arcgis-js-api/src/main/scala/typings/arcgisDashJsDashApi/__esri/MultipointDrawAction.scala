package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipointDrawAction extends DrawAction {
  /**
    * Two-dimensional array of numbers representing the coordinates of each vertex that comprises the drawn geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html#vertices)
    */
  val vertices: js.Array[js.Array[Double]] = js.native
  /**
    * Completes drawing the [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html#event-draw-complete) event. Call this method if the drawing logic needs to be completed other than by double-clicking or pressing the "C" key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
}

@JSGlobal("__esri.MultipointDrawAction")
@js.native
object MultipointDrawAction extends TopLevel[MultipointDrawActionConstructor]

