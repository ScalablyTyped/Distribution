package typings.agDashGrid

import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditor
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typings.agDashGrid.distLibRenderingCellEditorsLargeTextCellEditorMod.ILargeTextEditorParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditors/largeTextCellEditor", JSImport.Namespace)
@js.native
object distLibRenderingCellEditorsLargeTextCellEditorMod extends js.Object {
  @js.native
  trait ILargeTextEditorParams extends ICellEditorParams {
    var cols: Double = js.native
    var maxLength: Double = js.native
    var rows: Double = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.agDashGrid.distLibInterfacesIComponentMod.IComponent because Already inherited
  - typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @js.native
  class LargeTextCellEditor ()
    extends Component
       with ICellEditor {
    var focusAfterAttached: js.Any = js.native
    var params: js.Any = js.native
    var textarea: js.Any = js.native
    @JSName("afterGuiAttached")
    def afterGuiAttached_MLargeTextCellEditor(): Unit = js.native
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    @JSName("init")
    def init_MLargeTextCellEditor(params: ILargeTextEditorParams): Unit = js.native
    @JSName("isPopup")
    def isPopup_MLargeTextCellEditor(): Boolean = js.native
    /* private */ def onKeyDown(event: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object LargeTextCellEditor extends js.Object {
    var TEMPLATE: js.Any = js.native
  }
  
}

