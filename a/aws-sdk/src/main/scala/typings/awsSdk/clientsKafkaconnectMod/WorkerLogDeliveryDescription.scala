package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerLogDeliveryDescription extends StObject {
  
  /**
    * Details about delivering logs to Amazon CloudWatch Logs.
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsLogDeliveryDescription] = js.undefined
  
  /**
    * Details about delivering logs to Amazon Kinesis Data Firehose.
    */
  var firehose: js.UndefOr[FirehoseLogDeliveryDescription] = js.undefined
  
  /**
    * Details about delivering logs to Amazon S3.
    */
  var s3: js.UndefOr[S3LogDeliveryDescription] = js.undefined
}
object WorkerLogDeliveryDescription {
  
  inline def apply(): WorkerLogDeliveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerLogDeliveryDescription]
  }
  
  extension [Self <: WorkerLogDeliveryDescription](x: Self) {
    
    inline def setCloudWatchLogs(value: CloudWatchLogsLogDeliveryDescription): Self = StObject.set(x, "cloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "cloudWatchLogs", js.undefined)
    
    inline def setFirehose(value: FirehoseLogDeliveryDescription): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setS3(value: S3LogDeliveryDescription): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
