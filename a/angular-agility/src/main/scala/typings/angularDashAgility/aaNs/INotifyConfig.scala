package typings.angularDashAgility.aaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyConfig extends js.Object {
  var name: String
  var namedDefaults: INotifyDefaults
  var options: INotifyOptions
  var template: js.UndefOr[String] = js.undefined
  var templateName: js.UndefOr[String] = js.undefined
}

object INotifyConfig {
  @scala.inline
  def apply(
    name: String,
    namedDefaults: INotifyDefaults,
    options: INotifyOptions,
    template: String = null,
    templateName: String = null
  ): INotifyConfig = {
    val __obj = js.Dynamic.literal(name = name, namedDefaults = namedDefaults, options = options)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateName != null) __obj.updateDynamic("templateName")(templateName)
    __obj.asInstanceOf[INotifyConfig]
  }
}

