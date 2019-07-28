package typings.androiduix.androidNs.appNs

import typings.androiduix.androidNs.appNs.ApplicationNs.ActivityLifecycleCallbacks
import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.osNs.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.Application")
@js.native
class Application () extends Context {
  var mActivityLifecycleCallbacks: js.Any = js.native
  var mWindowManager: js.Any = js.native
  /* private */ def collectActivityLifecycleCallbacks(): js.Any = js.native
  def dispatchActivityCreated(activity: Activity, savedInstanceState: Bundle): Unit = js.native
  def dispatchActivityDestroyed(activity: Activity): Unit = js.native
  def dispatchActivityPaused(activity: Activity): Unit = js.native
  def dispatchActivityResumed(activity: Activity): Unit = js.native
  def dispatchActivitySaveInstanceState(activity: Activity, outState: Bundle): Unit = js.native
  def dispatchActivityStarted(activity: Activity): Unit = js.native
  def dispatchActivityStopped(activity: Activity): Unit = js.native
  def onCreate(): Unit = js.native
  def registerActivityLifecycleCallbacks(callback: ActivityLifecycleCallbacks): Unit = js.native
  def unregisterActivityLifecycleCallbacks(callback: ActivityLifecycleCallbacks): Unit = js.native
}

