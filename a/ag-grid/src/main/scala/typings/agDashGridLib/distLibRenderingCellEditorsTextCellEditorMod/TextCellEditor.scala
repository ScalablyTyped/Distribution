package typings
package agDashGridLib.distLibRenderingCellEditorsTextCellEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/textCellEditor", "TextCellEditor")
@js.native
class TextCellEditor ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  var focusAfterAttached: js.Any = js.native
  var highlightAllOnFocus: js.Any = js.native
  var params: js.Any = js.native
  @JSName("afterGuiAttached")
  def afterGuiAttached_MTextCellEditor(): scala.Unit = js.native
  def focusIn(): scala.Unit = js.native
  /* private */ def getStartValue(params: js.Any): js.Any = js.native
  def getValue(): js.Any = js.native
  @JSName("init")
  def init_MTextCellEditor(params: ITextCellEditorParams): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellEditors/textCellEditor", "TextCellEditor")
@js.native
object TextCellEditor extends js.Object {
  var TEMPLATE: js.Any = js.native
}

