package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDelegationsResponse extends StObject {
  
  /**
    *  The list of delegations that the GetDelegations API returned. 
    */
  var delegations: js.UndefOr[DelegationMetadataList] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object GetDelegationsResponse {
  
  inline def apply(): GetDelegationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDelegationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDelegationsResponse] (val x: Self) extends AnyVal {
    
    inline def setDelegations(value: DelegationMetadataList): Self = StObject.set(x, "delegations", value.asInstanceOf[js.Any])
    
    inline def setDelegationsUndefined: Self = StObject.set(x, "delegations", js.undefined)
    
    inline def setDelegationsVarargs(value: DelegationMetadata*): Self = StObject.set(x, "delegations", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
