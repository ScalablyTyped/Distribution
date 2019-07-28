package typings.androiduix.androidNs.viewNs.ViewGroupNs

import typings.androiduix.androidNs.contentNs.Context
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewGroup.MarginLayoutParams")
@js.native
class MarginLayoutParams protected () extends LayoutParams {
  def this(args: js.Any*) = this()
  def this(src: LayoutParams) = this()
  def this(src: MarginLayoutParams) = this()
  def this(context: Context, attrs: HTMLElement) = this()
  def this(width: Double, height: Double) = this()
  var bottomMargin: Double = js.native
  var leftMargin: Double = js.native
  var rightMargin: Double = js.native
  var topMargin: Double = js.native
  def getLayoutDirection(): Double = js.native
  def isLayoutRtl(): Boolean = js.native
  def resolveLayoutDirection(layoutDirection: Double): Unit = js.native
  def setLayoutDirection(layoutDirection: Double): Unit = js.native
  def setMargins(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
}

/* static members */
@JSGlobal("android.view.ViewGroup.MarginLayoutParams")
@js.native
object MarginLayoutParams extends js.Object {
  var DEFAULT_MARGIN_RELATIVE: Double = js.native
  var DEFAULT_MARGIN_RESOLVED: Double = js.native
  var UNDEFINED_MARGIN: Double = js.native
}

