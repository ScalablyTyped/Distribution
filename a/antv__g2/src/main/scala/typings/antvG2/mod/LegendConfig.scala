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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendConfig extends StObject {
  
  var allowAllCanceled: js.UndefOr[Double] = js.undefined
  
  var background: js.UndefOr[Fill] = js.undefined
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var containerTpl: js.UndefOr[String] = js.undefined
  
  var custom: js.UndefOr[Double] = js.undefined
  
  var defaultClickHandlerEnabled: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hoverable: js.UndefOr[Boolean] = js.undefined
  
  var itemFormatter: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  
  var itemGap: js.UndefOr[Double] = js.undefined
  
  var itemMarginBottom: js.UndefOr[Double] = js.undefined
  
  var itemTpl: js.UndefOr[String] = js.undefined
  
  var itemWidth: js.UndefOr[Double] = js.undefined
  
  var items: js.UndefOr[js.Array[Marker]] = js.undefined
  
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
  
  var marker: js.UndefOr[String | js.Function] = js.undefined
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  
  var onHover: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  
  var position: js.UndefOr[
    top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.undefined
  
  var selectedMode: js.UndefOr[single | multiple] = js.undefined
  
  var slidable: js.UndefOr[Boolean] = js.undefined
  
  var textStyle: js.UndefOr[text] = js.undefined
  
  var title: js.UndefOr[text] = js.undefined
  
  var unCheckColor: js.UndefOr[String] = js.undefined
  
  var useHtml: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object LegendConfig {
  
  inline def apply(): LegendConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendConfig]
  }
  
  extension [Self <: LegendConfig](x: Self) {
    
    inline def setAllowAllCanceled(value: Double): Self = StObject.set(x, "allowAllCanceled", value.asInstanceOf[js.Any])
    
    inline def setAllowAllCanceledUndefined: Self = StObject.set(x, "allowAllCanceled", js.undefined)
    
    inline def setBackground(value: Fill): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    inline def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCustom(value: Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDefaultClickHandlerEnabled(value: Boolean): Self = StObject.set(x, "defaultClickHandlerEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultClickHandlerEnabledUndefined: Self = StObject.set(x, "defaultClickHandlerEnabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
    
    inline def setItemFormatter(value: /* value */ String => String): Self = StObject.set(x, "itemFormatter", js.Any.fromFunction1(value))
    
    inline def setItemFormatterUndefined: Self = StObject.set(x, "itemFormatter", js.undefined)
    
    inline def setItemGap(value: Double): Self = StObject.set(x, "itemGap", value.asInstanceOf[js.Any])
    
    inline def setItemGapUndefined: Self = StObject.set(x, "itemGap", js.undefined)
    
    inline def setItemMarginBottom(value: Double): Self = StObject.set(x, "itemMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setItemMarginBottomUndefined: Self = StObject.set(x, "itemMarginBottom", js.undefined)
    
    inline def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    inline def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    inline def setItems(value: js.Array[Marker]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Marker*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setLayout(value: vertical | horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMarker(value: String | js.Function): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setOnClick(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHover(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    inline def setPosition(
      value: top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSelectedMode(value: single | multiple): Self = StObject.set(x, "selectedMode", value.asInstanceOf[js.Any])
    
    inline def setSelectedModeUndefined: Self = StObject.set(x, "selectedMode", js.undefined)
    
    inline def setSlidable(value: Boolean): Self = StObject.set(x, "slidable", value.asInstanceOf[js.Any])
    
    inline def setSlidableUndefined: Self = StObject.set(x, "slidable", js.undefined)
    
    inline def setTextStyle(value: text): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTitle(value: text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUnCheckColor(value: String): Self = StObject.set(x, "unCheckColor", value.asInstanceOf[js.Any])
    
    inline def setUnCheckColorUndefined: Self = StObject.set(x, "unCheckColor", js.undefined)
    
    inline def setUseHtml(value: Boolean): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    inline def setUseHtmlUndefined: Self = StObject.set(x, "useHtml", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
