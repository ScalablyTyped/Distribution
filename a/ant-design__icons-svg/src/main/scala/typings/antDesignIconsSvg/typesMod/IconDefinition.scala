package typings.antDesignIconsSvg.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconDefinition extends js.Object {
  var icon: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode
  var name: String
  var theme: ThemeType
}

object IconDefinition {
  @scala.inline
  def apply(
    icon: (js.Function2[/* primaryColor */ String, /* secondaryColor */ String, AbstractNode]) | AbstractNode,
    name: String,
    theme: ThemeType
  ): IconDefinition = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDefinition]
  }
}

