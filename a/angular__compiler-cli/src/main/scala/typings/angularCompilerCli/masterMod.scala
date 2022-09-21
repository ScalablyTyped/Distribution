package typings.angularCompilerCli

import typings.angularCompilerCli.apiMod.AnalyzeEntryPointsFn
import typings.angularCompilerCli.fileWriterMod.FileWriter
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.PathManipulation
import typings.angularCompilerCli.tasksApiMod.CreateTaskCompletedCallback
import typings.angularCompilerCli.writingPackageJsonUpdaterMod.PackageJsonUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object masterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/cluster/master", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/cluster/master", "ClusterMaster")
  @js.native
  open class ClusterMaster protected () extends StObject {
    def this(
      maxWorkerCount: Double,
      fileSystem: PathManipulation,
      logger: Logger,
      fileWriter: FileWriter,
      pkgJsonUpdater: PackageJsonUpdater,
      analyzeEntryPoints: AnalyzeEntryPointsFn,
      createTaskCompletedCallback: CreateTaskCompletedCallback
    ) = this()
    
    /* private */ var fileSystem: Any = js.native
    
    /* private */ var fileWriter: Any = js.native
    
    /* private */ var finishedDeferred: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var maxWorkerCount: Any = js.native
    
    /** Try to find available (idle) workers and assign them available (non-blocked) tasks. */
    /* private */ var maybeDistributeWork: Any = js.native
    
    /* private */ var onTaskCompleted: Any = js.native
    
    /** Handle a worker's exiting. (Might be intentional or not.) */
    /* private */ var onWorkerExit: Any = js.native
    
    /** Handle a message from a worker. */
    /* private */ var onWorkerMessage: Any = js.native
    
    /** Handle a worker's coming online and ready for retrieving IPC messages. */
    /* private */ var onWorkerReady: Any = js.native
    
    /** Handle a worker's having completed their assigned task. */
    /* private */ var onWorkerTaskCompleted: Any = js.native
    
    /** Handle a worker's message regarding the files transformed while processing its task. */
    /* private */ var onWorkerTransformedFiles: Any = js.native
    
    /** Handle a worker's request to update a `package.json` file. */
    /* private */ var onWorkerUpdatePackageJson: Any = js.native
    
    /* private */ var pkgJsonUpdater: Any = js.native
    
    /* private */ var processingStartTime: Any = js.native
    
    /* private */ var remainingRespawnAttempts: Any = js.native
    
    def run(): js.Promise[Unit] = js.native
    
    /** Stop all workers and stop listening on cluster events. */
    /* private */ var stopWorkers: Any = js.native
    
    /* private */ var taskAssignments: Any = js.native
    
    /* private */ var taskQueue: Any = js.native
    
    /**
      * Wrap an event handler to ensure that `finishedDeferred` will be rejected on error (regardless
      * if the handler completes synchronously or asynchronously).
      */
    /* private */ var wrapEventHandler: Any = js.native
  }
  
  inline def getClusterWorkerScriptPath(fileSystem: PathManipulation): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("getClusterWorkerScriptPath")(fileSystem.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
}
