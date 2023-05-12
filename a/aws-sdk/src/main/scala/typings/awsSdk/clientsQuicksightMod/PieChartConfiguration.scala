package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartConfiguration extends StObject {
  
  /**
    * The label options of the group/color that is displayed in a pie chart.
    */
  var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The contribution analysis (anomaly configuration) setup of the visual.
    */
  var ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList] = js.undefined
  
  /**
    * The options that determine if visual data labels are displayed.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The options that determine the shape of the chart. This option determines whether the chart is a pie chart or a donut chart.
    */
  var DonutOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DonutOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[PieChartFieldWells] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The small multiples setup for the visual.
    */
  var SmallMultiplesOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SmallMultiplesOptions] = js.undefined
  
  /**
    * The sort configuration of a pie chart.
    */
  var SortConfiguration: js.UndefOr[PieChartSortConfiguration] = js.undefined
  
  /**
    * The tooltip display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * The label options for the value that is displayed in a pie chart.
    */
  var ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The palette (chart color) display setup of the visual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
}
object PieChartConfiguration {
  
  inline def apply(): PieChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "CategoryLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelOptionsUndefined: Self = StObject.set(x, "CategoryLabelOptions", js.undefined)
    
    inline def setContributionAnalysisDefaults(value: ContributionAnalysisDefaultList): Self = StObject.set(x, "ContributionAnalysisDefaults", value.asInstanceOf[js.Any])
    
    inline def setContributionAnalysisDefaultsUndefined: Self = StObject.set(x, "ContributionAnalysisDefaults", js.undefined)
    
    inline def setContributionAnalysisDefaultsVarargs(value: ContributionAnalysisDefault*): Self = StObject.set(x, "ContributionAnalysisDefaults", js.Array(value*))
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setDonutOptions(value: DonutOptions): Self = StObject.set(x, "DonutOptions", value.asInstanceOf[js.Any])
    
    inline def setDonutOptionsUndefined: Self = StObject.set(x, "DonutOptions", js.undefined)
    
    inline def setFieldWells(value: PieChartFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setSmallMultiplesOptions(value: SmallMultiplesOptions): Self = StObject.set(x, "SmallMultiplesOptions", value.asInstanceOf[js.Any])
    
    inline def setSmallMultiplesOptionsUndefined: Self = StObject.set(x, "SmallMultiplesOptions", js.undefined)
    
    inline def setSortConfiguration(value: PieChartSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setValueLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "ValueLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setValueLabelOptionsUndefined: Self = StObject.set(x, "ValueLabelOptions", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
  }
}
