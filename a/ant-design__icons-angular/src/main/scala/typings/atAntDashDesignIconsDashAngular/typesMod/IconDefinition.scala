package typings.atAntDashDesignIconsDashAngular.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconDefinition extends js.Object {
  var icon: String
  var name: String
  var theme: js.UndefOr[ThemeType] = js.undefined
}

object IconDefinition {
  @scala.inline
  def apply(icon: String, name: String, theme: ThemeType = null): IconDefinition = {
    val __obj = js.Dynamic.literal(icon = icon, name = name)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IconDefinition]
  }
}

