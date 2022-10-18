package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCasesForContactRequest extends StObject {
  
  /**
    * A unique identifier of a contact in Amazon Connect.
    */
  var contactArn: ContactArn
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The maximum number of results to return per page.
    */
  var maxResults: js.UndefOr[ListCasesForContactRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCasesForContactRequest {
  
  inline def apply(contactArn: ContactArn, domainId: DomainId): ListCasesForContactRequest = {
    val __obj = js.Dynamic.literal(contactArn = contactArn.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCasesForContactRequest]
  }
  
  extension [Self <: ListCasesForContactRequest](x: Self) {
    
    inline def setContactArn(value: ContactArn): Self = StObject.set(x, "contactArn", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListCasesForContactRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
