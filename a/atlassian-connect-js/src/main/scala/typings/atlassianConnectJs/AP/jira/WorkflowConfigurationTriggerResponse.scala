package typings.atlassianConnectJs.AP.jira

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowConfigurationTriggerResponse extends js.Object {
  
  /**
    * The result of the validation listener [WorkflowConfiguration.onSaveValidation]{@link WorkflowConfiguration.onSaveValidation}.
    */
  var valid: js.Any = js.native
  
  /**
    * The result of the [WorkflowConfiguration.onSave]{@link WorkflowConfiguration.onSave}.
    */
  var value: js.Any = js.native
}
object WorkflowConfigurationTriggerResponse {
  
  @scala.inline
  def apply(valid: js.Any, value: js.Any): WorkflowConfigurationTriggerResponse = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowConfigurationTriggerResponse]
  }
  
  @scala.inline
  implicit class WorkflowConfigurationTriggerResponseOps[Self <: WorkflowConfigurationTriggerResponse] (val x: Self) extends AnyVal {
    
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
    def setValid(value: js.Any): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
