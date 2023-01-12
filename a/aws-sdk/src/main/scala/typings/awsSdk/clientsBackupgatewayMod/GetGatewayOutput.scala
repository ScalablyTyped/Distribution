package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGatewayOutput extends StObject {
  
  /**
    * By providing the ARN (Amazon Resource Name), this API returns the gateway.
    */
  var Gateway: js.UndefOr[GatewayDetails] = js.undefined
}
object GetGatewayOutput {
  
  inline def apply(): GetGatewayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGatewayOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGatewayOutput] (val x: Self) extends AnyVal {
    
    inline def setGateway(value: GatewayDetails): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
  }
}
