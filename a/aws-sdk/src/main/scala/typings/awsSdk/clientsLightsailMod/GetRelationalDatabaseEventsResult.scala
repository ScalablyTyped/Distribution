package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseEventsResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseEvents request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An object describing the result of your get relational database events request.
    */
  var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.undefined
}
object GetRelationalDatabaseEventsResult {
  
  inline def apply(): GetRelationalDatabaseEventsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseEventsResult]
  }
  
  extension [Self <: GetRelationalDatabaseEventsResult](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRelationalDatabaseEvents(value: RelationalDatabaseEventList): Self = StObject.set(x, "relationalDatabaseEvents", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseEventsUndefined: Self = StObject.set(x, "relationalDatabaseEvents", js.undefined)
    
    inline def setRelationalDatabaseEventsVarargs(value: RelationalDatabaseEvent*): Self = StObject.set(x, "relationalDatabaseEvents", js.Array(value*))
  }
}
