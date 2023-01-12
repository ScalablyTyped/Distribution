package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProposalsOutput extends StObject {
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The summary of each proposal made on the network.
    */
  var Proposals: js.UndefOr[ProposalSummaryList] = js.undefined
}
object ListProposalsOutput {
  
  inline def apply(): ListProposalsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProposalsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProposals(value: ProposalSummaryList): Self = StObject.set(x, "Proposals", value.asInstanceOf[js.Any])
    
    inline def setProposalsUndefined: Self = StObject.set(x, "Proposals", js.undefined)
    
    inline def setProposalsVarargs(value: ProposalSummary*): Self = StObject.set(x, "Proposals", js.Array(value*))
  }
}
