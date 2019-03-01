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
    onActivityCreated: js.Function2[
      androiduixLib.androidNs.appNs.Activity, 
      androiduixLib.androidNs.osNs.Bundle, 
      scala.Unit
    ],
    onActivityDestroyed: js.Function1[androiduixLib.androidNs.appNs.Activity, scala.Unit],
    onActivityPaused: js.Function1[androiduixLib.androidNs.appNs.Activity, scala.Unit],
    onActivityResumed: js.Function1[androiduixLib.androidNs.appNs.Activity, scala.Unit],
    onActivitySaveInstanceState: js.Function2[
      androiduixLib.androidNs.appNs.Activity, 
      androiduixLib.androidNs.osNs.Bundle, 
      scala.Unit
    ],
    onActivityStarted: js.Function1[androiduixLib.androidNs.appNs.Activity, scala.Unit],
    onActivityStopped: js.Function1[androiduixLib.androidNs.appNs.Activity, scala.Unit]
  ): ActivityLifecycleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onActivityCreated")(onActivityCreated)
    __obj.updateDynamic("onActivityDestroyed")(onActivityDestroyed)
    __obj.updateDynamic("onActivityPaused")(onActivityPaused)
    __obj.updateDynamic("onActivityResumed")(onActivityResumed)
    __obj.updateDynamic("onActivitySaveInstanceState")(onActivitySaveInstanceState)
    __obj.updateDynamic("onActivityStarted")(onActivityStarted)
    __obj.updateDynamic("onActivityStopped")(onActivityStopped)
    __obj.asInstanceOf[ActivityLifecycleCallbacks]
  }
}

