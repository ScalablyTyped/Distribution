package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboChartConfiguration extends StObject {
  
  /**
    * The options that determine if visual data labels are displayed. The data label options for a bar in a combo chart.
    */
  var BarDataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * Determines the bar arrangement in a combo chart. The following are valid values in this structure:    CLUSTERED: For clustered bar combo charts.    STACKED: For stacked bar combo charts.    STACKED_PERCENT: Do not use. If you use this value, the operation returns a validation error.  
    */
  var BarsArrangement: js.UndefOr[typings.awsSdk.clientsQuicksightMod.BarsArrangement] = js.undefined
  
  /**
    * The category axis of a combo chart.
    */
  var CategoryAxis: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility, and sort icon visibility) of a combo chart category (group/color) field well.
    */
  var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility, and sort icon visibility) of a combo chart's color field well.
    */
  var ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[ComboChartFieldWells] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The options that determine if visual data labels are displayed. The data label options for a line in a combo chart.
    */
  var LineDataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The label display options (grid line, range, scale, and axis step) of a combo chart's primary y-axis (bar) field well.
    */
  var PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility, and sort icon visibility) of a combo chart's primary y-axis (bar) field well.
    */
  var PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The reference line setup of the visual.
    */
  var ReferenceLines: js.UndefOr[ReferenceLineList] = js.undefined
  
  /**
    * The label display options (grid line, range, scale, axis step) of a combo chart's secondary y-axis (line) field well.
    */
  var SecondaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility, and sort icon visibility) of a combo chart's secondary y-axis(line) field well.
    */
  var SecondaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The sort configuration of a ComboChartVisual.
    */
  var SortConfiguration: js.UndefOr[ComboChartSortConfiguration] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * The palette (chart color) display setup of the visual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
}
object ComboChartConfiguration {
  
  inline def apply(): ComboChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComboChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBarDataLabels(value: DataLabelOptions): Self = StObject.set(x, "BarDataLabels", value.asInstanceOf[js.Any])
    
    inline def setBarDataLabelsUndefined: Self = StObject.set(x, "BarDataLabels", js.undefined)
    
    inline def setBarsArrangement(value: BarsArrangement): Self = StObject.set(x, "BarsArrangement", value.asInstanceOf[js.Any])
    
    inline def setBarsArrangementUndefined: Self = StObject.set(x, "BarsArrangement", js.undefined)
    
    inline def setCategoryAxis(value: AxisDisplayOptions): Self = StObject.set(x, "CategoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "CategoryAxis", js.undefined)
    
    inline def setCategoryLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "CategoryLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelOptionsUndefined: Self = StObject.set(x, "CategoryLabelOptions", js.undefined)
    
    inline def setColorLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "ColorLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setColorLabelOptionsUndefined: Self = StObject.set(x, "ColorLabelOptions", js.undefined)
    
    inline def setFieldWells(value: ComboChartFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setLineDataLabels(value: DataLabelOptions): Self = StObject.set(x, "LineDataLabels", value.asInstanceOf[js.Any])
    
    inline def setLineDataLabelsUndefined: Self = StObject.set(x, "LineDataLabels", js.undefined)
    
    inline def setPrimaryYAxisDisplayOptions(value: AxisDisplayOptions): Self = StObject.set(x, "PrimaryYAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryYAxisDisplayOptionsUndefined: Self = StObject.set(x, "PrimaryYAxisDisplayOptions", js.undefined)
    
    inline def setPrimaryYAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "PrimaryYAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryYAxisLabelOptionsUndefined: Self = StObject.set(x, "PrimaryYAxisLabelOptions", js.undefined)
    
    inline def setReferenceLines(value: ReferenceLineList): Self = StObject.set(x, "ReferenceLines", value.asInstanceOf[js.Any])
    
    inline def setReferenceLinesUndefined: Self = StObject.set(x, "ReferenceLines", js.undefined)
    
    inline def setReferenceLinesVarargs(value: ReferenceLine*): Self = StObject.set(x, "ReferenceLines", js.Array(value*))
    
    inline def setSecondaryYAxisDisplayOptions(value: AxisDisplayOptions): Self = StObject.set(x, "SecondaryYAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setSecondaryYAxisDisplayOptionsUndefined: Self = StObject.set(x, "SecondaryYAxisDisplayOptions", js.undefined)
    
    inline def setSecondaryYAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "SecondaryYAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setSecondaryYAxisLabelOptionsUndefined: Self = StObject.set(x, "SecondaryYAxisLabelOptions", js.undefined)
    
    inline def setSortConfiguration(value: ComboChartSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
  }
}
