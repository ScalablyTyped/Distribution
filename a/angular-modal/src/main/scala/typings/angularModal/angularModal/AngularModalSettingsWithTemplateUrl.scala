package typings.angularModal.angularModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngularModalSettingsWithTemplateUrl extends AngularModalSettings {
  
  var templateUrl: String = js.native
}
object AngularModalSettingsWithTemplateUrl {
  
  @scala.inline
  def apply(templateUrl: String): AngularModalSettingsWithTemplateUrl = {
    val __obj = js.Dynamic.literal(templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularModalSettingsWithTemplateUrl]
  }
  
  @scala.inline
  implicit class AngularModalSettingsWithTemplateUrlOps[Self <: AngularModalSettingsWithTemplateUrl] (val x: Self) extends AnyVal {
    
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
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
  }
}
