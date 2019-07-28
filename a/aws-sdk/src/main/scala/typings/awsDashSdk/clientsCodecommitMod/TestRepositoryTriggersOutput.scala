package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRepositoryTriggersOutput extends js.Object {
  /**
    * The list of triggers that were not able to be tested. This list provides the names of the triggers that could not be tested, separated by commas.
    */
  var failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList] = js.undefined
  /**
    * The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.
    */
  var successfulExecutions: js.UndefOr[RepositoryTriggerNameList] = js.undefined
}

object TestRepositoryTriggersOutput {
  @scala.inline
  def apply(
    failedExecutions: RepositoryTriggerExecutionFailureList = null,
    successfulExecutions: RepositoryTriggerNameList = null
  ): TestRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    if (failedExecutions != null) __obj.updateDynamic("failedExecutions")(failedExecutions)
    if (successfulExecutions != null) __obj.updateDynamic("successfulExecutions")(successfulExecutions)
    __obj.asInstanceOf[TestRepositoryTriggersOutput]
  }
}

