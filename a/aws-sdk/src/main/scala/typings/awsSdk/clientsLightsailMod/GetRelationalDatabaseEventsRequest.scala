package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseEventsRequest extends StObject {
  
  /**
    * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2 hours, enter 120. Default: 60  The minimum is 1 and the maximum is 14 days (20160 minutes).
    */
  var durationInMinutes: js.UndefOr[integer] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetRelationalDatabaseEvents request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the database from which to get events.
    */
  var relationalDatabaseName: ResourceName
}
object GetRelationalDatabaseEventsRequest {
  
  inline def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseEventsRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseEventsRequest]
  }
  
  extension [Self <: GetRelationalDatabaseEventsRequest](x: Self) {
    
    inline def setDurationInMinutes(value: integer): Self = StObject.set(x, "durationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDurationInMinutesUndefined: Self = StObject.set(x, "durationInMinutes", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
