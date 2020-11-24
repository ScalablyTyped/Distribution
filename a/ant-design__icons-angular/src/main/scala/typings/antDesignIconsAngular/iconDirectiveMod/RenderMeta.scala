package typings.antDesignIconsAngular.iconDirectiveMod

import typings.antDesignIconsAngular.typesMod.IconDefinition
import typings.antDesignIconsAngular.typesMod.ThemeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderMeta extends js.Object {
  
  var theme: ThemeType = js.native
  
  var twoToneColor: String = js.native
  
  var `type`: String | IconDefinition = js.native
}
object RenderMeta {
  
  @scala.inline
  def apply(theme: ThemeType, twoToneColor: String, `type`: String | IconDefinition): RenderMeta = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], twoToneColor = twoToneColor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMeta]
  }
  
  @scala.inline
  implicit class RenderMetaOps[Self <: RenderMeta] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ThemeType): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoToneColor(value: String): Self = this.set("twoToneColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String | IconDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
