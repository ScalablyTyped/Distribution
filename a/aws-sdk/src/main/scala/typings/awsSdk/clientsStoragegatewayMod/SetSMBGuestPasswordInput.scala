package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSMBGuestPasswordInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 File Gateway the SMB file share is associated with.
    */
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * The password that you want to set for your SMB server.
    */
  var Password: SMBGuestPassword
}
object SetSMBGuestPasswordInput {
  
  inline def apply(GatewayARN: GatewayARN, Password: SMBGuestPassword): SetSMBGuestPasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSMBGuestPasswordInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetSMBGuestPasswordInput] (val x: Self) extends AnyVal {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: SMBGuestPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
