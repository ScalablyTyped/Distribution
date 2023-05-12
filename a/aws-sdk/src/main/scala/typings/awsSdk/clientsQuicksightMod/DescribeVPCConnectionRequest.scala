package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVPCConnectionRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the account that contains the VPC connection that you want described.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the VPC connection that you're creating. This ID is a unique identifier for each Amazon Web Services Region in an Amazon Web Services account.
    */
  var VPCConnectionId: VPCConnectionResourceIdUnrestricted
}
object DescribeVPCConnectionRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, VPCConnectionId: VPCConnectionResourceIdUnrestricted): DescribeVPCConnectionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], VPCConnectionId = VPCConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVPCConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVPCConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setVPCConnectionId(value: VPCConnectionResourceIdUnrestricted): Self = StObject.set(x, "VPCConnectionId", value.asInstanceOf[js.Any])
  }
}
