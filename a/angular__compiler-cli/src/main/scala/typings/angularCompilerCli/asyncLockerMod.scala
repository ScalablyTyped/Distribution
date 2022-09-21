package typings.angularCompilerCli

import typings.angularCompilerCli.lockFileMod.LockFile
import typings.angularCompilerCli.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncLockerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/locking/async_locker", "AsyncLocker")
  @js.native
  open class AsyncLocker protected () extends StObject {
    def this(lockFile: LockFile, logger: Logger, retryDelay: Double, retryAttempts: Double) = this()
    
    /* protected */ def create(): js.Promise[Unit] = js.native
    
    /**
      * Run a function guarded by the lock file.
      *
      * @param fn The function to run.
      */
    def lock[T](fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /* private */ var lockFile: Any = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /* private */ var retryAttempts: Any = js.native
    
    /* private */ var retryDelay: Any = js.native
  }
}
