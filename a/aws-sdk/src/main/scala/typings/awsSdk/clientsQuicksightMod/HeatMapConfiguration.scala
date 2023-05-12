package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatMapConfiguration extends StObject {
  
  /**
    * The color options (gradient color, point of divergence) in a heat map.
    */
  var ColorScale: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ColorScale] = js.undefined
  
  /**
    * The label options of the column that is displayed in a heat map.
    */
  var ColumnLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The options that determine if visual data labels are displayed.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[HeatMapFieldWells] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The label options of the row that is displayed in a heat map.
    */
  var RowLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The sort configuration of a heat map.
    */
  var SortConfiguration: js.UndefOr[HeatMapSortConfiguration] = js.undefined
  
  /**
    * The tooltip display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
}
object HeatMapConfiguration {
  
  inline def apply(): HeatMapConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatMapConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatMapConfiguration] (val x: Self) extends AnyVal {
    
    inline def setColorScale(value: ColorScale): Self = StObject.set(x, "ColorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "ColorScale", js.undefined)
    
    inline def setColumnLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "ColumnLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setColumnLabelOptionsUndefined: Self = StObject.set(x, "ColumnLabelOptions", js.undefined)
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setFieldWells(value: HeatMapFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setRowLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "RowLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setRowLabelOptionsUndefined: Self = StObject.set(x, "RowLabelOptions", js.undefined)
    
    inline def setSortConfiguration(value: HeatMapSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
  }
}
