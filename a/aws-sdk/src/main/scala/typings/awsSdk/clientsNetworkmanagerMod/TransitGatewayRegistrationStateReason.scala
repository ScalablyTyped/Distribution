package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRegistrationStateReason extends StObject {
  
  /**
    * The code for the state reason.
    */
  var Code: js.UndefOr[TransitGatewayRegistrationState] = js.undefined
  
  /**
    * The message for the state reason.
    */
  var Message: js.UndefOr[ConstrainedString] = js.undefined
}
object TransitGatewayRegistrationStateReason {
  
  inline def apply(): TransitGatewayRegistrationStateReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRegistrationStateReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayRegistrationStateReason] (val x: Self) extends AnyVal {
    
    inline def setCode(value: TransitGatewayRegistrationState): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: ConstrainedString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
