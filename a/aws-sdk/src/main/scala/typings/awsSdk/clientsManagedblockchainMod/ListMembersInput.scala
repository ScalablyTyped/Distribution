package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersInput extends StObject {
  
  /**
    * An optional Boolean value. If provided, the request is limited either to members that the current Amazon Web Services account owns (true) or that other Amazon Web Services accountsn own (false). If omitted, all members are listed.
    */
  var IsOwned: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.IsOwned] = js.undefined
  
  /**
    * The maximum number of members to return in the request.
    */
  var MaxResults: js.UndefOr[MemberListMaxResults] = js.undefined
  
  /**
    * The optional name of the member to list.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the network for which to list members.
    */
  var NetworkId: ResourceIdString
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An optional status specifier. If provided, only members currently in this status are listed.
    */
  var Status: js.UndefOr[MemberStatus] = js.undefined
}
object ListMembersInput {
  
  inline def apply(NetworkId: ResourceIdString): ListMembersInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersInput]
  }
  
  extension [Self <: ListMembersInput](x: Self) {
    
    inline def setIsOwned(value: IsOwned): Self = StObject.set(x, "IsOwned", value.asInstanceOf[js.Any])
    
    inline def setIsOwnedUndefined: Self = StObject.set(x, "IsOwned", js.undefined)
    
    inline def setMaxResults(value: MemberListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: MemberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
