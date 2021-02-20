package typings.androiduix.android.widget

import typings.androiduix.android.content.DialogInterface
import typings.androiduix.android.content.DialogInterface.OnClickListener
import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnTouchListener
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewParent
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.widget.AdapterView.OnItemClickListener
import typings.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typings.androiduix.android.widget.PopupWindow.OnDismissListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spinner
  extends AbsSpinner
     with OnClickListener {
  
  def getDropDownHorizontalOffset(): Double = js.native
  
  def getDropDownVerticalOffset(): Double = js.native
  
  def getDropDownWidth(): Double = js.native
  
  def getGravity(): Double = js.native
  
  /* InferMemberOverrides */
  override def getParent(): ViewParent = js.native
  
  def getPopupBackground(): Drawable = js.native
  
  def getPrompt(): String = js.native
  
  /* InferMemberOverrides */
  override def isLayoutRequested(): Boolean = js.native
  
  var mDisableChildrenWhenDisabled: js.Any = js.native
  
  var mDropDownWidth: Double = js.native
  
  var mGravity: js.Any = js.native
  
  var mPopup: js.Any = js.native
  
  var mTempAdapter: js.Any = js.native
  
  var mTempRect: js.Any = js.native
  
  /* private */ def makeView(position: js.Any, addChild: js.Any): js.Any = js.native
  
  def measureContentWidth(adapter: SpinnerAdapter, background: Drawable): Double = js.native
  
  /* InferMemberOverrides */
  override def requestLayout(): js.Any with Unit = js.native
  
  def setDropDownHorizontalOffset(pixels: Double): Unit = js.native
  
  def setDropDownVerticalOffset(pixels: Double): Unit = js.native
  
  def setDropDownWidth(pixels: Double): Unit = js.native
  
  def setGravity(gravity: Double): Unit = js.native
  
  def setOnItemClickListenerInt(l: OnItemClickListener): Unit = js.native
  
  def setPopupBackgroundDrawable(background: Drawable): Unit = js.native
  
  def setPrompt(prompt: String): Unit = js.native
  
  /* private */ def setUpChild(child: js.Any, addChild: js.Any): js.Any = js.native
}
object Spinner {
  
  @js.native
  trait DialogPopup
    extends SpinnerPopup
       with OnClickListener {
    
    var _Spinner_this: Spinner = js.native
    
    var mListAdapter: js.Any = js.native
    
    var mPopup: js.Any = js.native
    
    var mPrompt: js.Any = js.native
  }
  object DialogPopup {
    
