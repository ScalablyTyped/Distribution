package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcLockingLockFileWithChildProcessUtilMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/locking/lock_file_with_child_process/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeLockFile(fs: FileSystem, logger: Logger, lockFilePath: AbsoluteFsPath, pid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLockFile")(fs.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], lockFilePath.asInstanceOf[js.Any], pid.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
