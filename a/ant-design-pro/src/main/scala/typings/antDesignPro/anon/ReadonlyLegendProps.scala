package typings.antDesignPro.anon

import typings.antDesignPro.antDesignProStrings.multiple
import typings.antDesignPro.antDesignProStrings.single
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.text
import typings.bizcharts.mod.LegendLayoutType
import typings.bizcharts.mod.LegendPositionType
import typings.bizcharts.mod.MarkerType
import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.std.CanvasRenderingContext2D
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.LegendProps> */
trait ReadonlyLegendProps extends StObject {
  
  val allowAllCanceled: js.UndefOr[Boolean] = js.undefined
  
  val background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.undefined
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val clickable: js.UndefOr[Boolean] = js.undefined
  
  val container: js.UndefOr[String] = js.undefined
  
  val containerTpl: js.UndefOr[String] = js.undefined
  
  val custom: js.UndefOr[Boolean] = js.undefined
  
  val `g2-legend`: js.UndefOr[CSSProperties] = js.undefined
  
  val `g2-legend-item`: js.UndefOr[CSSProperties] = js.undefined
  
  val `g2-legend-list-item`: js.UndefOr[CSSProperties] = js.undefined
  
  val `g2-legend-marker`: js.UndefOr[CSSProperties] = js.undefined
  
  val `g2-legend-text`: js.UndefOr[CSSProperties] = js.undefined
  
  val height: js.UndefOr[Double] = js.undefined
  
  val hoverable: js.UndefOr[Boolean] = js.undefined
  
  val itemFormatter: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], String | Double]] = js.undefined
  
  val itemGap: js.UndefOr[Double] = js.undefined
  
  val itemMarginBottom: js.UndefOr[Double] = js.undefined
  
  val itemTpl: js.UndefOr[
    String | (js.Function4[
      /* value */ js.UndefOr[String], 
      /* color */ js.UndefOr[String], 
      /* checked */ js.UndefOr[Boolean], 
      /* index */ js.UndefOr[Double], 
      String
    ])
  ] = js.undefined
  
  val itemWidth: js.UndefOr[Double] = js.undefined
  
  val items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val layout: js.UndefOr[LegendLayoutType] = js.undefined
  
  val marker: js.UndefOr[
    String | MarkerType | (js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* r */ js.UndefOr[Double], 
      /* ctx */ js.UndefOr[CanvasRenderingContext2D], 
      Unit
    ])
  ] = js.undefined
  
  val name: js.UndefOr[String] = js.undefined
  
  val offsetX: js.UndefOr[Double] = js.undefined
  
  val offsetY: js.UndefOr[Double] = js.undefined
  
  val onClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  
  val onHover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  
  val position: js.UndefOr[LegendPositionType] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  val scroll: js.UndefOr[Boolean] = js.undefined
  
  val selectedMode: js.UndefOr[single | multiple] = js.undefined
  
  val slidable: js.UndefOr[Boolean] = js.undefined
  
  val textStyle: js.UndefOr[text] = js.undefined
  
  val title: js.UndefOr[Boolean] = js.undefined
  
  val unChecked: js.UndefOr[String] = js.undefined
  
  val useHtml: js.UndefOr[Boolean] = js.undefined
  
  val visible: js.UndefOr[Boolean] = js.undefined
  
  val width: js.UndefOr[Double] = js.undefined
}
object ReadonlyLegendProps {
  
  @scala.inline
  def apply(): ReadonlyLegendProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyLegendProps]
  }
  
  @scala.inline
  implicit class ReadonlyLegendPropsMutableBuilder[Self <: ReadonlyLegendProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAllCanceled(value: Boolean): Self = StObject.set(x, "allowAllCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAllCanceledUndefined: Self = StObject.set(x, "allowAllCanceled", js.undefined)
    
    @scala.inline
    def setBackground(value: background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
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
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def `setG2-legend`(value: CSSProperties): Self = StObject.set(x, "g2-legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-legend-item`(value: CSSProperties): Self = StObject.set(x, "g2-legend-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-legend-itemUndefined`: Self = StObject.set(x, "g2-legend-item", js.undefined)
    
    @scala.inline
    def `setG2-legend-list-item`(value: CSSProperties): Self = StObject.set(x, "g2-legend-list-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-legend-list-itemUndefined`: Self = StObject.set(x, "g2-legend-list-item", js.undefined)
    
    @scala.inline
    def `setG2-legend-marker`(value: CSSProperties): Self = StObject.set(x, "g2-legend-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-legend-markerUndefined`: Self = StObject.set(x, "g2-legend-marker", js.undefined)
    
    @scala.inline
    def `setG2-legend-text`(value: CSSProperties): Self = StObject.set(x, "g2-legend-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-legend-textUndefined`: Self = StObject.set(x, "g2-legend-text", js.undefined)
    
    @scala.inline
    def `setG2-legendUndefined`: Self = StObject.set(x, "g2-legend", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
    
    @scala.inline
    def setItemFormatter(value: /* val */ js.UndefOr[js.Any] => String | Double): Self = StObject.set(x, "itemFormatter", js.Any.fromFunction1(value))
    
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
    def setItemTpl(
      value: String | (js.Function4[
          /* value */ js.UndefOr[String], 
          /* color */ js.UndefOr[String], 
          /* checked */ js.UndefOr[Boolean], 
          /* index */ js.UndefOr[Double], 
          String
        ])
    ): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTplFunction4(
      value: (/* value */ js.UndefOr[String], /* color */ js.UndefOr[String], /* checked */ js.UndefOr[Boolean], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "itemTpl", js.Any.fromFunction4(value))
    
    @scala.inline
    def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLayout(value: LegendLayoutType): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMarker(
      value: String | MarkerType | (js.Function4[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* r */ js.UndefOr[Double], 
          /* ctx */ js.UndefOr[CanvasRenderingContext2D], 
          Unit
        ])
    ): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerFunction4(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* r */ js.UndefOr[Double], /* ctx */ js.UndefOr[CanvasRenderingContext2D]) => Unit
    ): Self = StObject.set(x, "marker", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* ev */ MouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnHover(value: /* ev */ MouseEvent => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    @scala.inline
    def setPosition(value: LegendPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
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
    def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUnChecked(value: String): Self = StObject.set(x, "unChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnCheckedUndefined: Self = StObject.set(x, "unChecked", js.undefined)
    
    @scala.inline
    def setUseHtml(value: Boolean): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHtmlUndefined: Self = StObject.set(x, "useHtml", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
