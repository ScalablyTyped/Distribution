package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLoggingOptionUpdate extends StObject {
  
  /**
    * The ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined
}
object CloudWatchLoggingOptionUpdate {
  
  inline def apply(CloudWatchLoggingOptionId: Id): CloudWatchLoggingOptionUpdate = {
    val __obj = js.Dynamic.literal(CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
  }
  
  extension [Self <: CloudWatchLoggingOptionUpdate](x: Self) {
    
    inline def setCloudWatchLoggingOptionId(value: Id): Self = StObject.set(x, "CloudWatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    inline def setLogStreamARNUpdate(value: LogStreamARN): Self = StObject.set(x, "LogStreamARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setLogStreamARNUpdateUndefined: Self = StObject.set(x, "LogStreamARNUpdate", js.undefined)
  }
}
