package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.srcTreeActionMod.Action
import typings.angularDevkitSchematics.srcTreeActionMod.CreateFileAction
import typings.angularDevkitSchematics.srcTreeActionMod.DeleteFileAction
import typings.angularDevkitSchematics.srcTreeActionMod.OverwriteFileAction
import typings.angularDevkitSchematics.srcTreeActionMod.RenameFileAction
import typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
import typings.node.bufferMod.global.Buffer
import typings.rxjs.mod.Observable_
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSinkSinkMod {
  
  /* note: abstract class */ @JSImport("@angular-devkit/schematics/src/sink/sink", "SimpleSinkBase")
  @js.native
  open class SimpleSinkBase ()
    extends StObject
       with Sink {
    
    /* protected */ def _createFile(path: String, content: Buffer): Observable_[Unit] = js.native
    
    /* protected */ def _deleteFile(path: String): Observable_[Unit] = js.native
    
    /* protected */ def _done(): Observable_[Unit] = js.native
    
    /* protected */ def _fileAlreadyExistException(path: String): Unit = js.native
    
    /* protected */ def _fileDoesNotExistException(path: String): Unit = js.native
    
    /* protected */ def _overwriteFile(path: String, content: Buffer): Observable_[Unit] = js.native
    
    /* protected */ def _renameFile(path: String, to: String): Observable_[Unit] = js.native
    
    /* protected */ def _validateCreateAction(action: CreateFileAction): Observable_[Unit] = js.native
    
    /* protected */ def _validateDeleteAction(action: DeleteFileAction): Observable_[Unit] = js.native
    
    /* protected */ def _validateFileExists(p: String): Observable_[Boolean] = js.native
    
    /* protected */ def _validateOverwriteAction(action: OverwriteFileAction): Observable_[Unit] = js.native
    
    /* protected */ def _validateRenameAction(action: RenameFileAction): Observable_[Unit] = js.native
    
    /* CompleteClass */
    override def commit(tree: Tree): Observable_[Unit] = js.native
    
    def commitSingleAction(action: Action): Observable_[Unit] = js.native
    
    def postCommit(): Unit | Observable_[Unit] = js.native
    
    def postCommitAction(action: Action): Unit | Observable_[Unit] = js.native
    
    def preCommit(): Unit | Observable_[Unit] = js.native
    
    def preCommitAction(action: Action): Unit | Action | PromiseLike[Action] | Observable_[Action] = js.native
    
    def validateSingleAction(action: Action): Observable_[Unit] = js.native
  }
  
  trait Sink extends StObject {
    
    def commit(tree: Tree): Observable_[Unit]
  }
  object Sink {
    
    inline def apply(commit: Tree => Observable_[Unit]): Sink = {
      val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit))
      __obj.asInstanceOf[Sink]
    }
    
    extension [Self <: Sink](x: Self) {
      
      inline def setCommit(value: Tree => Observable_[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
    }
  }
}
