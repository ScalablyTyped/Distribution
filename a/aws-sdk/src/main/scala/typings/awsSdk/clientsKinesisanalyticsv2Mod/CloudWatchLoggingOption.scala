package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLoggingOption extends StObject {
  
  /**
    * The ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.LogStreamARN
}
object CloudWatchLoggingOption {
  
  inline def apply(LogStreamARN: LogStreamARN): CloudWatchLoggingOption = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLoggingOption] (val x: Self) extends AnyVal {
    
    inline def setLogStreamARN(value: LogStreamARN): Self = StObject.set(x, "LogStreamARN", value.asInstanceOf[js.Any])
  }
}
