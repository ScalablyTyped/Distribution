package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateDeviceIdentifierRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the device identifier.
    */
  var deviceIdentifierArn: Arn
}
object ActivateDeviceIdentifierRequest {
  
  inline def apply(deviceIdentifierArn: Arn): ActivateDeviceIdentifierRequest = {
    val __obj = js.Dynamic.literal(deviceIdentifierArn = deviceIdentifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateDeviceIdentifierRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateDeviceIdentifierRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDeviceIdentifierArn(value: Arn): Self = StObject.set(x, "deviceIdentifierArn", value.asInstanceOf[js.Any])
  }
}
