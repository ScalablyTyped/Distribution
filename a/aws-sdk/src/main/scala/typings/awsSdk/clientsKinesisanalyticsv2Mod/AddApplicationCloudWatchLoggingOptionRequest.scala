package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationCloudWatchLoggingOptionRequest extends StObject {
  
  /**
    * The Kinesis Data Analytics application name.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * Provides the Amazon CloudWatch log stream Amazon Resource Name (ARN). 
    */
  var CloudWatchLoggingOption: typings.awsSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOption
  
  /**
    * A value you use to implement strong concurrency for application updates. You must provide the CurrentApplicationVersionId or the ConditionalToken. You get the application's current ConditionalToken using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var ConditionalToken: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ConditionalToken] = js.undefined
  
  /**
    * The version ID of the Kinesis Data Analytics application. You must provide the CurrentApplicationVersionId or the ConditionalToken.You can retrieve the application version ID using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
}
object AddApplicationCloudWatchLoggingOptionRequest {
  
  inline def apply(ApplicationName: ApplicationName, CloudWatchLoggingOption: CloudWatchLoggingOption): AddApplicationCloudWatchLoggingOptionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CloudWatchLoggingOption = CloudWatchLoggingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddApplicationCloudWatchLoggingOptionRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOption(value: CloudWatchLoggingOption): Self = StObject.set(x, "CloudWatchLoggingOption", value.asInstanceOf[js.Any])
    
    inline def setConditionalToken(value: ConditionalToken): Self = StObject.set(x, "ConditionalToken", value.asInstanceOf[js.Any])
    
    inline def setConditionalTokenUndefined: Self = StObject.set(x, "ConditionalToken", js.undefined)
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionIdUndefined: Self = StObject.set(x, "CurrentApplicationVersionId", js.undefined)
  }
}
