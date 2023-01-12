package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentInput extends StObject {
  
  /**
    * A list of key-value pairs containing the Apache Airflow configuration options you want to attach to your environment. To learn more, see Apache Airflow configuration options.
    */
  var AirflowConfigurationOptions: js.UndefOr[typings.awsSdk.clientsMwaaMod.AirflowConfigurationOptions] = js.undefined
  
  /**
    * The Apache Airflow version for your environment. If no value is specified, defaults to the latest version. Valid values: 1.10.12, 2.0.2, and 2.2.2.
    */
  var AirflowVersion: js.UndefOr[typings.awsSdk.clientsMwaaMod.AirflowVersion] = js.undefined
  
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
    * The Apache Airflow log types to send to CloudWatch Logs.
    */
  var LoggingConfiguration: js.UndefOr[LoggingConfigurationInput] = js.undefined
  
  /**
    * The maximum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow workers up to the number you specify in the MaxWorkers field. For example, 20. When there are no more tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the one worker that is included with your environment, or the number you specify in MinWorkers.
    */
  var MaxWorkers: js.UndefOr[typings.awsSdk.clientsMwaaMod.MaxWorkers] = js.undefined
  
  /**
    * The minimum number of workers that you want to run in your environment. MWAA scales the number of Apache Airflow workers up to the number you specify in the MaxWorkers field. When there are no more tasks running, and no more in the queue, MWAA disposes of the extra workers leaving the worker count you specify in the MinWorkers field. For example, 2.
    */
  var MinWorkers: js.UndefOr[typings.awsSdk.clientsMwaaMod.MinWorkers] = js.undefined
  
  /**
    * The name of your Amazon MWAA environment. For example, MyMWAAEnvironment.
    */
  var Name: EnvironmentName
  
  /**
    * The VPC networking components used to secure and enable network traffic between the Amazon Web Services resources for your environment. To learn more, see About networking on Amazon MWAA.
    */
  var NetworkConfiguration: js.UndefOr[UpdateNetworkConfigurationInput] = js.undefined
  
  /**
    * The version of the plugins.zip file on your Amazon S3 bucket. A version must be specified each time a plugins.zip file is updated. To learn more, see How S3 Versioning works.
    */
  var PluginsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined
  
  /**
    * The relative path to the plugins.zip file on your Amazon S3 bucket. For example, plugins.zip. If specified, then the plugins.zip version is required. To learn more, see Installing custom plugins.
    */
  var PluginsS3Path: js.UndefOr[RelativePath] = js.undefined
  
  /**
    * The version of the requirements.txt file on your Amazon S3 bucket. A version must be specified each time a requirements.txt file is updated. To learn more, see How S3 Versioning works.
    */
  var RequirementsS3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined
  
  /**
    * The relative path to the requirements.txt file on your Amazon S3 bucket. For example, requirements.txt. If specified, then a file version is required. To learn more, see Installing Python dependencies.
    */
  var RequirementsS3Path: js.UndefOr[RelativePath] = js.undefined
  
  /**
    * The number of Apache Airflow schedulers to run in your Amazon MWAA environment.
    */
  var Schedulers: js.UndefOr[typings.awsSdk.clientsMwaaMod.Schedulers] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket where your DAG code and supporting files are stored. For example, arn:aws:s3:::my-airflow-bucket-unique-name. To learn more, see Create an Amazon S3 bucket for Amazon MWAA.
    */
  var SourceBucketArn: js.UndefOr[S3BucketArn] = js.undefined
  
  /**
    * The Apache Airflow Web server access mode. To learn more, see Apache Airflow access modes.
    */
  var WebserverAccessMode: js.UndefOr[typings.awsSdk.clientsMwaaMod.WebserverAccessMode] = js.undefined
  
  /**
    * The day and time of the week in Coordinated Universal Time (UTC) 24-hour standard time to start weekly maintenance updates of your environment in the following format: DAY:HH:MM. For example: TUE:03:30. You can specify a start time in 30 minute increments only.
    */
  var WeeklyMaintenanceWindowStart: js.UndefOr[typings.awsSdk.clientsMwaaMod.WeeklyMaintenanceWindowStart] = js.undefined
}
object UpdateEnvironmentInput {
  
  inline def apply(Name: EnvironmentName): UpdateEnvironmentInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnvironmentInput] (val x: Self) extends AnyVal {
    
    inline def setAirflowConfigurationOptions(value: AirflowConfigurationOptions): Self = StObject.set(x, "AirflowConfigurationOptions", value.asInstanceOf[js.Any])
    
    inline def setAirflowConfigurationOptionsUndefined: Self = StObject.set(x, "AirflowConfigurationOptions", js.undefined)
    
    inline def setAirflowVersion(value: AirflowVersion): Self = StObject.set(x, "AirflowVersion", value.asInstanceOf[js.Any])
    
    inline def setAirflowVersionUndefined: Self = StObject.set(x, "AirflowVersion", js.undefined)
    
    inline def setDagS3Path(value: RelativePath): Self = StObject.set(x, "DagS3Path", value.asInstanceOf[js.Any])
    
    inline def setDagS3PathUndefined: Self = StObject.set(x, "DagS3Path", js.undefined)
    
    inline def setEnvironmentClass(value: EnvironmentClass): Self = StObject.set(x, "EnvironmentClass", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentClassUndefined: Self = StObject.set(x, "EnvironmentClass", js.undefined)
    
    inline def setExecutionRoleArn(value: IamRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setLoggingConfiguration(value: LoggingConfigurationInput): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
    
    inline def setMaxWorkers(value: MaxWorkers): Self = StObject.set(x, "MaxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "MaxWorkers", js.undefined)
    
    inline def setMinWorkers(value: MinWorkers): Self = StObject.set(x, "MinWorkers", value.asInstanceOf[js.Any])
    
    inline def setMinWorkersUndefined: Self = StObject.set(x, "MinWorkers", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfiguration(value: UpdateNetworkConfigurationInput): Self = StObject.set(x, "NetworkConfiguration", value.asInstanceOf[js.Any])
    
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
    
    inline def setSourceBucketArn(value: S3BucketArn): Self = StObject.set(x, "SourceBucketArn", value.asInstanceOf[js.Any])
    
    inline def setSourceBucketArnUndefined: Self = StObject.set(x, "SourceBucketArn", js.undefined)
    
    inline def setWebserverAccessMode(value: WebserverAccessMode): Self = StObject.set(x, "WebserverAccessMode", value.asInstanceOf[js.Any])
    
    inline def setWebserverAccessModeUndefined: Self = StObject.set(x, "WebserverAccessMode", js.undefined)
    
    inline def setWeeklyMaintenanceWindowStart(value: WeeklyMaintenanceWindowStart): Self = StObject.set(x, "WeeklyMaintenanceWindowStart", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceWindowStartUndefined: Self = StObject.set(x, "WeeklyMaintenanceWindowStart", js.undefined)
  }
}
