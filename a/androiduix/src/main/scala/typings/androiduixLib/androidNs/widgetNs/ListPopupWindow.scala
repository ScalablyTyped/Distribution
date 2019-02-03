package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ListPopupWindow")
@js.native
class ListPopupWindow protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, styleAttr: stdLib.Map[java.lang.String, java.lang.String]) = this()
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
  var mListItemExpandMaximum: scala.Double = js.native
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
  def clearListSelection(): scala.Unit = js.native
  def createDragToOpenListener(src: androiduixLib.androidNs.viewNs.View): androiduixLib.androidNs.viewNs.ViewNs.OnTouchListener = js.native
  def dismiss(): scala.Unit = js.native
  def getAnchorView(): androiduixLib.androidNs.viewNs.View = js.native
  def getBackground(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getEnterAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getExitAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getHeight(): scala.Double = js.native
  def getHorizontalOffset(): scala.Double = js.native
  def getInputMethodMode(): scala.Double = js.native
  def getListView(): ListView = js.native
  def getPromptPosition(): scala.Double = js.native
  def getSelectedItem(): js.Any = js.native
  def getSelectedItemId(): scala.Double = js.native
  def getSelectedItemPosition(): scala.Double = js.native
  def getSelectedView(): androiduixLib.androidNs.viewNs.View = js.native
  def getVerticalOffset(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def isDropDownAlwaysVisible(): scala.Boolean = js.native
  def isInputMethodNotNeeded(): scala.Boolean = js.native
  def isModal(): scala.Boolean = js.native
  def isShowing(): scala.Boolean = js.native
  def onKeyDown(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def onKeyPreIme(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def onKeyUp(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def performItemClick(position: scala.Double): scala.Boolean = js.native
  def postShow(): scala.Unit = js.native
  /* private */ def removePromptView(): js.Any = js.native
  def setAdapter(adapter: ListAdapter): scala.Unit = js.native
  def setAnchorView(anchor: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setBackgroundDrawable(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setContentWidth(width: scala.Double): scala.Unit = js.native
  def setDropDownAlwaysVisible(dropDownAlwaysVisible: scala.Boolean): scala.Unit = js.native
  def setDropDownGravity(gravity: scala.Double): scala.Unit = js.native
  def setForceIgnoreOutsideTouch(forceIgnoreOutsideTouch: scala.Boolean): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  def setHorizontalOffset(offset: scala.Double): scala.Unit = js.native
  def setInputMethodMode(mode: scala.Double): scala.Unit = js.native
  def setListItemExpandMax(max: scala.Double): scala.Unit = js.native
  def setModal(modal: scala.Boolean): scala.Unit = js.native
  def setOnDismissListener(listener: androiduixLib.androidNs.widgetNs.PopupWindowNs.OnDismissListener): scala.Unit = js.native
  def setOnItemClickListener(clickListener: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemClickListener): scala.Unit = js.native
  def setOnItemSelectedListener(selectedListener: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemSelectedListener): scala.Unit = js.native
  def setPromptPosition(position: scala.Double): scala.Unit = js.native
  def setPromptView(prompt: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setSelection(position: scala.Double): scala.Unit = js.native
  def setVerticalOffset(offset: scala.Double): scala.Unit = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
  def setWindowAnimation(
    enterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    exitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation
  ): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.widget.ListPopupWindow")
@js.native
object ListPopupWindow extends js.Object {
  var DEBUG: js.Any = js.native
  var EXPAND_LIST_TIMEOUT: js.Any = js.native
  var INPUT_METHOD_FROM_FOCUSABLE: scala.Double = js.native
  var INPUT_METHOD_NEEDED: scala.Double = js.native
  var INPUT_METHOD_NOT_NEEDED: scala.Double = js.native
  var MATCH_PARENT: scala.Double = js.native
  var POSITION_PROMPT_ABOVE: scala.Double = js.native
  var POSITION_PROMPT_BELOW: scala.Double = js.native
  var TAG: js.Any = js.native
  var WRAP_CONTENT: scala.Double = js.native
}

