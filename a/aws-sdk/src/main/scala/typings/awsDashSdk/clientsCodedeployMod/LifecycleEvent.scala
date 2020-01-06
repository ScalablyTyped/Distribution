package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleEvent extends js.Object {
  /**
    * Diagnostic information about the deployment lifecycle event.
    */
  var diagnostics: js.UndefOr[Diagnostics] = js.native
  /**
    * A timestamp that indicates when the deployment lifecycle event ended.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
    */
  var lifecycleEventName: js.UndefOr[LifecycleEventName] = js.native
  /**
    * A timestamp that indicates when the deployment lifecycle event started.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * The deployment lifecycle event status:   Pending: The deployment lifecycle event is pending.   InProgress: The deployment lifecycle event is in progress.   Succeeded: The deployment lifecycle event ran successfully.   Failed: The deployment lifecycle event has failed.   Skipped: The deployment lifecycle event has been skipped.   Unknown: The deployment lifecycle event is unknown.  
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.native
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
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (lifecycleEventName != null) __obj.updateDynamic("lifecycleEventName")(lifecycleEventName.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleEvent]
  }
}

