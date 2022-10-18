package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersRequest extends StObject {
  
  /**
    * The maximum number of items to return in the response. 
    */
  var MaxResults: js.UndefOr[CrossAccountMaxResults] = js.undefined
  
  /**
    * The token that is required for pagination. On your first call to the ListMembers operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    * Specifies which member accounts to include in the response based on their relationship status with the administrator account. The default value is TRUE. If OnlyAssociated is set to TRUE, the response includes member accounts whose relationship status with the administrator account is set to ENABLED. If OnlyAssociated is set to FALSE, the response includes all existing member accounts. 
    */
  var OnlyAssociated: js.UndefOr[Boolean] = js.undefined
}
object ListMembersRequest {
  
  inline def apply(): ListMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersRequest]
  }
  
  extension [Self <: ListMembersRequest](x: Self) {
    
    inline def setMaxResults(value: CrossAccountMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOnlyAssociated(value: Boolean): Self = StObject.set(x, "OnlyAssociated", value.asInstanceOf[js.Any])
    
    inline def setOnlyAssociatedUndefined: Self = StObject.set(x, "OnlyAssociated", js.undefined)
  }
}
