package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExportTaskRequest extends StObject {
  
  /**
    * The name of S3 bucket for the exported log data. The bucket must be in the same Amazon Web Services Region.
    */
  var destination: ExportDestinationBucket
  
  /**
    * The prefix used as the start of the key for every object exported. If you don't specify a value, the default is exportedlogs.
    */
  var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined
  
  /**
    * The start time of the range for the request, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp earlier than this time are not exported.
    */
  var from: Timestamp
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  /**
    * Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is applied.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined
  
  /**
    * The name of the export task.
    */
  var taskName: js.UndefOr[ExportTaskName] = js.undefined
  
  /**
    * The end time of the range for the request, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported. You must specify a time that is not earlier than when this log group was created.
    */
  var to: Timestamp
}
object CreateExportTaskRequest {
  
  inline def apply(destination: ExportDestinationBucket, from: Timestamp, logGroupName: LogGroupName, to: Timestamp): CreateExportTaskRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExportTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: ExportDestinationBucket): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefix(value: ExportDestinationPrefix): Self = StObject.set(x, "destinationPrefix", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixUndefined: Self = StObject.set(x, "destinationPrefix", js.undefined)
    
    inline def setFrom(value: Timestamp): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamePrefix(value: LogStreamName): Self = StObject.set(x, "logStreamNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamePrefixUndefined: Self = StObject.set(x, "logStreamNamePrefix", js.undefined)
    
    inline def setTaskName(value: ExportTaskName): Self = StObject.set(x, "taskName", value.asInstanceOf[js.Any])
    
    inline def setTaskNameUndefined: Self = StObject.set(x, "taskName", js.undefined)
    
    inline def setTo(value: Timestamp): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
