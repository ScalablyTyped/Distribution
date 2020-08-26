package typings.antDesignIconsAngular.typesMod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachedIconDefinition extends js.Object {
  var icon: SVGElement = js.native
  var name: String = js.native
  var theme: String = js.native
}

object CachedIconDefinition {
  @scala.inline
  def apply(icon: SVGElement, name: String, theme: String): CachedIconDefinition = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedIconDefinition]
  }
  @scala.inline
  implicit class CachedIconDefinitionOps[Self <: CachedIconDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIcon(value: SVGElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

