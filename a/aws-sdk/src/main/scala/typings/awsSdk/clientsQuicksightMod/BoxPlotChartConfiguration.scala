package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxPlotChartConfiguration extends StObject {
  
  /**
    * The box plot chart options for a box plot visual
    */
  var BoxPlotOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.BoxPlotOptions] = js.undefined
  
  /**
    * The label display options (grid line, range, scale, axis step) of a box plot category.
    */
  var CategoryAxis: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility and sort Icon visibility) of a box plot category.
    */
  var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[BoxPlotFieldWells] = js.undefined
  
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The label display options (grid line, range, scale, axis step) of a box plot category.
    */
  var PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility and sort icon visibility) of a box plot value.
    */
  var PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The reference line setup of the visual.
    */
  var ReferenceLines: js.UndefOr[ReferenceLineList] = js.undefined
  
  /**
    * The sort configuration of a BoxPlotVisual.
    */
  var SortConfiguration: js.UndefOr[BoxPlotSortConfiguration] = js.undefined
  
  /**
    * The tooltip display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * The palette (chart color) display setup of the visual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
}
object BoxPlotChartConfiguration {
  
  inline def apply(): BoxPlotChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxPlotChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxPlotChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBoxPlotOptions(value: BoxPlotOptions): Self = StObject.set(x, "BoxPlotOptions", value.asInstanceOf[js.Any])
    
    inline def setBoxPlotOptionsUndefined: Self = StObject.set(x, "BoxPlotOptions", js.undefined)
    
    inline def setCategoryAxis(value: AxisDisplayOptions): Self = StObject.set(x, "CategoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "CategoryAxis", js.undefined)
    
    inline def setCategoryLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "CategoryLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelOptionsUndefined: Self = StObject.set(x, "CategoryLabelOptions", js.undefined)
    
    inline def setFieldWells(value: BoxPlotFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setPrimaryYAxisDisplayOptions(value: AxisDisplayOptions): Self = StObject.set(x, "PrimaryYAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryYAxisDisplayOptionsUndefined: Self = StObject.set(x, "PrimaryYAxisDisplayOptions", js.undefined)
    
    inline def setPrimaryYAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "PrimaryYAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setPrimaryYAxisLabelOptionsUndefined: Self = StObject.set(x, "PrimaryYAxisLabelOptions", js.undefined)
    
    inline def setReferenceLines(value: ReferenceLineList): Self = StObject.set(x, "ReferenceLines", value.asInstanceOf[js.Any])
    
    inline def setReferenceLinesUndefined: Self = StObject.set(x, "ReferenceLines", js.undefined)
    
    inline def setReferenceLinesVarargs(value: ReferenceLine*): Self = StObject.set(x, "ReferenceLines", js.Array(value*))
    
    inline def setSortConfiguration(value: BoxPlotSortConfiguration): Self = StObject.set(x, "SortConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSortConfigurationUndefined: Self = StObject.set(x, "SortConfiguration", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
  }
}
