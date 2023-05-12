package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrackersResponse extends StObject {
  
  /**
    * Contains tracker resources in your Amazon Web Services account. Details include tracker name, description and timestamps for when the tracker was created and last updated.
    */
  var Entries: ListTrackersResponseEntryList
  
  /**
    * A pagination token indicating there are additional pages available. You can use the token in a following request to fetch the next set of results. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListTrackersResponse {
  
  inline def apply(Entries: ListTrackersResponseEntryList): ListTrackersResponse = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrackersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTrackersResponse] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: ListTrackersResponseEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: ListTrackersResponseEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
