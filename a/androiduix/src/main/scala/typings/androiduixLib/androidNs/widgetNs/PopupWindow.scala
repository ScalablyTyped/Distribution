package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.PopupWindow")
@js.native
class PopupWindow protected ()
  extends androiduixLib.androidNs.viewNs.WindowNs.Callback {
  def this(contentView: androiduixLib.androidNs.viewNs.View) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(contentView: androiduixLib.androidNs.viewNs.View, width: scala.Double) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, styleAttr: stdLib.Map[java.lang.String, java.lang.String]) = this()
  def this(contentView: androiduixLib.androidNs.viewNs.View, width: scala.Double, height: scala.Double) = this()
  def this(contentView: androiduixLib.androidNs.viewNs.View, width: scala.Double, height: scala.Double, focusable: scala.Boolean) = this()
  var mAboveAnchor: js.Any = js.native
  var mAboveAnchorBackgroundDrawable: js.Any = js.native
  var mAllowScrollingAnchorParent: js.Any = js.native
  var mAnchor: js.Any = js.native
  var mAnchorXoff: js.Any = js.native
  var mAnchorYoff: js.Any = js.native
  var mAnchoredGravity: js.Any = js.native
  var mBackground: js.Any = js.native
  var mBelowAnchorBackgroundDrawable: js.Any = js.native
  var mClipToScreen: js.Any = js.native
  var mContentView: js.Any = js.native
  var mContext: js.Any = js.native
  var mDefaultDropdownAboveEnterAnimation: js.Any = js.native
  var mDefaultDropdownAboveExitAnimation: js.Any = js.native
  var mDefaultDropdownBelowEnterAnimation: js.Any = js.native
  var mDefaultDropdownBelowExitAnimation: js.Any = js.native
  var mDrawingLocation: js.Any = js.native
  var mEnterAnimation: js.Any = js.native
  var mExitAnimation: js.Any = js.native
  var mFocusable: js.Any = js.native
  var mHeight: js.Any = js.native
  var mHeightMode: js.Any = js.native
  var mInputMethodMode: js.Any = js.native
  var mIsDropdown: js.Any = js.native
  var mIsShowing: js.Any = js.native
  var mLastHeight: js.Any = js.native
  var mLastWidth: js.Any = js.native
  var mNotTouchModal: js.Any = js.native
  var mOnDismissListener: js.Any = js.native
  var mOnScrollChangedListener: js.Any = js.native
  var mOutsideTouchable: js.Any = js.native
  var mPopupHeight: js.Any = js.native
  var mPopupView: js.Any = js.native
  var mPopupViewInitialLayoutDirectionInherited: js.Any = js.native
  var mPopupWidth: js.Any = js.native
  var mPopupWindow: js.Any = js.native
  var mScreenLocation: js.Any = js.native
  var mSplitTouchEnabled: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mTouchInterceptor: js.Any = js.native
  var mTouchable: js.Any = js.native
  var mWidth: js.Any = js.native
  var mWidthMode: js.Any = js.native
  var mWindowLayoutType: js.Any = js.native
  var mWindowManager: js.Any = js.native
  /* private */ def _update(): js.Any = js.native
  /* private */ def _update_a_w_h(anchor: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def _update_a_x_y_w_h(anchor: js.Any, xoff: js.Any, yoff: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def _update_all_args(
    anchor: js.Any,
    updateLocation: js.Any,
    xoff: js.Any,
    yoff: js.Any,
    updateDimension: js.Any,
    width: js.Any,
    height: js.Any,
    gravity: js.Any
  ): js.Any = js.native
  /* private */ def _update_w_h(width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def _update_x_y_w_h_f(x: js.Any, y: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def _update_x_y_w_h_f(x: js.Any, y: js.Any, width: js.Any, height: js.Any, force: js.Any): js.Any = js.native
  /* private */ def computeFlags(curFlags: js.Any): js.Any = js.native
  /* private */ def computeWindowEnterAnimation(): js.Any = js.native
  /* private */ def computeWindowExitAnimation(): js.Any = js.native
  /* private */ def createPopupLayout(): js.Any = js.native
  def dismiss(): scala.Unit = js.native
  /* CompleteClass */
  override def dispatchGenericMotionEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def dispatchKeyEvent(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def dispatchTouchEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* private */ def findDropDownPosition(anchor: js.Any, p: js.Any, xoff: js.Any, yoff: js.Any, gravity: js.Any): js.Any = js.native
  def getBackground(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getContentView(): androiduixLib.androidNs.viewNs.View = js.native
  def getEnterAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getExitAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getHeight(): scala.Double = js.native
  def getInputMethodMode(): scala.Double = js.native
  def getMaxAvailableHeight(anchor: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def getMaxAvailableHeight(anchor: androiduixLib.androidNs.viewNs.View, yOffset: scala.Double): scala.Double = js.native
  def getMaxAvailableHeight(
    anchor: androiduixLib.androidNs.viewNs.View,
    yOffset: scala.Double,
    ignoreBottomDecorations: scala.Boolean
  ): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def getWindowLayoutType(): scala.Double = js.native
  /* private */ def invokePopup(p: js.Any): js.Any = js.native
  def isAboveAnchor(): scala.Boolean = js.native
  def isFocusable(): scala.Boolean = js.native
  def isOutsideTouchable(): scala.Boolean = js.native
  def isShowing(): scala.Boolean = js.native
  def isSplitTouchEnabled(): scala.Boolean = js.native
  def isTouchable(): scala.Boolean = js.native
  /* CompleteClass */
  override def onAttachedToWindow(): scala.Unit = js.native
  /* CompleteClass */
  override def onContentChanged(): scala.Unit = js.native
  /* CompleteClass */
  override def onDetachedFromWindow(): scala.Unit = js.native
  def onGenericMotionEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  def onTouchEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onWindowAttributesChanged(attrs: androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams): scala.Unit = js.native
  /* CompleteClass */
  override def onWindowFocusChanged(hasFocus: scala.Boolean): scala.Unit = js.native
  /* private */ def preparePopup(p: js.Any): js.Any = js.native
  /* private */ def registerForScrollChanged(anchor: js.Any, xoff: js.Any, yoff: js.Any, gravity: js.Any): js.Any = js.native
  /* private */ def setAllowScrollingAnchorParent(enabled: js.Any): js.Any = js.native
  def setBackgroundDrawable(background: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setClipToScreenEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setContentView(contentView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setFocusable(focusable: scala.Boolean): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  def setInputMethodMode(mode: scala.Double): scala.Unit = js.native
  /* private */ def setLayoutDirectionFromAnchor(): js.Any = js.native
  def setOnDismissListener(onDismissListener: androiduixLib.androidNs.widgetNs.PopupWindowNs.OnDismissListener): scala.Unit = js.native
  def setOutsideTouchable(touchable: scala.Boolean): scala.Unit = js.native
  def setSplitTouchEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setTouchInterceptor(l: androiduixLib.androidNs.viewNs.ViewNs.OnTouchListener): scala.Unit = js.native
  def setTouchModal(touchModal: scala.Boolean): scala.Unit = js.native
  def setTouchable(touchable: scala.Boolean): scala.Unit = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
  def setWindowAnimation(
    enterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    exitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation
  ): scala.Unit = js.native
  def setWindowLayoutMode(widthSpec: scala.Double, heightSpec: scala.Double): scala.Unit = js.native
  def setWindowLayoutType(layoutType: scala.Double): scala.Unit = js.native
  def showAsDropDown(anchor: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def showAsDropDown(anchor: androiduixLib.androidNs.viewNs.View, xoff: scala.Double): scala.Unit = js.native
  def showAsDropDown(anchor: androiduixLib.androidNs.viewNs.View, xoff: scala.Double, yoff: scala.Double): scala.Unit = js.native
  def showAsDropDown(
    anchor: androiduixLib.androidNs.viewNs.View,
    xoff: scala.Double,
    yoff: scala.Double,
    gravity: scala.Double
  ): scala.Unit = js.native
  def showAtLocation(
    parent: androiduixLib.androidNs.viewNs.View,
    gravity: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  /* private */ def unregisterForScrollChanged(): js.Any = js.native
  def update(): scala.Unit = js.native
  def update(anchor: androiduixLib.androidNs.viewNs.View, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def update(
    anchor: androiduixLib.androidNs.viewNs.View,
    xoff: scala.Double,
    yoff: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  def update(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def update(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def update(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, force: scala.Boolean): scala.Unit = js.native
  /* private */ def updateAboveAnchor(aboveAnchor: js.Any): js.Any = js.native
}

@JSGlobal("android.widget.PopupWindow")
@js.native
object PopupWindow extends js.Object {
  var DEFAULT_ANCHORED_GRAVITY: js.Any = js.native
  var INPUT_METHOD_FROM_FOCUSABLE: scala.Double = js.native
  var INPUT_METHOD_NEEDED: scala.Double = js.native
  var INPUT_METHOD_NOT_NEEDED: scala.Double = js.native
}

