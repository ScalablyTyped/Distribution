package typings.androiduix.androidNs.appNs

import typings.androiduix.androidNs.contentNs.Intent
import typings.androiduix.androidNs.osNs.Bundle
import typings.androiduix.androidNs.viewNs.animationNs.Animation
import typings.androiduix.androiduiNs.AndroidUI
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.ActivityThread")
@js.native
class ActivityThread protected () extends js.Object {
  def this(androidUI: AndroidUI) = this()
  var activityResumeTimeout: js.Any = js.native
  var androidUI: AndroidUI = js.native
  var mLaunchedActivities: Set[Activity] = js.native
  var overrideEnterAnimation: Animation = js.native
  var overrideExitAnimation: Animation = js.native
  var overrideHideAnimation: Animation = js.native
  var overrideResumeAnimation: Animation = js.native
  var scheduleApplicationHideTimeout: js.Any = js.native
  def canBackTo(intent: Intent): Boolean = js.native
  def execStartActivity(callActivity: Activity, intent: Intent): Unit = js.native
  def execStartActivity(callActivity: Activity, intent: Intent, options: Bundle): Unit = js.native
  def getOverrideEnterAnimation(): Animation = js.native
  def getOverrideExitAnimation(): Animation = js.native
  def getOverrideHideAnimation(): Animation = js.native
  def getOverrideResumeAnimation(): Animation = js.native
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
    enterAnimation: Animation,
    exitAnimation: Animation,
    resumeAnimation: Animation,
    hideAnimation: Animation
  ): Unit = js.native
  /* private */ def performDestroyActivity(activity: js.Any, finishing: js.Any): js.Any = js.native
  /* private */ def performLaunchActivity(intent: js.Any): js.Any = js.native
  /* private */ def performPauseActivity(activity: js.Any): js.Any = js.native
  /* private */ def performResumeActivity(a: js.Any, launching: js.Any): js.Any = js.native
  /* private */ def performStopActivity(activity: js.Any, saveState: js.Any): js.Any = js.native
  def scheduleActivityResume(): Unit = js.native
  def scheduleApplicationHide(): Unit = js.native
  def scheduleApplicationShow(): Unit = js.native
  def scheduleBackTo(intent: Intent): Boolean = js.native
  def scheduleBackToRoot(): Unit = js.native
  def scheduleDestroyActivity(activity: Activity): Unit = js.native
  def scheduleDestroyActivity(activity: Activity, finishing: Boolean): Unit = js.native
  def scheduleDestroyActivityByRequestCode(requestCode: Double): Unit = js.native
  def scheduleLaunchActivity(callActivity: Activity, intent: Intent): Unit = js.native
  def scheduleLaunchActivity(callActivity: Activity, intent: Intent, options: Bundle): Unit = js.native
  /* private */ def updateVisibility(activity: js.Any, show: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.app.ActivityThread")
@js.native
object ActivityThread extends js.Object {
  /* private */ def getActivityName(activity: js.Any): js.Any = js.native
}

