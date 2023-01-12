package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsConfig extends StObject {
  
  /**
    *  The group name of the logs in CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the logs in CloudWatch Logs for a build project. Valid values are:    ENABLED: CloudWatch Logs are enabled for this build project.    DISABLED: CloudWatch Logs are not enabled for this build project.  
    */
  var status: LogsConfigStatusType
  
  /**
    *  The prefix of the stream name of the CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var streamName: js.UndefOr[String] = js.undefined
}
object CloudWatchLogsConfig {
  
  inline def apply(status: LogsConfigStatusType): CloudWatchLogsConfig = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLogsConfig] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setStatus(value: LogsConfigStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
