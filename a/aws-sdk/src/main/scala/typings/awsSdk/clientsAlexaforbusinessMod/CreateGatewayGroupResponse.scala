package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGatewayGroupResponse extends StObject {
  
  /**
    * The ARN of the created gateway group.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.undefined
}
object CreateGatewayGroupResponse {
  
  inline def apply(): CreateGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGatewayGroupResponse]
  }
  
  extension [Self <: CreateGatewayGroupResponse](x: Self) {
    
    inline def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayGroupArnUndefined: Self = StObject.set(x, "GatewayGroupArn", js.undefined)
  }
}
