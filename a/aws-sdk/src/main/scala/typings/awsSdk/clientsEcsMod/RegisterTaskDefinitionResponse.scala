package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTaskDefinitionResponse extends StObject {
  
  /**
    * The list of tags associated with the task definition.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The full description of the registered task definition.
    */
  var taskDefinition: js.UndefOr[TaskDefinition] = js.undefined
}
object RegisterTaskDefinitionResponse {
  
  inline def apply(): RegisterTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTaskDefinitionResponse]
  }
  
  extension [Self <: RegisterTaskDefinitionResponse](x: Self) {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTaskDefinition(value: TaskDefinition): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
  }
}
