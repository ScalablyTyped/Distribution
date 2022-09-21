package typings.angularCompilerCli

import typings.angularCompilerCli.apiMod.AnalyzeEntryPointsFn
import typings.angularCompilerCli.apiMod.CreateCompileFn
import typings.angularCompilerCli.apiMod.Executor
import typings.angularCompilerCli.asyncLockerMod.AsyncLocker
import typings.angularCompilerCli.fileWriterMod.FileWriter
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.srcTypesMod.PathManipulation
import typings.angularCompilerCli.tasksApiMod.CreateTaskCompletedCallback
import typings.angularCompilerCli.writingPackageJsonUpdaterMod.PackageJsonUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorMod {
  
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
