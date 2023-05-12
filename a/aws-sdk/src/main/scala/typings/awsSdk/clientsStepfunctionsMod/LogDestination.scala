package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDestination extends StObject {
  
  /**
    * An object describing a CloudWatch log group. For more information, see AWS::Logs::LogGroup in the CloudFormation User Guide.
    */
  var cloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup] = js.undefined
}
object LogDestination {
  
  inline def apply(): LogDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogDestination] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsLogGroup(value: CloudWatchLogsLogGroup): Self = StObject.set(x, "cloudWatchLogsLogGroup", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsLogGroupUndefined: Self = StObject.set(x, "cloudWatchLogsLogGroup", js.undefined)
  }
}
