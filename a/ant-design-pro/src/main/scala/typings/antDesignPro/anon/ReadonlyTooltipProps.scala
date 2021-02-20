package typings.antDesignPro.anon

import typings.bizcharts.anon.Style
import typings.bizcharts.mod.PositionType
import typings.bizcharts.mod.triggerOnType
import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.TooltipProps> */
@js.native
trait ReadonlyTooltipProps extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val containerTpl: js.UndefOr[String] = js.native
  
  val crosshairs: js.UndefOr[Style | Boolean] = js.native
  
  val enterable: js.UndefOr[Boolean] = js.native
  
  val follow: js.UndefOr[Boolean] = js.native
  
  val `g2-tooltip`: js.UndefOr[CSSProperties] = js.native
  
  val `g2-tooltip-list`: js.UndefOr[CSSProperties] = js.native
  
  val `g2-tooltip-list-item`: js.UndefOr[CSSProperties] = js.native
  
  val `g2-tooltip-marker`: js.UndefOr[CSSProperties] = js.native
  
  val `g2-tooltip-title`: js.UndefOr[CSSProperties] = js.native
  
  val hideMarkers: js.UndefOr[Boolean] = js.native
  
  val htmlContent: js.UndefOr[
    js.Function2[/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]], String]
  ] = js.native
  
  val inPlot: js.UndefOr[Boolean] = js.native
  
  val itemTpl: js.UndefOr[String] = js.native
  
  val key: js.UndefOr[typings.react.mod.Key] = js.native
  
  val offset: js.UndefOr[Double] = js.native
  
  val position: js.UndefOr[PositionType] = js.native
  
  val ref: js.UndefOr[LegacyRef[_]] = js.native
  
  val shared: js.UndefOr[Boolean] = js.native
  
  val showTitle: js.UndefOr[Boolean] = js.native
  
  val title: js.UndefOr[String] = js.native
  
  val triggerOn: js.UndefOr[triggerOnType] = js.native
  
  val `type`: js.UndefOr[String] = js.native
  
  val useHtml: js.UndefOr[Boolean] = js.native
}
object ReadonlyTooltipProps {
  
  @scala.inline
  def apply(): ReadonlyTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyTooltipProps]
  }
  
  @scala.inline
  implicit class ReadonlyTooltipPropsMutableBuilder[Self <: ReadonlyTooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    @scala.inline
    def setCrosshairs(value: Style | Boolean): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsUndefined: Self = StObject.set(x, "crosshairs", js.undefined)
    
    @scala.inline
    def setEnterable(value: Boolean): Self = StObject.set(x, "enterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterableUndefined: Self = StObject.set(x, "enterable", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    @scala.inline
    def `setG2-tooltip`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list-item`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-list-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list-itemUndefined`: Self = StObject.set(x, "g2-tooltip-list-item", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-listUndefined`: Self = StObject.set(x, "g2-tooltip-list", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-marker`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-markerUndefined`: Self = StObject.set(x, "g2-tooltip-marker", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-title`(value: CSSProperties): Self = StObject.set(x, "g2-tooltip-title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-titleUndefined`: Self = StObject.set(x, "g2-tooltip-title", js.undefined)
    
    @scala.inline
    def `setG2-tooltipUndefined`: Self = StObject.set(x, "g2-tooltip", js.undefined)
    
    @scala.inline
    def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]]) => String): Self = StObject.set(x, "htmlContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    @scala.inline
    def setInPlot(value: Boolean): Self = StObject.set(x, "inPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPlotUndefined: Self = StObject.set(x, "inPlot", js.undefined)
    
    @scala.inline
    def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTriggerOn(value: triggerOnType): Self = StObject.set(x, "triggerOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerOnUndefined: Self = StObject.set(x, "triggerOn", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseHtml(value: Boolean): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHtmlUndefined: Self = StObject.set(x, "useHtml", js.undefined)
  }
}
