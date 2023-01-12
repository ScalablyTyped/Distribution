package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoutingControlRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the routing control.
    */
  var RoutingControlArn: stringMin1Max256PatternAZaZ09
  
  /**
    * The name of the routing control.
    */
  var RoutingControlName: stringMin1Max64PatternS
}
object UpdateRoutingControlRequest {
  
  inline def apply(RoutingControlArn: stringMin1Max256PatternAZaZ09, RoutingControlName: stringMin1Max64PatternS): UpdateRoutingControlRequest = {
    val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any], RoutingControlName = RoutingControlName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRoutingControlRequest] (val x: Self) extends AnyVal {
    
    inline def setRoutingControlArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
    
    inline def setRoutingControlName(value: stringMin1Max64PatternS): Self = StObject.set(x, "RoutingControlName", value.asInstanceOf[js.Any])
  }
}
