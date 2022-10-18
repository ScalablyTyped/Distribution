package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * A list of key-value pairs containing the Apache Airflow configuration options attached to your environment. To learn more, see Apache Airflow configuration options.
    */
  var AirflowConfigurationOptions: js.UndefOr[typings.awsSdk.clientsMwaaMod.AirflowConfigurationOptions] = js.undefined
  
  /**
    * The Apache Airflow version on your environment. Valid values: 1.10.12, 2.0.2, and 2.2.2.
    */
  var AirflowVersion: js.UndefOr[typings.awsSdk.clientsMwaaMod.AirflowVersion] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon MWAA environment.
    */
  var Arn: js.UndefOr[EnvironmentArn] = js.undefined
  
  /**
    * The day and time the environment was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The relative path to the DAGs folder on your Amazon S3 bucket. For example, dags. To learn more, see Adding or updating DAGs.
    */
  var DagS3Path: js.UndefOr[RelativePath] = js.undefined
  
  /**
    * The environment class type. Valid values: mw1.small, mw1.medium, mw1.large. To learn more, see Amazon MWAA environment class.
    */
  var EnvironmentClass: js.UndefOr[typings.awsSdk.clientsMwaaMod.EnvironmentClass] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the execution role in IAM that allows MWAA to access Amazon Web Services resources in your environment. For example, arn:aws:iam::123456789:role/my-execution-role. To learn more, see Amazon MWAA Execution role.
    */
  var ExecutionRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The Amazon Web Services Key Management Service (KMS) encryption key used to encrypt the data in your environment.
    */
  var KmsKey: js.UndefOr[typings.awsSdk.clientsMwaaMod.KmsKey] = js.undefined
  
  /**
    * The status of the last update on the environment.
    */
  var LastUpdate: js.UndefOr[typings.awsSdk.clientsMwaaMod.LastUpdate] = js.undefined
  
  /**
    * The Apache Airflow logs published to CloudWatch Logs.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.clientsMwaaMod.LoggingConfiguration] = js.undefined
  
  /**
    * The maximum number of workers that run in your environment. For example, 20.
    */
  var MaxWorkers: js.UndefOr[typings.awsSdk.clientsMwaaMod.MaxWorkers] = js.undefined
  
  /**
    * The minimum number of workers that run in your environment. For example, 2.
    */
  var MinWorkers: js.UndefOr[typings.awsSdk.clientsMwaaMod.MinWorkers] = js.undefined
  
  /**
    * The name of the Amazon MWAA environment. For example, MyMWAAEnvironment.
    */
  var Name: js.UndefOr[EnvironmentName] = js.undefined
  
  /**
    * Describes the VPC networking components used to secure and enable network traffic between the Amazon Web Services resources for your environment. To learn more, see About networking on Amazon MWAA.
    */
  var NetworkConfiguration: js.UndefOr[typings.awsSdk.clientsMwaaMod.NetworkConfiguration] = js.undefined
  
  /**
    * The version of the plugins.zip file on your Amazon S3 bucket. To learn more, see Installing custom plugins.
    */
  var PluginsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined
  
  /**
    * The relative path to the plugins.zip file on your Amazon S3 bucket. For example, plugins.zip. To learn more, see Installing custom plugins.
    */
  var PluginsS3Path: js.UndefOr[RelativePath] = js.undefined
  
  /**
    * The version of the requirements.txt file on your Amazon S3 bucket. To learn more, see Installing Python dependencies.
    */
  var RequirementsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined
  
  /**
    * The relative path to the requirements.txt file on your Amazon S3 bucket. For example, requirements.txt. To learn more, see Installing Python dependencies.
    */
  var RequirementsS3Path: js.UndefOr[RelativePath] = js.undefined
  
  /**
    * The number of Apache Airflow schedulers that run in your Amazon MWAA environment.
    */
  var Schedulers: js.UndefOr[typings.awsSdk.clientsMwaaMod.Schedulers] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the service-linked role of the environment. To learn more, see Amazon MWAA Service-linked role.
    */
  var ServiceRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are stored. For example, arn:aws:s3:::my-airflow-bucket-unique-name. To learn more, see Create an Amazon S3 bucket for Amazon MWAA.
    */
  var SourceBucketArn: js.UndefOr[S3BucketArn] = js.undefined
  
  /**
    * The status of the Amazon MWAA environment. Valid values:    CREATING - Indicates the request to create the environment is in progress.    CREATE_FAILED - Indicates the request to create the environment failed, and the environment could not be created.    AVAILABLE - Indicates the request was successful and the environment is ready to use.    UPDATING - Indicates the request to update the environment is in progress.    DELETING - Indicates the request to delete the environment is in progress.    DELETED - Indicates the request to delete the environment is complete, and the environment has been deleted.    UNAVAILABLE - Indicates the request failed, but the environment was unable to rollback and is not in a stable state.    UPDATE_FAILED - Indicates the request to update the environment failed, and the environment has rolled back successfully and is ready to use.   We recommend reviewing our troubleshooting guide for a list of common errors and their solutions. To learn more, see Amazon MWAA troubleshooting.
    */
  var Status: js.UndefOr[EnvironmentStatus] = js.undefined
  
  /**
    * The key-value tag pairs associated to your environment. For example, "Environment": "Staging". To learn more, see Tagging Amazon Web Services resources.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Apache Airflow Web server access mode. To learn more, see Apache Airflow access modes.
    */
  var WebserverAccessMode: js.UndefOr[typings.awsSdk.clientsMwaaMod.WebserverAccessMode] = js.undefined
  
  /**
    * The Apache Airflow Web server host name for the Amazon MWAA environment. To learn more, see Accessing the Apache Airflow UI.
    */
  var WebserverUrl: js.UndefOr[typings.awsSdk.clientsMwaaMod.WebserverUrl] = js.undefined
  
  /**
    * The day and time of the week in Coordinated Universal Time (UTC) 24-hour standard time that weekly maintenance updates are scheduled. For example: TUE:03:30.
    */
  var WeeklyMaintenanceWindowStart: js.UndefOr[typings.awsSdk.clientsMwaaMod.WeeklyMaintenanceWindowStart] = js.undefined
}
object Environment {
  
