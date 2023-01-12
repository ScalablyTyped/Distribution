package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeliveryChannelStatusRequest extends StObject {
  
  /**
    * A list of delivery channel names.
    */
  var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
}
object DescribeDeliveryChannelStatusRequest {
  
  inline def apply(): DescribeDeliveryChannelStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDeliveryChannelStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setDeliveryChannelNames(value: DeliveryChannelNameList): Self = StObject.set(x, "DeliveryChannelNames", value.asInstanceOf[js.Any])
    
    inline def setDeliveryChannelNamesUndefined: Self = StObject.set(x, "DeliveryChannelNames", js.undefined)
    
    inline def setDeliveryChannelNamesVarargs(value: ChannelName*): Self = StObject.set(x, "DeliveryChannelNames", js.Array(value*))
  }
}
