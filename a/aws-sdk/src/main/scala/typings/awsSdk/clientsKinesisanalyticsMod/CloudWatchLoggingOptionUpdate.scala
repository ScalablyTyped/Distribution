package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLoggingOptionUpdate extends StObject {
  
  /**
    * ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id
  
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined
  
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
}
object CloudWatchLoggingOptionUpdate {
  
  inline def apply(CloudWatchLoggingOptionId: Id): CloudWatchLoggingOptionUpdate = {
    val __obj = js.Dynamic.literal(CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLoggingOptionUpdate] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLoggingOptionId(value: Id): Self = StObject.set(x, "CloudWatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    inline def setLogStreamARNUpdate(value: LogStreamARN): Self = StObject.set(x, "LogStreamARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setLogStreamARNUpdateUndefined: Self = StObject.set(x, "LogStreamARNUpdate", js.undefined)
    
    inline def setRoleARNUpdate(value: RoleARN): Self = StObject.set(x, "RoleARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUpdateUndefined: Self = StObject.set(x, "RoleARNUpdate", js.undefined)
  }
}
