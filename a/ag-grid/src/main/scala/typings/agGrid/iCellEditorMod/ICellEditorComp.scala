package typings.agGrid.iCellEditorMod

import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellEditorComp
  extends ICellEditor
     with IComponent[ICellEditorParams]
object ICellEditorComp {
  
  @scala.inline
  def apply(getGui: () => HTMLElement, getValue: () => js.Any): ICellEditorComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[ICellEditorComp]
  }
}
