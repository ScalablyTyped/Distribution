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

