package typings.androiduix.android.widget.Spinner

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.widget.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerPopup extends js.Object {
  def dismiss(): Unit
  def getBackground(): Drawable
  def getHintText(): String
  def getHorizontalOffset(): Double
  def getVerticalOffset(): Double
  def isShowing(): Boolean
  def setAdapter(adapter: ListAdapter): Unit
  def setBackgroundDrawable(bg: Drawable): Unit
  def setHorizontalOffset(px: Double): Unit
  def setPromptText(hintText: String): Unit
  def setVerticalOffset(px: Double): Unit
  def showPopup(textDirection: Double, textAlignment: Double): Unit
}

object SpinnerPopup {
  @scala.inline
  def apply(
    dismiss: () => Unit,
    getBackground: () => Drawable,
    getHintText: () => String,
    getHorizontalOffset: () => Double,
    getVerticalOffset: () => Double,
    isShowing: () => Boolean,
    setAdapter: ListAdapter => Unit,
    setBackgroundDrawable: Drawable => Unit,
    setHorizontalOffset: Double => Unit,
    setPromptText: String => Unit,
    setVerticalOffset: Double => Unit,
    showPopup: (Double, Double) => Unit
  ): SpinnerPopup = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), getBackground = js.Any.fromFunction0(getBackground), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), isShowing = js.Any.fromFunction0(isShowing), setAdapter = js.Any.fromFunction1(setAdapter), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setPromptText = js.Any.fromFunction1(setPromptText), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), showPopup = js.Any.fromFunction2(showPopup))
    __obj.asInstanceOf[SpinnerPopup]
  }
}

