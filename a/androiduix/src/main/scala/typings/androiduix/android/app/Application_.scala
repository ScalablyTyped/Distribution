package typings.androiduix.android.app

import typings.androiduix.android.app.Application.ActivityLifecycleCallbacks
import typings.androiduix.android.content.Context
import typings.androiduix.android.os.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application_ extends Context {
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

