package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationDefinition extends js.Object {
  var default: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var required: Boolean = js.native
  var `type`: js.UndefOr[ConfigurationType] = js.native
}

object ConfigurationDefinition {
  @scala.inline
  def apply(required: Boolean): ConfigurationDefinition = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationDefinition]
  }
  @scala.inline
  implicit class ConfigurationDefinitionOps[Self <: ConfigurationDefinition] (val x: Self) extends AnyVal {
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setType(value: ConfigurationType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

