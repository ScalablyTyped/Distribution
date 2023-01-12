package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfig extends StObject {
  
  /**
    * The Amazon CloudWatch Logs group to which CloudFormation sends error logging information when invoking the extension's handlers.
    */
  var LogGroupName: typings.awsSdk.clientsCloudformationMod.LogGroupName
  
  /**
    * The Amazon Resource Name (ARN) of the role that CloudFormation should assume when sending log entries to CloudWatch Logs.
    */
  var LogRoleArn: RoleArn
}
object LoggingConfig {
  
  inline def apply(LogGroupName: LogGroupName, LogRoleArn: RoleArn): LoggingConfig = {
    val __obj = js.Dynamic.literal(LogGroupName = LogGroupName.asInstanceOf[js.Any], LogRoleArn = LogRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggingConfig] (val x: Self) extends AnyVal {
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogRoleArn(value: RoleArn): Self = StObject.set(x, "LogRoleArn", value.asInstanceOf[js.Any])
  }
}
