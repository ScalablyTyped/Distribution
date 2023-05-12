package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayInstanceRequest extends StObject {
  
  /**
    * The availability of the instance to host new bridges. The bridgePlacement property can be LOCKED or AVAILABLE. If it is LOCKED, no new bridges can be deployed to this instance. If it is AVAILABLE, new bridges can be added to this instance.
    */
  var BridgePlacement: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.BridgePlacement] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the instance that you want to update.
    */
  var GatewayInstanceArn: string
}
object UpdateGatewayInstanceRequest {
  
  inline def apply(GatewayInstanceArn: string): UpdateGatewayInstanceRequest = {
    val __obj = js.Dynamic.literal(GatewayInstanceArn = GatewayInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGatewayInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setBridgePlacement(value: BridgePlacement): Self = StObject.set(x, "BridgePlacement", value.asInstanceOf[js.Any])
    
    inline def setBridgePlacementUndefined: Self = StObject.set(x, "BridgePlacement", js.undefined)
    
    inline def setGatewayInstanceArn(value: string): Self = StObject.set(x, "GatewayInstanceArn", value.asInstanceOf[js.Any])
  }
}
