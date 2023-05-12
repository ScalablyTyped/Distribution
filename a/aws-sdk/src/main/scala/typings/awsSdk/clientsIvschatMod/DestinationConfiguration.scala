package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationConfiguration extends StObject {
  
  /**
    * An Amazon CloudWatch Logs destination configuration where chat activity will be logged.
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfiguration] = js.undefined
  
  /**
    * An Amazon Kinesis Data Firehose destination configuration where chat activity will be logged.
    */
  var firehose: js.UndefOr[FirehoseDestinationConfiguration] = js.undefined
  
  /**
    * An Amazon S3 destination configuration where chat activity will be logged.
    */
  var s3: js.UndefOr[S3DestinationConfiguration] = js.undefined
}
object DestinationConfiguration {
  
  inline def apply(): DestinationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogs(value: CloudWatchLogsDestinationConfiguration): Self = StObject.set(x, "cloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "cloudWatchLogs", js.undefined)
    
    inline def setFirehose(value: FirehoseDestinationConfiguration): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setS3(value: S3DestinationConfiguration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
