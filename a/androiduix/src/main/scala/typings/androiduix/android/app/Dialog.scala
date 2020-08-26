package typings.androiduix.android.app

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.DialogInterface
import typings.androiduix.android.content.DialogInterface.OnCancelListener
import typings.androiduix.android.content.DialogInterface.OnDismissListener
import typings.androiduix.android.content.DialogInterface.OnKeyListener
import typings.androiduix.android.content.DialogInterface.OnShowListener
import typings.androiduix.android.os.Bundle
import typings.androiduix.android.os.Handler
import typings.androiduix.android.os.Message
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.LayoutInflater
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.Window
import typings.androiduix.android.view.Window.Callback
import typings.androiduix.android.view.WindowManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog
  extends DialogInterface
     with Callback
     with typings.androiduix.android.view.KeyEvent.Callback {
  var mCancelAndDismissTaken: js.Any = js.native
  var mCancelMessage: js.Any = js.native
  var mCancelable: Boolean = js.native
  var mCanceled: js.Any = js.native
  var mContext: Context = js.native
  var mCreated: js.Any = js.native
  var mDecor: View = js.native
  var mDismissAction: js.Any = js.native
  var mDismissMessage: js.Any = js.native
  var mHandler: js.Any = js.native
  var mListenersHandler: js.Any = js.native
  var mOnKeyListener: js.Any = js.native
  var mShowMessage: js.Any = js.native
  var mShowing: js.Any = js.native
  var mWindow: Window = js.native
  var mWindowManager: WindowManager = js.native
  def addContentView(view: View, params: LayoutParams): Unit = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  /* InferMemberOverrides */
  override def dismiss(): Unit = js.native
  def dismissDialog(): Unit = js.native
  def dispatchOnCreate(savedInstanceState: Bundle): Unit = js.native
  def findViewById(id: String): View = js.native
  def getContext(): Context = js.native
  def getCurrentFocus(): View = js.native
  def getLayoutInflater(): LayoutInflater = js.native
  def getWindow(): Window = js.native
  def hide(): Unit = js.native
  def isShowing(): Boolean = js.native
  def onBackPressed(): Unit = js.native
  /* protected */ def onCreate(savedInstanceState: Bundle): Unit = js.native
  def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
  def onKeyMultiple(keyCode: Double, repeatCount: Double, event: KeyEvent): Boolean = js.native
  /* protected */ def onStart(): Unit = js.native
  /* protected */ def onStop(): Unit = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
  def onTrackballEvent(event: MotionEvent): Boolean = js.native
  /* private */ def sendDismissMessage(): js.Any = js.native
  /* private */ def sendShowMessage(): js.Any = js.native
  def setCancelMessage(msg: Message): Unit = js.native
  def setCancelable(flag: Boolean): Unit = js.native
  def setCanceledOnTouchOutside(cancel: Boolean): Unit = js.native
  def setContentView(view: View): Unit = js.native
  def setContentView(view: View, params: LayoutParams): Unit = js.native
  def setDismissMessage(msg: Message): Unit = js.native
  def setOnCancelListener(listener: OnCancelListener): Unit = js.native
  def setOnDismissListener(listener: OnDismissListener): Unit = js.native
  def setOnKeyListener(onKeyListener: OnKeyListener): Unit = js.native
  def setOnShowListener(listener: OnShowListener): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def show(): Unit = js.native
  def takeCancelAndDismissListeners(msg: String, cancel: OnCancelListener, dismiss: OnDismissListener): Boolean = js.native
  def takeKeyEvents(get: Boolean): Unit = js.native
}

@JSGlobal("android.app.Dialog")
@js.native
object Dialog extends js.Object {
  @js.native
  trait ListenersHandler extends Handler {
    var mDialog: js.Any = js.native
  }
  
}

