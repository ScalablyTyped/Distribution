package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQueryLoggingConfigRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the log group that you want to Amazon Route 53 to send query logs to. This is the format of the ARN: arn:aws:logs:region:account-id:log-group:log_group_name  To get the ARN for a log group, you can use the CloudWatch console, the DescribeLogGroups API action, the describe-log-groups command, or the applicable command in one of the Amazon Web Services SDKs.
    */
  var CloudWatchLogsLogGroupArn: typings.awsSdk.clientsRoute53Mod.CloudWatchLogsLogGroupArn
  
  /**
    * The ID of the hosted zone that you want to log queries for. You can log queries only for public hosted zones.
    */
  var HostedZoneId: ResourceId
}
object CreateQueryLoggingConfigRequest {
  
  inline def apply(CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn, HostedZoneId: ResourceId): CreateQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(CloudWatchLogsLogGroupArn = CloudWatchLogsLogGroupArn.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueryLoggingConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQueryLoggingConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsLogGroupArn(value: CloudWatchLogsLogGroupArn): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
  }
}
