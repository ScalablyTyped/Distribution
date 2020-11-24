package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBar extends js.Object {
  
  val ToolBar: Boolean = js.native
}
object ToolBar {
  
  @scala.inline
  def apply(ToolBar: Boolean): ToolBar = {
    val __obj = js.Dynamic.literal(ToolBar = ToolBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBar]
  }
  
  @scala.inline
  implicit class ToolBarOps[Self <: ToolBar] (val x: Self) extends AnyVal {
    
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
    def setToolBar(value: Boolean): Self = this.set("ToolBar", value.asInstanceOf[js.Any])
  }
}
