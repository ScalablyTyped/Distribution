package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGatewayResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway that was deleted.
    */
  var GatewayArn: js.UndefOr[string] = js.undefined
}
object DeleteGatewayResponse {
  
  inline def apply(): DeleteGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGatewayResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGatewayResponse] (val x: Self) extends AnyVal {
    
    inline def setGatewayArn(value: string): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
  }
}
