package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayInformationOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[String] = js.undefined
}
object UpdateGatewayInformationOutput {
  
  inline def apply(): UpdateGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGatewayInformationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGatewayInformationOutput] (val x: Self) extends AnyVal {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setGatewayName(value: String): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayNameUndefined: Self = StObject.set(x, "GatewayName", js.undefined)
  }
}
