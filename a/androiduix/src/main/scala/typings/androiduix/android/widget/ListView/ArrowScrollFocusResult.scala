package typings.androiduix.android.widget.ListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowScrollFocusResult extends js.Object {
  var mAmountToScroll: js.Any = js.native
  var mSelectedPosition: js.Any = js.native
  def getAmountToScroll(): Double = js.native
  def getSelectedPosition(): Double = js.native
  def populate(selectedPosition: Double, amountToScroll: Double): Unit = js.native
}

object ArrowScrollFocusResult {
  @scala.inline
  def apply(
    getAmountToScroll: () => Double,
    getSelectedPosition: () => Double,
    mAmountToScroll: js.Any,
    mSelectedPosition: js.Any,
    populate: (Double, Double) => Unit
  ): ArrowScrollFocusResult = {
    val __obj = js.Dynamic.literal(getAmountToScroll = js.Any.fromFunction0(getAmountToScroll), getSelectedPosition = js.Any.fromFunction0(getSelectedPosition), mAmountToScroll = mAmountToScroll.asInstanceOf[js.Any], mSelectedPosition = mSelectedPosition.asInstanceOf[js.Any], populate = js.Any.fromFunction2(populate))
    __obj.asInstanceOf[ArrowScrollFocusResult]
  }
  @scala.inline
  implicit class ArrowScrollFocusResultOps[Self <: ArrowScrollFocusResult] (val x: Self) extends AnyVal {
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
    def setGetAmountToScroll(value: () => Double): Self = this.set("getAmountToScroll", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectedPosition(value: () => Double): Self = this.set("getSelectedPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setMAmountToScroll(value: js.Any): Self = this.set("mAmountToScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSelectedPosition(value: js.Any): Self = this.set("mSelectedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopulate(value: (Double, Double) => Unit): Self = this.set("populate", js.Any.fromFunction2(value))
  }
  
}

