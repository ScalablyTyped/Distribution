package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicePositionHistoryRequest extends StObject {
  
  /**
    * The device whose position history you want to retrieve.
    */
  var DeviceId: Id
  
  /**
    * Specify the end time for the position history in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. By default, the value will be the time that the request is made. Requirement:   The time specified for EndTimeExclusive must be after the time for StartTimeInclusive.  
    */
  var EndTimeExclusive: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An optional limit for the number of device positions returned in a single call. Default value: 100 
    */
  var MaxResults: js.UndefOr[GetDevicePositionHistoryRequestMaxResultsInteger] = js.undefined
  
  /**
    * The pagination token specifying which page of results to return in the response. If no token is provided, the default page is the first page.  Default value: null 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Specify the start time for the position history in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. By default, the value will be 24 hours prior to the time that the request is made. Requirement:   The time specified for StartTimeInclusive must be before EndTimeExclusive.  
    */
  var StartTimeInclusive: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The tracker resource receiving the request for the device position history.
    */
  var TrackerName: ResourceName
}
object GetDevicePositionHistoryRequest {
  
  inline def apply(DeviceId: Id, TrackerName: ResourceName): GetDevicePositionHistoryRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePositionHistoryRequest]
  }
  
  extension [Self <: GetDevicePositionHistoryRequest](x: Self) {
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setEndTimeExclusive(value: js.Date): Self = StObject.set(x, "EndTimeExclusive", value.asInstanceOf[js.Any])
    
    inline def setEndTimeExclusiveUndefined: Self = StObject.set(x, "EndTimeExclusive", js.undefined)
    
    inline def setMaxResults(value: GetDevicePositionHistoryRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTimeInclusive(value: js.Date): Self = StObject.set(x, "StartTimeInclusive", value.asInstanceOf[js.Any])
    
    inline def setStartTimeInclusiveUndefined: Self = StObject.set(x, "StartTimeInclusive", js.undefined)
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
