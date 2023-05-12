package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestionStatus extends StObject {
  
  /**
    * The event ID of the most recent attempt to ingest events.
    */
  var LatestIngestionAttemptEventID: js.UndefOr[UUID] = js.undefined
  
  /**
    * The time stamp of the most recent attempt to ingest events on the channel.
    */
  var LatestIngestionAttemptTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The error code for the most recent failure to ingest events.
    */
  var LatestIngestionErrorCode: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The event ID of the most recent successful ingestion of events.
    */
  var LatestIngestionSuccessEventID: js.UndefOr[UUID] = js.undefined
  
  /**
    * The time stamp of the most recent successful ingestion of events for the channel.
    */
  var LatestIngestionSuccessTime: js.UndefOr[js.Date] = js.undefined
}
object IngestionStatus {
  
  inline def apply(): IngestionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestionStatus] (val x: Self) extends AnyVal {
    
    inline def setLatestIngestionAttemptEventID(value: UUID): Self = StObject.set(x, "LatestIngestionAttemptEventID", value.asInstanceOf[js.Any])
    
    inline def setLatestIngestionAttemptEventIDUndefined: Self = StObject.set(x, "LatestIngestionAttemptEventID", js.undefined)
    
    inline def setLatestIngestionAttemptTime(value: js.Date): Self = StObject.set(x, "LatestIngestionAttemptTime", value.asInstanceOf[js.Any])
    
    inline def setLatestIngestionAttemptTimeUndefined: Self = StObject.set(x, "LatestIngestionAttemptTime", js.undefined)
    
    inline def setLatestIngestionErrorCode(value: ErrorMessage): Self = StObject.set(x, "LatestIngestionErrorCode", value.asInstanceOf[js.Any])
    
    inline def setLatestIngestionErrorCodeUndefined: Self = StObject.set(x, "LatestIngestionErrorCode", js.undefined)
    
    inline def setLatestIngestionSuccessEventID(value: UUID): Self = StObject.set(x, "LatestIngestionSuccessEventID", value.asInstanceOf[js.Any])
    
    inline def setLatestIngestionSuccessEventIDUndefined: Self = StObject.set(x, "LatestIngestionSuccessEventID", js.undefined)
    
    inline def setLatestIngestionSuccessTime(value: js.Date): Self = StObject.set(x, "LatestIngestionSuccessTime", value.asInstanceOf[js.Any])
    
    inline def setLatestIngestionSuccessTimeUndefined: Self = StObject.set(x, "LatestIngestionSuccessTime", js.undefined)
  }
}
