package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointAttributes extends StObject {
  
  /**
    * The device token for the GCM, APNS, and APNS_SANDBOX endpoint types.
    */
  var DeviceToken: NonEmptySensitiveString1600
  
  /**
    * The VOIP device token for the APNS and APNS_SANDBOX endpoint types.
    */
  var VoipDeviceToken: js.UndefOr[NonEmptySensitiveString1600] = js.undefined
}
object EndpointAttributes {
  
  inline def apply(DeviceToken: NonEmptySensitiveString1600): EndpointAttributes = {
    val __obj = js.Dynamic.literal(DeviceToken = DeviceToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointAttributes] (val x: Self) extends AnyVal {
    
    inline def setDeviceToken(value: NonEmptySensitiveString1600): Self = StObject.set(x, "DeviceToken", value.asInstanceOf[js.Any])
    
    inline def setVoipDeviceToken(value: NonEmptySensitiveString1600): Self = StObject.set(x, "VoipDeviceToken", value.asInstanceOf[js.Any])
    
    inline def setVoipDeviceTokenUndefined: Self = StObject.set(x, "VoipDeviceToken", js.undefined)
  }
}
