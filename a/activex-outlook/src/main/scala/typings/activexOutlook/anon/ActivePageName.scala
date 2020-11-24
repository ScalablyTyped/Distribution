package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivePageName extends js.Object {
  
  val ActivePageName: String = js.native
}
object ActivePageName {
  
  @scala.inline
  def apply(ActivePageName: String): ActivePageName = {
    val __obj = js.Dynamic.literal(ActivePageName = ActivePageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivePageName]
  }
  
  @scala.inline
  implicit class ActivePageNameOps[Self <: ActivePageName] (val x: Self) extends AnyVal {
    
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
    def setActivePageName(value: String): Self = this.set("ActivePageName", value.asInstanceOf[js.Any])
  }
}
