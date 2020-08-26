package typings.antvG2.mod

import typings.antvG2.antvG2Booleans.`false`
import typings.antvG2.antvG2Strings.default
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  var boardStyle: js.UndefOr[background] = js.native
  var itemGap: js.UndefOr[Double] = js.native
  var nameStyle: js.UndefOr[text] = js.native
  var titleStyle: js.UndefOr[text] = js.native
  @JSName("type")
  var type_CanvasTooltipConfig: js.UndefOr[default] = js.native
  @JSName("useHtml")
  var useHtml_CanvasTooltipConfig: `false` = js.native
  var valueStyle: js.UndefOr[text] = js.native
}

object CanvasTooltipConfig {
  @scala.inline
  def apply(useHtml: `false`): CanvasTooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = useHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTooltipConfig]
  }
  @scala.inline
  implicit class CanvasTooltipConfigOps[Self <: CanvasTooltipConfig] (val x: Self) extends AnyVal {
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
    def setUseHtml(value: `false`): Self = this.set("useHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoardStyle(value: background): Self = this.set("boardStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoardStyle: Self = this.set("boardStyle", js.undefined)
    @scala.inline
    def setItemGap(value: Double): Self = this.set("itemGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemGap: Self = this.set("itemGap", js.undefined)
    @scala.inline
    def setNameStyle(value: text): Self = this.set("nameStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameStyle: Self = this.set("nameStyle", js.undefined)
    @scala.inline
    def setTitleStyle(value: text): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setType(value: default): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValueStyle(value: text): Self = this.set("valueStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueStyle: Self = this.set("valueStyle", js.undefined)
  }
  
}

