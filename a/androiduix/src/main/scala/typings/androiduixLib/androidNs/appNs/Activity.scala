package typings
package androiduixLib.androidNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.Activity")
@js.native
class Activity protected ()
  extends androiduixLib.androidNs.contentNs.Context
     with androiduixLib.androidNs.viewNs.WindowNs.Callback
     with androiduixLib.androidNs.viewNs.KeyEventNs.Callback {
  def this(androidUI: androiduixLib.androiduiNs.AndroidUI) = this()
  var mCallActivity: js.Any = js.native
  var mCalled: js.Any = js.native
  var mDestroyed: js.Any = js.native
  var mFinished: js.Any = js.native
  var mIntent: js.Any = js.native
  var mMenu: js.Any = js.native
  var mMenuPopuoHelper: js.Any = js.native
  var mResultCode: js.Any = js.native
  var mResultData: js.Any = js.native
  var mResumed: js.Any = js.native
  var mStartedActivity: js.Any = js.native
  var mStopped: js.Any = js.native
  var mVisibleFromClient: js.Any = js.native
  var mWindow: js.Any = js.native
  var mWindowAdded: js.Any = js.native
  def addContentView(
    view: androiduixLib.androidNs.viewNs.View,
    params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams
  ): scala.Unit = js.native
  def closeOptionsMenu(): scala.Unit = js.native
  def dispatchActivityResult(
    who: java.lang.String,
    requestCode: scala.Double,
    resultCode: scala.Double,
    data: androiduixLib.androidNs.contentNs.Intent
  ): scala.Unit = js.native
  /* CompleteClass */
  override def dispatchGenericMotionEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def dispatchKeyEvent(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def dispatchTouchEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  def findViewById(id: java.lang.String): androiduixLib.androidNs.viewNs.View = js.native
  def finish(): scala.Unit = js.native
  def finishActivity(requestCode: scala.Double): scala.Unit = js.native
  def getApplication(): Application = js.native
  def getCallingActivity(): java.lang.String = js.native
  def getCurrentFocus(): androiduixLib.androidNs.viewNs.View = js.native
  def getGlobalWindowManager(): androiduixLib.androidNs.viewNs.WindowManager = js.native
  def getIntent(): androiduixLib.androidNs.contentNs.Intent = js.native
  def getTitle(): java.lang.String = js.native
  def getWindow(): androiduixLib.androidNs.viewNs.Window = js.native
  def hasWindowFocus(): scala.Boolean = js.native
  /* private */ def invalidateOptionsMenu(): js.Any = js.native
  /* protected */ def invalidateOptionsMenuPopupHelper(menu: androiduixLib.androidNs.viewNs.Menu): androiduixLib.androidNs.viewNs.menuNs.MenuPopupHelper = js.native
  def isDestroyed(): scala.Boolean = js.native
  def isFinishing(): scala.Boolean = js.native
  def isResumed(): scala.Boolean = js.native
  def makeVisible(): scala.Unit = js.native
  def navigateUpTo(upIntent: androiduixLib.androidNs.contentNs.Intent): scala.Boolean = js.native
  def navigateUpTo(upIntent: androiduixLib.androidNs.contentNs.Intent, upToRootIfNotFound: scala.Boolean): scala.Boolean = js.native
  /* protected */ def onActivityResult(
    requestCode: scala.Double,
    resultCode: scala.Double,
    data: androiduixLib.androidNs.contentNs.Intent
  ): scala.Unit = js.native
  /* CompleteClass */
  override def onAttachedToWindow(): scala.Unit = js.native
  def onBackPressed(): scala.Unit = js.native
  /* CompleteClass */
  override def onContentChanged(): scala.Unit = js.native
  /* protected */ def onCreate(): scala.Unit = js.native
  /* protected */ def onCreate(savedInstanceState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  def onCreateOptionsMenu(menu: androiduixLib.androidNs.viewNs.Menu): scala.Boolean = js.native
  /* protected */ def onDestroy(): scala.Unit = js.native
  /* CompleteClass */
  override def onDetachedFromWindow(): scala.Unit = js.native
  def onGenericMotionEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyDown(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyLongPress(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyUp(keyCode: scala.Double, event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  /* protected */ def onNewIntent(intent: androiduixLib.androidNs.contentNs.Intent): scala.Unit = js.native
  def onOptionsItemSelected(item: androiduixLib.androidNs.viewNs.MenuItem): scala.Boolean = js.native
  def onOptionsMenuClosed(menu: androiduixLib.androidNs.viewNs.Menu): scala.Unit = js.native
  /* protected */ def onPause(): scala.Unit = js.native
  /* protected */ def onPostCreate(savedInstanceState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  /* protected */ def onPostResume(): scala.Unit = js.native
  def onPrepareOptionsMenu(menu: androiduixLib.androidNs.viewNs.Menu): scala.Boolean = js.native
  /* protected */ def onRestart(): scala.Unit = js.native
  /* protected */ def onRestoreInstanceState(savedInstanceState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  /* protected */ def onResume(): scala.Unit = js.native
  /* protected */ def onSaveInstanceState(outState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  /* protected */ def onStart(): scala.Unit = js.native
  /* protected */ def onStop(): scala.Unit = js.native
  /* protected */ def onTitleChanged(title: java.lang.String): scala.Unit = js.native
  /* protected */ def onTitleChanged(title: java.lang.String, color: scala.Double): scala.Unit = js.native
  def onTouchEvent(event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  def onUserInteraction(): scala.Unit = js.native
  /* protected */ def onUserLeaveHint(): scala.Unit = js.native
  /* CompleteClass */
  override def onWindowAttributesChanged(attrs: androiduixLib.androidNs.viewNs.WindowManagerNs.LayoutParams): scala.Unit = js.native
  /* CompleteClass */
  override def onWindowFocusChanged(hasFocus: scala.Boolean): scala.Unit = js.native
  def openOptionsMenu(): scala.Unit = js.native
  def overrideNextTransition(
    enterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    exitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    resumeAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    hideAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation
  ): scala.Unit = js.native
  /* private */ def performCreate(icicle: js.Any): js.Any = js.native
  /* private */ def performDestroy(): js.Any = js.native
  /* private */ def performPause(): js.Any = js.native
  /* private */ def performRestart(): js.Any = js.native
  def performRestoreInstanceState(savedInstanceState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  /* private */ def performResume(): js.Any = js.native
  def performSaveInstanceState(outState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  /* private */ def performStart(): js.Any = js.native
  /* private */ def performStop(): js.Any = js.native
  /* private */ def performUserLeaving(): js.Any = js.native
  def runOnUiThread(action: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
  def setContentView(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setContentView(
    view: androiduixLib.androidNs.viewNs.View,
    params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams
  ): scala.Unit = js.native
  def setContentView(view: java.lang.String): scala.Unit = js.native
  def setContentView(view: java.lang.String, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Unit = js.native
  def setContentView(view: stdLib.HTMLElement): scala.Unit = js.native
  def setContentView(view: stdLib.HTMLElement, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Unit = js.native
  def setFinishOnTouchOutside(finish: scala.Boolean): scala.Unit = js.native
  def setIntent(newIntent: androiduixLib.androidNs.contentNs.Intent): scala.Unit = js.native
  def setResult(resultCode: scala.Double): scala.Unit = js.native
  def setResult(resultCode: scala.Double, data: androiduixLib.androidNs.contentNs.Intent): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def startActivities(intents: js.Array[androiduixLib.androidNs.contentNs.Intent]): scala.Unit = js.native
  def startActivities(
    intents: js.Array[androiduixLib.androidNs.contentNs.Intent],
    options: androiduixLib.androidNs.osNs.Bundle
  ): scala.Unit = js.native
  def startActivity(intent: androiduixLib.androidNs.contentNs.Intent): scala.Unit = js.native
  def startActivity(intent: androiduixLib.androidNs.contentNs.Intent, options: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  def startActivity(intent: java.lang.String): scala.Unit = js.native
  def startActivity(intent: java.lang.String, options: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  def startActivityForResult(intent: androiduixLib.androidNs.contentNs.Intent, requestCode: scala.Double): scala.Unit = js.native
  def startActivityForResult(
    intent: androiduixLib.androidNs.contentNs.Intent,
    requestCode: scala.Double,
    options: androiduixLib.androidNs.osNs.Bundle
  ): scala.Unit = js.native
  def startActivityForResult(intent: java.lang.String, requestCode: scala.Double): scala.Unit = js.native
  def startActivityForResult(intent: java.lang.String, requestCode: scala.Double, options: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  def startActivityIfNeeded(intent: androiduixLib.androidNs.contentNs.Intent, requestCode: scala.Double): scala.Boolean = js.native
  def startActivityIfNeeded(
    intent: androiduixLib.androidNs.contentNs.Intent,
    requestCode: scala.Double,
    options: androiduixLib.androidNs.osNs.Bundle
  ): scala.Boolean = js.native
  def takeKeyEvents(_get: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("android.app.Activity")
@js.native
object Activity extends js.Object {
  var DEBUG_LIFECYCLE: js.Any = js.native
  var RESULT_CANCELED: scala.Double = js.native
  var RESULT_FIRST_USER: scala.Double = js.native
  var RESULT_OK: scala.Double = js.native
  var TAG: js.Any = js.native
}

