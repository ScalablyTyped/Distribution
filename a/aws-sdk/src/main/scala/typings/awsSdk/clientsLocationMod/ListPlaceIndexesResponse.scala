package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlaceIndexesResponse extends StObject {
  
  /**
    * Lists the place index resources that exist in your AWS account
    */
  var Entries: ListPlaceIndexesResponseEntryList
  
  /**
    * A pagination token indicating that there are additional pages available. You can use the token in a new request to fetch the next page of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListPlaceIndexesResponse {
  
  inline def apply(Entries: ListPlaceIndexesResponseEntryList): ListPlaceIndexesResponse = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlaceIndexesResponse]
  }
  
  extension [Self <: ListPlaceIndexesResponse](x: Self) {
    
    inline def setEntries(value: ListPlaceIndexesResponseEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: ListPlaceIndexesResponseEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
