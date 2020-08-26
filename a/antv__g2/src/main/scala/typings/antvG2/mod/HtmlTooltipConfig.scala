package typings.antvG2.mod

import typings.antvG2.antvG2Booleans.`true`
import typings.antvG2.antvG2Strings.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  var containerTpl: js.UndefOr[String] = js.native
  var enterable: js.UndefOr[Boolean] = js.native
  var `g2-tooltip`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-list`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-list-item`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-marker`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-title`: js.UndefOr[Record[String, _]] = js.native
  var `g2-tooltip-value`: js.UndefOr[Record[String, _]] = js.native
  var htmlContent: js.UndefOr[js.Function2[/* title */ String, /* items */ js.Array[TooltipItem], String]] = js.native
  var itemTpl: js.UndefOr[String] = js.native
  @JSName("type")
  var type_HtmlTooltipConfig: js.UndefOr[default] = js.native
  @JSName("useHtml")
  var useHtml_HtmlTooltipConfig: js.UndefOr[`true`] = js.native
}

object HtmlTooltipConfig {
  @scala.inline
  def apply(): HtmlTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlTooltipConfig]
  }
  @scala.inline
  implicit class HtmlTooltipConfigOps[Self <: HtmlTooltipConfig] (val x: Self) extends AnyVal {
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
    def setContainerTpl(value: String): Self = this.set("containerTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerTpl: Self = this.set("containerTpl", js.undefined)
    @scala.inline
    def setEnterable(value: Boolean): Self = this.set("enterable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterable: Self = this.set("enterable", js.undefined)
    @scala.inline
    def `setG2-tooltip`(value: Record[String, _]): Self = this.set("g2-tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-tooltip`: Self = this.set("g2-tooltip", js.undefined)
    @scala.inline
    def `setG2-tooltip-list`(value: Record[String, _]): Self = this.set("g2-tooltip-list", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-tooltip-list`: Self = this.set("g2-tooltip-list", js.undefined)
    @scala.inline
    def `setG2-tooltip-list-item`(value: Record[String, _]): Self = this.set("g2-tooltip-list-item", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-tooltip-list-item`: Self = this.set("g2-tooltip-list-item", js.undefined)
    @scala.inline
    def `setG2-tooltip-marker`(value: Record[String, _]): Self = this.set("g2-tooltip-marker", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-tooltip-marker`: Self = this.set("g2-tooltip-marker", js.undefined)
    @scala.inline
    def `setG2-tooltip-title`(value: Record[String, _]): Self = this.set("g2-tooltip-title", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-tooltip-title`: Self = this.set("g2-tooltip-title", js.undefined)
    @scala.inline
    def `setG2-tooltip-value`(value: Record[String, _]): Self = this.set("g2-tooltip-value", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-tooltip-value`: Self = this.set("g2-tooltip-value", js.undefined)
    @scala.inline
    def setHtmlContent(value: (/* title */ String, /* items */ js.Array[TooltipItem]) => String): Self = this.set("htmlContent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    @scala.inline
    def setItemTpl(value: String): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTpl: Self = this.set("itemTpl", js.undefined)
    @scala.inline
    def setType(value: default): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseHtml(value: `true`): Self = this.set("useHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHtml: Self = this.set("useHtml", js.undefined)
  }
  
}

