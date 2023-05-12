package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarChartConfiguration extends StObject {
  
  /**
    * Determines the arrangement of the bars. The orientation and arrangement of bars determine the type of bar that is used in the visual.
    */
  var BarsArrangement: js.UndefOr[typings.awsSdk.clientsQuicksightMod.BarsArrangement] = js.undefined
  
  /**
    * The label display options (grid line, range, scale, axis step) for bar chart category.
    */
  var CategoryAxis: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility and sort icon visibility) for a bar chart.
    */
  var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility and sort icon visibility) for a color that is used in a bar chart.
    */
  var ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The contribution analysis (anomaly configuration) setup of the visual.
    */
  var ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList] = js.undefined
  
  /**
    * The options that determine if visual data labels are displayed.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[BarChartFieldWells] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The orientation of the bars in a bar chart visual. There are two valid values in this structure:    HORIZONTAL: Used for charts that have horizontal bars. Visuals that use this value are horizontal bar charts, horizontal stacked bar charts, and horizontal stacked 100% bar charts.    VERTICAL: Used for charts that have vertical bars. Visuals that use this value are vertical bar charts, vertical stacked bar charts, and vertical stacked 100% bar charts.  
    */
  var Orientation: js.UndefOr[BarChartOrientation] = js.undefined
  
  /**
    * The reference line setup of the visual.
    */
  var ReferenceLines: js.UndefOr[ReferenceLineList] = js.undefined
  
  /**
    * The small multiples setup for the visual.
    */
  var SmallMultiplesOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SmallMultiplesOptions] = js.undefined
  
  /**
    * The sort configuration of a BarChartVisual.
    */
  var SortConfiguration: js.UndefOr[BarChartSortConfiguration] = js.undefined
  
  /**
    * The tooltip display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * The label display options (grid line, range, scale, axis step) for a bar chart value.
    */
  var ValueAxis: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility and sort icon visibility) for a bar chart value.
    */
  var ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The palette (chart color) display setup of the visual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
}
object BarChartConfiguration {
  
  inline def apply(): BarChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBarsArrangement(value: BarsArrangement): Self = StObject.set(x, "BarsArrangement", value.asInstanceOf[js.Any])
    
    inline def setBarsArrangementUndefined: Self = StObject.set(x, "BarsArrangement", js.undefined)
    
    inline def setCategoryAxis(value: AxisDisplayOptions): Self = StObject.set(x, "CategoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "CategoryAxis", js.undefined)
    
    inline def setCategoryLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "CategoryLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelOptionsUndefined: Self = StObject.set(x, "CategoryLabelOptions", js.undefined)
    
    inline def setColorLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "ColorLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setColorLabelOptionsUndefined: Self = StObject.set(x, "ColorLabelOptions", js.undefined)
    
    inline def setContributionAnalysisDefaults(value: ContributionAnalysisDefaultList): Self = StObject.set(x, "ContributionAnalysisDefaults", value.asInstanceOf[js.Any])
    
    inline def setContributionAnalysisDefaultsUndefined: Self = StObject.set(x, "ContributionAnalysisDefaults", js.undefined)
    
    inline def setContributionAnalysisDefaultsVarargs(value: ContributionAnalysisDefault*): Self = StObject.set(x, "ContributionAnalysisDefaults", js.Array(value*))
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setFieldWells(value: BarChartFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setOrientation(value: BarChartOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "Orientation", js.undefined)
    
    inline def setReferenceLines(value: ReferenceLineList): Self = StObject.set(x, "ReferenceLines", value.asInstanceOf[js.Any])
    
    inline def setReferenceLinesUndefined: Self = StObject.set(x, "ReferenceLines", js.undefined)
    
    inline def setReferenceLinesVarargs(value: ReferenceLine*): Self = StObject.set(x, "ReferenceLines", js.Array(value*))
    
    inline def setSmallMultiplesOptions(value: SmallMultiplesOptions): Self = StObject.set(x, "SmallMultiplesOptions", value.asInstanceOf[js.Any])
    
    inline def setSmallMultiplesOptionsUndefined: Self = StObject.set(x, "SmallMultiplesOptions", js.undefined)
    
    inline def setSortConfiguration(value: BarChartSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setValueAxis(value: AxisDisplayOptions): Self = StObject.set(x, "ValueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "ValueAxis", js.undefined)
    
    inline def setValueLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "ValueLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setValueLabelOptionsUndefined: Self = StObject.set(x, "ValueLabelOptions", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
  }
}
