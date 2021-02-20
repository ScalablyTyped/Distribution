package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends StObject {
  
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
  implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorOperator(value: ConnectorOperator): Self = StObject.set(x, "connectorOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorOperatorUndefined: Self = StObject.set(x, "connectorOperator", js.undefined)
    
    @scala.inline
    def setDestinationField(value: DestinationField): Self = StObject.set(x, "destinationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationFieldUndefined: Self = StObject.set(x, "destinationField", js.undefined)
    
    @scala.inline
    def setSourceFields(value: SourceFields): Self = StObject.set(x, "sourceFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFieldsVarargs(value: String*): Self = StObject.set(x, "sourceFields", js.Array(value :_*))
    
    @scala.inline
    def setTaskProperties(value: TaskPropertiesMap): Self = StObject.set(x, "taskProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskPropertiesUndefined: Self = StObject.set(x, "taskProperties", js.undefined)
    
    @scala.inline
    def setTaskType(value: TaskType): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
  }
}
