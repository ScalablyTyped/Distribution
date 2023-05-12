package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KPIOptions extends StObject {
  
  /**
    * The comparison configuration of a KPI visual.
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
  
  /**
    * The options that determine the presentation of the progress bar of a KPI visual.
    */
  var ProgressBar: js.UndefOr[ProgressBarOptions] = js.undefined
  
  /**
    * The options that determine the presentation of the secondary value of a KPI visual.
    */
  var SecondaryValue: js.UndefOr[SecondaryValueOptions] = js.undefined
  
  /**
    * The options that determine the secondary value font configuration.
    */
  var SecondaryValueFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined
  
  /**
    * The options that determine the presentation of trend arrows in a KPI visual.
    */
  var TrendArrows: js.UndefOr[TrendArrowOptions] = js.undefined
}
object KPIOptions {
  
  inline def apply(): KPIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KPIOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KPIOptions] (val x: Self) extends AnyVal {
    
    inline def setComparison(value: ComparisonConfiguration): Self = StObject.set(x, "Comparison", value.asInstanceOf[js.Any])
    
    inline def setComparisonUndefined: Self = StObject.set(x, "Comparison", js.undefined)
    
    inline def setPrimaryValueDisplayType(value: PrimaryValueDisplayType): Self = StObject.set(x, "PrimaryValueDisplayType", value.asInstanceOf[js.Any])
    
    inline def setPrimaryValueDisplayTypeUndefined: Self = StObject.set(x, "PrimaryValueDisplayType", js.undefined)
    
    inline def setPrimaryValueFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "PrimaryValueFontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPrimaryValueFontConfigurationUndefined: Self = StObject.set(x, "PrimaryValueFontConfiguration", js.undefined)
    
    inline def setProgressBar(value: ProgressBarOptions): Self = StObject.set(x, "ProgressBar", value.asInstanceOf[js.Any])
    
    inline def setProgressBarUndefined: Self = StObject.set(x, "ProgressBar", js.undefined)
    
    inline def setSecondaryValue(value: SecondaryValueOptions): Self = StObject.set(x, "SecondaryValue", value.asInstanceOf[js.Any])
    
    inline def setSecondaryValueFontConfiguration(value: FontConfiguration): Self = StObject.set(x, "SecondaryValueFontConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecondaryValueFontConfigurationUndefined: Self = StObject.set(x, "SecondaryValueFontConfiguration", js.undefined)
    
    inline def setSecondaryValueUndefined: Self = StObject.set(x, "SecondaryValue", js.undefined)
    
    inline def setTrendArrows(value: TrendArrowOptions): Self = StObject.set(x, "TrendArrows", value.asInstanceOf[js.Any])
    
    inline def setTrendArrowsUndefined: Self = StObject.set(x, "TrendArrows", js.undefined)
  }
}
