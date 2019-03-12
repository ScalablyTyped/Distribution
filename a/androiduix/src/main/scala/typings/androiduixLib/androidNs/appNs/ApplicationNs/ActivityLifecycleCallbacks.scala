package typings
package androiduixLib.androidNs.appNs.ApplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityLifecycleCallbacks extends js.Object {
  def onActivityCreated(
    activity: androiduixLib.androidNs.appNs.Activity,
    savedInstanceState: androiduixLib.androidNs.osNs.Bundle
  ): scala.Unit
  def onActivityDestroyed(activity: androiduixLib.androidNs.appNs.Activity): scala.Unit
  def onActivityPaused(activity: androiduixLib.androidNs.appNs.Activity): scala.Unit
  def onActivityResumed(activity: androiduixLib.androidNs.appNs.Activity): scala.Unit
  def onActivitySaveInstanceState(activity: androiduixLib.androidNs.appNs.Activity, outState: androiduixLib.androidNs.osNs.Bundle): scala.Unit
  def onActivityStarted(activity: androiduixLib.androidNs.appNs.Activity): scala.Unit
  def onActivityStopped(activity: androiduixLib.androidNs.appNs.Activity): scala.Unit
}

object ActivityLifecycleCallbacks {
  @scala.inline
  def apply(
    onActivityCreated: (androiduixLib.androidNs.appNs.Activity, androiduixLib.androidNs.osNs.Bundle) => scala.Unit,
    onActivityDestroyed: androiduixLib.androidNs.appNs.Activity => scala.Unit,
    onActivityPaused: androiduixLib.androidNs.appNs.Activity => scala.Unit,
    onActivityResumed: androiduixLib.androidNs.appNs.Activity => scala.Unit,
    onActivitySaveInstanceState: (androiduixLib.androidNs.appNs.Activity, androiduixLib.androidNs.osNs.Bundle) => scala.Unit,
    onActivityStarted: androiduixLib.androidNs.appNs.Activity => scala.Unit,
    onActivityStopped: androiduixLib.androidNs.appNs.Activity => scala.Unit
  ): ActivityLifecycleCallbacks = {
    val __obj = js.Dynamic.literal(onActivityCreated = js.Any.fromFunction2(onActivityCreated), onActivityDestroyed = js.Any.fromFunction1(onActivityDestroyed), onActivityPaused = js.Any.fromFunction1(onActivityPaused), onActivityResumed = js.Any.fromFunction1(onActivityResumed), onActivitySaveInstanceState = js.Any.fromFunction2(onActivitySaveInstanceState), onActivityStarted = js.Any.fromFunction1(onActivityStarted), onActivityStopped = js.Any.fromFunction1(onActivityStopped))
  
    __obj.asInstanceOf[ActivityLifecycleCallbacks]
  }
}

