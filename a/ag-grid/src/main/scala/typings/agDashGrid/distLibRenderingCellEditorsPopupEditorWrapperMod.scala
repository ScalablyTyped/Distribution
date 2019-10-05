package typings.agDashGrid

import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditor
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", JSImport.Namespace)
@js.native
object distLibRenderingCellEditorsPopupEditorWrapperMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.agDashGrid.distLibInterfacesIComponentMod.IComponent because Already inherited
  - typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @js.native
  class PopupEditorWrapper protected ()
    extends Component
       with ICellEditor {
    def this(cellEditor: ICellEditorComp) = this()
    var cellEditor: js.Any = js.native
    var getGuiCalledOnChild: js.Any = js.native
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    var params: js.Any = js.native
    @JSName("afterGuiAttached")
    def afterGuiAttached_MPopupEditorWrapper(): Unit = js.native
    @JSName("focusIn")
    def focusIn_MPopupEditorWrapper(): Unit = js.native
    @JSName("focusOut")
    def focusOut_MPopupEditorWrapper(): Unit = js.native
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    @JSName("init")
    def init_MPopupEditorWrapper(params: ICellEditorParams): Unit = js.native
    @JSName("isCancelAfterEnd")
    def isCancelAfterEnd_MPopupEditorWrapper(): Boolean = js.native
    @JSName("isCancelBeforeStart")
    def isCancelBeforeStart_MPopupEditorWrapper(): Boolean = js.native
    @JSName("isPopup")
    def isPopup_MPopupEditorWrapper(): Boolean = js.native
    /* private */ def onKeyDown(event: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object PopupEditorWrapper extends js.Object {
    var DOM_KEY_POPUP_EDITOR_WRAPPER: String = js.native
  }
  
}

