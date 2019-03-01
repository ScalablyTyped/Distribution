package typings
package adoneLib.adoneNs.templatingNs.dotNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends js.Object {
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var global: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var templateSettings: js.UndefOr[stdLib.Partial[TemplateSettings]] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    destination: java.lang.String = null,
    global: java.lang.String = null,
    path: java.lang.String = null,
    templateSettings: stdLib.Partial[TemplateSettings] = null
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (global != null) __obj.updateDynamic("global")(global)
    if (path != null) __obj.updateDynamic("path")(path)
    if (templateSettings != null) __obj.updateDynamic("templateSettings")(templateSettings)
    __obj.asInstanceOf[ProcessOptions]
  }
}

