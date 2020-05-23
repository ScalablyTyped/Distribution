package typings.athenajs.mod

import typings.athenajs.anon.AIR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Tile")
@js.native
class Tile protected () extends js.Object {
  def this(options: JSObject) = this()
  var downCollide: Boolean = js.native
  var height: Double = js.native
  var inertia: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var upCollide: Boolean = js.native
  var width: Double = js.native
}

/* static members */
@JSImport("athenajs", "Tile")
@js.native
object Tile extends js.Object {
  var TYPE: AIR = js.native
}

