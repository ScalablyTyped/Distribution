package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskSubmitFailedEventDetails extends js.Object {
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.undefined
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.undefined
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name
}

object TaskSubmitFailedEventDetails {
  @scala.inline
  def apply(resource: Name, resourceType: Name, cause: SensitiveCause = null, error: SensitiveError = null): TaskSubmitFailedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource, resourceType = resourceType)
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[TaskSubmitFailedEventDetails]
  }
}

