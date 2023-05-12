package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeFormatConfiguration extends StObject {
  
  /**
    * Determines the DateTime format.
    */
  var DateTimeFormat: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateTimeFormat] = js.undefined
  
  /**
    * The options that determine the null value format configuration.
    */
  var NullValueFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NullValueFormatConfiguration] = js.undefined
  
  /**
    * The formatting configuration for numeric DateTime fields.
    */
  var NumericFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumericFormatConfiguration] = js.undefined
}
object DateTimeFormatConfiguration {
  
  inline def apply(): DateTimeFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDateTimeFormat(value: DateTimeFormat): Self = StObject.set(x, "DateTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDateTimeFormatUndefined: Self = StObject.set(x, "DateTimeFormat", js.undefined)
    
    inline def setNullValueFormatConfiguration(value: NullValueFormatConfiguration): Self = StObject.set(x, "NullValueFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNullValueFormatConfigurationUndefined: Self = StObject.set(x, "NullValueFormatConfiguration", js.undefined)
    
    inline def setNumericFormatConfiguration(value: NumericFormatConfiguration): Self = StObject.set(x, "NumericFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNumericFormatConfigurationUndefined: Self = StObject.set(x, "NumericFormatConfiguration", js.undefined)
  }
}
