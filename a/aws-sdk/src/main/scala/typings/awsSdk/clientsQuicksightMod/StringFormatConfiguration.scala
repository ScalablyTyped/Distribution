package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringFormatConfiguration extends StObject {
  
  /**
    * The options that determine the null value format configuration.
    */
  var NullValueFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NullValueFormatConfiguration] = js.undefined
  
  /**
    * The formatting configuration for numeric strings.
    */
  var NumericFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumericFormatConfiguration] = js.undefined
}
object StringFormatConfiguration {
  
  inline def apply(): StringFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setNullValueFormatConfiguration(value: NullValueFormatConfiguration): Self = StObject.set(x, "NullValueFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNullValueFormatConfigurationUndefined: Self = StObject.set(x, "NullValueFormatConfiguration", js.undefined)
    
    inline def setNumericFormatConfiguration(value: NumericFormatConfiguration): Self = StObject.set(x, "NumericFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNumericFormatConfigurationUndefined: Self = StObject.set(x, "NumericFormatConfiguration", js.undefined)
  }
}
