package typings.agGrid.mainMod

import typings.agGrid.iCellEditorMod.ICellEditorComp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "PopupEditorWrapper")
@js.native
class PopupEditorWrapper protected ()
  extends typings.agGrid.popupEditorWrapperMod.PopupEditorWrapper {
  def this(cellEditor: ICellEditorComp) = this()
}
/* static members */
object PopupEditorWrapper {
  
  @JSImport("ag-grid/dist/lib/main", "PopupEditorWrapper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "PopupEditorWrapper.DOM_KEY_POPUP_EDITOR_WRAPPER")
  @js.native
  def DOM_KEY_POPUP_EDITOR_WRAPPER: String = js.native
  @scala.inline
  def DOM_KEY_POPUP_EDITOR_WRAPPER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_KEY_POPUP_EDITOR_WRAPPER")(x.asInstanceOf[js.Any])
}
