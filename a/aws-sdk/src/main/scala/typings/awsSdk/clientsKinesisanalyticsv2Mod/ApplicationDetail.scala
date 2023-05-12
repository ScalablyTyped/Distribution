package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationDetail extends StObject {
  
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN
  
  /**
    * Describes details about the application code and starting parameters for a Kinesis Data Analytics application.
    */
  var ApplicationConfigurationDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationConfigurationDescription] = js.undefined
  
  /**
    * The description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationDescription] = js.undefined
  
  /**
    * The details of the maintenance configuration for the application.
    */
  var ApplicationMaintenanceConfigurationDescription: js.UndefOr[
    typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationMaintenanceConfigurationDescription
  ] = js.undefined
  
  /**
    * To create a Kinesis Data Analytics Studio notebook, you must set the mode to INTERACTIVE. However, for a Kinesis Data Analytics for Apache Flink application, the mode is optional.
    */
  var ApplicationMode: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationMode] = js.undefined
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationStatus
  
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
    */
  var ApplicationVersionId: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId
  
  /**
    * If you reverted the application using RollbackApplication, the application version when RollbackApplication was called.
    */
  var ApplicationVersionRolledBackFrom: js.UndefOr[ApplicationVersionId] = js.undefined
  
  /**
    * The version to which you want to roll back the application.
    */
  var ApplicationVersionRolledBackTo: js.UndefOr[ApplicationVersionId] = js.undefined
  
  /**
    * The previous application version before the latest application update. RollbackApplication reverts the application to this version.
    */
  var ApplicationVersionUpdatedFrom: js.UndefOr[ApplicationVersionId] = js.undefined
  
  /**
    * Describes the application Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.undefined
  
  /**
    * A value you use to implement strong concurrency for application updates.
    */
  var ConditionalToken: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ConditionalToken] = js.undefined
  
  /**
    * The current timestamp when the application was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current timestamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The runtime environment for the application.
    */
  var RuntimeEnvironment: typings.awsSdk.clientsKinesisanalyticsv2Mod.RuntimeEnvironment
  
  /**
    * Specifies the IAM role that the application uses to access external resources.
    */
  var ServiceExecutionRole: js.UndefOr[RoleARN] = js.undefined
}
object ApplicationDetail {
  
  inline def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationDetail] (val x: Self) extends AnyVal {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationConfigurationDescription(value: ApplicationConfigurationDescription): Self = StObject.set(x, "ApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationConfigurationDescription", js.undefined)
    
    inline def setApplicationDescription(value: ApplicationDescription): Self = StObject.set(x, "ApplicationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationDescriptionUndefined: Self = StObject.set(x, "ApplicationDescription", js.undefined)
    
    inline def setApplicationMaintenanceConfigurationDescription(value: ApplicationMaintenanceConfigurationDescription): Self = StObject.set(x, "ApplicationMaintenanceConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationMaintenanceConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationMaintenanceConfigurationDescription", js.undefined)
    
    inline def setApplicationMode(value: ApplicationMode): Self = StObject.set(x, "ApplicationMode", value.asInstanceOf[js.Any])
    
    inline def setApplicationModeUndefined: Self = StObject.set(x, "ApplicationMode", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionRolledBackFrom(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionRolledBackFrom", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionRolledBackFromUndefined: Self = StObject.set(x, "ApplicationVersionRolledBackFrom", js.undefined)
    
    inline def setApplicationVersionRolledBackTo(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionRolledBackTo", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionRolledBackToUndefined: Self = StObject.set(x, "ApplicationVersionRolledBackTo", js.undefined)
    
    inline def setApplicationVersionUpdatedFrom(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionUpdatedFrom", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionUpdatedFromUndefined: Self = StObject.set(x, "ApplicationVersionUpdatedFrom", js.undefined)
    
    inline def setCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionDescriptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.undefined)
    
    inline def setCloudWatchLoggingOptionDescriptionsVarargs(value: CloudWatchLoggingOptionDescription*): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.Array(value*))
    
    inline def setConditionalToken(value: ConditionalToken): Self = StObject.set(x, "ConditionalToken", value.asInstanceOf[js.Any])
    
    inline def setConditionalTokenUndefined: Self = StObject.set(x, "ConditionalToken", js.undefined)
    
    inline def setCreateTimestamp(value: js.Date): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    inline def setLastUpdateTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    inline def setRuntimeEnvironment(value: RuntimeEnvironment): Self = StObject.set(x, "RuntimeEnvironment", value.asInstanceOf[js.Any])
    
    inline def setServiceExecutionRole(value: RoleARN): Self = StObject.set(x, "ServiceExecutionRole", value.asInstanceOf[js.Any])
    
    inline def setServiceExecutionRoleUndefined: Self = StObject.set(x, "ServiceExecutionRole", js.undefined)
  }
}
