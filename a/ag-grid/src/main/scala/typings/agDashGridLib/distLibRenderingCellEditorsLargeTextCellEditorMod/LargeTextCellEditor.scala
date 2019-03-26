package typings
package agDashGridLib.distLibRenderingCellEditorsLargeTextCellEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/largeTextCellEditor", "LargeTextCellEditor")
@js.native
class LargeTextCellEditor ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  var focusAfterAttached: js.Any = js.native
  var params: js.Any = js.native
  var textarea: js.Any = js.native
  @JSName("afterGuiAttached")
  def afterGuiAttached_MLargeTextCellEditor(): scala.Unit = js.native
  def getValue(): js.Any = js.native
  @JSName("init")
  def init_MLargeTextCellEditor(params: ILargeTextEditorParams): scala.Unit = js.native
  def isPopup(): scala.Boolean = js.native
  /* private */ def onKeyDown(event: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellEditors/largeTextCellEditor", "LargeTextCellEditor")
@js.native
object LargeTextCellEditor extends js.Object {
  var TEMPLATE: js.Any = js.native
}

