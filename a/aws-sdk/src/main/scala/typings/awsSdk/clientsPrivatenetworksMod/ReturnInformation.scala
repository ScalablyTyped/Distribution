package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnInformation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replacement order.
    */
  var replacementOrderArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The reason for the return. If the return request did not include a reason for the return, this value is null.
    */
  var returnReason: js.UndefOr[String] = js.undefined
  
  /**
    * The shipping address.
    */
  var shippingAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * The URL of the shipping label. The shipping label is available for download only if the status of the network resource is PENDING_RETURN. For more information, see Return a radio unit.
    */
  var shippingLabel: js.UndefOr[String] = js.undefined
}
object ReturnInformation {
  
  inline def apply(): ReturnInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnInformation] (val x: Self) extends AnyVal {
    
    inline def setReplacementOrderArn(value: Arn): Self = StObject.set(x, "replacementOrderArn", value.asInstanceOf[js.Any])
    
    inline def setReplacementOrderArnUndefined: Self = StObject.set(x, "replacementOrderArn", js.undefined)
    
    inline def setReturnReason(value: String): Self = StObject.set(x, "returnReason", value.asInstanceOf[js.Any])
    
    inline def setReturnReasonUndefined: Self = StObject.set(x, "returnReason", js.undefined)
    
    inline def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    inline def setShippingLabel(value: String): Self = StObject.set(x, "shippingLabel", value.asInstanceOf[js.Any])
    
    inline def setShippingLabelUndefined: Self = StObject.set(x, "shippingLabel", js.undefined)
  }
}
