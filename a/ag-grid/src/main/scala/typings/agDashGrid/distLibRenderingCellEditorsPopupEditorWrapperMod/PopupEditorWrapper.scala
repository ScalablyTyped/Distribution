package typings.agDashGrid.distLibRenderingCellEditorsPopupEditorWrapperMod

import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", "PopupEditorWrapper")
@js.native
class PopupEditorWrapper protected () extends Component {
  def this(cellEditor: ICellEditorComp) = this()
  var cellEditor: js.Any = js.native
  var getGuiCalledOnChild: js.Any = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  var params: js.Any = js.native
  @JSName("afterGuiAttached")
  def afterGuiAttached_MPopupEditorWrapper(): Unit = js.native
  def focusIn(): Unit = js.native
  def focusOut(): Unit = js.native
  def getValue(): js.Any = js.native
  @JSName("init")
  def init_MPopupEditorWrapper(params: ICellEditorParams): Unit = js.native
  def isCancelAfterEnd(): Boolean = js.native
  def isCancelBeforeStart(): Boolean = js.native
  def isPopup(): Boolean = js.native
  /* private */ def onKeyDown(event: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", "PopupEditorWrapper")
@js.native
object PopupEditorWrapper extends js.Object {
  var DOM_KEY_POPUP_EDITOR_WRAPPER: String = js.native
}

