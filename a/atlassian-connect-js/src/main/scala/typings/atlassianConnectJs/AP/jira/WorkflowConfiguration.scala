package typings.atlassianConnectJs.AP.jira

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowConfiguration extends js.Object {
  /**
    * Attach a callback function to run when a workflow is saved
    * @param listener called on save.
    */
  def onSave(listener: js.Function1[/* listener */ js.Object, Unit]): Unit = js.native
  /**
    * Validate a workflow configuration before saving
    * @param listener called on validation. Return false to indicate that validation has not passed and the workflow cannot be saved.
    */
  def onSaveValidation(listener: js.Function1[/* listener */ js.Object, Unit]): Unit = js.native
  /**
    * Save a workflow configuration if valid.
    */
  def trigger(): WorkflowConfigurationTriggerResponse = js.native
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
  @scala.inline
  implicit class WorkflowConfigurationOps[Self <: WorkflowConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnSave(value: js.Function1[/* listener */ js.Object, Unit] => Unit): Self = this.set("onSave", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSaveValidation(value: js.Function1[/* listener */ js.Object, Unit] => Unit): Self = this.set("onSaveValidation", js.Any.fromFunction1(value))
    @scala.inline
    def setTrigger(value: () => WorkflowConfigurationTriggerResponse): Self = this.set("trigger", js.Any.fromFunction0(value))
  }
  
}

