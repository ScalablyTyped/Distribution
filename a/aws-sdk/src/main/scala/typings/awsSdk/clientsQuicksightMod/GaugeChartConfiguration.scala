package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartConfiguration extends StObject {
  
  /**
    * The data label configuration of a GaugeChartVisual.
    */
  var DataLabels: js.UndefOr[DataLabelOptions] = js.undefined
  
  /**
    * The field well configuration of a GaugeChartVisual.
    */
  var FieldWells: js.UndefOr[GaugeChartFieldWells] = js.undefined
  
  /**
    * The options that determine the presentation of the GaugeChartVisual.
    */
  var GaugeChartOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.GaugeChartOptions] = js.undefined
  
  /**
    * The tooltip configuration of a GaugeChartVisual.
    */
  var TooltipOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TooltipOptions] = js.undefined
  
  /**
    * The visual palette configuration of a GaugeChartVisual.
    */
  var VisualPalette: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VisualPalette] = js.undefined
}
object GaugeChartConfiguration {
  
  inline def apply(): GaugeChartConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeChartConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataLabels(value: DataLabelOptions): Self = StObject.set(x, "DataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "DataLabels", js.undefined)
    
    inline def setFieldWells(value: GaugeChartFieldWells): Self = StObject.set(x, "FieldWells", value.asInstanceOf[js.Any])
    
    inline def setFieldWellsUndefined: Self = StObject.set(x, "FieldWells", js.undefined)
    
    inline def setGaugeChartOptions(value: GaugeChartOptions): Self = StObject.set(x, "GaugeChartOptions", value.asInstanceOf[js.Any])
    
    inline def setGaugeChartOptionsUndefined: Self = StObject.set(x, "GaugeChartOptions", js.undefined)
    
    inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "TooltipOptions", value.asInstanceOf[js.Any])
    
    inline def setTooltipOptionsUndefined: Self = StObject.set(x, "TooltipOptions", js.undefined)
    
    inline def setVisualPalette(value: VisualPalette): Self = StObject.set(x, "VisualPalette", value.asInstanceOf[js.Any])
    
    inline def setVisualPaletteUndefined: Self = StObject.set(x, "VisualPalette", js.undefined)
  }
}
