package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "SimpleText")
@js.native
class SimpleText protected () extends Drawable {
  def this(`type`: String, simpleTextOptions: SimpleTextOptions) = this()
  def getCurrentOffsetX(): Double = js.native
  def getCurrentOffsetY(): Double = js.native
  def setColor(color: String): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setText(text: String): Unit = js.native
}

