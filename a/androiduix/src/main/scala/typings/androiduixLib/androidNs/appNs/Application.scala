package typings
package androiduixLib.androidNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.Application")
@js.native
class Application ()
  extends androiduixLib.androidNs.contentNs.Context {
  var mActivityLifecycleCallbacks: js.Any = js.native
  var mWindowManager: js.Any = js.native
  /* private */ def collectActivityLifecycleCallbacks(): js.Any = js.native
  def dispatchActivityCreated(activity: Activity, savedInstanceState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  def dispatchActivityDestroyed(activity: Activity): scala.Unit = js.native
  def dispatchActivityPaused(activity: Activity): scala.Unit = js.native
  def dispatchActivityResumed(activity: Activity): scala.Unit = js.native
  def dispatchActivitySaveInstanceState(activity: Activity, outState: androiduixLib.androidNs.osNs.Bundle): scala.Unit = js.native
  def dispatchActivityStarted(activity: Activity): scala.Unit = js.native
  def dispatchActivityStopped(activity: Activity): scala.Unit = js.native
  def onCreate(): scala.Unit = js.native
  def registerActivityLifecycleCallbacks(callback: androiduixLib.androidNs.appNs.ApplicationNs.ActivityLifecycleCallbacks): scala.Unit = js.native
  def unregisterActivityLifecycleCallbacks(callback: androiduixLib.androidNs.appNs.ApplicationNs.ActivityLifecycleCallbacks): scala.Unit = js.native
}

