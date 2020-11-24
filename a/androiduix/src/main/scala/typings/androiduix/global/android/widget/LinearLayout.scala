package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.LinearLayout")
@js.native
class LinearLayout protected ()
  extends typings.androiduix.android.widget.LinearLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
/* static members */
@JSGlobal("android.widget.LinearLayout")
@js.native
object LinearLayout extends js.Object {
  
  var HORIZONTAL: Double = js.native
  
  var INDEX_BOTTOM: js.Any = js.native
  
  var INDEX_CENTER_VERTICAL: js.Any = js.native
  
  var INDEX_FILL: js.Any = js.native
  
  var INDEX_TOP: js.Any = js.native
  
  var SHOW_DIVIDER_BEGINNING: Double = js.native
  
  var SHOW_DIVIDER_END: Double = js.native
  
  var SHOW_DIVIDER_MIDDLE: Double = js.native
  
  var SHOW_DIVIDER_NONE: Double = js.native
  
  var VERTICAL: Double = js.native
  
  var VERTICAL_GRAVITY_COUNT: js.Any = js.native
  
  @js.native
  class LayoutParams protected ()
    extends typings.androiduix.android.widget.LinearLayout.LayoutParams {
    def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, weight: Double) = this()
  }
}
