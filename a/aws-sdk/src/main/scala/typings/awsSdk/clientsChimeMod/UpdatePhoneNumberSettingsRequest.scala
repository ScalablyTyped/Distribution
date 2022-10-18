package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneNumberSettingsRequest extends StObject {
  
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: typings.awsSdk.clientsChimeMod.CallingName
}
object UpdatePhoneNumberSettingsRequest {
  
  inline def apply(CallingName: CallingName): UpdatePhoneNumberSettingsRequest = {
    val __obj = js.Dynamic.literal(CallingName = CallingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberSettingsRequest]
  }
  
  extension [Self <: UpdatePhoneNumberSettingsRequest](x: Self) {
    
    inline def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
  }
}
