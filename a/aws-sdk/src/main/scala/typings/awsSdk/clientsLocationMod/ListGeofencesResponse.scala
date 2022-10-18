package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGeofencesResponse extends StObject {
  
  /**
    * Contains a list of geofences stored in the geofence collection.
    */
  var Entries: ListGeofenceResponseEntryList
  
  /**
    * A pagination token indicating there are additional pages available. You can use the token in a following request to fetch the next set of results. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListGeofencesResponse {
  
  inline def apply(Entries: ListGeofenceResponseEntryList): ListGeofencesResponse = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeofencesResponse]
  }
  
  extension [Self <: ListGeofencesResponse](x: Self) {
    
    inline def setEntries(value: ListGeofenceResponseEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: ListGeofenceResponseEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
