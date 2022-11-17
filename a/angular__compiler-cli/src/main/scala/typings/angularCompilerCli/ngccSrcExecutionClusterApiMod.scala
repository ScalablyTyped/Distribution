package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.Task
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskProcessingOutcome
import typings.angularCompilerCli.ngccSrcUtilsMod.JsonObject
import typings.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonChange
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionClusterApiMod {
  
  trait ErrorMessage
    extends StObject
       with JsonObject {
    
    var error: String
    
    var `type`: "error"
  }
  object ErrorMessage {
    
    inline def apply(error: String): ErrorMessage = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ErrorMessage]
    }
    
    extension [Self <: ErrorMessage](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setType(value: "error"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageFromWorker = ReadyMessage | ErrorMessage | TaskCompletedMessage | TransformedFilesMessage | UpdatePackageJsonMessage
  
  type MessageToWorker = ProcessTaskMessage
  
  trait ProcessTaskMessage
    extends StObject
       with JsonObject {
    
    var task: Task
    
    var `type`: "process-task"
  }
  object ProcessTaskMessage {
    
    inline def apply(task: Task): ProcessTaskMessage = {
      val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("process-task")
      __obj.asInstanceOf[ProcessTaskMessage]
    }
    
    extension [Self <: ProcessTaskMessage](x: Self) {
      
      inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setType(value: "process-task"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadyMessage
    extends StObject
       with JsonObject {
    
    var `type`: "ready"
  }
  object ReadyMessage {
    
    inline def apply(): ReadyMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ready")
      __obj.asInstanceOf[ReadyMessage]
    }
    
    extension [Self <: ReadyMessage](x: Self) {
      
      inline def setType(value: "ready"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskCompletedMessage
    extends StObject
       with JsonObject {
    
    var message: String | Null
    
    var outcome: TaskProcessingOutcome
    
    var `type`: "task-completed"
  }
  object TaskCompletedMessage {
    
    inline def apply(outcome: TaskProcessingOutcome): TaskCompletedMessage = {
      val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], message = null)
      __obj.updateDynamic("type")("task-completed")
      __obj.asInstanceOf[TaskCompletedMessage]
    }
    
    extension [Self <: TaskCompletedMessage](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setOutcome(value: TaskProcessingOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      inline def setType(value: "task-completed"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformedFilesMessage
    extends StObject
       with JsonObject {
    
    var files: js.Array[AbsoluteFsPath]
    
    var `type`: "transformed-files"
  }
  object TransformedFilesMessage {
    
    inline def apply(files: js.Array[AbsoluteFsPath]): TransformedFilesMessage = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("transformed-files")
      __obj.asInstanceOf[TransformedFilesMessage]
    }
    
    extension [Self <: TransformedFilesMessage](x: Self) {
      
      inline def setFiles(value: js.Array[AbsoluteFsPath]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: AbsoluteFsPath*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setType(value: "transformed-files"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdatePackageJsonMessage
    extends StObject
       with JsonObject {
    
    var changes: js.Array[PackageJsonChange]
    
    var packageJsonPath: AbsoluteFsPath
    
    var `type`: "update-package-json"
  }
  object UpdatePackageJsonMessage {
    
    inline def apply(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath): UpdatePackageJsonMessage = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], packageJsonPath = packageJsonPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update-package-json")
      __obj.asInstanceOf[UpdatePackageJsonMessage]
    }
    
    extension [Self <: UpdatePackageJsonMessage](x: Self) {
      
      inline def setChanges(value: js.Array[PackageJsonChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: PackageJsonChange*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setPackageJsonPath(value: AbsoluteFsPath): Self = StObject.set(x, "packageJsonPath", value.asInstanceOf[js.Any])
      
      inline def setType(value: "update-package-json"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
