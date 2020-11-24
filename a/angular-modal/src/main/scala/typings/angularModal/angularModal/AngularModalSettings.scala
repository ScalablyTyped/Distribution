package typings.angularModal.angularModal

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngularModalSettings extends js.Object {
  
  var container: js.UndefOr[AngularModalJQuerySelector] = js.native
  
  var controller: js.UndefOr[AngularModalControllerDefinition] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
}
object AngularModalSettings {
  
  @scala.inline
  def apply(): AngularModalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AngularModalSettings]
  }
  
  @scala.inline
  implicit class AngularModalSettingsOps[Self <: AngularModalSettings] (val x: Self) extends AnyVal {
    
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
    def setContainerVarargs(value: (js.Any | Element)*): Self = this.set("container", js.Array(value :_*))
    
    @scala.inline
    def setContainer(value: AngularModalJQuerySelector): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setController(value: AngularModalControllerDefinition): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
  }
}
