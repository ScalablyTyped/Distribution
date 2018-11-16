package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Behavior")
@js.native
class Behavior protected () extends js.Object {
  def this(sprite: Drawable) = this()
  def this(sprite: Drawable, options: JSObject) = this()
  var gravity: scala.Double = js.native
  var onVXChange: js.UndefOr[js.Function1[/* vx */ scala.Double, scala.Unit]] = js.native
  var onVYChange: js.UndefOr[js.Function1[/* vy */ scala.Double, scala.Unit]] = js.native
  var sprite: Drawable = js.native
  var vx: scala.Double = js.native
  var vy: scala.Double = js.native
  /**
       * Returns current mapEvent
       *
       */
  def getMapEvent(): MapEvent = js.native
  def onUpdate(timestamp: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

