package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberDisplayFormatConfiguration extends StObject {
  
  /**
    * The option that determines the decimal places configuration.
    */
  var DecimalPlacesConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DecimalPlacesConfiguration] = js.undefined
  
  /**
    * The options that determine the negative value configuration.
    */
  var NegativeValueConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NegativeValueConfiguration] = js.undefined
  
  /**
    * The options that determine the null value format configuration.
    */
  var NullValueFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NullValueFormatConfiguration] = js.undefined
  
  /**
    * Determines the number scale value of the number format.
    */
  var NumberScale: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumberScale] = js.undefined
  
  /**
    * Determines the prefix value of the number format.
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Prefix] = js.undefined
  
  /**
    * The options that determine the numeric separator configuration.
    */
  var SeparatorConfiguration: js.UndefOr[NumericSeparatorConfiguration] = js.undefined
  
  /**
    * Determines the suffix value of the number format.
    */
  var Suffix: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Suffix] = js.undefined
}
object NumberDisplayFormatConfiguration {
  
  inline def apply(): NumberDisplayFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberDisplayFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberDisplayFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDecimalPlacesConfiguration(value: DecimalPlacesConfiguration): Self = StObject.set(x, "DecimalPlacesConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDecimalPlacesConfigurationUndefined: Self = StObject.set(x, "DecimalPlacesConfiguration", js.undefined)
    
    inline def setNegativeValueConfiguration(value: NegativeValueConfiguration): Self = StObject.set(x, "NegativeValueConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNegativeValueConfigurationUndefined: Self = StObject.set(x, "NegativeValueConfiguration", js.undefined)
    
    inline def setNullValueFormatConfiguration(value: NullValueFormatConfiguration): Self = StObject.set(x, "NullValueFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNullValueFormatConfigurationUndefined: Self = StObject.set(x, "NullValueFormatConfiguration", js.undefined)
    
    inline def setNumberScale(value: NumberScale): Self = StObject.set(x, "NumberScale", value.asInstanceOf[js.Any])
    
    inline def setNumberScaleUndefined: Self = StObject.set(x, "NumberScale", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setSeparatorConfiguration(value: NumericSeparatorConfiguration): Self = StObject.set(x, "SeparatorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSeparatorConfigurationUndefined: Self = StObject.set(x, "SeparatorConfiguration", js.undefined)
    
    inline def setSuffix(value: Suffix): Self = StObject.set(x, "Suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "Suffix", js.undefined)
  }
}
