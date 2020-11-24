package typings.antvG2.mod

import typings.antvG2.antvG2Strings.mini
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  
  var boardStyle: js.UndefOr[background] = js.native
  
  var triangleHeight: js.UndefOr[Double] = js.native
  
  var triangleWidth: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_MiniTooltipConfig: mini = js.native
  
  var valueStyle: js.UndefOr[text] = js.native
}
object MiniTooltipConfig {
  
  @scala.inline
  def apply(`type`: mini): MiniTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniTooltipConfig]
  }
  
  @scala.inline
  implicit class MiniTooltipConfigOps[Self <: MiniTooltipConfig] (val x: Self) extends AnyVal {
    
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
    def setType(value: mini): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoardStyle(value: background): Self = this.set("boardStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoardStyle: Self = this.set("boardStyle", js.undefined)
    
    @scala.inline
    def setTriangleHeight(value: Double): Self = this.set("triangleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleHeight: Self = this.set("triangleHeight", js.undefined)
    
    @scala.inline
    def setTriangleWidth(value: Double): Self = this.set("triangleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleWidth: Self = this.set("triangleWidth", js.undefined)
    
    @scala.inline
    def setValueStyle(value: text): Self = this.set("valueStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueStyle: Self = this.set("valueStyle", js.undefined)
  }
}
