package typings.angularDevkitSchematics

import typings.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.angularDevkitSchematics.srcTreeActionMod.Action
import typings.angularDevkitSchematics.srcTreeInterfaceMod.DirEntry
import typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTreeScopedMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/scoped", "ScopedTree")
  @js.native
  open class ScopedTree protected ()
    extends StObject
       with Tree {
    def this(_base: Tree, scope: String) = this()
    
    /* private */ var _base: Any = js.native
    
    /* private */ var _fullPath: Any = js.native
    
    /* private */ var _fullPathAction: Any = js.native
    
    val _root: ScopedDirEntry = js.native
    
    @JSName("actions")
    def actions_MScopedTree: js.Array[Action] = js.native
    
    @JSName("root")
    def root_MScopedTree: DirEntry = js.native
  }
  
  @js.native
  trait ScopedDirEntry
    extends StObject
       with DirEntry {
    
    /* private */ var _base: Any = js.native
    
    @JSName("parent")
    def parent_MScopedDirEntry: DirEntry | Null = js.native
    
    @JSName("path")
    def path_MScopedDirEntry: Path_ = js.native
    
    val scope: Path_ = js.native
    
    @JSName("subdirs")
    def subdirs_MScopedDirEntry: js.Array[PathFragment] = js.native
    
    @JSName("subfiles")
    def subfiles_MScopedDirEntry: js.Array[PathFragment] = js.native
  }
}
