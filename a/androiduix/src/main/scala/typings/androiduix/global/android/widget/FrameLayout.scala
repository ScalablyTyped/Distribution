package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.FrameLayout")
@js.native
class FrameLayout protected ()
  extends typings.androiduix.android.widget.FrameLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}

/* static members */
@JSGlobal("android.widget.FrameLayout")
@js.native
object FrameLayout extends js.Object {
  @js.native
  class LayoutParams ()
    extends typings.androiduix.android.widget.FrameLayout.LayoutParams {
    def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, gravity: Double) = this()
  }
  
  var DEFAULT_CHILD_GRAVITY: Double = js.native
}

