package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommunicationTypeOptions extends StObject {
  
  /**
    *  A JSON-formatted list containing date and time ranges for periods without support 
    */
  var datesWithoutSupport: js.UndefOr[DatesWithoutSupportList] = js.undefined
  
  /**
    *  A JSON-formatted list containing time ranges when support is available. 
    */
  var supportedHours: js.UndefOr[SupportedHoursList] = js.undefined
  
  /**
    *  A string value indicating the communication type. At the moment the type value can assume one of 3 values at the moment chat, web and call. 
    */
  var `type`: js.UndefOr[Type] = js.undefined
}
object CommunicationTypeOptions {
  
  inline def apply(): CommunicationTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunicationTypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommunicationTypeOptions] (val x: Self) extends AnyVal {
    
    inline def setDatesWithoutSupport(value: DatesWithoutSupportList): Self = StObject.set(x, "datesWithoutSupport", value.asInstanceOf[js.Any])
    
    inline def setDatesWithoutSupportUndefined: Self = StObject.set(x, "datesWithoutSupport", js.undefined)
    
    inline def setDatesWithoutSupportVarargs(value: DateInterval*): Self = StObject.set(x, "datesWithoutSupport", js.Array(value*))
    
    inline def setSupportedHours(value: SupportedHoursList): Self = StObject.set(x, "supportedHours", value.asInstanceOf[js.Any])
    
    inline def setSupportedHoursUndefined: Self = StObject.set(x, "supportedHours", js.undefined)
    
    inline def setSupportedHoursVarargs(value: SupportedHour*): Self = StObject.set(x, "supportedHours", js.Array(value*))
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
