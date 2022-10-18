package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.srcTreeActionMod.Action
import typings.angularDevkitSchematics.srcTreeInterfaceMod.DirEntry
import typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTreeDelegateMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/delegate", "DelegateTree")
  @js.native
  open class DelegateTree protected ()
    extends StObject
       with Tree {
    def this(_other: Tree) = this()
    
    /* protected */ var _other: Tree = js.native
    
    @JSName("actions")
    def actions_MDelegateTree: js.Array[Action] = js.native
    
    @JSName("root")
    def root_MDelegateTree: DirEntry = js.native
  }
}
