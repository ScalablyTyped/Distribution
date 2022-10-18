package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledActionsMessage extends StObject {
  
  /**
    * If true, retrieve only active scheduled actions. If false, retrieve only disabled scheduled actions. 
    */
  var Active: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The end time in UTC of the scheduled action to retrieve. Only active scheduled actions that have invocations before this time are retrieved.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * List of scheduled action filters. 
    */
  var Filters: js.UndefOr[ScheduledActionFilterList] = js.undefined
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeScheduledActions request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of the scheduled action to retrieve. 
    */
  var ScheduledActionName: js.UndefOr[String] = js.undefined
  
  /**
    * The start time in UTC of the scheduled actions to retrieve. Only active scheduled actions that have invocations after this time are retrieved.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of the scheduled actions to retrieve. 
    */
  var TargetActionType: js.UndefOr[ScheduledActionTypeValues] = js.undefined
}
object DescribeScheduledActionsMessage {
  
  inline def apply(): DescribeScheduledActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledActionsMessage]
  }
  
  extension [Self <: DescribeScheduledActionsMessage](x: Self) {
    
    inline def setActive(value: BooleanOptional): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFilters(value: ScheduledActionFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: ScheduledActionFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setScheduledActionName(value: String): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionNameUndefined: Self = StObject.set(x, "ScheduledActionName", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTargetActionType(value: ScheduledActionTypeValues): Self = StObject.set(x, "TargetActionType", value.asInstanceOf[js.Any])
    
    inline def setTargetActionTypeUndefined: Self = StObject.set(x, "TargetActionType", js.undefined)
  }
}
