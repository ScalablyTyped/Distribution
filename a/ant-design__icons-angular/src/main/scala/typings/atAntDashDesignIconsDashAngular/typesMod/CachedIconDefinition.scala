package typings.atAntDashDesignIconsDashAngular.typesMod

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
    val __obj = js.Dynamic.literal(icon = icon, name = name, theme = theme)
  
    __obj.asInstanceOf[CachedIconDefinition]
  }
}

