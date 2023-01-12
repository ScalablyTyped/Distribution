package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoutingControlRequest extends StObject {
  
  /**
    * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action, specify a client token in the request.
    */
  var ClientToken: js.UndefOr[stringMin1Max64PatternS] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the cluster that includes the routing control.
    */
  var ClusterArn: stringMin1Max256PatternAZaZ09
  
  /**
    * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
    */
  var ControlPanelArn: js.UndefOr[stringMin1Max256PatternAZaZ09] = js.undefined
  
  /**
    * The name of the routing control.
    */
  var RoutingControlName: stringMin1Max64PatternS
}
object CreateRoutingControlRequest {
  
  inline def apply(ClusterArn: stringMin1Max256PatternAZaZ09, RoutingControlName: stringMin1Max64PatternS): CreateRoutingControlRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], RoutingControlName = RoutingControlName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoutingControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRoutingControlRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: stringMin1Max64PatternS): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setClusterArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setControlPanelArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
    
    inline def setControlPanelArnUndefined: Self = StObject.set(x, "ControlPanelArn", js.undefined)
    
    inline def setRoutingControlName(value: stringMin1Max64PatternS): Self = StObject.set(x, "RoutingControlName", value.asInstanceOf[js.Any])
  }
}
