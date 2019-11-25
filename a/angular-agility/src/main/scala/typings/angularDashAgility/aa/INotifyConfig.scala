package typings.angularDashAgility.aa

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedDefaults = namedDefaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyConfig]
  }
}

