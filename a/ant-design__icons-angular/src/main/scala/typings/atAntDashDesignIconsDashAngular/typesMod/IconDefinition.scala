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
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDefinition]
  }
}

