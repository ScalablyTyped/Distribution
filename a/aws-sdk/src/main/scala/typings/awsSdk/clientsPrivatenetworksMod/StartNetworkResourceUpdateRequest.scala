package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNetworkResourceUpdateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the network resource.
    */
  var networkResourceArn: Arn
  
  /**
    * The reason for the return. Providing a reason for a return is optional.
    */
  var returnReason: js.UndefOr[StartNetworkResourceUpdateRequestReturnReasonString] = js.undefined
  
  /**
    * The shipping address. If you don't provide a shipping address when replacing or returning a network resource, we use the address from the original order for the network resource.
    */
  var shippingAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * The update type.    REPLACE - Submits a request to replace a defective radio unit. We provide a shipping label that you can use for the return process and we ship a replacement radio unit to you.    RETURN - Submits a request to replace a radio unit that you no longer need. We provide a shipping label that you can use for the return process.  
    */
  var updateType: UpdateType
}
object StartNetworkResourceUpdateRequest {
  
  inline def apply(networkResourceArn: Arn, updateType: UpdateType): StartNetworkResourceUpdateRequest = {
    val __obj = js.Dynamic.literal(networkResourceArn = networkResourceArn.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNetworkResourceUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartNetworkResourceUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setNetworkResourceArn(value: Arn): Self = StObject.set(x, "networkResourceArn", value.asInstanceOf[js.Any])
    
    inline def setReturnReason(value: StartNetworkResourceUpdateRequestReturnReasonString): Self = StObject.set(x, "returnReason", value.asInstanceOf[js.Any])
    
    inline def setReturnReasonUndefined: Self = StObject.set(x, "returnReason", js.undefined)
    
    inline def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    inline def setUpdateType(value: UpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
