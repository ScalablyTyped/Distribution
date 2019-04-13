package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleEvent extends js.Object {
  /**
    * Diagnostic information about the deployment lifecycle event.
    */
  var diagnostics: js.UndefOr[Diagnostics] = js.undefined
  /**
    * A timestamp that indicates when the deployment lifecycle event ended.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
    */
  var lifecycleEventName: js.UndefOr[LifecycleEventName] = js.undefined
  /**
    * A timestamp that indicates when the deployment lifecycle event started.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The deployment lifecycle event status:   Pending: The deployment lifecycle event is pending.   InProgress: The deployment lifecycle event is in progress.   Succeeded: The deployment lifecycle event ran successfully.   Failed: The deployment lifecycle event has failed.   Skipped: The deployment lifecycle event has been skipped.   Unknown: The deployment lifecycle event is unknown.  
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.undefined
}

object LifecycleEvent {
  @scala.inline
  def apply(
    diagnostics: Diagnostics = null,
    endTime: Timestamp = null,
    lifecycleEventName: LifecycleEventName = null,
    startTime: Timestamp = null,
    status: LifecycleEventStatus = null
  ): LifecycleEvent = {
    val __obj = js.Dynamic.literal()
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (lifecycleEventName != null) __obj.updateDynamic("lifecycleEventName")(lifecycleEventName)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleEvent]
  }
}

