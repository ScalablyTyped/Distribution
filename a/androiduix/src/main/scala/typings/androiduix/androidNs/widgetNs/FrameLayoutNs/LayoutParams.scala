package typings.androiduix.androidNs.widgetNs.FrameLayoutNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.ViewGroupNs.MarginLayoutParams
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.FrameLayout.LayoutParams")
@js.native
class LayoutParams () extends MarginLayoutParams {
  def this(source: typings.androiduix.androidNs.viewNs.ViewGroupNs.LayoutParams) = this()
  def this(context: Context, attrs: HTMLElement) = this()
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, gravity: Double) = this()
  var gravity: Double = js.native
}

