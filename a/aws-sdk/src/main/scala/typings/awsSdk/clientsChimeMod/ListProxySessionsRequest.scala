package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProxySessionsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The proxy session status.
    */
  var Status: js.UndefOr[ProxySessionStatus] = js.undefined
  
  /**
    * The Amazon Chime voice connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object ListProxySessionsRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString128): ListProxySessionsRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProxySessionsRequest]
  }
  
  extension [Self <: ListProxySessionsRequest](x: Self) {
    
    inline def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: ProxySessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
