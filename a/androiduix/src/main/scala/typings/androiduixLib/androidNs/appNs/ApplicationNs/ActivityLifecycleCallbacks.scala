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

