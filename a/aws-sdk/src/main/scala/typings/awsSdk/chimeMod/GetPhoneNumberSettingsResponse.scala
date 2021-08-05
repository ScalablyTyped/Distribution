package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhoneNumberSettingsResponse extends StObject {
  
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.undefined
  
  /**
    * The updated outbound calling name timestamp, in ISO 8601 format.
    */
  var CallingNameUpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
}
object GetPhoneNumberSettingsResponse {
  
  inline def apply(): GetPhoneNumberSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPhoneNumberSettingsResponse]
  }
  
  extension [Self <: GetPhoneNumberSettingsResponse](x: Self) {
    
    inline def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
    
    inline def setCallingNameUndefined: Self = StObject.set(x, "CallingName", js.undefined)
    
    inline def setCallingNameUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CallingNameUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCallingNameUpdatedTimestampUndefined: Self = StObject.set(x, "CallingNameUpdatedTimestamp", js.undefined)
  }
}
