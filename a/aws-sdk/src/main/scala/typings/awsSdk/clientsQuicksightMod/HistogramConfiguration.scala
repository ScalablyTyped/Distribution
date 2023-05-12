package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramConfiguration extends StObject {
  
  /**
    * The options that determine the presentation of histogram bins.
    */
  var BinOptions: js.UndefOr[HistogramBinOptions] = js.undefined
  
  /**
    * The data label configuration of a histogram.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The field well configuration of a histogram.
    */
  var FieldWells: js.UndefOr[HistogramFieldWells] = js.undefined
  
  /**
    * The tooltip configuration of a histogram.
    */
  var Tooltip: js.UndefOr[TooltipOptions] = js.undefined
  
  /**
    * The visual palette configuration of a histogram.
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
  
  /**
    * The options that determine the presentation of the y-axis.
    */
  var YAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
}
object HistogramConfiguration {
  
  inline def apply(): HistogramConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBinOptions(value: HistogramBinOptions): Self = StObject.set(x, "BinOptions", value.asInstanceOf[js.Any])
    
    inline def setBinOptionsUndefined: Self = StObject.set(x, "BinOptions", js.undefined)
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setFieldWells(value: HistogramFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
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
  }
}
