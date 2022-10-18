package typings.angularCompilerCli

import typings.angularCompilerCli.anon.RecordTaskProcessingOutco
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.Task
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskCompletedCallback
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskQueue
import typings.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonUpdater
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionTasksCompletionMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/completion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeTaskCompletedCallbacks(callbacks: RecordTaskProcessingOutco): TaskCompletedCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTaskCompletedCallbacks")(callbacks.asInstanceOf[js.Any]).asInstanceOf[TaskCompletedCallback]
  
  inline def createLogErrorHandler(logger: Logger, fs: ReadonlyFileSystem, taskQueue: TaskQueue): TaskCompletedHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogErrorHandler")(logger.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], taskQueue.asInstanceOf[js.Any])).asInstanceOf[TaskCompletedHandler]
  
  inline def createMarkAsProcessedHandler(fs: PathManipulation, pkgJsonUpdater: PackageJsonUpdater): TaskCompletedHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("createMarkAsProcessedHandler")(fs.asInstanceOf[js.Any], pkgJsonUpdater.asInstanceOf[js.Any])).asInstanceOf[TaskCompletedHandler]
  
  inline def createThrowErrorHandler(fs: ReadonlyFileSystem): TaskCompletedHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrowErrorHandler")(fs.asInstanceOf[js.Any]).asInstanceOf[TaskCompletedHandler]
  
  type TaskCompletedHandler = js.Function2[/* task */ Task, /* message */ String | Null, Unit]
}
