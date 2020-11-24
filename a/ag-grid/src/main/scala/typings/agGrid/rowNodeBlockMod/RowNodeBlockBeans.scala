package typings.agGrid.rowNodeBlockMod

import typings.agGrid.contextMod.Context
import typings.agGrid.rowRendererMod.RowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowNodeBlockBeans extends js.Object {
  
  var context: Context = js.native
  
  var rowRenderer: RowRenderer = js.native
}
object RowNodeBlockBeans {
  
  @scala.inline
  def apply(context: Context, rowRenderer: RowRenderer): RowNodeBlockBeans = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowNodeBlockBeans]
  }
  
  @scala.inline
  implicit class RowNodeBlockBeansOps[Self <: RowNodeBlockBeans] (val x: Self) extends AnyVal {
    
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
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowRenderer(value: RowRenderer): Self = this.set("rowRenderer", value.asInstanceOf[js.Any])
  }
}
