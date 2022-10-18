package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationDetail extends StObject {
  
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN
  
  /**
    * Returns the application code that you provided to perform data analysis on any of the in-application streams in your application.
    */
  var ApplicationCode: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.ApplicationCode] = js.undefined
  
  /**
    * Description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.ApplicationDescription] = js.undefined
  
  /**
    * Name of the application.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationName
  
  /**
    * Status of the application.
    */
  var ApplicationStatus: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationStatus
  
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationVersionId
  
  /**
    * Describes the CloudWatch log streams that are configured to receive application messages. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs. 
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.CloudWatchLoggingOptionDescriptions] = js.undefined
  
  /**
    * Time stamp when the application version was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Describes the application input configuration. For more information, see Configuring Application Input. 
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.InputDescriptions] = js.undefined
  
  /**
    * Time stamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Describes the application output configuration. For more information, see Configuring Application Output. 
    */
  var OutputDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.OutputDescriptions] = js.undefined
  
  /**
    * Describes reference data sources configured for the application. For more information, see Configuring Application Input. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.ReferenceDataSourceDescriptions] = js.undefined
}
object ApplicationDetail {
  
  inline def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
  
  extension [Self <: ApplicationDetail](x: Self) {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationCode(value: ApplicationCode): Self = StObject.set(x, "ApplicationCode", value.asInstanceOf[js.Any])
    
    inline def setApplicationCodeUndefined: Self = StObject.set(x, "ApplicationCode", js.undefined)
    
    inline def setApplicationDescription(value: ApplicationDescription): Self = StObject.set(x, "ApplicationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationDescriptionUndefined: Self = StObject.set(x, "ApplicationDescription", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionDescriptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.undefined)
    
    inline def setCloudWatchLoggingOptionDescriptionsVarargs(value: CloudWatchLoggingOptionDescription*): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.Array(value*))
    
    inline def setCreateTimestamp(value: js.Date): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    inline def setInputDescriptions(value: InputDescriptions): Self = StObject.set(x, "InputDescriptions", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptionsUndefined: Self = StObject.set(x, "InputDescriptions", js.undefined)
    
    inline def setInputDescriptionsVarargs(value: InputDescription*): Self = StObject.set(x, "InputDescriptions", js.Array(value*))
    
    inline def setLastUpdateTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    inline def setOutputDescriptions(value: OutputDescriptions): Self = StObject.set(x, "OutputDescriptions", value.asInstanceOf[js.Any])
    
    inline def setOutputDescriptionsUndefined: Self = StObject.set(x, "OutputDescriptions", js.undefined)
    
    inline def setOutputDescriptionsVarargs(value: OutputDescription*): Self = StObject.set(x, "OutputDescriptions", js.Array(value*))
    
    inline def setReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = StObject.set(x, "ReferenceDataSourceDescriptions", value.asInstanceOf[js.Any])
    
    inline def setReferenceDataSourceDescriptionsUndefined: Self = StObject.set(x, "ReferenceDataSourceDescriptions", js.undefined)
    
    inline def setReferenceDataSourceDescriptionsVarargs(value: ReferenceDataSourceDescription*): Self = StObject.set(x, "ReferenceDataSourceDescriptions", js.Array(value*))
  }
}