  inline def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setAirflowConfigurationOptions(value: AirflowConfigurationOptions): Self = StObject.set(x, "AirflowConfigurationOptions", value.asInstanceOf[js.Any])
    
    inline def setAirflowConfigurationOptionsUndefined: Self = StObject.set(x, "AirflowConfigurationOptions", js.undefined)
    
    inline def setAirflowVersion(value: AirflowVersion): Self = StObject.set(x, "AirflowVersion", value.asInstanceOf[js.Any])
    
    inline def setAirflowVersionUndefined: Self = StObject.set(x, "AirflowVersion", js.undefined)
    
    inline def setArn(value: EnvironmentArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDagS3Path(value: RelativePath): Self = StObject.set(x, "DagS3Path", value.asInstanceOf[js.Any])
    
    inline def setDagS3PathUndefined: Self = StObject.set(x, "DagS3Path", js.undefined)
    
    inline def setEnvironmentClass(value: EnvironmentClass): Self = StObject.set(x, "EnvironmentClass", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentClassUndefined: Self = StObject.set(x, "EnvironmentClass", js.undefined)
    
    inline def setExecutionRoleArn(value: IamRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setKmsKey(value: KmsKey): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "KmsKey", js.undefined)
    
    inline def setLastUpdate(value: LastUpdate): Self = StObject.set(x, "LastUpdate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateUndefined: Self = StObject.set(x, "LastUpdate", js.undefined)
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
    
    inline def setMaxWorkers(value: MaxWorkers): Self = StObject.set(x, "MaxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "MaxWorkers", js.undefined)
    
    inline def setMinWorkers(value: MinWorkers): Self = StObject.set(x, "MinWorkers", value.asInstanceOf[js.Any])
    
    inline def setMinWorkersUndefined: Self = StObject.set(x, "MinWorkers", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "NetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "NetworkConfiguration", js.undefined)
    
    inline def setPluginsS3ObjectVersion(value: S3ObjectVersion): Self = StObject.set(x, "PluginsS3ObjectVersion", value.asInstanceOf[js.Any])
    
    inline def setPluginsS3ObjectVersionUndefined: Self = StObject.set(x, "PluginsS3ObjectVersion", js.undefined)
    
    inline def setPluginsS3Path(value: RelativePath): Self = StObject.set(x, "PluginsS3Path", value.asInstanceOf[js.Any])
    
    inline def setPluginsS3PathUndefined: Self = StObject.set(x, "PluginsS3Path", js.undefined)
    
    inline def setRequirementsS3ObjectVersion(value: S3ObjectVersion): Self = StObject.set(x, "RequirementsS3ObjectVersion", value.asInstanceOf[js.Any])
    
    inline def setRequirementsS3ObjectVersionUndefined: Self = StObject.set(x, "RequirementsS3ObjectVersion", js.undefined)
    
    inline def setRequirementsS3Path(value: RelativePath): Self = StObject.set(x, "RequirementsS3Path", value.asInstanceOf[js.Any])
    
    inline def setRequirementsS3PathUndefined: Self = StObject.set(x, "RequirementsS3Path", js.undefined)
    
    inline def setSchedulers(value: Schedulers): Self = StObject.set(x, "Schedulers", value.asInstanceOf[js.Any])
    
    inline def setSchedulersUndefined: Self = StObject.set(x, "Schedulers", js.undefined)
    
    inline def setServiceRoleArn(value: IamRoleArn): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    inline def setSourceBucketArn(value: S3BucketArn): Self = StObject.set(x, "SourceBucketArn", value.asInstanceOf[js.Any])
    
    inline def setSourceBucketArnUndefined: Self = StObject.set(x, "SourceBucketArn", js.undefined)
    
    inline def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setWebserverAccessMode(value: WebserverAccessMode): Self = StObject.set(x, "WebserverAccessMode", value.asInstanceOf[js.Any])
    
    inline def setWebserverAccessModeUndefined: Self = StObject.set(x, "WebserverAccessMode", js.undefined)
    
    inline def setWebserverUrl(value: WebserverUrl): Self = StObject.set(x, "WebserverUrl", value.asInstanceOf[js.Any])
    
    inline def setWebserverUrlUndefined: Self = StObject.set(x, "WebserverUrl", js.undefined)
    
    inline def setWeeklyMaintenanceWindowStart(value: WeeklyMaintenanceWindowStart): Self = StObject.set(x, "WeeklyMaintenanceWindowStart", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceWindowStartUndefined: Self = StObject.set(x, "WeeklyMaintenanceWindowStart", js.undefined)
  }
}
