package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcExecutionApiMod.AnalyzeEntryPointsFn
import typings.angularCompilerCli.ngccSrcExecutionApiMod.CreateCompileFn
import typings.angularCompilerCli.ngccSrcExecutionApiMod.Executor
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.CreateTaskCompletedCallback
import typings.angularCompilerCli.ngccSrcLockingAsyncLockerMod.AsyncLocker
import typings.angularCompilerCli.ngccSrcWritingFileWriterMod.FileWriter
import typings.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonUpdater
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionClusterExecutorMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/cluster/executor", "ClusterExecutor")
  @js.native
  open class ClusterExecutor protected ()
    extends StObject
       with Executor {
    def this(
      workerCount: Double,
      fileSystem: PathManipulation,
      logger: Logger,
      fileWriter: FileWriter,
      pkgJsonUpdater: PackageJsonUpdater,
      lockFile: AsyncLocker,
      createTaskCompletedCallback: CreateTaskCompletedCallback
    ) = this()
    
    /* private */ var createTaskCompletedCallback: Any = js.native
    
    /* CompleteClass */
    override def execute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var fileSystem: Any = js.native
    
    /* private */ var fileWriter: Any = js.native
    
    /* private */ var lockFile: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var pkgJsonUpdater: Any = js.native
    
    /* private */ var workerCount: Any = js.native
  }
}
