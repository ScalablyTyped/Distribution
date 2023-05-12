package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadSetExportJobResponse extends StObject {
  
  /**
    * When the job completed.
    */
  var completionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the job was created.
    */
  var creationTime: js.Date
  
  /**
    * The job's destination in Amazon S3.
    */
  var destination: S3Destination
  
  /**
    * The job's ID.
    */
  var id: ExportJobId
  
  /**
    * The job's read sets.
    */
  var readSets: js.UndefOr[ExportReadSetDetailList] = js.undefined
  
  /**
    * The job's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    * The job's status.
    */
  var status: ReadSetExportJobStatus
  
  /**
    * The job's status message.
    */
  var statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
}
object GetReadSetExportJobResponse {
  
  inline def apply(
    creationTime: js.Date,
    destination: S3Destination,
    id: ExportJobId,
    sequenceStoreId: SequenceStoreId,
    status: ReadSetExportJobStatus
  ): GetReadSetExportJobResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadSetExportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetExportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: S3Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setId(value: ExportJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReadSets(value: ExportReadSetDetailList): Self = StObject.set(x, "readSets", value.asInstanceOf[js.Any])
    
    inline def setReadSetsUndefined: Self = StObject.set(x, "readSets", js.undefined)
    
    inline def setReadSetsVarargs(value: ExportReadSetDetail*): Self = StObject.set(x, "readSets", js.Array(value*))
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReadSetExportJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: JobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
