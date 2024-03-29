package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import typings.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.angularDevkitSchematics.srcTreeActionMod.Action
import typings.angularDevkitSchematics.srcTreeInterfaceMod.DirEntry
import typings.angularDevkitSchematics.srcTreeInterfaceMod.FileEntry
import typings.angularDevkitSchematics.srcTreeInterfaceMod.FileVisitor
import typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTreeNullMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/null", "CannotCreateFileException")
  @js.native
  open class CannotCreateFileException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/null", "NullTree")
  @js.native
  open class NullTree ()
    extends StObject
       with Tree {
    
    @JSName("actions")
    def actions_MNullTree: js.Array[Action] = js.native
    
    def copy(path: String, _to: String): scala.Nothing = js.native
    
    def visit(): Unit = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/null", "NullTreeDirEntry")
  @js.native
  open class NullTreeDirEntry protected ()
    extends StObject
       with DirEntry {
    def this(path: Path_) = this()
    
    /* CompleteClass */
    override def dir(name: PathFragment): DirEntry = js.native
    
    /* CompleteClass */
    override def file(name: PathFragment): FileEntry | Null = js.native
    
    /* CompleteClass */
    override val parent: DirEntry | Null = js.native
    @JSName("parent")
    def parent_MNullTreeDirEntry: DirEntry | Null = js.native
    
    /* CompleteClass */
    override val path: Path_ = js.native
    
    /* CompleteClass */
    override val subdirs: js.Array[PathFragment] = js.native
    
    /* CompleteClass */
    override val subfiles: js.Array[PathFragment] = js.native
    
    def visit(): Unit = js.native
    /* CompleteClass */
    override def visit(visitor: FileVisitor): Unit = js.native
  }
}
