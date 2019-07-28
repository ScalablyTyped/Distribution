package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryTriggerExecutionFailure extends js.Object {
  /**
    * Additional message information about the trigger that did not run.
    */
  var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage] = js.undefined
  /**
    * The name of the trigger that did not run.
    */
  var trigger: js.UndefOr[RepositoryTriggerName] = js.undefined
}

object RepositoryTriggerExecutionFailure {
  @scala.inline
  def apply(
    failureMessage: RepositoryTriggerExecutionFailureMessage = null,
    trigger: RepositoryTriggerName = null
  ): RepositoryTriggerExecutionFailure = {
    val __obj = js.Dynamic.literal()
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
  }
}

