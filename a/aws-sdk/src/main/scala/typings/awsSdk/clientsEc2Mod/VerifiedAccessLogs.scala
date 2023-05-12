package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogs extends StObject {
  
  /**
    * CloudWatch Logs logging destination.
    */
  var CloudWatchLogs: js.UndefOr[VerifiedAccessLogCloudWatchLogsDestination] = js.undefined
  
  /**
    * Kinesis logging destination.
    */
  var KinesisDataFirehose: js.UndefOr[VerifiedAccessLogKinesisDataFirehoseDestination] = js.undefined
  
  /**
    * Amazon S3 logging options.
    */
  var S3: js.UndefOr[VerifiedAccessLogS3Destination] = js.undefined
}
object VerifiedAccessLogs {
  
  inline def apply(): VerifiedAccessLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessLogs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogs] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogs(value: VerifiedAccessLogCloudWatchLogsDestination): Self = StObject.set(x, "CloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "CloudWatchLogs", js.undefined)
    
    inline def setKinesisDataFirehose(value: VerifiedAccessLogKinesisDataFirehoseDestination): Self = StObject.set(x, "KinesisDataFirehose", value.asInstanceOf[js.Any])
    
    inline def setKinesisDataFirehoseUndefined: Self = StObject.set(x, "KinesisDataFirehose", js.undefined)
    
    inline def setS3(value: VerifiedAccessLogS3Destination): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
