package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparisonFormatConfiguration extends StObject {
  
  /**
    * The number display format.
    */
  var NumberDisplayFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumberDisplayFormatConfiguration] = js.undefined
  
  /**
    * The percentage display format.
    */
  var PercentageDisplayFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PercentageDisplayFormatConfiguration] = js.undefined
}
object ComparisonFormatConfiguration {
  
  inline def apply(): ComparisonFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparisonFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComparisonFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setNumberDisplayFormatConfiguration(value: NumberDisplayFormatConfiguration): Self = StObject.set(x, "NumberDisplayFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNumberDisplayFormatConfigurationUndefined: Self = StObject.set(x, "NumberDisplayFormatConfiguration", js.undefined)
    
    inline def setPercentageDisplayFormatConfiguration(value: PercentageDisplayFormatConfiguration): Self = StObject.set(x, "PercentageDisplayFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPercentageDisplayFormatConfigurationUndefined: Self = StObject.set(x, "PercentageDisplayFormatConfiguration", js.undefined)
  }
}
