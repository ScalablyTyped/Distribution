package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetsInput extends StObject {
  
  /**
    * Filters the results by the host ID of a Dedicated Host.
    */
  var HostIdFilter: js.UndefOr[HostIdList] = js.undefined
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost. 
    */
  var OutpostIdentifier: typings.awsSdk.clientsOutpostsMod.OutpostIdentifier
  
  /**
    * Filters the results by state.
    */
  var StatusFilter: js.UndefOr[StatusList] = js.undefined
}
object ListAssetsInput {
  
  inline def apply(OutpostIdentifier: OutpostIdentifier): ListAssetsInput = {
    val __obj = js.Dynamic.literal(OutpostIdentifier = OutpostIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetsInput]
  }
  
  extension [Self <: ListAssetsInput](x: Self) {
    
    inline def setHostIdFilter(value: HostIdList): Self = StObject.set(x, "HostIdFilter", value.asInstanceOf[js.Any])
    
    inline def setHostIdFilterUndefined: Self = StObject.set(x, "HostIdFilter", js.undefined)
    
    inline def setHostIdFilterVarargs(value: HostId*): Self = StObject.set(x, "HostIdFilter", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutpostIdentifier(value: OutpostIdentifier): Self = StObject.set(x, "OutpostIdentifier", value.asInstanceOf[js.Any])
    
    inline def setStatusFilter(value: StatusList): Self = StObject.set(x, "StatusFilter", value.asInstanceOf[js.Any])
    
    inline def setStatusFilterUndefined: Self = StObject.set(x, "StatusFilter", js.undefined)
    
    inline def setStatusFilterVarargs(value: AssetState*): Self = StObject.set(x, "StatusFilter", js.Array(value*))
  }
}
