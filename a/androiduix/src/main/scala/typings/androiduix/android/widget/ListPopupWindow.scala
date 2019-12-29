package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnAttachStateChangeListener
import typings.androiduix.android.view.View.OnTouchListener
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.widget.AbsListView.OnScrollListener
import typings.androiduix.android.widget.AdapterView.OnItemClickListener
import typings.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typings.androiduix.android.widget.PopupWindow.OnDismissListener
import typings.androiduix.java.lang.Runnable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow")
@js.native
class ListPopupWindow protected () extends js.Object {
  def this(context: Context) = this()
  def this(context: Context, styleAttr: Map[String, String]) = this()
  var mAdapter: js.Any = js.native
  var mContext: js.Any = js.native
  var mDropDownAlwaysVisible: js.Any = js.native
  var mDropDownAnchorView: js.Any = js.native
  var mDropDownGravity: js.Any = js.native
  var mDropDownHeight: js.Any = js.native
  var mDropDownHorizontalOffset: js.Any = js.native
  var mDropDownList: js.Any = js.native
  var mDropDownListHighlight: js.Any = js.native
  var mDropDownVerticalOffset: js.Any = js.native
  var mDropDownVerticalOffsetSet: js.Any = js.native
  var mDropDownWidth: js.Any = js.native
  var mForceIgnoreOutsideTouch: js.Any = js.native
  var mHandler: js.Any = js.native
  var mHideSelector: js.Any = js.native
  var mItemClickListener: js.Any = js.native
  var mItemSelectedListener: js.Any = js.native
  var mLayoutDirection: js.Any = js.native
  var mListItemExpandMaximum: Double = js.native
  var mModal: js.Any = js.native
  var mObserver: js.Any = js.native
  var mPopup: js.Any = js.native
  var mPromptPosition: js.Any = js.native
  var mPromptView: js.Any = js.native
  var mResizePopupRunnable: js.Any = js.native
  var mScrollListener: js.Any = js.native
  var mShowDropDownRunnable: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mTouchInterceptor: js.Any = js.native
  /* private */ def buildDropDown(): js.Any = js.native
  def clearListSelection(): Unit = js.native
  def createDragToOpenListener(src: View): OnTouchListener = js.native
  def dismiss(): Unit = js.native
  def getAnchorView(): View = js.native
  def getBackground(): Drawable = js.native
  def getEnterAnimation(): Animation = js.native
  def getExitAnimation(): Animation = js.native
  def getHeight(): Double = js.native
  def getHorizontalOffset(): Double = js.native
  def getInputMethodMode(): Double = js.native
  def getListView(): ListView = js.native
  def getPromptPosition(): Double = js.native
  def getSelectedItem(): js.Any = js.native
  def getSelectedItemId(): Double = js.native
  def getSelectedItemPosition(): Double = js.native
  def getSelectedView(): View = js.native
  def getVerticalOffset(): Double = js.native
  def getWidth(): Double = js.native
  def isDropDownAlwaysVisible(): Boolean = js.native
  def isInputMethodNotNeeded(): Boolean = js.native
  def isModal(): Boolean = js.native
  def isShowing(): Boolean = js.native
  def onKeyDown(keyCode: Double, event: KeyEvent): Boolean = js.native
  def onKeyPreIme(keyCode: Double, event: KeyEvent): Boolean = js.native
  def onKeyUp(keyCode: Double, event: KeyEvent): Boolean = js.native
  def performItemClick(position: Double): Boolean = js.native
  def postShow(): Unit = js.native
  /* private */ def removePromptView(): js.Any = js.native
  def setAdapter(adapter: ListAdapter): Unit = js.native
  def setAnchorView(anchor: View): Unit = js.native
  def setBackgroundDrawable(d: Drawable): Unit = js.native
  def setContentWidth(width: Double): Unit = js.native
  def setDropDownAlwaysVisible(dropDownAlwaysVisible: Boolean): Unit = js.native
  def setDropDownGravity(gravity: Double): Unit = js.native
  def setForceIgnoreOutsideTouch(forceIgnoreOutsideTouch: Boolean): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setHorizontalOffset(offset: Double): Unit = js.native
  def setInputMethodMode(mode: Double): Unit = js.native
  def setListItemExpandMax(max: Double): Unit = js.native
  def setModal(modal: Boolean): Unit = js.native
  def setOnDismissListener(listener: OnDismissListener): Unit = js.native
  def setOnItemClickListener(clickListener: OnItemClickListener): Unit = js.native
  def setOnItemSelectedListener(selectedListener: OnItemSelectedListener): Unit = js.native
  def setPromptPosition(position: Double): Unit = js.native
  def setPromptView(prompt: View): Unit = js.native
  def setSelection(position: Double): Unit = js.native
  def setVerticalOffset(offset: Double): Unit = js.native
  def setWidth(width: Double): Unit = js.native
  def setWindowAnimation(enterAnimation: Animation, exitAnimation: Animation): Unit = js.native
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.ListPopupWindow")
@js.native
object ListPopupWindow extends js.Object {
  @js.native
  class DropDownListView protected () extends ListView {
    def this(context: Context, hijackFocus: Boolean) = this()
    var mDrawsInPressedState: js.Any = js.native
    var mHijackFocus: js.Any = js.native
    var mListSelectionHidden: js.Any = js.native
    /* private */ def clearPressedItem(): js.Any = js.native
    /* private */ def clickPressedItem(child: js.Any, position: js.Any): js.Any = js.native
    def onForwardedEvent(event: MotionEvent, activePointerId: Double): Boolean = js.native
    /* private */ def setPressedItem(child: js.Any, position: js.Any): js.Any = js.native
  }
  
