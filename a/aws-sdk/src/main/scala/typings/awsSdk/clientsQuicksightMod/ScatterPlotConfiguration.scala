package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterPlotConfiguration extends StObject {
  
  /**
    * The options that determine if visual data labels are displayed.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The field wells of the visual.
    */
  var FieldWells: js.UndefOr[ScatterPlotFieldWells] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Legend: js.UndefOr[LegendOptions] = js.undefined
  
  /**
    * The legend display setup of the visual.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * The palette (chart color) display setup of the visual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
  
  /**
    * The label display options (grid line, range, scale, and axis step) of the scatter plot's x-axis.
    */
  var XAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's x-axis.
    */
  var XAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
  
  /**
    * The label display options (grid line, range, scale, and axis step) of the scatter plot's y-axis.
    */
  var YAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The label options (label text, label visibility, and sort icon visibility) of the scatter plot's y-axis.
    */
  var YAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
}
object ScatterPlotConfiguration {
  
  inline def apply(): ScatterPlotConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterPlotConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScatterPlotConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setFieldWells(value: ScatterPlotFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setLegend(value: LegendOptions): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "Legend", js.undefined)
    
    inline def setTooltip(value: TooltipOptions): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
    
    inline def setXAxisDisplayOptions(value: AxisDisplayOptions): Self = StObject.set(x, "XAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setXAxisDisplayOptionsUndefined: Self = StObject.set(x, "XAxisDisplayOptions", js.undefined)
    
    inline def setXAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "XAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setXAxisLabelOptionsUndefined: Self = StObject.set(x, "XAxisLabelOptions", js.undefined)
    
    inline def setYAxisDisplayOptions(value: AxisDisplayOptions): Self = StObject.set(x, "YAxisDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setYAxisDisplayOptionsUndefined: Self = StObject.set(x, "YAxisDisplayOptions", js.undefined)
    
    inline def setYAxisLabelOptions(value: ChartAxisLabelOptions): Self = StObject.set(x, "YAxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setYAxisLabelOptionsUndefined: Self = StObject.set(x, "YAxisLabelOptions", js.undefined)
  }
}
