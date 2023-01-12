package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateCloudWatchLogsLogConfigurationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
    */
  var logGroupArn: CloudWatchLogGroupArn
}
object ExperimentTemplateCloudWatchLogsLogConfigurationInput {
  
  inline def apply(logGroupArn: CloudWatchLogGroupArn): ExperimentTemplateCloudWatchLogsLogConfigurationInput = {
    val __obj = js.Dynamic.literal(logGroupArn = logGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentTemplateCloudWatchLogsLogConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentTemplateCloudWatchLogsLogConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "logGroupArn", value.asInstanceOf[js.Any])
  }
}
