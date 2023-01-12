package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.`process-task`
import typings.angularCompilerCli.angularCompilerCliStrings.`task-completed`
import typings.angularCompilerCli.angularCompilerCliStrings.`transformed-files`
import typings.angularCompilerCli.angularCompilerCliStrings.`update-package-json`
import typings.angularCompilerCli.angularCompilerCliStrings.error
import typings.angularCompilerCli.angularCompilerCliStrings.ready
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
       with JsonObject
       with MessageFromWorker {
    
    var error: String
    
    var `type`: error
  }
  object ErrorMessage {
    
    inline def apply(error: String): ErrorMessage = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ErrorMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorMessage] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.ReadyMessage
    - typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.ErrorMessage
    - typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.TaskCompletedMessage
    - typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.TransformedFilesMessage
    - typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.UpdatePackageJsonMessage
  */
  trait MessageFromWorker extends StObject
  object MessageFromWorker {
    
    inline def ErrorMessage(error: String): typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.ErrorMessage = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.ErrorMessage]
    }
    
    inline def ReadyMessage(): typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.ReadyMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ready")
      __obj.asInstanceOf[typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.ReadyMessage]
    }
    
    inline def TaskCompletedMessage(outcome: TaskProcessingOutcome): typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.TaskCompletedMessage = {
      val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], message = null)
      __obj.updateDynamic("type")("task-completed")
      __obj.asInstanceOf[typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.TaskCompletedMessage]
    }
    
    inline def TransformedFilesMessage(files: js.Array[AbsoluteFsPath]): typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.TransformedFilesMessage = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("transformed-files")
      __obj.asInstanceOf[typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.TransformedFilesMessage]
    }
    
    inline def UpdatePackageJsonMessage(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath): typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.UpdatePackageJsonMessage = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], packageJsonPath = packageJsonPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update-package-json")
      __obj.asInstanceOf[typings.angularCompilerCli.ngccSrcExecutionClusterApiMod.UpdatePackageJsonMessage]
    }
  }
  
  type MessageToWorker = ProcessTaskMessage
  
  trait ProcessTaskMessage
    extends StObject
       with JsonObject {
    
    var task: Task
    
    var `type`: `process-task`
  }
  object ProcessTaskMessage {
    
    inline def apply(task: Task): ProcessTaskMessage = {
      val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("process-task")
      __obj.asInstanceOf[ProcessTaskMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessTaskMessage] (val x: Self) extends AnyVal {
      
      inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setType(value: `process-task`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadyMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var `type`: ready
  }
  object ReadyMessage {
    
    inline def apply(): ReadyMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ready")
      __obj.asInstanceOf[ReadyMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadyMessage] (val x: Self) extends AnyVal {
      
      inline def setType(value: ready): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskCompletedMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var message: String | Null
    
    var outcome: TaskProcessingOutcome
    
    var `type`: `task-completed`
  }
  object TaskCompletedMessage {
    
    inline def apply(outcome: TaskProcessingOutcome): TaskCompletedMessage = {
      val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], message = null)
      __obj.updateDynamic("type")("task-completed")
      __obj.asInstanceOf[TaskCompletedMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskCompletedMessage] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setOutcome(value: TaskProcessingOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      inline def setType(value: `task-completed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransformedFilesMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var files: js.Array[AbsoluteFsPath]
    
    var `type`: `transformed-files`
  }
  object TransformedFilesMessage {
    
    inline def apply(files: js.Array[AbsoluteFsPath]): TransformedFilesMessage = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("transformed-files")
      __obj.asInstanceOf[TransformedFilesMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformedFilesMessage] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: js.Array[AbsoluteFsPath]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: AbsoluteFsPath*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setType(value: `transformed-files`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdatePackageJsonMessage
    extends StObject
       with JsonObject
       with MessageFromWorker {
    
    var changes: js.Array[PackageJsonChange]
    
    var packageJsonPath: AbsoluteFsPath
    
    var `type`: `update-package-json`
  }
  object UpdatePackageJsonMessage {
    
    inline def apply(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath): UpdatePackageJsonMessage = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], packageJsonPath = packageJsonPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update-package-json")
      __obj.asInstanceOf[UpdatePackageJsonMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdatePackageJsonMessage] (val x: Self) extends AnyVal {
      
      inline def setChanges(value: js.Array[PackageJsonChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: PackageJsonChange*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setPackageJsonPath(value: AbsoluteFsPath): Self = StObject.set(x, "packageJsonPath", value.asInstanceOf[js.Any])
      
      inline def setType(value: `update-package-json`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