    @scala.inline
    def apply(
      _Spinner_this: Spinner,
      dismiss: () => Unit,
      getBackground: () => Drawable,
      getHintText: () => String,
      getHorizontalOffset: () => Double,
      getVerticalOffset: () => Double,
      isShowing: () => Boolean,
      mListAdapter: js.Any,
      mPopup: js.Any,
      mPrompt: js.Any,
      onClick: (DialogInterface, Double) => Unit,
      setAdapter: ListAdapter => Unit,
      setBackgroundDrawable: Drawable => Unit,
      setHorizontalOffset: Double => Unit,
      setPromptText: String => Unit,
      setVerticalOffset: Double => Unit,
      showPopup: (Double, Double) => Unit
    ): DialogPopup = {
      val __obj = js.Dynamic.literal(_Spinner_this = _Spinner_this.asInstanceOf[js.Any], dismiss = js.Any.fromFunction0(dismiss), getBackground = js.Any.fromFunction0(getBackground), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), isShowing = js.Any.fromFunction0(isShowing), mListAdapter = mListAdapter.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPrompt = mPrompt.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), setAdapter = js.Any.fromFunction1(setAdapter), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setPromptText = js.Any.fromFunction1(setPromptText), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), showPopup = js.Any.fromFunction2(showPopup))
      __obj.asInstanceOf[DialogPopup]
    }
    
    @scala.inline
    implicit class DialogPopupMutableBuilder[Self <: DialogPopup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMListAdapter(value: js.Any): Self = StObject.set(x, "mListAdapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPopup(value: js.Any): Self = StObject.set(x, "mPopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPrompt(value: js.Any): Self = StObject.set(x, "mPrompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_Spinner_this(value: Spinner): Self = StObject.set(x, "_Spinner_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropDownAdapter
    extends ListAdapter
       with SpinnerAdapter {
    
    var mAdapter: js.Any = js.native
    
    var mListAdapter: js.Any = js.native
  }
  object DropDownAdapter {
    
    @scala.inline
    def apply(
      areAllItemsEnabled: () => Boolean,
      getCount: () => Double,
      getDropDownView: (Double, View, ViewGroup) => View,
      getItem: Double => js.Any,
      getItemId: Double => Double,
      getItemViewType: Double => Double,
      getView: (Double, View, ViewGroup) => View,
      getViewTypeCount: () => Double,
      hasStableIds: () => Boolean,
      isEmpty: () => Boolean,
      isEnabled: Double => Boolean,
      mAdapter: js.Any,
      mListAdapter: js.Any,
      registerDataSetObserver: DataSetObserver => Unit,
      unregisterDataSetObserver: DataSetObserver => Unit
    ): DropDownAdapter = {
      val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), mAdapter = mAdapter.asInstanceOf[js.Any], mListAdapter = mListAdapter.asInstanceOf[js.Any], registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
      __obj.asInstanceOf[DropDownAdapter]
    }
    
    @scala.inline
    implicit class DropDownAdapterMutableBuilder[Self <: DropDownAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMAdapter(value: js.Any): Self = StObject.set(x, "mAdapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMListAdapter(value: js.Any): Self = StObject.set(x, "mListAdapter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropdownPopup
    extends ListPopupWindow
       with SpinnerPopup {
    
    var _Spinner_this: Spinner = js.native
    
    def computeContentWidth(): Unit = js.native
    
    /* InferMemberOverrides */
    override def dismiss(): Unit = js.native
    
    /* InferMemberOverrides */
    override def getBackground(): Drawable = js.native
    
    /* InferMemberOverrides */
    override def getHorizontalOffset(): Double = js.native
    
    /* InferMemberOverrides */
    override def getVerticalOffset(): Double = js.native
    
    /* InferMemberOverrides */
    override def isShowing(): Boolean = js.native
    
    var mHintText: js.Any = js.native
    
    /* InferMemberOverrides */
    override def setAdapter(adapter: ListAdapter): Unit = js.native
    
    /* InferMemberOverrides */
    override def setBackgroundDrawable(d: Drawable): Unit = js.native
    
    /* InferMemberOverrides */
    override def setHorizontalOffset(offset: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def setVerticalOffset(offset: Double): Unit = js.native
  }
  object DropdownPopup {
    
    @scala.inline
    def apply(
      _Spinner_this: Spinner,
      buildDropDown: () => js.Any,
      clearListSelection: () => Unit,
      computeContentWidth: () => Unit,
      createDragToOpenListener: View => OnTouchListener,
      dismiss: () => Unit,
      getAnchorView: () => View,
      getBackground: () => Drawable,
      getEnterAnimation: () => Animation,
      getExitAnimation: () => Animation,
      getHeight: () => Double,
      getHintText: () => String,
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
      mHintText: js.Any,
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
      setPromptText: String => Unit,
      setPromptView: View => Unit,
      setSelection: Double => Unit,
      setVerticalOffset: Double => Unit,
      setWidth: Double => Unit,
      setWindowAnimation: (Animation, Animation) => Unit,
      show: () => Unit,
      showPopup: (Double, Double) => Unit
    ): DropdownPopup = {
      val __obj = js.Dynamic.literal(_Spinner_this = _Spinner_this.asInstanceOf[js.Any], buildDropDown = js.Any.fromFunction0(buildDropDown), clearListSelection = js.Any.fromFunction0(clearListSelection), computeContentWidth = js.Any.fromFunction0(computeContentWidth), createDragToOpenListener = js.Any.fromFunction1(createDragToOpenListener), dismiss = js.Any.fromFunction0(dismiss), getAnchorView = js.Any.fromFunction0(getAnchorView), getBackground = js.Any.fromFunction0(getBackground), getEnterAnimation = js.Any.fromFunction0(getEnterAnimation), getExitAnimation = js.Any.fromFunction0(getExitAnimation), getHeight = js.Any.fromFunction0(getHeight), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getInputMethodMode = js.Any.fromFunction0(getInputMethodMode), getListView = js.Any.fromFunction0(getListView), getPromptPosition = js.Any.fromFunction0(getPromptPosition), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectedItemId = js.Any.fromFunction0(getSelectedItemId), getSelectedItemPosition = js.Any.fromFunction0(getSelectedItemPosition), getSelectedView = js.Any.fromFunction0(getSelectedView), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), getWidth = js.Any.fromFunction0(getWidth), isDropDownAlwaysVisible = js.Any.fromFunction0(isDropDownAlwaysVisible), isInputMethodNotNeeded = js.Any.fromFunction0(isInputMethodNotNeeded), isModal = js.Any.fromFunction0(isModal), isShowing = js.Any.fromFunction0(isShowing), mAdapter = mAdapter.asInstanceOf[js.Any], mContext = mContext.asInstanceOf[js.Any], mDropDownAlwaysVisible = mDropDownAlwaysVisible.asInstanceOf[js.Any], mDropDownAnchorView = mDropDownAnchorView.asInstanceOf[js.Any], mDropDownGravity = mDropDownGravity.asInstanceOf[js.Any], mDropDownHeight = mDropDownHeight.asInstanceOf[js.Any], mDropDownHorizontalOffset = mDropDownHorizontalOffset.asInstanceOf[js.Any], mDropDownList = mDropDownList.asInstanceOf[js.Any], mDropDownListHighlight = mDropDownListHighlight.asInstanceOf[js.Any], mDropDownVerticalOffset = mDropDownVerticalOffset.asInstanceOf[js.Any], mDropDownVerticalOffsetSet = mDropDownVerticalOffsetSet.asInstanceOf[js.Any], mDropDownWidth = mDropDownWidth.asInstanceOf[js.Any], mForceIgnoreOutsideTouch = mForceIgnoreOutsideTouch.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mHideSelector = mHideSelector.asInstanceOf[js.Any], mHintText = mHintText.asInstanceOf[js.Any], mItemClickListener = mItemClickListener.asInstanceOf[js.Any], mItemSelectedListener = mItemSelectedListener.asInstanceOf[js.Any], mLayoutDirection = mLayoutDirection.asInstanceOf[js.Any], mListItemExpandMaximum = mListItemExpandMaximum.asInstanceOf[js.Any], mModal = mModal.asInstanceOf[js.Any], mObserver = mObserver.asInstanceOf[js.Any], mPopup = mPopup.asInstanceOf[js.Any], mPromptPosition = mPromptPosition.asInstanceOf[js.Any], mPromptView = mPromptView.asInstanceOf[js.Any], mResizePopupRunnable = mResizePopupRunnable.asInstanceOf[js.Any], mScrollListener = mScrollListener.asInstanceOf[js.Any], mShowDropDownRunnable = mShowDropDownRunnable.asInstanceOf[js.Any], mTempRect = mTempRect.asInstanceOf[js.Any], mTouchInterceptor = mTouchInterceptor.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyPreIme = js.Any.fromFunction2(onKeyPreIme), onKeyUp = js.Any.fromFunction2(onKeyUp), performItemClick = js.Any.fromFunction1(performItemClick), postShow = js.Any.fromFunction0(postShow), removePromptView = js.Any.fromFunction0(removePromptView), setAdapter = js.Any.fromFunction1(setAdapter), setAnchorView = js.Any.fromFunction1(setAnchorView), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setContentWidth = js.Any.fromFunction1(setContentWidth), setDropDownAlwaysVisible = js.Any.fromFunction1(setDropDownAlwaysVisible), setDropDownGravity = js.Any.fromFunction1(setDropDownGravity), setForceIgnoreOutsideTouch = js.Any.fromFunction1(setForceIgnoreOutsideTouch), setHeight = js.Any.fromFunction1(setHeight), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setInputMethodMode = js.Any.fromFunction1(setInputMethodMode), setListItemExpandMax = js.Any.fromFunction1(setListItemExpandMax), setModal = js.Any.fromFunction1(setModal), setOnDismissListener = js.Any.fromFunction1(setOnDismissListener), setOnItemClickListener = js.Any.fromFunction1(setOnItemClickListener), setOnItemSelectedListener = js.Any.fromFunction1(setOnItemSelectedListener), setPromptPosition = js.Any.fromFunction1(setPromptPosition), setPromptText = js.Any.fromFunction1(setPromptText), setPromptView = js.Any.fromFunction1(setPromptView), setSelection = js.Any.fromFunction1(setSelection), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), setWidth = js.Any.fromFunction1(setWidth), setWindowAnimation = js.Any.fromFunction2(setWindowAnimation), show = js.Any.fromFunction0(show), showPopup = js.Any.fromFunction2(showPopup))
      __obj.asInstanceOf[DropdownPopup]
    }
    
    @scala.inline
    implicit class DropdownPopupMutableBuilder[Self <: DropdownPopup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeContentWidth(value: () => Unit): Self = StObject.set(x, "computeContentWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBackground(value: () => Drawable): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHorizontalOffset(value: () => Double): Self = StObject.set(x, "getHorizontalOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVerticalOffset(value: () => Double): Self = StObject.set(x, "getVerticalOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsShowing(value: () => Boolean): Self = StObject.set(x, "isShowing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMHintText(value: js.Any): Self = StObject.set(x, "mHintText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAdapter(value: ListAdapter => Unit): Self = StObject.set(x, "setAdapter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBackgroundDrawable(value: Drawable => Unit): Self = StObject.set(x, "setBackgroundDrawable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHorizontalOffset(value: Double => Unit): Self = StObject.set(x, "setHorizontalOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVerticalOffset(value: Double => Unit): Self = StObject.set(x, "setVerticalOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_Spinner_this(value: Spinner): Self = StObject.set(x, "_Spinner_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpinnerPopup extends StObject {
    
    def dismiss(): Unit = js.native
    
    def getBackground(): Drawable = js.native
    
    def getHintText(): String = js.native
    
    def getHorizontalOffset(): Double = js.native
    
    def getVerticalOffset(): Double = js.native
    
    def isShowing(): Boolean = js.native
    
    def setAdapter(adapter: ListAdapter): Unit = js.native
    
    def setBackgroundDrawable(bg: Drawable): Unit = js.native
    
    def setHorizontalOffset(px: Double): Unit = js.native
    
    def setPromptText(hintText: String): Unit = js.native
    
    def setVerticalOffset(px: Double): Unit = js.native
    
    def showPopup(textDirection: Double, textAlignment: Double): Unit = js.native
  }
  object SpinnerPopup {
    
    @scala.inline
    def apply(
      dismiss: () => Unit,
      getBackground: () => Drawable,
      getHintText: () => String,
      getHorizontalOffset: () => Double,
      getVerticalOffset: () => Double,
      isShowing: () => Boolean,
      setAdapter: ListAdapter => Unit,
      setBackgroundDrawable: Drawable => Unit,
      setHorizontalOffset: Double => Unit,
      setPromptText: String => Unit,
      setVerticalOffset: Double => Unit,
      showPopup: (Double, Double) => Unit
    ): SpinnerPopup = {
      val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), getBackground = js.Any.fromFunction0(getBackground), getHintText = js.Any.fromFunction0(getHintText), getHorizontalOffset = js.Any.fromFunction0(getHorizontalOffset), getVerticalOffset = js.Any.fromFunction0(getVerticalOffset), isShowing = js.Any.fromFunction0(isShowing), setAdapter = js.Any.fromFunction1(setAdapter), setBackgroundDrawable = js.Any.fromFunction1(setBackgroundDrawable), setHorizontalOffset = js.Any.fromFunction1(setHorizontalOffset), setPromptText = js.Any.fromFunction1(setPromptText), setVerticalOffset = js.Any.fromFunction1(setVerticalOffset), showPopup = js.Any.fromFunction2(showPopup))
      __obj.asInstanceOf[SpinnerPopup]
    }
    
    @scala.inline
    implicit class SpinnerPopupMutableBuilder[Self <: SpinnerPopup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBackground(value: () => Drawable): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHintText(value: () => String): Self = StObject.set(x, "getHintText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHorizontalOffset(value: () => Double): Self = StObject.set(x, "getHorizontalOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVerticalOffset(value: () => Double): Self = StObject.set(x, "getVerticalOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsShowing(value: () => Boolean): Self = StObject.set(x, "isShowing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetAdapter(value: ListAdapter => Unit): Self = StObject.set(x, "setAdapter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBackgroundDrawable(value: Drawable => Unit): Self = StObject.set(x, "setBackgroundDrawable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHorizontalOffset(value: Double => Unit): Self = StObject.set(x, "setHorizontalOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPromptText(value: String => Unit): Self = StObject.set(x, "setPromptText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVerticalOffset(value: Double => Unit): Self = StObject.set(x, "setVerticalOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowPopup(value: (Double, Double) => Unit): Self = StObject.set(x, "showPopup", js.Any.fromFunction2(value))
    }
  }
}
