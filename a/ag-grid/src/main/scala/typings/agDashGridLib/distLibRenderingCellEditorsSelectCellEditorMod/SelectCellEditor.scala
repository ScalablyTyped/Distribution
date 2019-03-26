package typings
package agDashGridLib.distLibRenderingCellEditorsSelectCellEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/selectCellEditor", "SelectCellEditor")
@js.native
class SelectCellEditor ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  var eSelect: js.Any = js.native
  var focusAfterAttached: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var valueFormatterService: js.Any = js.native
  @JSName("afterGuiAttached")
  def afterGuiAttached_MSelectCellEditor(): scala.Unit = js.native
  def focusIn(): scala.Unit = js.native
  def getValue(): js.Any = js.native
  @JSName("init")
  def init_MSelectCellEditor(params: ISelectCellEditorParams): scala.Unit = js.native
}

