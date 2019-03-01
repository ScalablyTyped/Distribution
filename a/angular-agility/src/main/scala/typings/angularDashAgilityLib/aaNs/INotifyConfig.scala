package typings
package angularDashAgilityLib.aaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyConfig extends js.Object {
  var name: java.lang.String
  var namedDefaults: INotifyDefaults
  var options: INotifyOptions
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateName: js.UndefOr[java.lang.String] = js.undefined
}

object INotifyConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    namedDefaults: INotifyDefaults,
    options: INotifyOptions,
    template: java.lang.String = null,
    templateName: java.lang.String = null
  ): INotifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namedDefaults")(namedDefaults)
    __obj.updateDynamic("options")(options)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateName != null) __obj.updateDynamic("templateName")(templateName)
    __obj.asInstanceOf[INotifyConfig]
  }
}

