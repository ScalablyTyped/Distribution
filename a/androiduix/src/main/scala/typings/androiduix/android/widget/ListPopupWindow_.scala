package typings.androiduix.android.widget

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnTouchListener
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.widget.AdapterView.OnItemClickListener
import typings.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typings.androiduix.android.widget.PopupWindow.OnDismissListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPopupWindow_ extends js.Object {
  
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
object ListPopupWindow_ {
  
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
  ): ListPopupWindow_ = {
    val __obj = js.Dynamic.literal(buildDropDown = js.Any.fromFunction0(buildDropDown), clearListSelection = js.Any.fromFunction0(clearListSelection), createDragToOpenListener = js.Any.fromFunction1(createDragToOpenListener), dismiss = js.Any.fromFunction0(dismiss), getAnchorView = js.Any.fromFunction0(getAnchorView), getBackground = js.Any.fromFunction0(getBackground), getEnterAnimation = js.Any.fromFunction0(getEnterAnimation), getExitAnimation = js.Any.fromFunction0(getExitAnimation), getHeight = js.Any.fromFunction0(getHeight), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getInputMethodMode = js.Any.fromFunction0(getInputMethodMode), getListView = js.Any.fromFunction0(getListView), getPromptPosition = js.Any.fromFunction0(getPromptPosition), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectedItemId = js.Any.fromFunction0(getSelectedItemId), getSelectedItemPosition = js.Any.fromFunction0(getSelectedItemPosition), getSelectedView = js.Any.fromFunction0(getSelectedView), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), getWidth = js.Any.fromFunction0(getWidth), isDropDownAlwaysVisible = js.Any.fromFunction0(isDropDownAlwaysVisible), isInputMethodNotNeeded = js.Any.fromFunction0(isInputMethodNotNeeded), isModal = js.Any.fromFunction0(isModal), isShowing = js.Any.fromFunction0(isShowing), mAdapter = mAdapter.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mDropDownAlwaysVisible = mDropDownAlwaysVisible.asInstanceOf[js.Any], mDropDownAnchorView = mDropDownAnchorView.asInstanceOf[js.Any], mDropDownGravity = mDropDownGravity.asInstanceOf[js.Any], mDropDownHeight = mDropDownHeight.asInstanceOf[js.Any], mDropDownHorizontalOffset = mDropDownHorizontalOffset.asInstanceOf[js.Any], mDropDownList = mDropDownList.asInstanceOf[js.Any], mDropDownListHighlight = mDropDownListHighlight.asInstanceOf[js.Any], mDropDownVerticalOffset = mDropDownVerticalOffset.asInstanceOf[js.Any], mDropDownVerticalOffsetSet = mDropDownVerticalOffsetSet.asInstanceOf[js.Any], mDropDownWidth = mDropDownWidth.asInstanceOf[js.Any], mForceIgnoreOutsideTouch = mForceIgnoreOutsideTouch.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mHideSelector = mHideSelector.asInstanceOf[js.Any], mItemClickListener = mItemClickListener.asInstanceOf[js.Any], mItemSelectedListener = mItemSelectedListener.asInstanceOf[js.Any], mLayoutDirection = mLayoutDirection.asInstanceOf[js.Any], mListItemExpandMaximum = mListItemExpandMaximum.asInstanceOf[js.Any], mModal = mModal.asInstanceOf[js.Any], mObserver = mObserver.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPromptPosition = mPromptPosition.asInstanceOf[js.Any], mPromptView = mPromptView.asInstanceOf[js.Any], mResizePopupRunnable = mResizePopupRunnable.asInstanceOf[js.Any], mScrollListener = mScrollListener.asInstanceOf[js.Any], mShowDropDownRunnable = mShowDropDownRunnable.asInstanceOf[js.Any], mTempRect = mTempRect.asInstanceOf[js.Any], mTouchInterceptor = mTouchInterceptor.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyPreIme = js.Any.fromFunction2(onKeyPreIme), onKeyUp = js.Any.fromFunction2(onKeyUp), performItemClick = js.Any.fromFunction1(performItemClick), postShow = js.Any.fromFunction0(postShow), removePromptView = js.Any.fromFunction0(removePromptView), setAdapter = js.Any.fromFunction1(setAdapter), setAnchorView = js.Any.fromFunction1(setAnchorView), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setContentWidth = js.Any.fromFunction1(setContentWidth), setDropDownAlwaysVisible = js.Any.fromFunction1(setDropDownAlwaysVisible), setDropDownGravity = js.Any.fromFunction1(setDropDownGravity), setForceIgnoreOutsideTouch = js.Any.fromFunction1(setForceIgnoreOutsideTouch), setHeight = js.Any.fromFunction1(setHeight), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setInputMethodMode = js.Any.fromFunction1(setInputMethodMode), setListItemExpandMax = js.Any.fromFunction1(setListItemExpandMax), setModal = js.Any.fromFunction1(setModal), setOnDismissListener = js.Any.fromFunction1(setOnDismissListener), setOnItemClickListener = js.Any.fromFunction1(setOnItemClickListener), setOnItemSelectedListener = js.Any.fromFunction1(setOnItemSelectedListener), setPromptPosition = js.Any.fromFunction1(setPromptPosition), setPromptView = js.Any.fromFunction1(setPromptView), setSelection = js.Any.fromFunction1(setSelection), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), setWidth = js.Any.fromFunction1(setWidth), setWindowAnimation = js.Any.fromFunction2(setWindowAnimation), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ListPopupWindow_]
  }
  
  @scala.inline
  implicit class ListPopupWindow_Ops[Self <: ListPopupWindow_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuildDropDown(value: () => js.Any): Self = this.set("buildDropDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearListSelection(value: () => Unit): Self = this.set("clearListSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateDragToOpenListener(value: View => OnTouchListener): Self = this.set("createDragToOpenListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDismiss(value: () => Unit): Self = this.set("dismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnchorView(value: () => View): Self = this.set("getAnchorView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBackground(value: () => Drawable): Self = this.set("getBackground", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnterAnimation(value: () => Animation): Self = this.set("getEnterAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExitAnimation(value: () => Animation): Self = this.set("getExitAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHorizontalOffset(value: () => Double): Self = this.set("getHorizontalOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputMethodMode(value: () => Double): Self = this.set("getInputMethodMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListView(value: () => ListView): Self = this.set("getListView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPromptPosition(value: () => Double): Self = this.set("getPromptPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItem(value: () => js.Any): Self = this.set("getSelectedItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItemId(value: () => Double): Self = this.set("getSelectedItemId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItemPosition(value: () => Double): Self = this.set("getSelectedItemPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedView(value: () => View): Self = this.set("getSelectedView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVerticalOffset(value: () => Double): Self = this.set("getVerticalOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDropDownAlwaysVisible(value: () => Boolean): Self = this.set("isDropDownAlwaysVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInputMethodNotNeeded(value: () => Boolean): Self = this.set("isInputMethodNotNeeded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsModal(value: () => Boolean): Self = this.set("isModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsShowing(value: () => Boolean): Self = this.set("isShowing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMAdapter(value: js.Any): Self = this.set("mAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMContext(value: js.Any): Self = this.set("mContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownAlwaysVisible(value: js.Any): Self = this.set("mDropDownAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownAnchorView(value: js.Any): Self = this.set("mDropDownAnchorView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownGravity(value: js.Any): Self = this.set("mDropDownGravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownHeight(value: js.Any): Self = this.set("mDropDownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownHorizontalOffset(value: js.Any): Self = this.set("mDropDownHorizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownList(value: js.Any): Self = this.set("mDropDownList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownListHighlight(value: js.Any): Self = this.set("mDropDownListHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownVerticalOffset(value: js.Any): Self = this.set("mDropDownVerticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownVerticalOffsetSet(value: js.Any): Self = this.set("mDropDownVerticalOffsetSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownWidth(value: js.Any): Self = this.set("mDropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMForceIgnoreOutsideTouch(value: js.Any): Self = this.set("mForceIgnoreOutsideTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHandler(value: js.Any): Self = this.set("mHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMHideSelector(value: js.Any): Self = this.set("mHideSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMItemClickListener(value: js.Any): Self = this.set("mItemClickListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMItemSelectedListener(value: js.Any): Self = this.set("mItemSelectedListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLayoutDirection(value: js.Any): Self = this.set("mLayoutDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMListItemExpandMaximum(value: Double): Self = this.set("mListItemExpandMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMModal(value: js.Any): Self = this.set("mModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMObserver(value: js.Any): Self = this.set("mObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPopup(value: js.Any): Self = this.set("mPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPromptPosition(value: js.Any): Self = this.set("mPromptPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPromptView(value: js.Any): Self = this.set("mPromptView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMResizePopupRunnable(value: js.Any): Self = this.set("mResizePopupRunnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMScrollListener(value: js.Any): Self = this.set("mScrollListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMShowDropDownRunnable(value: js.Any): Self = this.set("mShowDropDownRunnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTempRect(value: js.Any): Self = this.set("mTempRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMTouchInterceptor(value: js.Any): Self = this.set("mTouchInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDown(value: (Double, KeyEvent) => Boolean): Self = this.set("onKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyPreIme(value: (Double, KeyEvent) => Boolean): Self = this.set("onKeyPreIme", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyUp(value: (Double, KeyEvent) => Boolean): Self = this.set("onKeyUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPerformItemClick(value: Double => Boolean): Self = this.set("performItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostShow(value: () => Unit): Self = this.set("postShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemovePromptView(value: () => js.Any): Self = this.set("removePromptView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAdapter(value: ListAdapter => Unit): Self = this.set("setAdapter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnchorView(value: View => Unit): Self = this.set("setAnchorView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackgroundDrawable(value: Drawable => Unit): Self = this.set("setBackgroundDrawable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContentWidth(value: Double => Unit): Self = this.set("setContentWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDropDownAlwaysVisible(value: Boolean => Unit): Self = this.set("setDropDownAlwaysVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDropDownGravity(value: Double => Unit): Self = this.set("setDropDownGravity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetForceIgnoreOutsideTouch(value: Boolean => Unit): Self = this.set("setForceIgnoreOutsideTouch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeight(value: Double => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHorizontalOffset(value: Double => Unit): Self = this.set("setHorizontalOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInputMethodMode(value: Double => Unit): Self = this.set("setInputMethodMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetListItemExpandMax(value: Double => Unit): Self = this.set("setListItemExpandMax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetModal(value: Boolean => Unit): Self = this.set("setModal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnDismissListener(value: OnDismissListener => Unit): Self = this.set("setOnDismissListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnItemClickListener(value: OnItemClickListener => Unit): Self = this.set("setOnItemClickListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnItemSelectedListener(value: OnItemSelectedListener => Unit): Self = this.set("setOnItemSelectedListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPromptPosition(value: Double => Unit): Self = this.set("setPromptPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPromptView(value: View => Unit): Self = this.set("setPromptView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelection(value: Double => Unit): Self = this.set("setSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVerticalOffset(value: Double => Unit): Self = this.set("setVerticalOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWidth(value: Double => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWindowAnimation(value: (Animation, Animation) => Unit): Self = this.set("setWindowAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
}
