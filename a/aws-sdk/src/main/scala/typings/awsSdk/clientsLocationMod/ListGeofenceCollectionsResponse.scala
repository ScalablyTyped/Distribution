package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGeofenceCollectionsResponse extends StObject {
  
  /**
    * Lists the geofence collections that exist in your AWS account.
    */
  var Entries: ListGeofenceCollectionsResponseEntryList
  
  /**
    * A pagination token indicating there are additional pages available. You can use the token in a following request to fetch the next set of results. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListGeofenceCollectionsResponse {
  
  inline def apply(Entries: ListGeofenceCollectionsResponseEntryList): ListGeofenceCollectionsResponse = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeofenceCollectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGeofenceCollectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: ListGeofenceCollectionsResponseEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: ListGeofenceCollectionsResponseEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
