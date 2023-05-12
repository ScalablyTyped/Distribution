package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhoneNumberSettingsResponse extends StObject {
  
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.CallingName] = js.undefined
  
  /**
    * The updated outbound calling name timestamp, in ISO 8601 format.
    */
  var CallingNameUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object GetPhoneNumberSettingsResponse {
  
  inline def apply(): GetPhoneNumberSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPhoneNumberSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPhoneNumberSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
    
    inline def setCallingNameUndefined: Self = StObject.set(x, "CallingName", js.undefined)
    
    inline def setCallingNameUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "CallingNameUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCallingNameUpdatedTimestampUndefined: Self = StObject.set(x, "CallingNameUpdatedTimestamp", js.undefined)
  }
}
