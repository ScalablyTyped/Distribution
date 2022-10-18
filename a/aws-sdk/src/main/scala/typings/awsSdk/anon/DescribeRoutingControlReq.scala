package typings.awsSdk.anon

import typings.awsSdk.clientsRoute53recoverycontrolconfigMod.string
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/route53recoverycontrolconfig.DescribeRoutingControlRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeRoutingControlReq extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the routing control.
    */
  var RoutingControlArn: string
}
object DescribeRoutingControlReq {
  
  inline def apply(RoutingControlArn: string): DescribeRoutingControlReq = {
    val __obj = js.Dynamic.literal(RoutingControlArn = RoutingControlArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRoutingControlReq]
  }
  
  extension [Self <: DescribeRoutingControlReq](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setRoutingControlArn(value: string): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
  }
}
