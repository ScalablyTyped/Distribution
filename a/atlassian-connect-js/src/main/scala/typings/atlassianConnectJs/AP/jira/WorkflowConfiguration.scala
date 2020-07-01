package typings.atlassianConnectJs.AP.jira

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowConfiguration extends js.Object {
  /**
    * Attach a callback function to run when a workflow is saved
    * @param listener called on save.
    */
  def onSave(listener: js.Function1[/* listener */ js.Object, Unit]): Unit
  /**
    * Validate a workflow configuration before saving
    * @param listener called on validation. Return false to indicate that validation has not passed and the workflow cannot be saved.
    */
  def onSaveValidation(listener: js.Function1[/* listener */ js.Object, Unit]): Unit
  /**
    * Save a workflow configuration if valid.
    */
  def trigger(): WorkflowConfigurationTriggerResponse
}

object WorkflowConfiguration {
  @scala.inline
  def apply(
    onSave: js.Function1[/* listener */ js.Object, Unit] => Unit,
    onSaveValidation: js.Function1[/* listener */ js.Object, Unit] => Unit,
    trigger: () => WorkflowConfigurationTriggerResponse
  ): WorkflowConfiguration = {
    val __obj = js.Dynamic.literal(onSave = js.Any.fromFunction1(onSave), onSaveValidation = js.Any.fromFunction1(onSaveValidation), trigger = js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[WorkflowConfiguration]
  }
}

