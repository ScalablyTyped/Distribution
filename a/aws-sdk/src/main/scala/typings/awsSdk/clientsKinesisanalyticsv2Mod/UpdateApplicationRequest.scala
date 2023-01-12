package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * Describes application configuration updates.
    */
  var ApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationConfigurationUpdate] = js.undefined
  
  /**
    * The name of the application to update.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging options with this action. To add a new CloudWatch logging option, use AddApplicationCloudWatchLoggingOption.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOptionUpdates] = js.undefined
  
  /**
    * A value you use to implement strong concurrency for application updates. You must provide the CurrentApplicationVersionId or the ConditionalToken. You get the application's current ConditionalToken using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var ConditionalToken: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ConditionalToken] = js.undefined
  
  /**
    * The current application version ID. You must provide the CurrentApplicationVersionId or the ConditionalToken.You can retrieve the application version ID using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
  
  /**
    * Describes updates to the application's starting parameters.
    */
  var RunConfigurationUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.RunConfigurationUpdate] = js.undefined
  
  /**
    * Describes updates to the service execution role.
    */
  var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(ApplicationName: ApplicationName): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationConfigurationUpdate(value: ApplicationConfigurationUpdate): Self = StObject.set(x, "ApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setApplicationConfigurationUpdateUndefined: Self = StObject.set(x, "ApplicationConfigurationUpdate", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionUpdates(value: CloudWatchLoggingOptionUpdates): Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionUpdatesUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", js.undefined)
    
    inline def setCloudWatchLoggingOptionUpdatesVarargs(value: CloudWatchLoggingOptionUpdate*): Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", js.Array(value*))
    
    inline def setConditionalToken(value: ConditionalToken): Self = StObject.set(x, "ConditionalToken", value.asInstanceOf[js.Any])
    
    inline def setConditionalTokenUndefined: Self = StObject.set(x, "ConditionalToken", js.undefined)
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionIdUndefined: Self = StObject.set(x, "CurrentApplicationVersionId", js.undefined)
    
    inline def setRunConfigurationUpdate(value: RunConfigurationUpdate): Self = StObject.set(x, "RunConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setRunConfigurationUpdateUndefined: Self = StObject.set(x, "RunConfigurationUpdate", js.undefined)
    
    inline def setServiceExecutionRoleUpdate(value: RoleARN): Self = StObject.set(x, "ServiceExecutionRoleUpdate", value.asInstanceOf[js.Any])
    
    inline def setServiceExecutionRoleUpdateUndefined: Self = StObject.set(x, "ServiceExecutionRoleUpdate", js.undefined)
  }
}
