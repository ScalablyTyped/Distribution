package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.View
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow")
@js.native
class ListPopupWindow protected ()
  extends typings.androiduix.android.widget.ListPopupWindow {
  def this(context: Context) = this()
  def this(context: Context, styleAttr: Map[String, String]) = this()
}

/* static members */
@JSGlobal("android.widget.ListPopupWindow")
@js.native
object ListPopupWindow extends js.Object {
  @js.native
  class DropDownListView protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.DropDownListView {
    def this(context: Context, hijackFocus: Boolean) = this()
  }
  
  @js.native
  abstract class ForwardingListener protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.ForwardingListener {
    def this(src: View) = this()
  }
  
  @js.native
  class ListSelectorHider protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.ListSelectorHider {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  @js.native
  class PopupDataSetObserver protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.PopupDataSetObserver {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  @js.native
  class PopupScrollListener protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.PopupScrollListener {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  @js.native
  class PopupTouchInterceptor protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.PopupTouchInterceptor {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  @js.native
  class ResizePopupRunnable protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.ResizePopupRunnable {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  var DEBUG: js.Any = js.native
  var EXPAND_LIST_TIMEOUT: js.Any = js.native
  var INPUT_METHOD_FROM_FOCUSABLE: Double = js.native
  var INPUT_METHOD_NEEDED: Double = js.native
  var INPUT_METHOD_NOT_NEEDED: Double = js.native
  var MATCH_PARENT: Double = js.native
  var POSITION_PROMPT_ABOVE: Double = js.native
  var POSITION_PROMPT_BELOW: Double = js.native
  var TAG: js.Any = js.native
  var WRAP_CONTENT: Double = js.native
  /* static members */
  @js.native
  object DropDownListView extends js.Object {
    var CLICK_ANIM_ALPHA: js.Any = js.native
    var CLICK_ANIM_DURATION: js.Any = js.native
  }
  
  @js.native
  object ForwardingListener extends js.Object {
    @js.native
    class DisallowIntercept protected ()
      extends typings.androiduix.android.widget.ListPopupWindow.ForwardingListener.DisallowIntercept {
      def this(arg: typings.androiduix.android.widget.ListPopupWindow.ForwardingListener) = this()
    }
    
  }
  
}

