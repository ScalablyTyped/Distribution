package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Behavior")
@js.native
class Behavior protected () extends js.Object {
  def this(sprite: Drawable) = this()
  def this(sprite: Drawable, options: JSObject) = this()
  var gravity: Double = js.native
  var onVXChange: js.UndefOr[js.Function1[/* vx */ Double, Unit]] = js.native
  var onVYChange: js.UndefOr[js.Function1[/* vy */ Double, Unit]] = js.native
  var sprite: Drawable = js.native
  var vx: Double = js.native
  var vy: Double = js.native
  /**
    * Returns current mapEvent
    *
    */
  def getMapEvent(): MapEvent = js.native
  def onUpdate(timestamp: Double): Unit = js.native
  def reset(): Unit = js.native
}

