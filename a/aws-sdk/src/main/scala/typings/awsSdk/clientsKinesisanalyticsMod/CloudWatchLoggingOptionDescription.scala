package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLoggingOptionDescription extends StObject {
  
  /**
    * ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined
  
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsSdk.clientsKinesisanalyticsMod.LogStreamARN
  
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role used must have the PutLogEvents policy action enabled.
    */
  var RoleARN: typings.awsSdk.clientsKinesisanalyticsMod.RoleARN
}
object CloudWatchLoggingOptionDescription {
  
  inline def apply(LogStreamARN: LogStreamARN, RoleARN: RoleARN): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
  }
  
  extension [Self <: CloudWatchLoggingOptionDescription](x: Self) {
    
    inline def setCloudWatchLoggingOptionId(value: Id): Self = StObject.set(x, "CloudWatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionIdUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionId", js.undefined)
    
    inline def setLogStreamARN(value: LogStreamARN): Self = StObject.set(x, "LogStreamARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
