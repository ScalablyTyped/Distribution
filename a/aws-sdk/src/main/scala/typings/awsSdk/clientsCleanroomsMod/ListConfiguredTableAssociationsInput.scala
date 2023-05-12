package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfiguredTableAssociationsInput extends StObject {
  
  /**
    * The maximum size of the results that is returned per call.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A unique identifier for the membership to list configured table associations for. Currently accepts the membership ID.
    */
  var membershipIdentifier: MembershipIdentifier
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListConfiguredTableAssociationsInput {
  
  inline def apply(membershipIdentifier: MembershipIdentifier): ListConfiguredTableAssociationsInput = {
    val __obj = js.Dynamic.literal(membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfiguredTableAssociationsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConfiguredTableAssociationsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
