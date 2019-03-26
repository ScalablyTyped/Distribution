package typings
package agDashGridLib.distLibRenderingCellEditorsPopupEditorWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", "PopupEditorWrapper")
@js.native
class PopupEditorWrapper protected ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  def this(cellEditor: agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp) = this()
  var cellEditor: js.Any = js.native
  var getGuiCalledOnChild: js.Any = js.native
  var gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper = js.native
  var params: js.Any = js.native
  @JSName("afterGuiAttached")
  def afterGuiAttached_MPopupEditorWrapper(): scala.Unit = js.native
  def focusIn(): scala.Unit = js.native
  def focusOut(): scala.Unit = js.native
  def getValue(): js.Any = js.native
  @JSName("init")
  def init_MPopupEditorWrapper(params: agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams): scala.Unit = js.native
  def isCancelAfterEnd(): scala.Boolean = js.native
  def isCancelBeforeStart(): scala.Boolean = js.native
  def isPopup(): scala.Boolean = js.native
  /* private */ def onKeyDown(event: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", "PopupEditorWrapper")
@js.native
object PopupEditorWrapper extends js.Object {
  var DOM_KEY_POPUP_EDITOR_WRAPPER: java.lang.String = js.native
}

