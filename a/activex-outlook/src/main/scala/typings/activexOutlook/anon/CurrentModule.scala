package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.NavigationModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentModule extends js.Object {
  
  val CurrentModule: NavigationModule = js.native
}
object CurrentModule {
  
  @scala.inline
  def apply(CurrentModule: NavigationModule): CurrentModule = {
    val __obj = js.Dynamic.literal(CurrentModule = CurrentModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentModule]
  }
  
  @scala.inline
  implicit class CurrentModuleOps[Self <: CurrentModule] (val x: Self) extends AnyVal {
    
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
    def setCurrentModule(value: NavigationModule): Self = this.set("CurrentModule", value.asInstanceOf[js.Any])
  }
}
