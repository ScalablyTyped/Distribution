package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVPCConnectionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC connection.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The availability status of the VPC connection.
    */
  var AvailabilityStatus: js.UndefOr[VPCConnectionAvailabilityStatus] = js.undefined
  
  /**
    * The status of the creation of the VPC connection.
    */
  var CreationStatus: js.UndefOr[VPCConnectionResourceStatus] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The ID for the VPC connection that you're creating. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var VPCConnectionId: js.UndefOr[VPCConnectionResourceIdRestricted] = js.undefined
}
object CreateVPCConnectionResponse {
  
  inline def apply(): CreateVPCConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVPCConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVPCConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAvailabilityStatus(value: VPCConnectionAvailabilityStatus): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
    
    inline def setCreationStatus(value: VPCConnectionResourceStatus): Self = StObject.set(x, "CreationStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationStatusUndefined: Self = StObject.set(x, "CreationStatus", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVPCConnectionId(value: VPCConnectionResourceIdRestricted): Self = StObject.set(x, "VPCConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVPCConnectionIdUndefined: Self = StObject.set(x, "VPCConnectionId", js.undefined)
  }
}
