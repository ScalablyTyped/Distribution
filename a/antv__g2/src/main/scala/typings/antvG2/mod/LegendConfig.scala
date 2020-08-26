package typings.antvG2.mod

import typings.antvG2.anon.Fill
import typings.antvG2.anon.Marker
import typings.antvG2.antvG2Strings.`bottom-center`
import typings.antvG2.antvG2Strings.`bottom-left`
import typings.antvG2.antvG2Strings.`bottom-right`
import typings.antvG2.antvG2Strings.`left-bottom`
import typings.antvG2.antvG2Strings.`left-center`
import typings.antvG2.antvG2Strings.`left-top`
import typings.antvG2.antvG2Strings.`right-bottom`
import typings.antvG2.antvG2Strings.`right-center`
import typings.antvG2.antvG2Strings.`right-top`
import typings.antvG2.antvG2Strings.`top-center`
import typings.antvG2.antvG2Strings.`top-left`
import typings.antvG2.antvG2Strings.`top-right`
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.horizontal
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.multiple
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.single
import typings.antvG2.antvG2Strings.top
import typings.antvG2.antvG2Strings.vertical
import typings.antvG2.mod.Styles.text
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendConfig extends js.Object {
  var allowAllCanceled: js.UndefOr[Double] = js.native
  var background: js.UndefOr[Fill] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
  var containerTpl: js.UndefOr[String] = js.native
  var custom: js.UndefOr[Double] = js.native
  var defaultClickHandlerEnabled: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var itemFormatter: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  var itemGap: js.UndefOr[Double] = js.native
  var itemMarginBottom: js.UndefOr[Double] = js.native
  var itemTpl: js.UndefOr[String] = js.native
  var itemWidth: js.UndefOr[Double] = js.native
  var items: js.UndefOr[js.Array[Marker]] = js.native
  var layout: js.UndefOr[vertical | horizontal] = js.native
  var marker: js.UndefOr[String | js.Function] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onHover: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var position: js.UndefOr[
    top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.native
  var selectedMode: js.UndefOr[single | multiple] = js.native
  var slidable: js.UndefOr[Boolean] = js.native
  var textStyle: js.UndefOr[text] = js.native
  var title: js.UndefOr[text] = js.native
  var unCheckColor: js.UndefOr[String] = js.native
  var useHtml: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object LegendConfig {
  @scala.inline
  def apply(): LegendConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendConfig]
  }
  @scala.inline
  implicit class LegendConfigOps[Self <: LegendConfig] (val x: Self) extends AnyVal {
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
    def setAllowAllCanceled(value: Double): Self = this.set("allowAllCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAllCanceled: Self = this.set("allowAllCanceled", js.undefined)
    @scala.inline
    def setBackground(value: Fill): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerTpl(value: String): Self = this.set("containerTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerTpl: Self = this.set("containerTpl", js.undefined)
    @scala.inline
    def setCustom(value: Double): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDefaultClickHandlerEnabled(value: Boolean): Self = this.set("defaultClickHandlerEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultClickHandlerEnabled: Self = this.set("defaultClickHandlerEnabled", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    @scala.inline
    def setItemFormatter(value: /* value */ String => String): Self = this.set("itemFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemFormatter: Self = this.set("itemFormatter", js.undefined)
    @scala.inline
    def setItemGap(value: Double): Self = this.set("itemGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemGap: Self = this.set("itemGap", js.undefined)
    @scala.inline
    def setItemMarginBottom(value: Double): Self = this.set("itemMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemMarginBottom: Self = this.set("itemMarginBottom", js.undefined)
    @scala.inline
    def setItemTpl(value: String): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTpl: Self = this.set("itemTpl", js.undefined)
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Marker*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Marker]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLayout(value: vertical | horizontal): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMarker(value: String | js.Function): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ MouseEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHover(value: /* e */ MouseEvent => Unit): Self = this.set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setPosition(
      value: top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSelectedMode(value: single | multiple): Self = this.set("selectedMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMode: Self = this.set("selectedMode", js.undefined)
    @scala.inline
    def setSlidable(value: Boolean): Self = this.set("slidable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidable: Self = this.set("slidable", js.undefined)
    @scala.inline
    def setTextStyle(value: text): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setTitle(value: text): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUnCheckColor(value: String): Self = this.set("unCheckColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnCheckColor: Self = this.set("unCheckColor", js.undefined)
    @scala.inline
    def setUseHtml(value: Boolean): Self = this.set("useHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHtml: Self = this.set("useHtml", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

