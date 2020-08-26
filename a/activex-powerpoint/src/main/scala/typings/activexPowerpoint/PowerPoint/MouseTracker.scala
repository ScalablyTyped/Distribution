package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseTracker extends js.Object {
  @JSName("PowerPoint.MouseTracker_typekey")
  var PowerPointDotMouseTracker_typekey: MouseTracker = js.native
  def EndTrack(X: Double, Y: Double): Unit = js.native
  def OnTrack(X: Double, Y: Double): Unit = js.native
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
  @scala.inline
  implicit class MouseTrackerOps[Self <: MouseTracker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTrack(value: (Double, Double) => Unit): Self = this.set("EndTrack", js.Any.fromFunction2(value))
    @scala.inline
    def setOnTrack(value: (Double, Double) => Unit): Self = this.set("OnTrack", js.Any.fromFunction2(value))
    @scala.inline
    def setPowerPointDotMouseTracker_typekey(value: MouseTracker): Self = this.set("PowerPoint.MouseTracker_typekey", value.asInstanceOf[js.Any])
  }
  
}

