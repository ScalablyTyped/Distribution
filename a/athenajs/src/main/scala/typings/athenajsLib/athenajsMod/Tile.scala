package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Tile")
@js.native
class Tile protected () extends js.Object {
  def this(options: JSObject) = this()
  var downCollide: scala.Boolean = js.native
  var height: scala.Double = js.native
  var inertia: scala.Double = js.native
  var offsetX: scala.Double = js.native
  var offsetY: scala.Double = js.native
  var upCollide: scala.Boolean = js.native
  var width: scala.Double = js.native
}

@JSImport("athenajs", "Tile")
@js.native
object Tile extends js.Object {
  var TYPE: athenajsLib.Anon_WALL = js.native
}

