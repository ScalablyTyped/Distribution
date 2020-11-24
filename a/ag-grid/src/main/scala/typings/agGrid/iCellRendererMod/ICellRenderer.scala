package typings.agGrid.iCellRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellRenderer extends js.Object {
  
  /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
    * then the grid will refresh the cell for you. */
  def refresh(params: js.Any): Boolean = js.native
}
object ICellRenderer {
  
  @scala.inline
  def apply(refresh: js.Any => Boolean): ICellRenderer = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[ICellRenderer]
  }
  
  @scala.inline
  implicit class ICellRendererOps[Self <: ICellRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRefresh(value: js.Any => Boolean): Self = this.set("refresh", js.Any.fromFunction1(value))
  }
}
