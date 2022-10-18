package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpeechSynthesisTaskInput extends StObject {
  
  /**
    * The Amazon Polly generated identifier for a speech synthesis task.
    */
  var TaskId: typings.awsSdk.clientsPollyMod.TaskId
}
object GetSpeechSynthesisTaskInput {
  
  inline def apply(TaskId: TaskId): GetSpeechSynthesisTaskInput = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpeechSynthesisTaskInput]
  }
  
  extension [Self <: GetSpeechSynthesisTaskInput](x: Self) {
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
  }
}
