package typings
package androiduixLib.androidNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.Dialog")
@js.native
class Dialog protected ()
  extends androiduixLib.androidNs.contentNs.DialogInterface
     with androiduixLib.androidNs.viewNs.WindowNs.Callback
     with androiduixLib.androidNs.viewNs.KeyEventNs.Callback {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, cancelable: scala.Boolean) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, cancelable: scala.Boolean, cancelListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnCancelListener) = this()
  var mCancelAndDismissTaken: js.Any = js.native
  var mCancelMessage: js.Any = js.native
  var mCancelable: scala.Boolean = js.native
  var mCanceled: js.Any = js.native
  var mContext: androiduixLib.androidNs.contentNs.Context = js.native
  var mCreated: js.Any = js.native
  var mDecor: androiduixLib.androidNs.viewNs.View = js.native
  var mDismissAction: js.Any = js.native
  var mDismissMessage: js.Any = js.native
  var mHandler: js.Any = js.native
  var mListenersHandler: js.Any = js.native
  var mOnKeyListener: js.Any = js.native
  var mShowMessage: js.Any = js.native
  var mShowing: js.Any = js.native
  var mWindow: androiduixLib.androidNs.viewNs.Window = js.native
  var mWindowManager: androiduixLib.androidNs.viewNs.WindowManager = js.native
  def addContentView(
    view: androiduixLib.androidNs.viewNs.View,
    params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams
  ): scala.Unit = js.native
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def dismiss(): scala.Unit = js.native
  def dismissDialog(): scala.Unit = js.native
  /* CompleteClass */
  override def dispatchGenericMotionEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def dispatchKeyEvent(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def dispatchOnCreate(savedInstanceState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  /* CompleteClass */
  override def dispatchTouchEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  def findViewById(id: java.lang.String): androiduixLib.androidNs.viewNs.View = js.native
  def getContext(): androiduixLib.androidNs.contentNs.Context = js.native
  def getCurrentFocus(): androiduixLib.androidNs.viewNs.View = js.native
  def getLayoutInflater(): androiduixLib.androidNs.viewNs.LayoutInflater = js.native
  def getWindow(): androiduixLib.androidNs.viewNs.Window = js.native
  def hide(): scala.Unit = js.native
  def isShowing(): scala.Boolean = js.native
  /* CompleteClass */
  override def onAttachedToWindow(): scala.Unit = js.native
  def onBackPressed(): scala.Unit = js.native
  /* CompleteClass */
  override def onContentChanged(): scala.Unit = js.native
  /* protected */ def onCreate(savedInstanceState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  /* CompleteClass */
  override def onDetachedFromWindow(): scala.Unit = js.native
  def onGenericMotionEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyDown(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyLongPress(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def onKeyMultiple(keyCode: scala.Double, repeatCount: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyUp(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* protected */ def onStart(): scala.Unit = js.native
  /* protected */ def onStop(): scala.Unit = js.native
  def onTouchEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  def onTrackballEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onWindowAttributesChanged(attrs: androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams): scala.Unit = js.native
  /* CompleteClass */
  override def onWindowFocusChanged(hasFocus: scala.Boolean): scala.Unit = js.native
  /* private */ def sendDismissMessage(): js.Any = js.native
  /* private */ def sendShowMessage(): js.Any = js.native
  def setCancelMessage(msg: androiduixLib.androidNs.osNs.Message): scala.Unit = js.native
  def setCancelable(flag: scala.Boolean): scala.Unit = js.native
  def setCanceledOnTouchOutside(cancel: scala.Boolean): scala.Unit = js.native
  def setContentView(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setContentView(
    view: androiduixLib.androidNs.viewNs.View,
    params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams
  ): scala.Unit = js.native
  def setDismissMessage(msg: androiduixLib.androidNs.osNs.Message): scala.Unit = js.native
  def setOnCancelListener(listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnCancelListener): scala.Unit = js.native
  def setOnDismissListener(listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnDismissListener): scala.Unit = js.native
  def setOnKeyListener(onKeyListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnKeyListener): scala.Unit = js.native
  def setOnShowListener(listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnShowListener): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def takeCancelAndDismissListeners(
    msg: java.lang.String,
    cancel: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnCancelListener,
    dismiss: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnDismissListener
  ): scala.Boolean = js.native
  def takeKeyEvents(get: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.app.Dialog")
@js.native
object Dialog extends js.Object {
  var CANCEL: js.Any = js.native
  var DIALOG_HIERARCHY_TAG: js.Any = js.native
  var DIALOG_SHOWING_TAG: js.Any = js.native
  var DISMISS: js.Any = js.native
  var SHOW: js.Any = js.native
  var TAG: js.Any = js.native
}

