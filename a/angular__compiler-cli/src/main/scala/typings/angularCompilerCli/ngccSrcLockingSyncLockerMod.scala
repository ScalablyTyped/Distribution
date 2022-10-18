package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcLockingLockFileMod.LockFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcLockingSyncLockerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/locking/sync_locker", "SyncLocker")
  @js.native
  open class SyncLocker protected () extends StObject {
    def this(lockFile: LockFile) = this()
    
    /**
      * Write a lock file to disk, or error if there is already one there.
      */
    /* protected */ def create(): Unit = js.native
    
    /**
      * The lock-file already exists so raise a helpful error.
      */
    /* protected */ def handleExistingLockFile(): Unit = js.native
    
    /**
      * Run the given function guarded by the lock file.
      *
      * @param fn the function to run.
      * @returns the value returned from the `fn` call.
      */
    def lock[T](fn: js.Function0[T]): T = js.native
    
    /* private */ var lockFile: Any = js.native
  }
}
