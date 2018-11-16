package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "SimpleText")
@js.native
class SimpleText protected () extends Drawable {
  def this(`type`: java.lang.String, simpleTextOptions: SimpleTextOptions) = this()
  def getCurrentOffsetX(): scala.Double = js.native
  def getCurrentOffsetY(): scala.Double = js.native
  def setColor(color: java.lang.String): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
}

