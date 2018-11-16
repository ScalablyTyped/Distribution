package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Paint")
@js.native
class Paint protected () extends Drawable {
  def this(`type`: java.lang.String, paintOptions: PaintOptions) = this()
  var color: java.lang.String = js.native
  var name: java.lang.String = js.native
  def arc(
    cx: scala.Double,
    cy: scala.Double,
    r: scala.Double,
    starteAngle: scala.Double,
    endAngle: scala.Double,
    fillStyle: java.lang.String,
    borderSize: scala.Double
  ): scala.Unit = js.native
  def circle(cx: scala.Double, cy: scala.Double, r: scala.Double): scala.Unit = js.native
  def circle(cx: scala.Double, cy: scala.Double, r: scala.Double, fillStyle: java.lang.String): scala.Unit = js.native
  def circle(
    cx: scala.Double,
    cy: scala.Double,
    r: scala.Double,
    fillStyle: java.lang.String,
    borderWidth: scala.Double
  ): scala.Unit = js.native
  def circle(
    cx: scala.Double,
    cy: scala.Double,
    r: scala.Double,
    fillStyle: java.lang.String,
    borderWidth: scala.Double,
    borderStyle: java.lang.String
  ): scala.Unit = js.native
  def fill(): scala.Unit = js.native
  def fill(color: java.lang.String): scala.Unit = js.native
  def rect(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    color: java.lang.String
  ): scala.Unit = js.native
}

