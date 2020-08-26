package typings.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandableListPosition extends js.Object {
  var childPos: Double = js.native
  var flatListPos: Double = js.native
  var groupPos: Double = js.native
  var `type`: Double = js.native
  def getPackedPosition(): Double = js.native
  def recycle(): Unit = js.native
  /* private */ def resetState(): js.Any = js.native
}

object ExpandableListPosition {
  @scala.inline
  def apply(
    childPos: Double,
    flatListPos: Double,
    getPackedPosition: () => Double,
    groupPos: Double,
    recycle: () => Unit,
    resetState: () => js.Any,
    `type`: Double
  ): ExpandableListPosition = {
    val __obj = js.Dynamic.literal(childPos = childPos.asInstanceOf[js.Any], flatListPos = flatListPos.asInstanceOf[js.Any], getPackedPosition = js.Any.fromFunction0(getPackedPosition), groupPos = groupPos.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), resetState = js.Any.fromFunction0(resetState))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandableListPosition]
  }
  @scala.inline
  implicit class ExpandableListPositionOps[Self <: ExpandableListPosition] (val x: Self) extends AnyVal {
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
    def setChildPos(value: Double): Self = this.set("childPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlatListPos(value: Double): Self = this.set("flatListPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPackedPosition(value: () => Double): Self = this.set("getPackedPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGroupPos(value: Double): Self = this.set("groupPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecycle(value: () => Unit): Self = this.set("recycle", js.Any.fromFunction0(value))
    @scala.inline
    def setResetState(value: () => js.Any): Self = this.set("resetState", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

