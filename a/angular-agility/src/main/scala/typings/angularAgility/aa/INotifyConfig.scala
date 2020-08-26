package typings.angularAgility.aa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotifyConfig extends js.Object {
  var name: String = js.native
  var namedDefaults: INotifyDefaults = js.native
  var options: INotifyOptions = js.native
  var template: js.UndefOr[String] = js.native
  var templateName: js.UndefOr[String] = js.native
}

object INotifyConfig {
  @scala.inline
  def apply(name: String, namedDefaults: INotifyDefaults, options: INotifyOptions): INotifyConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedDefaults = namedDefaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyConfig]
  }
  @scala.inline
  implicit class INotifyConfigOps[Self <: INotifyConfig] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedDefaults(value: INotifyDefaults): Self = this.set("namedDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: INotifyOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateName(value: String): Self = this.set("templateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
  }
  
}

