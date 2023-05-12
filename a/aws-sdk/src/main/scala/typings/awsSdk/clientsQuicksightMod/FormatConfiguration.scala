package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatConfiguration extends StObject {
  
  /**
    * Formatting configuration for DateTime fields.
    */
  var DateTimeFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateTimeFormatConfiguration] = js.undefined
  
  /**
    * Formatting configuration for number fields.
    */
  var NumberFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumberFormatConfiguration] = js.undefined
  
  /**
    * Formatting configuration for string fields.
    */
  var StringFormatConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.StringFormatConfiguration] = js.undefined
}
object FormatConfiguration {
  
  inline def apply(): FormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDateTimeFormatConfiguration(value: DateTimeFormatConfiguration): Self = StObject.set(x, "DateTimeFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDateTimeFormatConfigurationUndefined: Self = StObject.set(x, "DateTimeFormatConfiguration", js.undefined)
    
    inline def setNumberFormatConfiguration(value: NumberFormatConfiguration): Self = StObject.set(x, "NumberFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatConfigurationUndefined: Self = StObject.set(x, "NumberFormatConfiguration", js.undefined)
    
    inline def setStringFormatConfiguration(value: StringFormatConfiguration): Self = StObject.set(x, "StringFormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStringFormatConfigurationUndefined: Self = StObject.set(x, "StringFormatConfiguration", js.undefined)
  }
}
