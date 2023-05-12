package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVPCConnectionsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * A VPCConnectionSummaries object that returns a summary of VPC connection objects.
    */
  var VPCConnectionSummaries: js.UndefOr[VPCConnectionSummaryList] = js.undefined
}
object ListVPCConnectionsResponse {
  
  inline def apply(): ListVPCConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVPCConnectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVPCConnectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVPCConnectionSummaries(value: VPCConnectionSummaryList): Self = StObject.set(x, "VPCConnectionSummaries", value.asInstanceOf[js.Any])
    
    inline def setVPCConnectionSummariesUndefined: Self = StObject.set(x, "VPCConnectionSummaries", js.undefined)
    
    inline def setVPCConnectionSummariesVarargs(value: VPCConnectionSummary*): Self = StObject.set(x, "VPCConnectionSummaries", js.Array(value*))
  }
}
