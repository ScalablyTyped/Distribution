package typings.atlassianConnectJs.AP.jira

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowConfigurationTriggerResponse extends js.Object {
  /**
    * The result of the validation listener [WorkflowConfiguration.onSaveValidation]{@link WorkflowConfiguration.onSaveValidation}.
    */
  var valid: js.Any
  /**
    * The result of the [WorkflowConfiguration.onSave]{@link WorkflowConfiguration.onSave}.
    */
  var value: js.Any
}

object WorkflowConfigurationTriggerResponse {
  @scala.inline
  def apply(valid: js.Any, value: js.Any): WorkflowConfigurationTriggerResponse = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowConfigurationTriggerResponse]
  }
}

