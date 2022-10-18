package typings.atlaskitTree

import typings.atlaskitTree.distTypesComponentsTreeItemTreeItemTypesMod.Props
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTreeItemTreeItemMod {
  
  @JSImport("@atlaskit/tree/dist/types/components/TreeItem/TreeItem", JSImport.Default)
  @js.native
  open class default () extends TreeItem
  
  @js.native
  trait TreeItem
    extends Component[Props, js.Object, Any] {
    
    def patchDraggableProps(
      draggableProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvidedDraggableProps */ Any,
      snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
    ): Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTreeItem(nextProps: Props): Boolean = js.native
  }
}
