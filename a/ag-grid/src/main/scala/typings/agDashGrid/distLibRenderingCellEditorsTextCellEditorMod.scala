package typings.agDashGrid

import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditor
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typings.agDashGrid.distLibRenderingCellEditorsTextCellEditorMod.ITextCellEditorParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditors/textCellEditor", JSImport.Namespace)
@js.native
object distLibRenderingCellEditorsTextCellEditorMod extends js.Object {
  @js.native
  trait ITextCellEditorParams extends ICellEditorParams {
    var useFormatter: Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.agDashGrid.distLibInterfacesIComponentMod.IComponent because Already inherited
  - typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @js.native
  class TextCellEditor ()
    extends Component
       with ICellEditor {
    var focusAfterAttached: js.Any = js.native
    var highlightAllOnFocus: js.Any = js.native
    var params: js.Any = js.native
    @JSName("afterGuiAttached")
    def afterGuiAttached_MTextCellEditor(): Unit = js.native
    @JSName("focusIn")
    def focusIn_MTextCellEditor(): Unit = js.native
    /* private */ def getStartValue(params: js.Any): js.Any = js.native
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    @JSName("init")
    def init_MTextCellEditor(params: ITextCellEditorParams): Unit = js.native
  }
  
  /* static members */
  @js.native
  object TextCellEditor extends js.Object {
    var TEMPLATE: js.Any = js.native
  }
  
}