  @js.native
  abstract class ForwardingListener protected ()
    extends OnTouchListener
       with OnAttachStateChangeListener {
    def this(src: View) = this()
    var mActivePointerId: js.Any = js.native
    var mDisallowIntercept: js.Any = js.native
    var mForwarding: js.Any = js.native
    var mScaledTouchSlop: js.Any = js.native
    var mSrc: js.Any = js.native
    var mTapTimeout: js.Any = js.native
    def getPopup(): ListPopupWindow = js.native
    /* protected */ def onForwardingStarted(): Boolean = js.native
    /* protected */ def onForwardingStopped(): Boolean = js.native
    /* CompleteClass */
    override def onTouch(v: View, event: MotionEvent): Unit = js.native
    /* private */ def onTouchForwarded(srcEvent: js.Any): js.Any = js.native
    /* private */ def onTouchObserved(srcEvent: js.Any): js.Any = js.native
    /* CompleteClass */
    override def onViewAttachedToWindow(v: View): js.Any = js.native
    /* CompleteClass */
    override def onViewDetachedFromWindow(v: View): js.Any = js.native
  }
  
  @js.native
  class ListSelectorHider protected () extends Runnable {
    def this(arg: ListPopupWindow) = this()
    var _ListPopupWindow_this: ListPopupWindow = js.native
    /* CompleteClass */
    override def run(): js.Any = js.native
  }
  
  @js.native
  class PopupDataSetObserver protected () extends DataSetObserver {
    def this(arg: ListPopupWindow) = this()
    var _ListPopupWindow_this: ListPopupWindow = js.native
  }
  
  @js.native
  class PopupScrollListener protected () extends OnScrollListener {
    def this(arg: ListPopupWindow) = this()
    var _ListPopupWindow_this: ListPopupWindow = js.native
    /* CompleteClass */
    override def onScroll(view: AbsListView, firstVisibleItem: Double, visibleItemCount: Double, totalItemCount: Double): Unit = js.native
    /* CompleteClass */
    override def onScrollStateChanged(view: AbsListView, scrollState: Double): Unit = js.native
  }
  
  @js.native
  class PopupTouchInterceptor protected () extends OnTouchListener {
    def this(arg: ListPopupWindow) = this()
    var _ListPopupWindow_this: ListPopupWindow = js.native
    /* CompleteClass */
    override def onTouch(v: View, event: MotionEvent): Unit = js.native
  }
  
  @js.native
  class ResizePopupRunnable protected () extends Runnable {
    def this(arg: ListPopupWindow) = this()
    var _ListPopupWindow_this: ListPopupWindow = js.native
    /* CompleteClass */
    override def run(): js.Any = js.native
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
    class DisallowIntercept protected () extends Runnable {
      def this(arg: ForwardingListener) = this()
      var _ForwardingListener_this: ForwardingListener = js.native
      /* CompleteClass */
      override def run(): js.Any = js.native
    }
    
  }
  
}

