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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendConfig extends StObject {
  
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
  implicit class LegendConfigMutableBuilder[Self <: LegendConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAllCanceled(value: Double): Self = StObject.set(x, "allowAllCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAllCanceledUndefined: Self = StObject.set(x, "allowAllCanceled", js.undefined)
    
    @scala.inline
    def setBackground(value: Fill): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCustom(value: Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDefaultClickHandlerEnabled(value: Boolean): Self = StObject.set(x, "defaultClickHandlerEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultClickHandlerEnabledUndefined: Self = StObject.set(x, "defaultClickHandlerEnabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
    
    @scala.inline
    def setItemFormatter(value: /* value */ String => String): Self = StObject.set(x, "itemFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemFormatterUndefined: Self = StObject.set(x, "itemFormatter", js.undefined)
    
    @scala.inline
    def setItemGap(value: Double): Self = StObject.set(x, "itemGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGapUndefined: Self = StObject.set(x, "itemGap", js.undefined)
    
    @scala.inline
    def setItemMarginBottom(value: Double): Self = StObject.set(x, "itemMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMarginBottomUndefined: Self = StObject.set(x, "itemMarginBottom", js.undefined)
    
    @scala.inline
    def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Marker]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Marker*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLayout(value: vertical | horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMarker(value: String | js.Function): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    @scala.inline
    def setPosition(
      value: top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSelectedMode(value: single | multiple): Self = StObject.set(x, "selectedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedModeUndefined: Self = StObject.set(x, "selectedMode", js.undefined)
    
    @scala.inline
    def setSlidable(value: Boolean): Self = StObject.set(x, "slidable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidableUndefined: Self = StObject.set(x, "slidable", js.undefined)
    
    @scala.inline
    def setTextStyle(value: text): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUnCheckColor(value: String): Self = StObject.set(x, "unCheckColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnCheckColorUndefined: Self = StObject.set(x, "unCheckColor", js.undefined)
    
    @scala.inline
    def setUseHtml(value: Boolean): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHtmlUndefined: Self = StObject.set(x, "useHtml", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
