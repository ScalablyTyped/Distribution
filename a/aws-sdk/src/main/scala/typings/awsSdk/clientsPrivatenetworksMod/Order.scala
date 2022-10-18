package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  /**
    * The acknowledgement status of the order.
    */
  var acknowledgmentStatus: js.UndefOr[AcknowledgmentStatus] = js.undefined
  
  /**
    * The creation time of the order.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network associated with this order.
    */
  var networkArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network site associated with this order.
    */
  var networkSiteArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the order.
    */
  var orderArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The shipping address of the order.
    */
  var shippingAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * The tracking information of the order.
    */
  var trackingInformation: js.UndefOr[TrackingInformationList] = js.undefined
}
object Order {
  
  inline def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setAcknowledgmentStatus(value: AcknowledgmentStatus): Self = StObject.set(x, "acknowledgmentStatus", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgmentStatusUndefined: Self = StObject.set(x, "acknowledgmentStatus", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkArnUndefined: Self = StObject.set(x, "networkArn", js.undefined)
    
    inline def setNetworkSiteArn(value: Arn): Self = StObject.set(x, "networkSiteArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteArnUndefined: Self = StObject.set(x, "networkSiteArn", js.undefined)
    
    inline def setOrderArn(value: Arn): Self = StObject.set(x, "orderArn", value.asInstanceOf[js.Any])
    
    inline def setOrderArnUndefined: Self = StObject.set(x, "orderArn", js.undefined)
    
    inline def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    inline def setTrackingInformation(value: TrackingInformationList): Self = StObject.set(x, "trackingInformation", value.asInstanceOf[js.Any])
    
    inline def setTrackingInformationUndefined: Self = StObject.set(x, "trackingInformation", js.undefined)
    
    inline def setTrackingInformationVarargs(value: TrackingInformation*): Self = StObject.set(x, "trackingInformation", js.Array(value*))
  }
}
