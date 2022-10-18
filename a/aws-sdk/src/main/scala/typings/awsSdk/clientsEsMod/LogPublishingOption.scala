package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPublishingOption extends StObject {
  
  var CloudWatchLogsLogGroupArn: js.UndefOr[typings.awsSdk.clientsEsMod.CloudWatchLogsLogGroupArn] = js.undefined
  
  /**
    *  Specifies whether given log publishing option is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object LogPublishingOption {
  
  inline def apply(): LogPublishingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOption]
  }
  
  extension [Self <: LogPublishingOption](x: Self) {
    
    inline def setCloudWatchLogsLogGroupArn(value: CloudWatchLogsLogGroupArn): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
