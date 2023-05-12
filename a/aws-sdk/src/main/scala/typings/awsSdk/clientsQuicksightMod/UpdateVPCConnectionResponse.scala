package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVPCConnectionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC connection.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The availability status of the VPC connection.
    */
  var AvailabilityStatus: js.UndefOr[VPCConnectionAvailabilityStatus] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The update status of the VPC connection's last update.
    */
  var UpdateStatus: js.UndefOr[VPCConnectionResourceStatus] = js.undefined
  
  /**
    * The ID of the VPC connection that you are updating. This ID is a unique identifier for each Amazon Web Services Region in anAmazon Web Services account.
    */
  var VPCConnectionId: js.UndefOr[VPCConnectionResourceIdUnrestricted] = js.undefined
}
object UpdateVPCConnectionResponse {
  
  inline def apply(): UpdateVPCConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVPCConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVPCConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAvailabilityStatus(value: VPCConnectionAvailabilityStatus): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdateStatus(value: VPCConnectionResourceStatus): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
    
    inline def setVPCConnectionId(value: VPCConnectionResourceIdUnrestricted): Self = StObject.set(x, "VPCConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVPCConnectionIdUndefined: Self = StObject.set(x, "VPCConnectionId", js.undefined)
  }
}
