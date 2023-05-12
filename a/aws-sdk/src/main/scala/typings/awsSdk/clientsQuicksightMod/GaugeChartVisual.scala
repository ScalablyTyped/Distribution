package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartVisual extends StObject {
  
  /**
    * The list of custom actions that are configured for a visual.
    */
  var Actions: js.UndefOr[VisualCustomActionList] = js.undefined
  
  /**
    * The configuration of a GaugeChartVisual.
    */
  var ChartConfiguration: js.UndefOr[GaugeChartConfiguration] = js.undefined
  
  /**
    * The conditional formatting of a GaugeChartVisual.
    */
  var ConditionalFormatting: js.UndefOr[GaugeChartConditionalFormatting] = js.undefined
  
  /**
    * The subtitle that is displayed on the visual.
    */
  var Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined
  
  /**
    * The title that is displayed on the visual.
    */
  var Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
  
  /**
    * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers.
    */
  var VisualId: ShortRestrictiveResourceId
}
object GaugeChartVisual {
  
  inline def apply(VisualId: ShortRestrictiveResourceId): GaugeChartVisual = {
    val __obj = js.Dynamic.literal(VisualId = VisualId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeChartVisual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeChartVisual] (val x: Self) extends AnyVal {
    
    inline def setActions(value: VisualCustomActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: VisualCustomAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setChartConfiguration(value: GaugeChartConfiguration): Self = StObject.set(x, "ChartConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChartConfigurationUndefined: Self = StObject.set(x, "ChartConfiguration", js.undefined)
    
    inline def setConditionalFormatting(value: GaugeChartConditionalFormatting): Self = StObject.set(x, "ConditionalFormatting", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormattingUndefined: Self = StObject.set(x, "ConditionalFormatting", js.undefined)
    
    inline def setSubtitle(value: VisualSubtitleLabelOptions): Self = StObject.set(x, "Subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "Subtitle", js.undefined)
    
    inline def setTitle(value: VisualTitleLabelOptions): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setVisualId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "VisualId", value.asInstanceOf[js.Any])
  }
}
