package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVPCConnectionRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the account where you want to delete a VPC connection.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services Region in an Amazon Web Services account.
    */
  var VPCConnectionId: VPCConnectionResourceIdUnrestricted
}
object DeleteVPCConnectionRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, VPCConnectionId: VPCConnectionResourceIdUnrestricted): DeleteVPCConnectionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], VPCConnectionId = VPCConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVPCConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVPCConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setVPCConnectionId(value: VPCConnectionResourceIdUnrestricted): Self = StObject.set(x, "VPCConnectionId", value.asInstanceOf[js.Any])
  }
}
