package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event data to an Amazon CloudWatch destination.
    */
  var IamRoleArn: typings.awsSdk.clientsPinpointsmsvoicev2Mod.IamRoleArn
  
  /**
    * The name of the Amazon CloudWatch log group that you want to record events in. 
    */
  var LogGroupArn: typings.awsSdk.clientsPinpointsmsvoicev2Mod.LogGroupArn
}
object CloudWatchLogsDestination {
  
  inline def apply(IamRoleArn: IamRoleArn, LogGroupArn: LogGroupArn): CloudWatchLogsDestination = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], LogGroupArn = LogGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsDestination]
  }
  
  extension [Self <: CloudWatchLogsDestination](x: Self) {
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
  }
}
