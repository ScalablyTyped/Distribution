package typings.antDesignIconsAngular.typesMod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachedIconDefinition extends js.Object {
  var icon: SVGElement
  var name: String
  var theme: String
}

object CachedIconDefinition {
  @scala.inline
  def apply(icon: SVGElement, name: String, theme: String): CachedIconDefinition = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedIconDefinition]
  }
}

