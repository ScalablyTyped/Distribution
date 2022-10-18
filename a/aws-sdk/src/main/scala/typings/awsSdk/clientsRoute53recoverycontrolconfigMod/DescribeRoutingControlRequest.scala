package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRoutingControlRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the routing control.
    */
  var RoutingControlArn: string
}
object DescribeRoutingControlRequest {
  
  inline def apply(RoutingControlArn: string): DescribeRoutingControlRequest = {
    val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRoutingControlRequest]
  }
  
  extension [Self <: DescribeRoutingControlRequest](x: Self) {
    
    inline def setRoutingControlArn(value: string): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
  }
}
