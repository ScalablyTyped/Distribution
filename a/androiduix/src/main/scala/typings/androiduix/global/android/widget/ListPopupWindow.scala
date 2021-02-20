package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.View
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ListPopupWindow")
@js.native
class ListPopupWindow protected ()
  extends typings.androiduix.android.widget.ListPopupWindow {
  def this(context: Context) = this()
  def this(context: Context, styleAttr: Map[String, String]) = this()
}
object ListPopupWindow {
  
  @JSGlobal("android.widget.ListPopupWindow")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.DEBUG")
  @js.native
  def DEBUG: js.Any = js.native
  @scala.inline
  def DEBUG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.ListPopupWindow.DropDownListView")
  @js.native
  class DropDownListView protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.DropDownListView {
    def this(context: Context, hijackFocus: Boolean) = this()
  }
  object DropDownListView {
    
    @JSGlobal("android.widget.ListPopupWindow.DropDownListView")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.ListPopupWindow.DropDownListView.CLICK_ANIM_ALPHA")
    @js.native
    def CLICK_ANIM_ALPHA: js.Any = js.native
    @scala.inline
    def CLICK_ANIM_ALPHA_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK_ANIM_ALPHA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.ListPopupWindow.DropDownListView.CLICK_ANIM_DURATION")
    @js.native
    def CLICK_ANIM_DURATION: js.Any = js.native
    @scala.inline
    def CLICK_ANIM_DURATION_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK_ANIM_DURATION")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.EXPAND_LIST_TIMEOUT")
  @js.native
  def EXPAND_LIST_TIMEOUT: js.Any = js.native
  @scala.inline
  def EXPAND_LIST_TIMEOUT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXPAND_LIST_TIMEOUT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.ListPopupWindow.ForwardingListener")
  @js.native
  abstract class ForwardingListener protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.ForwardingListener {
    def this(src: View) = this()
  }
  object ForwardingListener {
    
    @JSGlobal("android.widget.ListPopupWindow.ForwardingListener.DisallowIntercept")
    @js.native
    class DisallowIntercept protected ()
      extends typings.androiduix.android.widget.ListPopupWindow.ForwardingListener.DisallowIntercept {
      def this(arg: typings.androiduix.android.widget.ListPopupWindow.ForwardingListener) = this()
    }
  }
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.INPUT_METHOD_FROM_FOCUSABLE")
  @js.native
  def INPUT_METHOD_FROM_FOCUSABLE: Double = js.native
  @scala.inline
  def INPUT_METHOD_FROM_FOCUSABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_METHOD_FROM_FOCUSABLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.INPUT_METHOD_NEEDED")
  @js.native
  def INPUT_METHOD_NEEDED: Double = js.native
  @scala.inline
  def INPUT_METHOD_NEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_METHOD_NEEDED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.INPUT_METHOD_NOT_NEEDED")
  @js.native
  def INPUT_METHOD_NOT_NEEDED: Double = js.native
  @scala.inline
  def INPUT_METHOD_NOT_NEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_METHOD_NOT_NEEDED")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.ListPopupWindow.ListSelectorHider")
  @js.native
  class ListSelectorHider protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.ListSelectorHider {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.MATCH_PARENT")
  @js.native
  def MATCH_PARENT: Double = js.native
  @scala.inline
  def MATCH_PARENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MATCH_PARENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.POSITION_PROMPT_ABOVE")
  @js.native
  def POSITION_PROMPT_ABOVE: Double = js.native
  @scala.inline
  def POSITION_PROMPT_ABOVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_PROMPT_ABOVE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.POSITION_PROMPT_BELOW")
  @js.native
  def POSITION_PROMPT_BELOW: Double = js.native
  @scala.inline
  def POSITION_PROMPT_BELOW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION_PROMPT_BELOW")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.ListPopupWindow.PopupDataSetObserver")
  @js.native
  class PopupDataSetObserver protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.PopupDataSetObserver {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  @JSGlobal("android.widget.ListPopupWindow.PopupScrollListener")
  @js.native
  class PopupScrollListener protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.PopupScrollListener {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  @JSGlobal("android.widget.ListPopupWindow.PopupTouchInterceptor")
  @js.native
  class PopupTouchInterceptor protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.PopupTouchInterceptor {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  @JSGlobal("android.widget.ListPopupWindow.ResizePopupRunnable")
  @js.native
  class ResizePopupRunnable protected ()
    extends typings.androiduix.android.widget.ListPopupWindow.ResizePopupRunnable {
    def this(arg: typings.androiduix.android.widget.ListPopupWindow) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.TAG")
  @js.native
  def TAG: js.Any = js.native
  @scala.inline
  def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ListPopupWindow.WRAP_CONTENT")
  @js.native
  def WRAP_CONTENT: Double = js.native
  @scala.inline
  def WRAP_CONTENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRAP_CONTENT")(x.asInstanceOf[js.Any])
}
