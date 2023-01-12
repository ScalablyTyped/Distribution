package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLoggingOptions extends StObject {
  
  /**
    * Enables or disables CloudWatch logging.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The CloudWatch group name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.clientsFirehoseMod.LogGroupName] = js.undefined
  
  /**
    * The CloudWatch log stream name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogStreamName: js.UndefOr[typings.awsSdk.clientsFirehoseMod.LogStreamName] = js.undefined
}
object CloudWatchLoggingOptions {
  
  inline def apply(): CloudWatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLoggingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLoggingOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: BooleanObject): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "LogStreamName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNameUndefined: Self = StObject.set(x, "LogStreamName", js.undefined)
  }
}
