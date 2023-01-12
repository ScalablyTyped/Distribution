package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskInput extends StObject {
  
  /**
    * A token ensuring that the action is called only once with the specified details.
    */
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The task to be performed. Only one task is executed on a device at a time.
    */
  var command: Command
  
  /**
    * A description of the task and its targets.
    */
  var description: js.UndefOr[TaskDescriptionString] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways, such as by purpose, owner, or environment. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A list of managed device IDs.
    */
  var targets: TargetList
}
object CreateTaskInput {
  
  inline def apply(command: Command, targets: TargetList): CreateTaskInput = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTaskInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TaskDescriptionString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargets(value: TargetList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
