package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeliveryChannelStatusResponse extends StObject {
  
  /**
    * A list that contains the status of a specified delivery channel.
    */
  var DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined
}
object DescribeDeliveryChannelStatusResponse {
  
  inline def apply(): DescribeDeliveryChannelStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelStatusResponse]
  }
  
  extension [Self <: DescribeDeliveryChannelStatusResponse](x: Self) {
    
    inline def setDeliveryChannelsStatus(value: DeliveryChannelStatusList): Self = StObject.set(x, "DeliveryChannelsStatus", value.asInstanceOf[js.Any])
    
    inline def setDeliveryChannelsStatusUndefined: Self = StObject.set(x, "DeliveryChannelsStatus", js.undefined)
    
    inline def setDeliveryChannelsStatusVarargs(value: DeliveryChannelStatus*): Self = StObject.set(x, "DeliveryChannelsStatus", js.Array(value*))
  }
}
