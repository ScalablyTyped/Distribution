package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcExecutionApiMod.AnalyzeEntryPointsFn
import typings.angularCompilerCli.ngccSrcExecutionApiMod.CreateCompileFn
import typings.angularCompilerCli.ngccSrcExecutionApiMod.Executor
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.CreateTaskCompletedCallback
import typings.angularCompilerCli.ngccSrcLockingAsyncLockerMod.AsyncLocker
import typings.angularCompilerCli.ngccSrcLockingSyncLockerMod.SyncLocker
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionSingleProcessExecutorMod {
  
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
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/ngcc/src/execution/single_process_executor", "SingleProcessorExecutorBase")
  @js.native
  open class SingleProcessorExecutorBase protected () extends StObject {
    def this(logger: Logger, createTaskCompletedCallback: CreateTaskCompletedCallback) = this()
    
    /* private */ var createTaskCompletedCallback: Any = js.native
    
    def doExecute(analyzeEntryPoints: AnalyzeEntryPointsFn, createCompileFn: CreateCompileFn): Unit | js.Promise[Unit] = js.native
    
    /* private */ var logger: Any = js.native
  }
}
