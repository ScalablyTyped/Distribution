package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneNumberSettingsRequest extends StObject {
  
  /**
    * The default outbound calling name for the account.
    */
  var CallingName: typings.awsSdk.chimeMod.CallingName
}
object UpdatePhoneNumberSettingsRequest {
  
  @scala.inline
  def apply(CallingName: CallingName): UpdatePhoneNumberSettingsRequest = {
    val __obj = js.Dynamic.literal(CallingName = CallingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdatePhoneNumberSettingsRequestMutableBuilder[Self <: UpdatePhoneNumberSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
  }
}
