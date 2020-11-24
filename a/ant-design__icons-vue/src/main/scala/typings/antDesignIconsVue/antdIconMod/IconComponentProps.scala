package typings.antDesignIconsVue.antdIconMod

import typings.antDesignIconsSvg.typesMod.IconDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconComponentProps extends AntdIconProps {
  
  var icon: IconDefinition = js.native
}
object IconComponentProps {
  
  @scala.inline
  def apply(icon: IconDefinition): IconComponentProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconComponentProps]
  }
  
  @scala.inline
  implicit class IconComponentPropsOps[Self <: IconComponentProps] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: IconDefinition): Self = this.set("icon", value.asInstanceOf[js.Any])
  }
}
