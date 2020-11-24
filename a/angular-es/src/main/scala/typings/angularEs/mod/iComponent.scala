package typings.angularEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component interface
  * @see https://docs.angularjs.org/guide/component
  */
@js.native
trait iComponent extends js.Object {
  
  var bindings: js.UndefOr[js.Object] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
  var require: js.UndefOr[String] = js.native
  
  var selector: String = js.native
  
  var template: String = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
  var transclude: js.UndefOr[String] = js.native
}
object iComponent {
  
  @scala.inline
  def apply(selector: String, template: String): iComponent = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[iComponent]
  }
  
  @scala.inline
  implicit class iComponentOps[Self <: iComponent] (val x: Self) extends AnyVal {
    
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindings(value: js.Object): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setRequire(value: String): Self = this.set("require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setTransclude(value: String): Self = this.set("transclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransclude: Self = this.set("transclude", js.undefined)
  }
}
