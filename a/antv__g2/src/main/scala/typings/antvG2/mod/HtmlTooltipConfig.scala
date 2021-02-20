package typings.antvG2.mod

import typings.antvG2.antvG2Booleans.`true`
import typings.antvG2.antvG2Strings.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class HtmlTooltipConfigMutableBuilder[Self <: HtmlTooltipConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    @scala.inline
    def setEnterable(value: Boolean): Self = StObject.set(x, "enterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterableUndefined: Self = StObject.set(x, "enterable", js.undefined)
    
    @scala.inline
    def `setG2-tooltip`(value: Record[String, _]): Self = StObject.set(x, "g2-tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list`(value: Record[String, _]): Self = StObject.set(x, "g2-tooltip-list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list-item`(value: Record[String, _]): Self = StObject.set(x, "g2-tooltip-list-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-list-itemUndefined`: Self = StObject.set(x, "g2-tooltip-list-item", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-listUndefined`: Self = StObject.set(x, "g2-tooltip-list", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-marker`(value: Record[String, _]): Self = StObject.set(x, "g2-tooltip-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-markerUndefined`: Self = StObject.set(x, "g2-tooltip-marker", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-title`(value: Record[String, _]): Self = StObject.set(x, "g2-tooltip-title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-titleUndefined`: Self = StObject.set(x, "g2-tooltip-title", js.undefined)
    
    @scala.inline
    def `setG2-tooltip-value`(value: Record[String, _]): Self = StObject.set(x, "g2-tooltip-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setG2-tooltip-valueUndefined`: Self = StObject.set(x, "g2-tooltip-value", js.undefined)
    
    @scala.inline
    def `setG2-tooltipUndefined`: Self = StObject.set(x, "g2-tooltip", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: (/* title */ String, /* items */ js.Array[TooltipItem]) => String): Self = StObject.set(x, "htmlContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    @scala.inline
    def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    @scala.inline
    def setType(value: default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseHtml(value: `true`): Self = StObject.set(x, "useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHtmlUndefined: Self = StObject.set(x, "useHtml", js.undefined)
  }
}
