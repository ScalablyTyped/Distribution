package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVPCConnectionResponse extends StObject {
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * A response object that provides information for the specified VPC connection.
    */
  var VPCConnection: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VPCConnection] = js.undefined
}
object DescribeVPCConnectionResponse {
  
  inline def apply(): DescribeVPCConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVPCConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVPCConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVPCConnection(value: VPCConnection): Self = StObject.set(x, "VPCConnection", value.asInstanceOf[js.Any])
    
    inline def setVPCConnectionUndefined: Self = StObject.set(x, "VPCConnection", js.undefined)
  }
}
