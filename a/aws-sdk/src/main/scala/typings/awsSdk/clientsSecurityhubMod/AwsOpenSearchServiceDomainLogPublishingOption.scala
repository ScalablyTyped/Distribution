package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainLogPublishingOption extends StObject {
  
  /**
    * The ARN of the CloudWatch Logs group to publish the logs to.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the log publishing is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object AwsOpenSearchServiceDomainLogPublishingOption {
  
  inline def apply(): AwsOpenSearchServiceDomainLogPublishingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainLogPublishingOption]
  }
  
  extension [Self <: AwsOpenSearchServiceDomainLogPublishingOption](x: Self) {
    
    inline def setCloudWatchLogsLogGroupArn(value: NonEmptyString): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
