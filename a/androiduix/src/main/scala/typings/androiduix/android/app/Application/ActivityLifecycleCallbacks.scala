package typings.androiduix.android.app.Application

import typings.androiduix.android.app.Activity
import typings.androiduix.android.os.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityLifecycleCallbacks extends js.Object {
  def onActivityCreated(activity: Activity, savedInstanceState: Bundle): Unit
  def onActivityDestroyed(activity: Activity): Unit
  def onActivityPaused(activity: Activity): Unit
  def onActivityResumed(activity: Activity): Unit
  def onActivitySaveInstanceState(activity: Activity, outState: Bundle): Unit
  def onActivityStarted(activity: Activity): Unit
  def onActivityStopped(activity: Activity): Unit
}

object ActivityLifecycleCallbacks {
  @scala.inline
  def apply(
    onActivityCreated: (Activity, Bundle) => Unit,
    onActivityDestroyed: Activity => Unit,
    onActivityPaused: Activity => Unit,
    onActivityResumed: Activity => Unit,
    onActivitySaveInstanceState: (Activity, Bundle) => Unit,
    onActivityStarted: Activity => Unit,
    onActivityStopped: Activity => Unit
  ): ActivityLifecycleCallbacks = {
    val __obj = js.Dynamic.literal(onActivityCreated = js.Any.fromFunction2(onActivityCreated), onActivityDestroyed = js.Any.fromFunction1(onActivityDestroyed), onActivityPaused = js.Any.fromFunction1(onActivityPaused), onActivityResumed = js.Any.fromFunction1(onActivityResumed), onActivitySaveInstanceState = js.Any.fromFunction2(onActivitySaveInstanceState), onActivityStarted = js.Any.fromFunction1(onActivityStarted), onActivityStopped = js.Any.fromFunction1(onActivityStopped))
  
    __obj.asInstanceOf[ActivityLifecycleCallbacks]
  }
}

