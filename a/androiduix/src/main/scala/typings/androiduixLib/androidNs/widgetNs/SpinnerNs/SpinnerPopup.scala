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
    dismiss: js.Function0[scala.Unit],
    getBackground: js.Function0[androiduixLib.androidNs.graphicsNs.drawableNs.Drawable],
    getHintText: js.Function0[java.lang.String],
    getHorizontalOffset: js.Function0[scala.Double],
    getVerticalOffset: js.Function0[scala.Double],
    isShowing: js.Function0[scala.Boolean],
    setAdapter: js.Function1[androiduixLib.androidNs.widgetNs.ListAdapter, scala.Unit],
    setBackgroundDrawable: js.Function1[androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, scala.Unit],
    setHorizontalOffset: js.Function1[scala.Double, scala.Unit],
    setPromptText: js.Function1[java.lang.String, scala.Unit],
    setVerticalOffset: js.Function1[scala.Double, scala.Unit],
    showPopup: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): SpinnerPopup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dismiss")(dismiss)
    __obj.updateDynamic("getBackground")(getBackground)
    __obj.updateDynamic("getHintText")(getHintText)
    __obj.updateDynamic("getHorizontalOffset")(getHorizontalOffset)
    __obj.updateDynamic("getVerticalOffset")(getVerticalOffset)
    __obj.updateDynamic("isShowing")(isShowing)
    __obj.updateDynamic("setAdapter")(setAdapter)
    __obj.updateDynamic("setBackgroundDrawable")(setBackgroundDrawable)
    __obj.updateDynamic("setHorizontalOffset")(setHorizontalOffset)
    __obj.updateDynamic("setPromptText")(setPromptText)
    __obj.updateDynamic("setVerticalOffset")(setVerticalOffset)
    __obj.updateDynamic("showPopup")(showPopup)
    __obj.asInstanceOf[SpinnerPopup]
  }
}

