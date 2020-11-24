package typings.angularStrap.mgcrea.ngStrap.tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITabOptions extends js.Object {
  
  var activeClass: js.UndefOr[String] = js.native
  
  var animation: js.UndefOr[String] = js.native
  
  var navClass: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
}
object ITabOptions {
  
  @scala.inline
  def apply(): ITabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabOptions]
  }
  
  @scala.inline
  implicit class ITabOptionsOps[Self <: ITabOptions] (val x: Self) extends AnyVal {
    
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setNavClass(value: String): Self = this.set("navClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavClass: Self = this.set("navClass", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
