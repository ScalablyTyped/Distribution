package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProposalsInput extends StObject {
  
  /**
    *  The maximum number of proposals to return. 
    */
  var MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined
  
  /**
    *  The unique identifier of the network. 
    */
  var NetworkId: ResourceIdString
  
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListProposalsInput {
  
  inline def apply(NetworkId: ResourceIdString): ListProposalsInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProposalsInput]
  }
  
  extension [Self <: ListProposalsInput](x: Self) {
    
    inline def setMaxResults(value: ProposalListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
