package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayRequest extends StObject {
  
  /**
    * The ARN of the gateway that you want to delete.
    */
  var GatewayArn: string
}
object DeleteGatewayRequest {
  
  inline def apply(GatewayArn: string): DeleteGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGatewayRequest] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: string): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
