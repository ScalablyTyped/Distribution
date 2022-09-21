package typings.angularDevkitSchematics

import typings.angularDevkitCore.hostInterfaceMod.ReadonlyHost
import typings.angularDevkitCore.mod.virtualFs.SyncDelegateHost
import typings.angularDevkitCore.pathMod.PathFragment
import typings.angularDevkitCore.pathMod.Path_
import typings.angularDevkitSchematics.actionMod.Action
import typings.angularDevkitSchematics.treeInterfaceMod.DirEntry
import typings.angularDevkitSchematics.treeInterfaceMod.FileEntry
import typings.angularDevkitSchematics.treeInterfaceMod.FilePredicate
import typings.angularDevkitSchematics.treeInterfaceMod.FileVisitor
import typings.angularDevkitSchematics.treeInterfaceMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostTreeMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/host-tree", "FilterHostTree")
  @js.native
  open class FilterHostTree protected () extends HostTree {
    def this(tree: HostTree) = this()
    def this(tree: HostTree, filter: FilePredicate[Boolean]) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/host-tree", "HostCreateTree")
  @js.native
  open class HostCreateTree protected () extends HostTree {
    def this(host: ReadonlyHost[js.Object]) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/host-tree", "HostDirEntry")
  @js.native
  open class HostDirEntry protected ()
    extends StObject
       with DirEntry {
    def this(parent: Null, path: Path_, _host: SyncDelegateHost[js.Object], _tree: Tree) = this()
    def this(parent: DirEntry, path: Path_, _host: SyncDelegateHost[js.Object], _tree: Tree) = this()
    
    /* protected */ var _host: SyncDelegateHost[js.Object] = js.native
    
    /* protected */ var _tree: Tree = js.native
    
    /* CompleteClass */
    override def dir(name: PathFragment): DirEntry = js.native
    
    /* CompleteClass */
    override def file(name: PathFragment): FileEntry | Null = js.native
    
    /* private */ var getSubfilesRecursively: Any = js.native
    
    /* CompleteClass */
    override val parent: DirEntry | Null = js.native
    
    /* CompleteClass */
    override val path: Path_ = js.native
    
    /* CompleteClass */
    override val subdirs: js.Array[PathFragment] = js.native
    @JSName("subdirs")
    def subdirs_MHostDirEntry: js.Array[PathFragment] = js.native
    
    /* CompleteClass */
    override val subfiles: js.Array[PathFragment] = js.native
    @JSName("subfiles")
    def subfiles_MHostDirEntry: js.Array[PathFragment] = js.native
    
    /* CompleteClass */
    override def visit(visitor: FileVisitor): Unit = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/host-tree", "HostTree")
  @js.native
  open class HostTree ()
    extends StObject
       with Tree {
    def this(_backend: ReadonlyHost[js.Object]) = this()
    
    /* private */ var _ancestry: Any = js.native
    
    /* protected */ var _backend: ReadonlyHost[js.Object] = js.native
    
    /* private */ var _dirCache: Any = js.native
    
    /* private */ val _id: Any = js.native
    
    /* protected */ def _normalizePath(path: String): Path_ = js.native
    
    /* private */ var _record: Any = js.native
    
    /* private */ var _recordSync: Any = js.native
    
    /* protected */ def _willCreate(path: Path_): Boolean = js.native
    
    /* protected */ def _willDelete(path: Path_): Boolean = js.native
    
    /* protected */ def _willOverwrite(path: Path_): Boolean = js.native
    
    /* protected */ def _willRename(path: Path_): Boolean = js.native
    
    @JSName("actions")
    def actions_MHostTree: js.Array[Action] = js.native
    
    /* private */ var generateActions: Any = js.native
    
    /* private */ var isAncestorOf: Any = js.native
    
    @JSName("root")
    def root_MHostTree: DirEntry = js.native
  }
  /* static members */
  object HostTree {
    
    @JSImport("@angular-devkit/schematics/src/tree/host-tree", "HostTree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isHostTree(tree: Tree): /* is @angular-devkit/schematics.@angular-devkit/schematics/src/tree/host-tree.HostTree */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHostTree")(tree.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/schematics.@angular-devkit/schematics/src/tree/host-tree.HostTree */ Boolean]
  }
}
