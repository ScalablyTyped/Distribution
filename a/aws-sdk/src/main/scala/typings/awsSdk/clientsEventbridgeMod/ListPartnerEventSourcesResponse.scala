package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartnerEventSourcesResponse extends StObject {
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.NextToken] = js.undefined
  
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSources: js.UndefOr[PartnerEventSourceList] = js.undefined
}
object ListPartnerEventSourcesResponse {
  
  inline def apply(): ListPartnerEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnerEventSourcesResponse]
  }
  
  extension [Self <: ListPartnerEventSourcesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPartnerEventSources(value: PartnerEventSourceList): Self = StObject.set(x, "PartnerEventSources", value.asInstanceOf[js.Any])
    
    inline def setPartnerEventSourcesUndefined: Self = StObject.set(x, "PartnerEventSources", js.undefined)
    
    inline def setPartnerEventSourcesVarargs(value: PartnerEventSource*): Self = StObject.set(x, "PartnerEventSources", js.Array(value*))
  }
}
