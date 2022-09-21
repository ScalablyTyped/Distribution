package typings.angularCompilerCli

import typings.angularCompilerCli.apiMod.AnalyzeEntryPointsFn
import typings.angularCompilerCli.apiMod.CreateCompileFn
import typings.angularCompilerCli.apiMod.Executor
import typings.angularCompilerCli.asyncLockerMod.AsyncLocker
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.syncLockerMod.SyncLocker
import typings.angularCompilerCli.tasksApiMod.CreateTaskCompletedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleProcessExecutorMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/single_process_executor", "SingleProcessExecutorAsync")
  @js.native
  open class SingleProcessExecutorAsync protected ()
    extends SingleProcessorExecutorBase
       with Executor {
    def this(logger: Logger, lockFile: AsyncLocker, createTaskCompletedCallback: CreateTaskCompletedCallback) = this()
    
    /* CompleteClass */
    override def execute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var lockFile: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/single_process_executor", "SingleProcessExecutorSync")
  @js.native
  open class SingleProcessExecutorSync protected ()
    extends SingleProcessorExecutorBase
       with Executor {
    def this(logger: Logger, lockFile: SyncLocker, createTaskCompletedCallback: CreateTaskCompletedCallback) = this()
    
    /* CompleteClass */
    override def execute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var lockFile: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/single_process_executor", "SingleProcessorExecutorBase")
  @js.native
  abstract class SingleProcessorExecutorBase protected () extends StObject {
    def this(logger: Logger, createTaskCompletedCallback: CreateTaskCompletedCallback) = this()
    
    /* private */ var createTaskCompletedCallback: Any = js.native
    
    def doExecute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var logger: Any = js.native
  }
}
