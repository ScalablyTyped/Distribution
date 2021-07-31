package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Paint")
@js.native
class Paint protected () extends Drawable {
  def this(`type`: String, paintOptions: PaintOptions) = this()
  
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
  def circle(cx: Double, cy: Double, r: Double, fillStyle: String, borderWidth: Unit, borderStyle: String): Unit = js.native
  def circle(cx: Double, cy: Double, r: Double, fillStyle: Unit, borderWidth: Double): Unit = js.native
  def circle(cx: Double, cy: Double, r: Double, fillStyle: Unit, borderWidth: Double, borderStyle: String): Unit = js.native
  def circle(cx: Double, cy: Double, r: Double, fillStyle: Unit, borderWidth: Unit, borderStyle: String): Unit = js.native
  
  var color: String = js.native
  
  def fill(): Unit = js.native
  def fill(color: String): Unit = js.native
  
  var name: String = js.native
  
  def rect(x: Double, y: Double, width: Double, height: Double, color: String): Unit = js.native
}
