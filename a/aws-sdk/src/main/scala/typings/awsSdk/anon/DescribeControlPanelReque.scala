package typings.awsSdk.anon

import typings.awsSdk.clientsRoute53recoverycontrolconfigMod.string
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/route53recoverycontrolconfig.DescribeControlPanelRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeControlPanelReque extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: string
}
object DescribeControlPanelReque {
  
  inline def apply(ControlPanelArn: string): DescribeControlPanelReque = {
    val __obj = js.Dynamic.literal(ControlPanelArn = ControlPanelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeControlPanelReque]
  }
  
  extension [Self <: DescribeControlPanelReque](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setControlPanelArn(value: string): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
  }
}
