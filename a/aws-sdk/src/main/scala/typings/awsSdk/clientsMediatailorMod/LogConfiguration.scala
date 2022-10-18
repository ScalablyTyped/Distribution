package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfiguration extends StObject {
  
  /**
    * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account. For example, if your playback configuration has 1000 sessions and percentEnabled is set to 60, MediaTailor sends logs for 600 of the sessions to CloudWatch Logs. MediaTailor decides at random which of the playback configuration sessions to send logs for. If you want to view logs for a specific session, you can use the debug log mode. Valid values: 0 - 100
    */
  var PercentEnabled: integer
}
object LogConfiguration {
  
  inline def apply(PercentEnabled: integer): LogConfiguration = {
    val __obj = js.Dynamic.literal(PercentEnabled = PercentEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfiguration]
  }
  
  extension [Self <: LogConfiguration](x: Self) {
    
    inline def setPercentEnabled(value: integer): Self = StObject.set(x, "PercentEnabled", value.asInstanceOf[js.Any])
  }
}
