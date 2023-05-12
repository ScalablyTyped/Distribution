package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRouteCalculatorsResponse extends StObject {
  
  /**
    * Lists the route calculator resources that exist in your Amazon Web Services account
    */
  var Entries: ListRouteCalculatorsResponseEntryList
  
  /**
    * A pagination token indicating there are additional pages available. You can use the token in a subsequent request to fetch the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListRouteCalculatorsResponse {
  
  inline def apply(Entries: ListRouteCalculatorsResponseEntryList): ListRouteCalculatorsResponse = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRouteCalculatorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRouteCalculatorsResponse] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: ListRouteCalculatorsResponseEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: ListRouteCalculatorsResponseEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
