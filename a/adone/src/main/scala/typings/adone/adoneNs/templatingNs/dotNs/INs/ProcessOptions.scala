package typings.adone.adoneNs.templatingNs.dotNs.INs

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends js.Object {
  var destination: js.UndefOr[String] = js.undefined
  var global: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var templateSettings: js.UndefOr[Partial[TemplateSettings]] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    destination: String = null,
    global: String = null,
    path: String = null,
    templateSettings: Partial[TemplateSettings] = null
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (global != null) __obj.updateDynamic("global")(global)
    if (path != null) __obj.updateDynamic("path")(path)
    if (templateSettings != null) __obj.updateDynamic("templateSettings")(templateSettings)
    __obj.asInstanceOf[ProcessOptions]
  }
}

