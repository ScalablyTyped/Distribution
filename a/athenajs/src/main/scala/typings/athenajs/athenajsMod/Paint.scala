package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Paint")
@js.native
class Paint protected () extends Drawable {
  def this(`type`: String, paintOptions: PaintOptions) = this()
  var color: String = js.native
  var name: String = js.native
  def arc(
    cx: Double,
    cy: Double,
    r: Double,
    starteAngle: Double,
    endAngle: Double,
    fillStyle: String,
    borderSize: Double
  ): Unit = js.native
  def circle(cx: Double, cy: Double, r: Double): Unit = js.native
  def circle(cx: Double, cy: Double, r: Double, fillStyle: String): Unit = js.native
  def circle(cx: Double, cy: Double, r: Double, fillStyle: String, borderWidth: Double): Unit = js.native
  def circle(cx: Double, cy: Double, r: Double, fillStyle: String, borderWidth: Double, borderStyle: String): Unit = js.native
  def fill(): Unit = js.native
  def fill(color: String): Unit = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, color: String): Unit = js.native
}

