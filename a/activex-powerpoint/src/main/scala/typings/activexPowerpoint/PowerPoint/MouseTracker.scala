package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseTracker extends js.Object {
  @JSName("PowerPoint.MouseTracker_typekey")
  var PowerPointDotMouseTracker_typekey: MouseTracker
  def EndTrack(X: Double, Y: Double): Unit
  def OnTrack(X: Double, Y: Double): Unit
}

object MouseTracker {
  @scala.inline
  def apply(
    EndTrack: (Double, Double) => Unit,
    OnTrack: (Double, Double) => Unit,
    PowerPointDotMouseTracker_typekey: MouseTracker
  ): MouseTracker = {
    val __obj = js.Dynamic.literal(EndTrack = js.Any.fromFunction2(EndTrack), OnTrack = js.Any.fromFunction2(OnTrack))
    __obj.updateDynamic("PowerPoint.MouseTracker_typekey")(PowerPointDotMouseTracker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTracker]
  }
}

