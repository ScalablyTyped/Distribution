package typings.androiduix.android.widget

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
import typings.androiduix.java_.lang.Runnable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPopupWindow extends StObject {
  
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
object ListPopupWindow {
  
  @scala.inline
  def apply(
    buildDropDown: () => js.Any,
    clearListSelection: () => Unit,
    createDragToOpenListener: View => OnTouchListener,
    dismiss: () => Unit,
    getAnchorView: () => View,
    getBackground: () => Drawable,
    getEnterAnimation: () => Animation,
    getExitAnimation: () => Animation,
    getHeight: () => Double,
    getHorizontalOffset: () => Double,
    getInputMethodMode: () => Double,
    getListView: () => ListView,
    getPromptPosition: () => Double,
    getSelectedItem: () => js.Any,
    getSelectedItemId: () => Double,
    getSelectedItemPosition: () => Double,
    getSelectedView: () => View,
    getVerticalOffset: () => Double,
    getWidth: () => Double,
    isDropDownAlwaysVisible: () => Boolean,
    isInputMethodNotNeeded: () => Boolean,
    isModal: () => Boolean,
    isShowing: () => Boolean,
    mAdapter: js.Any,
    mContext: js.Any,
    mDropDownAlwaysVisible: js.Any,
    mDropDownAnchorView: js.Any,
    mDropDownGravity: js.Any,
    mDropDownHeight: js.Any,
    mDropDownHorizontalOffset: js.Any,
    mDropDownList: js.Any,
    mDropDownListHighlight: js.Any,
    mDropDownVerticalOffset: js.Any,
    mDropDownVerticalOffsetSet: js.Any,
    mDropDownWidth: js.Any,
    mForceIgnoreOutsideTouch: js.Any,
    mHandler: js.Any,
    mHideSelector: js.Any,
    mItemClickListener: js.Any,
    mItemSelectedListener: js.Any,
    mLayoutDirection: js.Any,
    mListItemExpandMaximum: Double,
    mModal: js.Any,
    mObserver: js.Any,
    mPopup: js.Any,
    mPromptPosition: js.Any,
    mPromptView: js.Any,
    mResizePopupRunnable: js.Any,
    mScrollListener: js.Any,
    mShowDropDownRunnable: js.Any,
    mTempRect: js.Any,
    mTouchInterceptor: js.Any,
    onKeyDown: (Double, KeyEvent) => Boolean,
    onKeyPreIme: (Double, KeyEvent) => Boolean,
    onKeyUp: (Double, KeyEvent) => Boolean,
    performItemClick: Double => Boolean,
    postShow: () => Unit,
    removePromptView: () => js.Any,
    setAdapter: ListAdapter => Unit,
    setAnchorView: View => Unit,
    setBackgroundDrawable: Drawable => Unit,
    setContentWidth: Double => Unit,
    setDropDownAlwaysVisible: Boolean => Unit,
    setDropDownGravity: Double => Unit,
    setForceIgnoreOutsideTouch: Boolean => Unit,
    setHeight: Double => Unit,
    setHorizontalOffset: Double => Unit,
    setInputMethodMode: Double => Unit,
    setListItemExpandMax: Double => Unit,
    setModal: Boolean => Unit,
    setOnDismissListener: OnDismissListener => Unit,
    setOnItemClickListener: OnItemClickListener => Unit,
    setOnItemSelectedListener: OnItemSelectedListener => Unit,
    setPromptPosition: Double => Unit,
    setPromptView: View => Unit,
    setSelection: Double => Unit,
    setVerticalOffset: Double => Unit,
    setWidth: Double => Unit,
    setWindowAnimation: (Animation, Animation) => Unit,
    show: () => Unit
  ): ListPopupWindow = {
    val __obj = js.Dynamic.literal(buildDropDown = js.Any.fromFunction0(buildDropDown), clearListSelection = js.Any.fromFunction0(clearListSelection), createDragToOpenListener = js.Any.fromFunction1(createDragToOpenListener), dismiss = js.Any.fromFunction0(dismiss), getAnchorView = js.Any.fromFunction0(getAnchorView), getBackground = js.Any.fromFunction0(getBackground), getEnterAnimation = js.Any.fromFunction0(getEnterAnimation), getExitAnimation = js.Any.fromFunction0(getExitAnimation), getHeight = js.Any.fromFunction0(getHeight), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getInputMethodMode = js.Any.fromFunction0(getInputMethodMode), getListView = js.Any.fromFunction0(getListView), getPromptPosition = js.Any.fromFunction0(getPromptPosition), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectedItemId = js.Any.fromFunction0(getSelectedItemId), getSelectedItemPosition = js.Any.fromFunction0(getSelectedItemPosition), getSelectedView = js.Any.fromFunction0(getSelectedView), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), getWidth = js.Any.fromFunction0(getWidth), isDropDownAlwaysVisible = js.Any.fromFunction0(isDropDownAlwaysVisible), isInputMethodNotNeeded = js.Any.fromFunction0(isInputMethodNotNeeded), isModal = js.Any.fromFunction0(isModal), isShowing = js.Any.fromFunction0(isShowing), mAdapter = mAdapter.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mDropDownAlwaysVisible = mDropDownAlwaysVisible.asInstanceOf[js.Any], mDropDownAnchorView = mDropDownAnchorView.asInstanceOf[js.Any], mDropDownGravity = mDropDownGravity.asInstanceOf[js.Any], mDropDownHeight = mDropDownHeight.asInstanceOf[js.Any], mDropDownHorizontalOffset = mDropDownHorizontalOffset.asInstanceOf[js.Any], mDropDownList = mDropDownList.asInstanceOf[js.Any], mDropDownListHighlight = mDropDownListHighlight.asInstanceOf[js.Any], mDropDownVerticalOffset = mDropDownVerticalOffset.asInstanceOf[js.Any], mDropDownVerticalOffsetSet = mDropDownVerticalOffsetSet.asInstanceOf[js.Any], mDropDownWidth = mDropDownWidth.asInstanceOf[js.Any], mForceIgnoreOutsideTouch = mForceIgnoreOutsideTouch.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mHideSelector = mHideSelector.asInstanceOf[js.Any], mItemClickListener = mItemClickListener.asInstanceOf[js.Any], mItemSelectedListener = mItemSelectedListener.asInstanceOf[js.Any], mLayoutDirection = mLayoutDirection.asInstanceOf[js.Any], mListItemExpandMaximum = mListItemExpandMaximum.asInstanceOf[js.Any], mModal = mModal.asInstanceOf[js.Any], mObserver = mObserver.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPromptPosition = mPromptPosition.asInstanceOf[js.Any], mPromptView = mPromptView.asInstanceOf[js.Any], mResizePopupRunnable = mResizePopupRunnable.asInstanceOf[js.Any], mScrollListener = mScrollListener.asInstanceOf[js.Any], mShowDropDownRunnable = mShowDropDownRunnable.asInstanceOf[js.Any], mTempRect = mTempRect.asInstanceOf[js.Any], mTouchInterceptor = mTouchInterceptor.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyPreIme = js.Any.fromFunction2(onKeyPreIme), onKeyUp = js.Any.fromFunction2(onKeyUp), performItemClick = js.Any.fromFunction1(performItemClick), postShow = js.Any.fromFunction0(postShow), removePromptView = js.Any.fromFunction0(removePromptView), setAdapter = js.Any.fromFunction1(setAdapter), setAnchorView = js.Any.fromFunction1(setAnchorView), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setContentWidth = js.Any.fromFunction1(setContentWidth), setDropDownAlwaysVisible = js.Any.fromFunction1(setDropDownAlwaysVisible), setDropDownGravity = js.Any.fromFunction1(setDropDownGravity), setForceIgnoreOutsideTouch = js.Any.fromFunction1(setForceIgnoreOutsideTouch), setHeight = js.Any.fromFunction1(setHeight), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setInputMethodMode = js.Any.fromFunction1(setInputMethodMode), setListItemExpandMax = js.Any.fromFunction1(setListItemExpandMax), setModal = js.Any.fromFunction1(setModal), setOnDismissListener = js.Any.fromFunction1(setOnDismissListener), setOnItemClickListener = js.Any.fromFunction1(setOnItemClickListener), setOnItemSelectedListener = js.Any.fromFunction1(setOnItemSelectedListener), setPromptPosition = js.Any.fromFunction1(setPromptPosition), setPromptView = js.Any.fromFunction1(setPromptView), setSelection = js.Any.fromFunction1(setSelection), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), setWidth = js.Any.fromFunction1(setWidth), setWindowAnimation = js.Any.fromFunction2(setWindowAnimation), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ListPopupWindow]
  }
  
  @js.native
  trait DropDownListView extends ListView {
    
    /* private */ def clearPressedItem(): js.Any = js.native
    
    /* private */ def clickPressedItem(child: js.Any, position: js.Any): js.Any = js.native
    
    var mDrawsInPressedState: js.Any = js.native
    
    var mHijackFocus: js.Any = js.native
    
    var mListSelectionHidden: js.Any = js.native
    
    def onForwardedEvent(event: MotionEvent, activePointerId: Double): Boolean = js.native
    
    /* private */ def setPressedItem(child: js.Any, position: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ForwardingListener
    extends OnTouchListener
       with OnAttachStateChangeListener {
    
    def getPopup(): ListPopupWindow = js.native
    
    var mActivePointerId: js.Any = js.native
    
    var mDisallowIntercept: js.Any = js.native
    
    var mForwarding: js.Any = js.native
    
    var mScaledTouchSlop: js.Any = js.native
    
    var mSrc: js.Any = js.native
    
    var mTapTimeout: js.Any = js.native
    
    /* protected */ def onForwardingStarted(): Boolean = js.native
    
    /* protected */ def onForwardingStopped(): Boolean = js.native
    
    /* private */ def onTouchForwarded(srcEvent: js.Any): js.Any = js.native
    
    /* private */ def onTouchObserved(srcEvent: js.Any): js.Any = js.native
  }
  object ForwardingListener {
    
    @scala.inline
    def apply(
      getPopup: () => ListPopupWindow,
      mActivePointerId: js.Any,
      mDisallowIntercept: js.Any,
      mForwarding: js.Any,
      mScaledTouchSlop: js.Any,
      mSrc: js.Any,
      mTapTimeout: js.Any,
      onForwardingStarted: () => Boolean,
      onForwardingStopped: () => Boolean,
      onTouch: (View, MotionEvent) => Unit,
      onTouchForwarded: js.Any => js.Any,
      onTouchObserved: js.Any => js.Any,
      onViewAttachedToWindow: View => js.Any,
      onViewDetachedFromWindow: View => js.Any
    ): ForwardingListener = {
      val __obj = js.Dynamic.literal(getPopup = js.Any.fromFunction0(getPopup), mActivePointerId = mActivePointerId.asInstanceOf[js.Any], mDisallowIntercept = mDisallowIntercept.asInstanceOf[js.Any], mForwarding = mForwarding.asInstanceOf[js.Any], mScaledTouchSlop = mScaledTouchSlop.asInstanceOf[js.Any], mSrc = mSrc.asInstanceOf[js.Any], mTapTimeout = mTapTimeout.asInstanceOf[js.Any], onForwardingStarted = js.Any.fromFunction0(onForwardingStarted), onForwardingStopped = js.Any.fromFunction0(onForwardingStopped), onTouch = js.Any.fromFunction2(onTouch), onTouchForwarded = js.Any.fromFunction1(onTouchForwarded), onTouchObserved = js.Any.fromFunction1(onTouchObserved), onViewAttachedToWindow = js.Any.fromFunction1(onViewAttachedToWindow), onViewDetachedFromWindow = js.Any.fromFunction1(onViewDetachedFromWindow))
      __obj.asInstanceOf[ForwardingListener]
    }
    
    @js.native
    trait DisallowIntercept extends Runnable {
      
      var _ForwardingListener_this: ForwardingListener = js.native
    }
    object DisallowIntercept {
      
      @scala.inline
      def apply(_ForwardingListener_this: ForwardingListener, run: () => js.Any): DisallowIntercept = {
        val __obj = js.Dynamic.literal(_ForwardingListener_this = _ForwardingListener_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
        __obj.asInstanceOf[DisallowIntercept]
      }
      
      @scala.inline
      implicit class DisallowInterceptMutableBuilder[Self <: DisallowIntercept] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set_ForwardingListener_this(value: ForwardingListener): Self = StObject.set(x, "_ForwardingListener_this", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class ForwardingListenerMutableBuilder[Self <: ForwardingListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPopup(value: () => ListPopupWindow): Self = StObject.set(x, "getPopup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMActivePointerId(value: js.Any): Self = StObject.set(x, "mActivePointerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDisallowIntercept(value: js.Any): Self = StObject.set(x, "mDisallowIntercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMForwarding(value: js.Any): Self = StObject.set(x, "mForwarding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMScaledTouchSlop(value: js.Any): Self = StObject.set(x, "mScaledTouchSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMSrc(value: js.Any): Self = StObject.set(x, "mSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTapTimeout(value: js.Any): Self = StObject.set(x, "mTapTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnForwardingStarted(value: () => Boolean): Self = StObject.set(x, "onForwardingStarted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnForwardingStopped(value: () => Boolean): Self = StObject.set(x, "onForwardingStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTouchForwarded(value: js.Any => js.Any): Self = StObject.set(x, "onTouchForwarded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchObserved(value: js.Any => js.Any): Self = StObject.set(x, "onTouchObserved", js.Any.fromFunction1(value))
    }
  }
  
  @scala.inline
  implicit class ListPopupWindowMutableBuilder[Self <: ListPopupWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildDropDown(value: () => js.Any): Self = StObject.set(x, "buildDropDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearListSelection(value: () => Unit): Self = StObject.set(x, "clearListSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateDragToOpenListener(value: View => OnTouchListener): Self = StObject.set(x, "createDragToOpenListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnchorView(value: () => View): Self = StObject.set(x, "getAnchorView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBackground(value: () => Drawable): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnterAnimation(value: () => Animation): Self = StObject.set(x, "getEnterAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExitAnimation(value: () => Animation): Self = StObject.set(x, "getExitAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHorizontalOffset(value: () => Double): Self = StObject.set(x, "getHorizontalOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputMethodMode(value: () => Double): Self = StObject.set(x, "getInputMethodMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListView(value: () => ListView): Self = StObject.set(x, "getListView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPromptPosition(value: () => Double): Self = StObject.set(x, "getPromptPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItem(value: () => js.Any): Self = StObject.set(x, "getSelectedItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItemId(value: () => Double): Self = StObject.set(x, "getSelectedItemId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItemPosition(value: () => Double): Self = StObject.set(x, "getSelectedItemPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedView(value: () => View): Self = StObject.set(x, "getSelectedView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVerticalOffset(value: () => Double): Self = StObject.set(x, "getVerticalOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDropDownAlwaysVisible(value: () => Boolean): Self = StObject.set(x, "isDropDownAlwaysVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInputMethodNotNeeded(value: () => Boolean): Self = StObject.set(x, "isInputMethodNotNeeded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsModal(value: () => Boolean): Self = StObject.set(x, "isModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsShowing(value: () => Boolean): Self = StObject.set(x, "isShowing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAdapter(value: js.Any): Self = StObject.set(x, "mAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMContext(value: js.Any): Self = StObject.set(x, "mContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownAlwaysVisible(value: js.Any): Self = StObject.set(x, "mDropDownAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownAnchorView(value: js.Any): Self = StObject.set(x, "mDropDownAnchorView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownGravity(value: js.Any): Self = StObject.set(x, "mDropDownGravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownHeight(value: js.Any): Self = StObject.set(x, "mDropDownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownHorizontalOffset(value: js.Any): Self = StObject.set(x, "mDropDownHorizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownList(value: js.Any): Self = StObject.set(x, "mDropDownList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownListHighlight(value: js.Any): Self = StObject.set(x, "mDropDownListHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownVerticalOffset(value: js.Any): Self = StObject.set(x, "mDropDownVerticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownVerticalOffsetSet(value: js.Any): Self = StObject.set(x, "mDropDownVerticalOffsetSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownWidth(value: js.Any): Self = StObject.set(x, "mDropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMForceIgnoreOutsideTouch(value: js.Any): Self = StObject.set(x, "mForceIgnoreOutsideTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHandler(value: js.Any): Self = StObject.set(x, "mHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHideSelector(value: js.Any): Self = StObject.set(x, "mHideSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMItemClickListener(value: js.Any): Self = StObject.set(x, "mItemClickListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMItemSelectedListener(value: js.Any): Self = StObject.set(x, "mItemSelectedListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLayoutDirection(value: js.Any): Self = StObject.set(x, "mLayoutDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMListItemExpandMaximum(value: Double): Self = StObject.set(x, "mListItemExpandMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMModal(value: js.Any): Self = StObject.set(x, "mModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMObserver(value: js.Any): Self = StObject.set(x, "mObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPopup(value: js.Any): Self = StObject.set(x, "mPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPromptPosition(value: js.Any): Self = StObject.set(x, "mPromptPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPromptView(value: js.Any): Self = StObject.set(x, "mPromptView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMResizePopupRunnable(value: js.Any): Self = StObject.set(x, "mResizePopupRunnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMScrollListener(value: js.Any): Self = StObject.set(x, "mScrollListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMShowDropDownRunnable(value: js.Any): Self = StObject.set(x, "mShowDropDownRunnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTempRect(value: js.Any): Self = StObject.set(x, "mTempRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchInterceptor(value: js.Any): Self = StObject.set(x, "mTouchInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDown(value: (Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyPreIme(value: (Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyPreIme", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyUp(value: (Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPerformItemClick(value: Double => Boolean): Self = StObject.set(x, "performItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostShow(value: () => Unit): Self = StObject.set(x, "postShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemovePromptView(value: () => js.Any): Self = StObject.set(x, "removePromptView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAdapter(value: ListAdapter => Unit): Self = StObject.set(x, "setAdapter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnchorView(value: View => Unit): Self = StObject.set(x, "setAnchorView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackgroundDrawable(value: Drawable => Unit): Self = StObject.set(x, "setBackgroundDrawable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContentWidth(value: Double => Unit): Self = StObject.set(x, "setContentWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDropDownAlwaysVisible(value: Boolean => Unit): Self = StObject.set(x, "setDropDownAlwaysVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDropDownGravity(value: Double => Unit): Self = StObject.set(x, "setDropDownGravity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetForceIgnoreOutsideTouch(value: Boolean => Unit): Self = StObject.set(x, "setForceIgnoreOutsideTouch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeight(value: Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHorizontalOffset(value: Double => Unit): Self = StObject.set(x, "setHorizontalOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInputMethodMode(value: Double => Unit): Self = StObject.set(x, "setInputMethodMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetListItemExpandMax(value: Double => Unit): Self = StObject.set(x, "setListItemExpandMax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetModal(value: Boolean => Unit): Self = StObject.set(x, "setModal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnDismissListener(value: OnDismissListener => Unit): Self = StObject.set(x, "setOnDismissListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnItemClickListener(value: OnItemClickListener => Unit): Self = StObject.set(x, "setOnItemClickListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnItemSelectedListener(value: OnItemSelectedListener => Unit): Self = StObject.set(x, "setOnItemSelectedListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPromptPosition(value: Double => Unit): Self = StObject.set(x, "setPromptPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPromptView(value: View => Unit): Self = StObject.set(x, "setPromptView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelection(value: Double => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVerticalOffset(value: Double => Unit): Self = StObject.set(x, "setVerticalOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWindowAnimation(value: (Animation, Animation) => Unit): Self = StObject.set(x, "setWindowAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
  
  @js.native
  trait ListSelectorHider extends Runnable {
    
    var _ListPopupWindow_this: ListPopupWindow = js.native
  }
  object ListSelectorHider {
    
    @scala.inline
    def apply(_ListPopupWindow_this: ListPopupWindow, run: () => js.Any): ListSelectorHider = {
      val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[ListSelectorHider]
    }
    
    @scala.inline
    implicit class ListSelectorHiderMutableBuilder[Self <: ListSelectorHider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_ListPopupWindow_this(value: ListPopupWindow): Self = StObject.set(x, "_ListPopupWindow_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupDataSetObserver extends DataSetObserver {
    
    var _ListPopupWindow_this: ListPopupWindow = js.native
  }
  object PopupDataSetObserver {
    
    @scala.inline
    def apply(_ListPopupWindow_this: ListPopupWindow, onChanged: () => Unit, onInvalidated: () => Unit): PopupDataSetObserver = {
      val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
      __obj.asInstanceOf[PopupDataSetObserver]
    }
    
    @scala.inline
    implicit class PopupDataSetObserverMutableBuilder[Self <: PopupDataSetObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_ListPopupWindow_this(value: ListPopupWindow): Self = StObject.set(x, "_ListPopupWindow_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupScrollListener extends OnScrollListener {
    
    var _ListPopupWindow_this: ListPopupWindow = js.native
  }
  object PopupScrollListener {
    
    @scala.inline
    def apply(
      _ListPopupWindow_this: ListPopupWindow,
      onScroll: (AbsListView, Double, Double, Double) => Unit,
      onScrollStateChanged: (AbsListView, Double) => Unit
    ): PopupScrollListener = {
      val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], onScroll = js.Any.fromFunction4(onScroll), onScrollStateChanged = js.Any.fromFunction2(onScrollStateChanged))
      __obj.asInstanceOf[PopupScrollListener]
    }
    
    @scala.inline
    implicit class PopupScrollListenerMutableBuilder[Self <: PopupScrollListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_ListPopupWindow_this(value: ListPopupWindow): Self = StObject.set(x, "_ListPopupWindow_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupTouchInterceptor extends OnTouchListener {
    
    var _ListPopupWindow_this: ListPopupWindow = js.native
  }
  object PopupTouchInterceptor {
    
    @scala.inline
    def apply(_ListPopupWindow_this: ListPopupWindow, onTouch: (View, MotionEvent) => Unit): PopupTouchInterceptor = {
      val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], onTouch = js.Any.fromFunction2(onTouch))
      __obj.asInstanceOf[PopupTouchInterceptor]
    }
    
    @scala.inline
    implicit class PopupTouchInterceptorMutableBuilder[Self <: PopupTouchInterceptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_ListPopupWindow_this(value: ListPopupWindow): Self = StObject.set(x, "_ListPopupWindow_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResizePopupRunnable extends Runnable {
    
    var _ListPopupWindow_this: ListPopupWindow = js.native
  }
  object ResizePopupRunnable {
    
    @scala.inline
    def apply(_ListPopupWindow_this: ListPopupWindow, run: () => js.Any): ResizePopupRunnable = {
      val __obj = js.Dynamic.literal(_ListPopupWindow_this = _ListPopupWindow_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[ResizePopupRunnable]
    }
    
    @scala.inline
    implicit class ResizePopupRunnableMutableBuilder[Self <: ResizePopupRunnable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_ListPopupWindow_this(value: ListPopupWindow): Self = StObject.set(x, "_ListPopupWindow_this", value.asInstanceOf[js.Any])
    }
  }
}
