package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explorer extends js.Object {
  
  val Explorer: typings.activexOutlook.Outlook.Explorer = js.native
}
object Explorer {
  
  @scala.inline
  def apply(Explorer: typings.activexOutlook.Outlook.Explorer): Explorer = {
    val __obj = js.Dynamic.literal(Explorer = Explorer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorer]
  }
  
  @scala.inline
  implicit class ExplorerOps[Self <: Explorer] (val x: Self) extends AnyVal {
    
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
    def setExplorer(value: typings.activexOutlook.Outlook.Explorer): Self = this.set("Explorer", value.asInstanceOf[js.Any])
  }
}
