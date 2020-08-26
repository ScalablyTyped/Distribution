package typings.androiduix.android.content.res

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStateList extends js.Object {
  var mColors: js.Array[Double] = js.native
  var mDefaultColor: Double = js.native
  var mStateSpecs: js.Array[js.Array[Double]] = js.native
  def getColorForState(stateSet: js.Array[Double], defaultColor: Double): Double = js.native
  def getDefaultColor(): Double = js.native
  def isStateful(): Boolean = js.native
  def withAlpha(alpha: Double): ColorStateList = js.native
}

object ColorStateList {
  @scala.inline
  def apply(
    getColorForState: (js.Array[Double], Double) => Double,
    getDefaultColor: () => Double,
    isStateful: () => Boolean,
    mColors: js.Array[Double],
    mDefaultColor: Double,
    mStateSpecs: js.Array[js.Array[Double]],
    withAlpha: Double => ColorStateList
  ): ColorStateList = {
    val __obj = js.Dynamic.literal(getColorForState = js.Any.fromFunction2(getColorForState), getDefaultColor = js.Any.fromFunction0(getDefaultColor), isStateful = js.Any.fromFunction0(isStateful), mColors = mColors.asInstanceOf[js.Any], mDefaultColor = mDefaultColor.asInstanceOf[js.Any], mStateSpecs = mStateSpecs.asInstanceOf[js.Any], withAlpha = js.Any.fromFunction1(withAlpha))
    __obj.asInstanceOf[ColorStateList]
  }
  @scala.inline
  implicit class ColorStateListOps[Self <: ColorStateList] (val x: Self) extends AnyVal {
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
    def setGetColorForState(value: (js.Array[Double], Double) => Double): Self = this.set("getColorForState", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDefaultColor(value: () => Double): Self = this.set("getDefaultColor", js.Any.fromFunction0(value))
    @scala.inline
    def setIsStateful(value: () => Boolean): Self = this.set("isStateful", js.Any.fromFunction0(value))
    @scala.inline
    def setMColorsVarargs(value: Double*): Self = this.set("mColors", js.Array(value :_*))
    @scala.inline
    def setMColors(value: js.Array[Double]): Self = this.set("mColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDefaultColor(value: Double): Self = this.set("mDefaultColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMStateSpecsVarargs(value: js.Array[Double]*): Self = this.set("mStateSpecs", js.Array(value :_*))
    @scala.inline
    def setMStateSpecs(value: js.Array[js.Array[Double]]): Self = this.set("mStateSpecs", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithAlpha(value: Double => ColorStateList): Self = this.set("withAlpha", js.Any.fromFunction1(value))
  }
  
}

