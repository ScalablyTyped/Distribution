package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartOptions extends StObject {
  
  /**
    * The arc configuration of a GaugeChartVisual.
    */
  var Arc: js.UndefOr[ArcConfiguration] = js.undefined
  
  /**
    * The arc axis configuration of a GaugeChartVisual.
    */
  var ArcAxis: js.UndefOr[ArcAxisConfiguration] = js.undefined
  
  /**
    * The comparison configuration of a GaugeChartVisual.
    */
  var Comparison: js.UndefOr[ComparisonConfiguration] = js.undefined
  
  /**
    * The options that determine the primary value display type.
    */
  var PrimaryValueDisplayType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PrimaryValueDisplayType] = js.undefined
  
  /**
    * The options that determine the primary value font configuration.
    */
  var PrimaryValueFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined
}
object GaugeChartOptions {
  
  inline def apply(): GaugeChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeChartOptions] (val x: Self) extends AnyVal {
    
    inline def setArc(value: ArcConfiguration): Self = StObject.set(x, "Arc", value.asInstanceOf[js.Any])
    
    inline def setArcAxis(value: ArcAxisConfiguration): Self = StObject.set(x, "ArcAxis", value.asInstanceOf[js.Any])
    
    inline def setArcAxisUndefined: Self = StObject.set(x, "ArcAxis", js.undefined)
    
    inline def setArcUndefined: Self = StObject.set(x, "Arc", js.undefined)
    
    inline def setComparison(value: ComparisonConfiguration): Self = StObject.set(x, "Comparison", value.asInstanceOf[js.Any])
    
    inline def setComparisonUndefined: Self = StObject.set(x, "Comparison", js.undefined)
    
    inline def setPrimaryValueDisplayType(value: PrimaryValueDisplayType): Self = StObject.set(x, "PrimaryValueDisplayType", value.asInstanceOf[js.Any])
    
    inline def setPrimaryValueDisplayTypeUndefined: Self = StObject.set(x, "PrimaryValueDisplayType", js.undefined)
    
    inline def setPrimaryValueFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "PrimaryValueFontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPrimaryValueFontConfigurationUndefined: Self = StObject.set(x, "PrimaryValueFontConfiguration", js.undefined)
  }
}
