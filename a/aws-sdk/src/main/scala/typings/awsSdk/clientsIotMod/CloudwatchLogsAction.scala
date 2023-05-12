package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudwatchLogsAction extends StObject {
  
  /**
    * Indicates whether batches of log records will be extracted and uploaded into CloudWatch. Values include true or false (default).
    */
  var batchMode: js.UndefOr[BatchMode] = js.undefined
  
  /**
    * The CloudWatch log group to which the action sends data.
    */
  var logGroupName: LogGroupName
  
  /**
    * The IAM role that allows access to the CloudWatch log.
    */
  var roleArn: AwsArn
}
object CloudwatchLogsAction {
  
  inline def apply(logGroupName: LogGroupName, roleArn: AwsArn): CloudwatchLogsAction = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchLogsAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudwatchLogsAction] (val x: Self) extends AnyVal {
    
    inline def setBatchMode(value: BatchMode): Self = StObject.set(x, "batchMode", value.asInstanceOf[js.Any])
    
    inline def setBatchModeUndefined: Self = StObject.set(x, "batchMode", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
