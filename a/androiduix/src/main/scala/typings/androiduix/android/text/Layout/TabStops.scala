package typings.androiduix.android.text.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStops extends js.Object {
  var mIncrement: js.Any = js.native
  var mNumStops: js.Any = js.native
  var mStops: js.Any = js.native
  def nextTab(h: Double): Double = js.native
  def reset(increment: Double, spans: js.Array[_]): Unit = js.native
}

object TabStops {
  @scala.inline
  def apply(
    mIncrement: js.Any,
    mNumStops: js.Any,
    mStops: js.Any,
    nextTab: Double => Double,
    reset: (Double, js.Array[_]) => Unit
  ): TabStops = {
    val __obj = js.Dynamic.literal(mIncrement = mIncrement.asInstanceOf[js.Any], mNumStops = mNumStops.asInstanceOf[js.Any], mStops = mStops.asInstanceOf[js.Any], nextTab = js.Any.fromFunction1(nextTab), reset = js.Any.fromFunction2(reset))
    __obj.asInstanceOf[TabStops]
  }
  @scala.inline
  implicit class TabStopsOps[Self <: TabStops] (val x: Self) extends AnyVal {
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
    def setMIncrement(value: js.Any): Self = this.set("mIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def setMNumStops(value: js.Any): Self = this.set("mNumStops", value.asInstanceOf[js.Any])
    @scala.inline
    def setMStops(value: js.Any): Self = this.set("mStops", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextTab(value: Double => Double): Self = this.set("nextTab", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: (Double, js.Array[_]) => Unit): Self = this.set("reset", js.Any.fromFunction2(value))
  }
  
}

