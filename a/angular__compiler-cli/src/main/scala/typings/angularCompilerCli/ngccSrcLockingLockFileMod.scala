package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcLockingLockFileMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/locking/lock_file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLockFilePath(fs: PathManipulation): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("getLockFilePath")(fs.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  trait LockFile extends StObject {
    
    var path: AbsoluteFsPath
    
    /**
      * Read the PID, of the process holding the lock, from the lock-file.
      *
      * It is feasible that the lock-file was removed between the call to `write()` that effectively
      * checks for existence and this attempt to read the file. If so then this method should just
      * gracefully return `"{unknown}"`.
      */
    def read(): String
    
    /**
      * Remove the lock file from disk, whether or not it exists.
      */
    def remove(): Unit
    
    /**
      * Write a lock file to disk containing the PID of the current process.
      */
    def write(): Unit
  }
  object LockFile {
    
    inline def apply(path: AbsoluteFsPath, read: () => String, remove: () => Unit, write: () => Unit): LockFile = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), remove = js.Any.fromFunction0(remove), write = js.Any.fromFunction0(write))
      __obj.asInstanceOf[LockFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LockFile] (val x: Self) extends AnyVal {
      
      inline def setPath(value: AbsoluteFsPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRead(value: () => String): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setWrite(value: () => Unit): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
    }
  }
}
