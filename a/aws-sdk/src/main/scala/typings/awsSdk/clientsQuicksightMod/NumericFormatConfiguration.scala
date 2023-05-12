package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericFormatConfiguration extends StObject {
  
  /**
    * The options that determine the currency display format configuration.
    */
  var CurrencyDisplayFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CurrencyDisplayFormatConfiguration] = js.undefined
  
  /**
    * The options that determine the number display format configuration.
    */
  var NumberDisplayFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumberDisplayFormatConfiguration] = js.undefined
  
  /**
    * The options that determine the percentage display format configuration.
    */
  var PercentageDisplayFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PercentageDisplayFormatConfiguration] = js.undefined
}
object NumericFormatConfiguration {
  
  inline def apply(): NumericFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCurrencyDisplayFormatConfiguration(value: CurrencyDisplayFormatConfiguration): Self = StObject.set(x, "CurrencyDisplayFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayFormatConfigurationUndefined: Self = StObject.set(x, "CurrencyDisplayFormatConfiguration", js.undefined)
    
    inline def setNumberDisplayFormatConfiguration(value: NumberDisplayFormatConfiguration): Self = StObject.set(x, "NumberDisplayFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNumberDisplayFormatConfigurationUndefined: Self = StObject.set(x, "NumberDisplayFormatConfiguration", js.undefined)
    
    inline def setPercentageDisplayFormatConfiguration(value: PercentageDisplayFormatConfiguration): Self = StObject.set(x, "PercentageDisplayFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPercentageDisplayFormatConfigurationUndefined: Self = StObject.set(x, "PercentageDisplayFormatConfiguration", js.undefined)
  }
}
