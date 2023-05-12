package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDestination extends StObject {
  
  /**
    * An Amazon CloudWatch Logs log group that stores simulation log data. For more information about log groups, see Working with log groups and log streams in the Amazon CloudWatch Logs User Guide.
    */
  var CloudWatchLogsLogGroup: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.CloudWatchLogsLogGroup] = js.undefined
}
object LogDestination {
  
  inline def apply(): LogDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogDestination] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsLogGroup(value: CloudWatchLogsLogGroup): Self = StObject.set(x, "CloudWatchLogsLogGroup", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsLogGroupUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroup", js.undefined)
  }
}
