package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxPlotVisual extends StObject {
  
  /**
    * The list of custom actions that are configured for a visual.
    */
  var Actions: js.UndefOr[VisualCustomActionList] = js.undefined
  
  /**
    * The configuration settings of the visual.
    */
  var ChartConfiguration: js.UndefOr[BoxPlotChartConfiguration] = js.undefined
  
  /**
    * The column hierarchy that is used during drill-downs and drill-ups.
    */
  var ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined
  
  /**
    * The subtitle that is displayed on the visual.
    */
  var Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined
  
  /**
    * The title that is displayed on the visual.
    */
  var Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
  
  /**
    * The unique identifier of a visual. This identifier must be unique within the context of a dashboard, template, or analysis. Two dashboards, analyses, or templates can have visuals with the same identifiers..
    */
  var VisualId: ShortRestrictiveResourceId
}
object BoxPlotVisual {
  
  inline def apply(VisualId: ShortRestrictiveResourceId): BoxPlotVisual = {
    val __obj = js.Dynamic.literal(VisualId = VisualId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxPlotVisual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxPlotVisual] (val x: Self) extends AnyVal {
    
    inline def setActions(value: VisualCustomActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: VisualCustomAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setChartConfiguration(value: BoxPlotChartConfiguration): Self = StObject.set(x, "ChartConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChartConfigurationUndefined: Self = StObject.set(x, "ChartConfiguration", js.undefined)
    
    inline def setColumnHierarchies(value: ColumnHierarchyList): Self = StObject.set(x, "ColumnHierarchies", value.asInstanceOf[js.Any])
    
    inline def setColumnHierarchiesUndefined: Self = StObject.set(x, "ColumnHierarchies", js.undefined)
    
    inline def setColumnHierarchiesVarargs(value: ColumnHierarchy*): Self = StObject.set(x, "ColumnHierarchies", js.Array(value*))
    
    inline def setSubtitle(value: VisualSubtitleLabelOptions): Self = StObject.set(x, "Subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "Subtitle", js.undefined)
    
    inline def setTitle(value: VisualTitleLabelOptions): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setVisualId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "VisualId", value.asInstanceOf[js.Any])
  }
}
