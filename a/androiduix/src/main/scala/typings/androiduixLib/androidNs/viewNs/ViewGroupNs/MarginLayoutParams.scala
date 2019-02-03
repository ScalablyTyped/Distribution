package typings
package androiduixLib.androidNs.viewNs.ViewGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewGroup.MarginLayoutParams")
@js.native
class MarginLayoutParams protected () extends LayoutParams {
  def this(args: js.Any*) = this()
  def this(src: LayoutParams) = this()
  def this(src: MarginLayoutParams) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, attrs: stdLib.HTMLElement) = this()
  def this(width: scala.Double, height: scala.Double) = this()
  var bottomMargin: scala.Double = js.native
  var leftMargin: scala.Double = js.native
  var rightMargin: scala.Double = js.native
  var topMargin: scala.Double = js.native
  def getLayoutDirection(): scala.Double = js.native
  def isLayoutRtl(): scala.Boolean = js.native
  def resolveLayoutDirection(layoutDirection: scala.Double): scala.Unit = js.native
  def setLayoutDirection(layoutDirection: scala.Double): scala.Unit = js.native
  def setMargins(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.view.ViewGroup.MarginLayoutParams")
@js.native
object MarginLayoutParams extends js.Object {
  var DEFAULT_MARGIN_RELATIVE: scala.Double = js.native
  var DEFAULT_MARGIN_RESOLVED: scala.Double = js.native
  var UNDEFINED_MARGIN: scala.Double = js.native
}

