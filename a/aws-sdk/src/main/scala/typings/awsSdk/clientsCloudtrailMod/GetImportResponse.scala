package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportResponse extends StObject {
  
  /**
    *  The timestamp of the import's creation. 
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ARN of the destination event data store. 
    */
  var Destinations: js.UndefOr[ImportDestinations] = js.undefined
  
  /**
    *  Used with StartEventTime to bound a StartImport request, and limit imported trail events to only those events logged within a specified time period. 
    */
  var EndEventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ID of the import. 
    */
  var ImportId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The source S3 bucket. 
    */
  var ImportSource: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ImportSource] = js.undefined
  
  /**
    *  Provides statistics for the import. CloudTrail does not update import statistics in real-time. Returned values for parameters such as EventsCompleted may be lower than the actual value, because CloudTrail updates statistics incrementally over the course of the import. 
    */
  var ImportStatistics: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ImportStatistics] = js.undefined
  
  /**
    *  The status of the import. 
    */
  var ImportStatus: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ImportStatus] = js.undefined
  
  /**
    *  Used with EndEventTime to bound a StartImport request, and limit imported trail events to only those events logged within a specified time period. 
    */
  var StartEventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The timestamp of when the import was updated. 
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object GetImportResponse {
  
  inline def apply(): GetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImportResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDestinations(value: ImportDestinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: EventDataStoreArn*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setEndEventTime(value: js.Date): Self = StObject.set(x, "EndEventTime", value.asInstanceOf[js.Any])
    
    inline def setEndEventTimeUndefined: Self = StObject.set(x, "EndEventTime", js.undefined)
    
    inline def setImportId(value: UUID): Self = StObject.set(x, "ImportId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "ImportId", js.undefined)
    
    inline def setImportSource(value: ImportSource): Self = StObject.set(x, "ImportSource", value.asInstanceOf[js.Any])
    
    inline def setImportSourceUndefined: Self = StObject.set(x, "ImportSource", js.undefined)
    
    inline def setImportStatistics(value: ImportStatistics): Self = StObject.set(x, "ImportStatistics", value.asInstanceOf[js.Any])
    
    inline def setImportStatisticsUndefined: Self = StObject.set(x, "ImportStatistics", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
    
    inline def setStartEventTime(value: js.Date): Self = StObject.set(x, "StartEventTime", value.asInstanceOf[js.Any])
    
    inline def setStartEventTimeUndefined: Self = StObject.set(x, "StartEventTime", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
