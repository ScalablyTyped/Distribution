package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLoggingConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group that Amazon Route 53 is publishing logs to.
    */
  var CloudWatchLogsLogGroupArn: typings.awsSdk.clientsRoute53Mod.CloudWatchLogsLogGroupArn
  
  /**
    * The ID of the hosted zone that CloudWatch Logs is logging queries for. 
    */
  var HostedZoneId: ResourceId
  
  /**
    * The ID for a configuration for DNS query logging.
    */
  var Id: QueryLoggingConfigId
}
object QueryLoggingConfig {
  
  inline def apply(
    CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn,
    HostedZoneId: ResourceId,
    Id: QueryLoggingConfigId
  ): QueryLoggingConfig = {
    val __obj = js.Dynamic.literal(CloudWatchLogsLogGroupArn = CloudWatchLogsLogGroupArn.asInstanceOf[js.Any], HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoggingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryLoggingConfig] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsLogGroupArn(value: CloudWatchLogsLogGroupArn): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setId(value: QueryLoggingConfigId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
