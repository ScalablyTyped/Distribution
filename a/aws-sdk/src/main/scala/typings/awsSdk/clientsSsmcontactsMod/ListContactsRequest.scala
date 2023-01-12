package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactsRequest extends StObject {
  
  /**
    * Used to list only contacts who's aliases start with the specified prefix.
    */
  var AliasPrefix: js.UndefOr[ContactAlias] = js.undefined
  
  /**
    * The maximum number of contacts and escalation plans per page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The type of contact. A contact is type PERSONAL and an escalation plan is type ESCALATION.
    */
  var Type: js.UndefOr[ContactType] = js.undefined
}
object ListContactsRequest {
  
  inline def apply(): ListContactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContactsRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasPrefix(value: ContactAlias): Self = StObject.set(x, "AliasPrefix", value.asInstanceOf[js.Any])
    
    inline def setAliasPrefixUndefined: Self = StObject.set(x, "AliasPrefix", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setType(value: ContactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
