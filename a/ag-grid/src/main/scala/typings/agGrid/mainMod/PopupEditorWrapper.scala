package typings.agGrid.mainMod

import typings.agGrid.iCellEditorMod.ICellEditorComp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "PopupEditorWrapper")
@js.native
class PopupEditorWrapper protected ()
  extends typings.agGrid.popupEditorWrapperMod.PopupEditorWrapper {
  def this(cellEditor: ICellEditorComp) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "PopupEditorWrapper")
@js.native
object PopupEditorWrapper extends js.Object {
  var DOM_KEY_POPUP_EDITOR_WRAPPER: String = js.native
}

