package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.actionMod.Action
import typings.angularDevkitSchematics.actionMod.CreateFileAction
import typings.angularDevkitSchematics.actionMod.DeleteFileAction
import typings.angularDevkitSchematics.actionMod.OverwriteFileAction
import typings.angularDevkitSchematics.actionMod.RenameFileAction
import typings.angularDevkitSchematics.treeInterfaceMod.Tree
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinkMod {
  
  @JSImport("@angular-devkit/schematics/src/sink/sink", "SimpleSinkBase")
  @js.native
  abstract class SimpleSinkBase ()
    extends StObject
       with Sink {
    
    /* protected */ def _createFile(path: String, content: Buffer): Any = js.native
    
    /* protected */ def _deleteFile(path: String): Any = js.native
    
    /* protected */ def _done(): Any = js.native
    
    /* protected */ def _fileAlreadyExistException(path: String): Unit = js.native
    
    /* protected */ def _fileDoesNotExistException(path: String): Unit = js.native
    
    /* protected */ def _overwriteFile(path: String, content: Buffer): Any = js.native
    
    /* protected */ def _renameFile(path: String, to: String): Any = js.native
    
    /* protected */ def _validateCreateAction(action: CreateFileAction): Any = js.native
    
    /* protected */ def _validateDeleteAction(action: DeleteFileAction): Any = js.native
    
    /* protected */ def _validateFileExists(p: String): Any = js.native
    
    /* protected */ def _validateOverwriteAction(action: OverwriteFileAction): Any = js.native
    
    /* protected */ def _validateRenameAction(action: RenameFileAction): Any = js.native
    
    /* CompleteClass */
    override def commit(tree: Tree): Any = js.native
    
    def commitSingleAction(action: Action): Any = js.native
    
    def postCommit(): Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<void> */ Any) = js.native
    
    def postCommitAction(action: Action): Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<void> */ Any) = js.native
    
    def preCommit(): Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<void> */ Any) = js.native
    
    def preCommitAction(action: Action): Unit | Action | js.Thenable[Action] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<Action> */ Any) = js.native
    
    def validateSingleAction(action: Action): Any = js.native
  }
  
  trait Sink extends StObject {
    
    def commit(tree: Tree): Any
  }
  object Sink {
    
    inline def apply(commit: Tree => Any): Sink = {
      val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit))
      __obj.asInstanceOf[Sink]
    }
    
    extension [Self <: Sink](x: Self) {
      
      inline def setCommit(value: Tree => Any): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
    }
  }
}
