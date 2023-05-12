package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallChartConfiguration extends StObject {
  
  /**
    * The options that determine the presentation of the category axis.
    */
  var CategoryAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The options that determine the presentation of the category axis label.
    */
  var CategoryAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The data label configuration of a waterfall visual.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The field well configuration of a waterfall visual.
    */
  var FieldWells: js.UndefOr[WaterfallChartFieldWells] = js.undefined
  
  /**
    * The legend configuration of a waterfall visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The options that determine the presentation of the y-axis.
    */
  var PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The options that determine the presentation of the y-axis label.
    */
  var PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The sort configuration of a waterfall visual.
    */
  var SortConfiguration: js.UndefOr[WaterfallChartSortConfiguration] = js.undefined
  
  /**
    * The visual palette configuration of a waterfall visual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
  
  /**
    * The options that determine the presentation of a waterfall visual.
    */
  var WaterfallChartOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.WaterfallChartOptions] = js.undefined
}
object WaterfallChartConfiguration {
  
  inline def apply(): WaterfallChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaterfallChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryAxisDisplayOptions(value: AxisDisplayOptions): Self = StObject.set(x, "CategoryAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisDisplayOptionsUndefined: Self = StObject.set(x, "CategoryAxisDisplayOptions", js.undefined)
    
    inline def setCategoryAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "CategoryAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisLabelOptionsUndefined: Self = StObject.set(x, "CategoryAxisLabelOptions", js.undefined)
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setFieldWells(value: WaterfallChartFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setPrimaryYAxisDisplayOptions(value: AxisDisplayOptions): Self = StObject.set(x, "PrimaryYAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryYAxisDisplayOptionsUndefined: Self = StObject.set(x, "PrimaryYAxisDisplayOptions", js.undefined)
    
    inline def setPrimaryYAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "PrimaryYAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryYAxisLabelOptionsUndefined: Self = StObject.set(x, "PrimaryYAxisLabelOptions", js.undefined)
    
    inline def setSortConfiguration(value: WaterfallChartSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
    
    inline def setWaterfallChartOptions(value: WaterfallChartOptions): Self = StObject.set(x, "WaterfallChartOptions", value.asInstanceOf[js.Any])
    
    inline def setWaterfallChartOptionsUndefined: Self = StObject.set(x, "WaterfallChartOptions", js.undefined)
  }
}
