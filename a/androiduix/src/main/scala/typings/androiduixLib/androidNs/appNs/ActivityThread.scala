package typings
package androiduixLib.androidNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.ActivityThread")
@js.native
class ActivityThread protected () extends js.Object {
  def this(androidUI: androiduixLib.androiduiNs.AndroidUI) = this()
  var activityResumeTimeout: js.Any = js.native
  var androidUI: androiduixLib.androiduiNs.AndroidUI = js.native
  var mLaunchedActivities: stdLib.Set[Activity] = js.native
  var overrideEnterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var overrideExitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var overrideHideAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var overrideResumeAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var scheduleApplicationHideTimeout: js.Any = js.native
  def canBackTo(intent: androiduixLib.androidNs.contentNs.Intent): scala.Boolean = js.native
  def execStartActivity(callActivity: Activity, intent: androiduixLib.androidNs.contentNs.Intent): scala.Unit = js.native
  def execStartActivity(
    callActivity: Activity,
    intent: androiduixLib.androidNs.contentNs.Intent,
    options: androiduixLib.androidNs.osNs.Bundle
  ): scala.Unit = js.native
  def getOverrideEnterAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getOverrideExitAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getOverrideHideAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getOverrideResumeAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  /* private */ def getVisibleToUserActivities(): js.Any = js.native
  /* private */ def handleDestroyActivity(activity: js.Any, finishing: js.Any): js.Any = js.native
  /* private */ def handleLaunchActivity(intent: js.Any): js.Any = js.native
  /* private */ def handlePauseActivity(activity: js.Any): js.Any = js.native
  /* private */ def handleResumeActivity(a: js.Any, launching: js.Any): js.Any = js.native
  /* private */ def handleStopActivity(activity: js.Any): js.Any = js.native
  /* private */ def handleStopActivity(activity: js.Any, show: js.Any): js.Any = js.native
  /* private */ def initWithPageStack(): js.Any = js.native
  /* private */ def isRootActivity(activity: js.Any): js.Any = js.native
  def overrideNextWindowAnimation(
    enterAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    exitAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    resumeAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation,
    hideAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation
  ): scala.Unit = js.native
  /* private */ def performDestroyActivity(activity: js.Any, finishing: js.Any): js.Any = js.native
  /* private */ def performLaunchActivity(intent: js.Any): js.Any = js.native
  /* private */ def performPauseActivity(activity: js.Any): js.Any = js.native
  /* private */ def performResumeActivity(a: js.Any, launching: js.Any): js.Any = js.native
  /* private */ def performStopActivity(activity: js.Any, saveState: js.Any): js.Any = js.native
  def scheduleActivityResume(): scala.Unit = js.native
  def scheduleApplicationHide(): scala.Unit = js.native
  def scheduleApplicationShow(): scala.Unit = js.native
  def scheduleBackTo(intent: androiduixLib.androidNs.contentNs.Intent): scala.Boolean = js.native
  def scheduleBackToRoot(): scala.Unit = js.native
  def scheduleDestroyActivity(activity: Activity): scala.Unit = js.native
  def scheduleDestroyActivity(activity: Activity, finishing: scala.Boolean): scala.Unit = js.native
  def scheduleDestroyActivityByRequestCode(requestCode: scala.Double): scala.Unit = js.native
  def scheduleLaunchActivity(callActivity: Activity, intent: androiduixLib.androidNs.contentNs.Intent): scala.Unit = js.native
  def scheduleLaunchActivity(
    callActivity: Activity,
    intent: androiduixLib.androidNs.contentNs.Intent,
    options: androiduixLib.androidNs.osNs.Bundle
  ): scala.Unit = js.native
  /* private */ def updateVisibility(activity: js.Any, show: js.Any): js.Any = js.native
}

@JSGlobal("android.app.ActivityThread")
@js.native
object ActivityThread extends js.Object {
  /* private */ def getActivityName(activity: js.Any): js.Any = js.native
}

