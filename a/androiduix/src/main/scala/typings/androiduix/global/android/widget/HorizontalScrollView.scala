package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.HorizontalScrollView")
@js.native
class HorizontalScrollView protected ()
  extends typings.androiduix.android.widget.HorizontalScrollView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
/* static members */
@JSGlobal("android.widget.HorizontalScrollView")
@js.native
object HorizontalScrollView extends js.Object {
  
  var ANIMATED_SCROLL_GAP: js.Any = js.native
  
  var INVALID_POINTER: js.Any = js.native
  
  var MAX_SCROLL_FACTOR: js.Any = js.native
  
  var TAG: js.Any = js.native
  
  /* private */ def clamp(n: js.Any, my: js.Any, child: js.Any): js.Any = js.native
  
  /* private */ def isViewDescendantOf(child: js.Any, parent: js.Any): js.Any = js.native
}
