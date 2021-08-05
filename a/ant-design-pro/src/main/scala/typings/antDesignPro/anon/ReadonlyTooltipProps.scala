package typings.antDesignPro.anon

import typings.bizcharts.anon.Style
import typings.bizcharts.mod.PositionType
import typings.bizcharts.mod.triggerOnType
import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.TooltipProps> */
trait ReadonlyTooltipProps extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val containerTpl: js.UndefOr[String] = js.undefined
  
  val crosshairs: js.UndefOr[Style | Boolean] = js.undefined
  
  val enterable: js.UndefOr[Boolean] = js.undefined
  
  val follow: js.UndefOr[Boolean] = js.undefined
  
  val `g2-tooltip`: js.UndefOr[CSSProperties] = js.undefined
  
  val `g2-tooltip-list`: js.UndefOr[CSSProperties] = js.undefined
  
  val `g2-tooltip-list-item`: js.UndefOr[CSSProperties] = js.undefined
  
  val `g2-tooltip-marker`: js.UndefOr[CSSProperties] = js.undefined
  
  val `g2-tooltip-title`: js.UndefOr[CSSProperties] = js.undefined
  
  val hideMarkers: js.UndefOr[Boolean] = js.undefined
  
  val htmlContent: js.UndefOr[
    js.Function2[/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[js.Any]], String]
  ] = js.undefined
  
  val inPlot: js.UndefOr[Boolean] = js.undefined
  
  val itemTpl: js.UndefOr[String] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val offset: js.UndefOr[Double] = js.undefined
  
  val position: js.UndefOr[PositionType] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  val shared: js.UndefOr[Boolean] = js.undefined
  
  val showTitle: js.UndefOr[Boolean] = js.undefined
  
  val title: js.UndefOr[String] = js.undefined
  
  val triggerOn: js.UndefOr[triggerOnType] = js.undefined
  
  val `type`: js.UndefOr[String] = js.undefined
  
  val useHtml: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyTooltipProps {
  
  inline def apply(): ReadonlyTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyTooltipProps]
  }
  
  extension [Self <: ReadonlyTooltipProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    inline def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    inline def setCrosshairs(value: Style | Boolean): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    inline def setCrosshairsUndefined: Self = StObject.set(x, "crosshairs", js.undefined)
    
    inline def setEnterable(value: Boolean): Self = StObject.set(x, "enterable", value.asInstanceOf[js.Any])
    
    inline def setEnterableUndefined: Self = StObject.set(x, "enterable", js.undefined)
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def `setG2-tooltip`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip", value.asInstanceOf[js.Any])
    
    inline def `setG2-tooltip-list`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-list", value.asInstanceOf[js.Any])
    
    inline def `setG2-tooltip-list-item`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-list-item", value.asInstanceOf[js.Any])
    
    inline def `setG2-tooltip-list-itemUndefined`: Self = StObject.set(x, "g2-tooltip-list-item", js.undefined)
    
    inline def `setG2-tooltip-listUndefined`: Self = StObject.set(x, "g2-tooltip-list", js.undefined)
    
    inline def `setG2-tooltip-marker`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-marker", value.asInstanceOf[js.Any])
    
    inline def `setG2-tooltip-markerUndefined`: Self = StObject.set(x, "g2-tooltip-marker", js.undefined)
    
    inline def `setG2-tooltip-title`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-title", value.asInstanceOf[js.Any])
    
    inline def `setG2-tooltip-titleUndefined`: Self = StObject.set(x, "g2-tooltip-title", js.undefined)
    
    inline def `setG2-tooltipUndefined`: Self = StObject.set(x, "g2-tooltip", js.undefined)
    
    inline def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
    
    inline def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
    
    inline def setHtmlContent(value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[js.Any]]) => String): Self = StObject.set(x, "htmlContent", js.Any.fromFunction2(value))
    
    inline def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    inline def setInPlot(value: Boolean): Self = StObject.set(x, "inPlot", value.asInstanceOf[js.Any])
    
    inline def setInPlotUndefined: Self = StObject.set(x, "inPlot", js.undefined)
    
    inline def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    inline def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTriggerOn(value: triggerOnType): Self = StObject.set(x, "triggerOn", value.asInstanceOf[js.Any])
    
    inline def setTriggerOnUndefined: Self = StObject.set(x, "triggerOn", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseHtml(value: Boolean): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    inline def setUseHtmlUndefined: Self = StObject.set(x, "useHtml", js.undefined)
  }
}
