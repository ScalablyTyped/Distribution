package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * Use this parameter to configure the application.
    */
  var ApplicationConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationConfiguration] = js.undefined
  
  /**
    * A summary description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationDescription] = js.undefined
  
  /**
    * Use the STREAMING mode to create a Kinesis Data Analytics For Flink application. To create a Kinesis Data Analytics Studio notebook, use the INTERACTIVE mode.
    */
  var ApplicationMode: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationMode] = js.undefined
  
  /**
    * The name of your application (for example, sample-app).
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * Use this parameter to configure an Amazon CloudWatch log stream to monitor application configuration errors. 
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The runtime environment for the application.
    */
  var RuntimeEnvironment: typings.awsSdk.clientsKinesisanalyticsv2Mod.RuntimeEnvironment
  
  /**
    * The IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
    */
  var ServiceExecutionRole: RoleARN
  
  /**
    * A list of one or more tags to assign to the application. A tag is a key-value pair that identifies an application. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see Using Tagging.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.Tags] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(
    ApplicationName: ApplicationName,
    RuntimeEnvironment: RuntimeEnvironment,
    ServiceExecutionRole: RoleARN
  ): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any], ServiceExecutionRole = ServiceExecutionRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationConfiguration(value: ApplicationConfiguration): Self = StObject.set(x, "ApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationConfigurationUndefined: Self = StObject.set(x, "ApplicationConfiguration", js.undefined)
    
    inline def setApplicationDescription(value: ApplicationDescription): Self = StObject.set(x, "ApplicationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationDescriptionUndefined: Self = StObject.set(x, "ApplicationDescription", js.undefined)
    
    inline def setApplicationMode(value: ApplicationMode): Self = StObject.set(x, "ApplicationMode", value.asInstanceOf[js.Any])
    
    inline def setApplicationModeUndefined: Self = StObject.set(x, "ApplicationMode", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    inline def setCloudWatchLoggingOptionsVarargs(value: CloudWatchLoggingOption*): Self = StObject.set(x, "CloudWatchLoggingOptions", js.Array(value*))
    
    inline def setRuntimeEnvironment(value: RuntimeEnvironment): Self = StObject.set(x, "RuntimeEnvironment", value.asInstanceOf[js.Any])
    
    inline def setServiceExecutionRole(value: RoleARN): Self = StObject.set(x, "ServiceExecutionRole", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
