package typings
package androiduixLib.androidNs.widgetNs.SpinnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerPopup extends js.Object {
  def dismiss(): scala.Unit
  def getBackground(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable
  def getHintText(): java.lang.String
  def getHorizontalOffset(): scala.Double
  def getVerticalOffset(): scala.Double
  def isShowing(): scala.Boolean
  def setAdapter(adapter: androiduixLib.androidNs.widgetNs.ListAdapter): scala.Unit
  def setBackgroundDrawable(bg: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit
  def setHorizontalOffset(px: scala.Double): scala.Unit
  def setPromptText(hintText: java.lang.String): scala.Unit
  def setVerticalOffset(px: scala.Double): scala.Unit
  def showPopup(textDirection: scala.Double, textAlignment: scala.Double): scala.Unit
}

object SpinnerPopup {
  @scala.inline
  def apply(
    dismiss: () => scala.Unit,
    getBackground: () => androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    getHintText: () => java.lang.String,
    getHorizontalOffset: () => scala.Double,
    getVerticalOffset: () => scala.Double,
    isShowing: () => scala.Boolean,
    setAdapter: androiduixLib.androidNs.widgetNs.ListAdapter => scala.Unit,
    setBackgroundDrawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable => scala.Unit,
    setHorizontalOffset: scala.Double => scala.Unit,
    setPromptText: java.lang.String => scala.Unit,
    setVerticalOffset: scala.Double => scala.Unit,
    showPopup: (scala.Double, scala.Double) => scala.Unit
  ): SpinnerPopup = {
    val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), getBackground = js.Any.fromFunction0(getBackground), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), isShowing = js.Any.fromFunction0(isShowing), setAdapter = js.Any.fromFunction1(setAdapter), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setPromptText = js.Any.fromFunction1(setPromptText), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), showPopup = js.Any.fromFunction2(showPopup))
  
    __obj.asInstanceOf[SpinnerPopup]
  }
}

