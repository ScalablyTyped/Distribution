package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunnelChartConfiguration extends StObject {
  
  /**
    * The label options of the categories that are displayed in a FunnelChartVisual.
    */
  var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The options that determine the presentation of the data labels.
    */
  var DataLabelOptions: js.UndefOr[FunnelChartDataLabelOptions] = js.undefined
  
  /**
    * The field well configuration of a FunnelChartVisual.
    */
  var FieldWells: js.UndefOr[FunnelChartFieldWells] = js.undefined
  
  /**
    * The sort configuration of a FunnelChartVisual.
    */
  var SortConfiguration: js.UndefOr[FunnelChartSortConfiguration] = js.undefined
  
  /**
    * The tooltip configuration of a FunnelChartVisual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * The label options for the values that are displayed in a FunnelChartVisual.
    */
  var ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The visual palette configuration of a FunnelChartVisual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
}
object FunnelChartConfiguration {
  
  inline def apply(): FunnelChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunnelChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunnelChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "CategoryLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelOptionsUndefined: Self = StObject.set(x, "CategoryLabelOptions", js.undefined)
    
    inline def setDataLabelOptions(value: FunnelChartDataLabelOptions): Self = StObject.set(x, "DataLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setDataLabelOptionsUndefined: Self = StObject.set(x, "DataLabelOptions", js.undefined)
    
    inline def setFieldWells(value: FunnelChartFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setSortConfiguration(value: FunnelChartSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setValueLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "ValueLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setValueLabelOptionsUndefined: Self = StObject.set(x, "ValueLabelOptions", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
  }
}
