package typings.androiduix.android.app

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.Intent
import typings.androiduix.android.os.Bundle
import typings.androiduix.android.view.MenuItem
import typings.androiduix.android.view.Menu_
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.Window
import typings.androiduix.android.view.Window.Callback
import typings.androiduix.android.view.WindowManager
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.view.menu.MenuPopupHelper
import typings.androiduix.java_.lang.Runnable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity
  extends Context
     with Callback
     with typings.androiduix.android.view.KeyEvent.Callback {
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
  def addContentView(view: View, params: LayoutParams): Unit = js.native
  def closeOptionsMenu(): Unit = js.native
  def dispatchActivityResult(who: String, requestCode: Double, resultCode: Double, data: Intent): Unit = js.native
  def findViewById(id: String): View = js.native
  def finish(): Unit = js.native
  def finishActivity(requestCode: Double): Unit = js.native
  def getApplication(): Application = js.native
  def getCallingActivity(): String = js.native
  def getCurrentFocus(): View = js.native
  def getGlobalWindowManager(): WindowManager = js.native
  def getIntent(): Intent = js.native
  def getTitle(): String = js.native
  def getWindow(): Window = js.native
  def hasWindowFocus(): Boolean = js.native
  /* private */ def invalidateOptionsMenu(): js.Any = js.native
  /* protected */ def invalidateOptionsMenuPopupHelper(menu: Menu_): MenuPopupHelper = js.native
  def isDestroyed(): Boolean = js.native
  def isFinishing(): Boolean = js.native
  def isResumed(): Boolean = js.native
  def makeVisible(): Unit = js.native
  def navigateUpTo(upIntent: Intent): Boolean = js.native
  def navigateUpTo(upIntent: Intent, upToRootIfNotFound: Boolean): Boolean = js.native
  /* protected */ def onActivityResult(requestCode: Double, resultCode: Double, data: Intent): Unit = js.native
  def onBackPressed(): Unit = js.native
  /* protected */ def onCreate(): Unit = js.native
  /* protected */ def onCreate(savedInstanceState: Bundle): Unit = js.native
  def onCreateOptionsMenu(menu: Menu_): Boolean = js.native
  /* protected */ def onDestroy(): Unit = js.native
  def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
  /* protected */ def onNewIntent(intent: Intent): Unit = js.native
  def onOptionsItemSelected(item: MenuItem): Boolean = js.native
  def onOptionsMenuClosed(menu: Menu_): Unit = js.native
  /* protected */ def onPause(): Unit = js.native
  /* protected */ def onPostCreate(savedInstanceState: Bundle): Unit = js.native
  /* protected */ def onPostResume(): Unit = js.native
  def onPrepareOptionsMenu(menu: Menu_): Boolean = js.native
  /* protected */ def onRestart(): Unit = js.native
  /* protected */ def onRestoreInstanceState(savedInstanceState: Bundle): Unit = js.native
  /* protected */ def onResume(): Unit = js.native
  /* protected */ def onSaveInstanceState(outState: Bundle): Unit = js.native
  /* protected */ def onStart(): Unit = js.native
  /* protected */ def onStop(): Unit = js.native
  /* protected */ def onTitleChanged(title: String): Unit = js.native
  /* protected */ def onTitleChanged(title: String, color: Double): Unit = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
  def onUserInteraction(): Unit = js.native
  /* protected */ def onUserLeaveHint(): Unit = js.native
  def openOptionsMenu(): Unit = js.native
  def overrideNextTransition(
    enterAnimation: Animation,
    exitAnimation: Animation,
    resumeAnimation: Animation,
    hideAnimation: Animation
  ): Unit = js.native
  /* private */ def performCreate(icicle: js.Any): js.Any = js.native
  /* private */ def performDestroy(): js.Any = js.native
  /* private */ def performPause(): js.Any = js.native
  /* private */ def performRestart(): js.Any = js.native
  def performRestoreInstanceState(savedInstanceState: Bundle): Unit = js.native
  /* private */ def performResume(): js.Any = js.native
  def performSaveInstanceState(outState: Bundle): Unit = js.native
  /* private */ def performStart(): js.Any = js.native
  /* private */ def performStop(): js.Any = js.native
  /* private */ def performUserLeaving(): js.Any = js.native
  def runOnUiThread(action: Runnable): Unit = js.native
  def setContentView(view: String): Unit = js.native
  def setContentView(view: String, params: LayoutParams): Unit = js.native
  def setContentView(view: View): Unit = js.native
  def setContentView(view: View, params: LayoutParams): Unit = js.native
  def setContentView(view: HTMLElement): Unit = js.native
  def setContentView(view: HTMLElement, params: LayoutParams): Unit = js.native
  def setFinishOnTouchOutside(finish: Boolean): Unit = js.native
  def setIntent(newIntent: Intent): Unit = js.native
  def setResult(resultCode: Double): Unit = js.native
  def setResult(resultCode: Double, data: Intent): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def startActivities(intents: js.Array[Intent]): Unit = js.native
  def startActivities(intents: js.Array[Intent], options: Bundle): Unit = js.native
  def startActivity(intent: String): Unit = js.native
  def startActivity(intent: String, options: Bundle): Unit = js.native
  def startActivity(intent: Intent): Unit = js.native
  def startActivity(intent: Intent, options: Bundle): Unit = js.native
  def startActivityForResult(intent: String, requestCode: Double): Unit = js.native
  def startActivityForResult(intent: String, requestCode: Double, options: Bundle): Unit = js.native
  def startActivityForResult(intent: Intent, requestCode: Double): Unit = js.native
  def startActivityForResult(intent: Intent, requestCode: Double, options: Bundle): Unit = js.native
  def startActivityIfNeeded(intent: Intent, requestCode: Double): Boolean = js.native
  def startActivityIfNeeded(intent: Intent, requestCode: Double, options: Bundle): Boolean = js.native
  def takeKeyEvents(_get: Boolean): Unit = js.native
}

