package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartConfiguration extends StObject {
  
  /**
    * The default configuration of a line chart's contribution analysis.
    */
  var ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList] = js.undefined
  
  /**
    * The data label configuration of a line chart.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The options that determine the default presentation of all line series in LineChartVisual.
    */
  var DefaultSeriesSettings: js.UndefOr[LineChartDefaultSeriesSettings] = js.undefined
  
  /**
    * The field well configuration of a line chart.
    */
  var FieldWells: js.UndefOr[LineChartFieldWells] = js.undefined
  
  /**
    * The forecast configuration of a line chart.
    */
  var ForecastConfigurations: js.UndefOr[ForecastConfigurationList] = js.undefined
  
  /**
    * The legend configuration of a line chart.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The series axis configuration of a line chart.
    */
  var PrimaryYAxisDisplayOptions: js.UndefOr[LineSeriesAxisDisplayOptions] = js.undefined
  
  /**
    * The options that determine the presentation of the y-axis label.
    */
  var PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The reference lines configuration of a line chart.
    */
  var ReferenceLines: js.UndefOr[ReferenceLineList] = js.undefined
  
  /**
    * The series axis configuration of a line chart.
    */
  var SecondaryYAxisDisplayOptions: js.UndefOr[LineSeriesAxisDisplayOptions] = js.undefined
  
  /**
    * The options that determine the presentation of the secondary y-axis label.
    */
  var SecondaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The series item configuration of a line chart.
    */
  var Series: js.UndefOr[SeriesItemList] = js.undefined
  
  /**
    * The small multiples setup for the visual.
    */
  var SmallMultiplesOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SmallMultiplesOptions] = js.undefined
  
  /**
    * The sort configuration of a line chart.
    */
  var SortConfiguration: js.UndefOr[LineChartSortConfiguration] = js.undefined
  
  /**
    * The tooltip configuration of a line chart.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * Determines the type of the line chart.
    */
  var Type: js.UndefOr[LineChartType] = js.undefined
  
  /**
    * The visual palette configuration of a line chart.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
  
  /**
    * The options that determine the presentation of the x-axis.
    */
  var XAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The options that determine the presentation of the x-axis label.
    */
  var XAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
}
object LineChartConfiguration {
  
  inline def apply(): LineChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContributionAnalysisDefaults(value: ContributionAnalysisDefaultList): Self = StObject.set(x, "ContributionAnalysisDefaults", value.asInstanceOf[js.Any])
    
    inline def setContributionAnalysisDefaultsUndefined: Self = StObject.set(x, "ContributionAnalysisDefaults", js.undefined)
    
    inline def setContributionAnalysisDefaultsVarargs(value: ContributionAnalysisDefault*): Self = StObject.set(x, "ContributionAnalysisDefaults", js.Array(value*))
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setDefaultSeriesSettings(value: LineChartDefaultSeriesSettings): Self = StObject.set(x, "DefaultSeriesSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultSeriesSettingsUndefined: Self = StObject.set(x, "DefaultSeriesSettings", js.undefined)
    
    inline def setFieldWells(value: LineChartFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setForecastConfigurations(value: ForecastConfigurationList): Self = StObject.set(x, "ForecastConfigurations", value.asInstanceOf[js.Any])
    
    inline def setForecastConfigurationsUndefined: Self = StObject.set(x, "ForecastConfigurations", js.undefined)
    
    inline def setForecastConfigurationsVarargs(value: ForecastConfiguration*): Self = StObject.set(x, "ForecastConfigurations", js.Array(value*))
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setPrimaryYAxisDisplayOptions(value: LineSeriesAxisDisplayOptions): Self = StObject.set(x, "PrimaryYAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryYAxisDisplayOptionsUndefined: Self = StObject.set(x, "PrimaryYAxisDisplayOptions", js.undefined)
    
    inline def setPrimaryYAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "PrimaryYAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryYAxisLabelOptionsUndefined: Self = StObject.set(x, "PrimaryYAxisLabelOptions", js.undefined)
    
    inline def setReferenceLines(value: ReferenceLineList): Self = StObject.set(x, "ReferenceLines", value.asInstanceOf[js.Any])
    
    inline def setReferenceLinesUndefined: Self = StObject.set(x, "ReferenceLines", js.undefined)
    
    inline def setReferenceLinesVarargs(value: ReferenceLine*): Self = StObject.set(x, "ReferenceLines", js.Array(value*))
    
    inline def setSecondaryYAxisDisplayOptions(value: LineSeriesAxisDisplayOptions): Self = StObject.set(x, "SecondaryYAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setSecondaryYAxisDisplayOptionsUndefined: Self = StObject.set(x, "SecondaryYAxisDisplayOptions", js.undefined)
    
    inline def setSecondaryYAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "SecondaryYAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setSecondaryYAxisLabelOptionsUndefined: Self = StObject.set(x, "SecondaryYAxisLabelOptions", js.undefined)
    
    inline def setSeries(value: SeriesItemList): Self = StObject.set(x, "Series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "Series", js.undefined)
    
    inline def setSeriesVarargs(value: SeriesItem*): Self = StObject.set(x, "Series", js.Array(value*))
    
    inline def setSmallMultiplesOptions(value: SmallMultiplesOptions): Self = StObject.set(x, "SmallMultiplesOptions", value.asInstanceOf[js.Any])
    
    inline def setSmallMultiplesOptionsUndefined: Self = StObject.set(x, "SmallMultiplesOptions", js.undefined)
    
    inline def setSortConfiguration(value: LineChartSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setType(value: LineChartType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
    
    inline def setXAxisDisplayOptions(value: AxisDisplayOptions): Self = StObject.set(x, "XAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setXAxisDisplayOptionsUndefined: Self = StObject.set(x, "XAxisDisplayOptions", js.undefined)
    
    inline def setXAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "XAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setXAxisLabelOptionsUndefined: Self = StObject.set(x, "XAxisLabelOptions", js.undefined)
  }
}
