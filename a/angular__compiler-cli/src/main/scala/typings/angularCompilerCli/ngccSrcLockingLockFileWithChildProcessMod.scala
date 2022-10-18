package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcLockingLockFileMod.LockFile
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcLockingLockFileWithChildProcessMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/locking/lock_file_with_child_process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/locking/lock_file_with_child_process", "LockFileWithChildProcess")
  @js.native
  open class LockFileWithChildProcess protected ()
    extends StObject
       with LockFile {
    def this(fs: FileSystem, logger: Logger) = this()
    
    /* protected */ def createUnlocker(path: AbsoluteFsPath): ChildProcess = js.native
    
    /* protected */ var fs: FileSystem = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /* CompleteClass */
    var path: AbsoluteFsPath = js.native
    
    /**
      * Read the PID, of the process holding the lock, from the lock-file.
      *
      * It is feasible that the lock-file was removed between the call to `write()` that effectively
      * checks for existence and this attempt to read the file. If so then this method should just
      * gracefully return `"{unknown}"`.
      */
    /* CompleteClass */
    override def read(): String = js.native
    
    /**
      * Remove the lock file from disk, whether or not it exists.
      */
    /* CompleteClass */
    override def remove(): Unit = js.native
    
    /* private */ var unlocker: Any = js.native
    
    /**
      * Write a lock file to disk containing the PID of the current process.
      */
    /* CompleteClass */
    override def write(): Unit = js.native
  }
  
  inline def getLockFileUnlockerScriptPath(fileSystem: FileSystem): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("getLockFileUnlockerScriptPath")(fileSystem.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
}
