package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPublishingOption extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs group to publish logs to.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[typings.awsSdk.clientsOpensearchMod.CloudWatchLogsLogGroupArn] = js.undefined
  
  /**
    * Whether the log should be published.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object LogPublishingOption {
  
  inline def apply(): LogPublishingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogPublishingOption] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsLogGroupArn(value: CloudWatchLogsLogGroupArn): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
