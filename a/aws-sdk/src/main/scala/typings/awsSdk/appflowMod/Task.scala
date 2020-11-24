package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends js.Object {
  
  /**
    *  The operation to be performed on the provided source fields. 
    */
  var connectorOperator: js.UndefOr[ConnectorOperator] = js.native
  
  /**
    *  A field in a destination connector, or a field value against which Amazon AppFlow validates a source field. 
    */
  var destinationField: js.UndefOr[DestinationField] = js.native
  
  /**
    *  The source fields to which a particular task is applied. 
    */
  var sourceFields: SourceFields = js.native
  
  /**
    *  A map used to store task-related information. The execution service looks for particular information based on the TaskType. 
    */
  var taskProperties: js.UndefOr[TaskPropertiesMap] = js.native
  
  /**
    *  Specifies the particular task implementation that Amazon AppFlow performs. 
    */
  var taskType: TaskType = js.native
}
object Task {
  
  @scala.inline
  def apply(sourceFields: SourceFields, taskType: TaskType): Task = {
    val __obj = js.Dynamic.literal(sourceFields = sourceFields.asInstanceOf[js.Any], taskType = taskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourceFieldsVarargs(value: String*): Self = this.set("sourceFields", js.Array(value :_*))
    
    @scala.inline
    def setSourceFields(value: SourceFields): Self = this.set("sourceFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskType(value: TaskType): Self = this.set("taskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorOperator(value: ConnectorOperator): Self = this.set("connectorOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorOperator: Self = this.set("connectorOperator", js.undefined)
    
    @scala.inline
    def setDestinationField(value: DestinationField): Self = this.set("destinationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationField: Self = this.set("destinationField", js.undefined)
    
    @scala.inline
    def setTaskProperties(value: TaskPropertiesMap): Self = this.set("taskProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskProperties: Self = this.set("taskProperties", js.undefined)
  }
}
