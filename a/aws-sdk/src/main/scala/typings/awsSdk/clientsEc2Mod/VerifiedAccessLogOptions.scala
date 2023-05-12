package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogOptions extends StObject {
  
  /**
    * Sends Verified Access logs to CloudWatch Logs.
    */
  var CloudWatchLogs: js.UndefOr[VerifiedAccessLogCloudWatchLogsDestinationOptions] = js.undefined
  
  /**
    * Sends Verified Access logs to Kinesis.
    */
  var KinesisDataFirehose: js.UndefOr[VerifiedAccessLogKinesisDataFirehoseDestinationOptions] = js.undefined
  
  /**
    * Sends Verified Access logs to Amazon S3.
    */
  var S3: js.UndefOr[VerifiedAccessLogS3DestinationOptions] = js.undefined
}
object VerifiedAccessLogOptions {
  
  inline def apply(): VerifiedAccessLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessLogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogOptions] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogs(value: VerifiedAccessLogCloudWatchLogsDestinationOptions): Self = StObject.set(x, "CloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "CloudWatchLogs", js.undefined)
    
    inline def setKinesisDataFirehose(value: VerifiedAccessLogKinesisDataFirehoseDestinationOptions): Self = StObject.set(x, "KinesisDataFirehose", value.asInstanceOf[js.Any])
    
    inline def setKinesisDataFirehoseUndefined: Self = StObject.set(x, "KinesisDataFirehose", js.undefined)
    
    inline def setS3(value: VerifiedAccessLogS3DestinationOptions): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
