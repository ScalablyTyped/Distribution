package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileJobRequest extends StObject {
  
  /**
    * Configuration for profile jobs. Used to select columns, do evaluations, and override default parameters of evaluations. When configuration is null, the profile job will run with default settings.
    */
  var Configuration: js.UndefOr[ProfileConfiguration] = js.undefined
  
  /**
    * The name of the dataset that this job is to act upon.
    */
  var DatasetName: typings.awsSdk.clientsDatabrewMod.DatasetName
  
  /**
    * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
    */
  var EncryptionKeyArn: js.UndefOr[typings.awsSdk.clientsDatabrewMod.EncryptionKeyArn] = js.undefined
  
  /**
    * The encryption mode for the job, which can be one of the following:    SSE-KMS - SSE-KMS - Server-side encryption with KMS-managed keys.    SSE-S3 - Server-side encryption with keys managed by Amazon S3.  
    */
  var EncryptionMode: js.UndefOr[typings.awsSdk.clientsDatabrewMod.EncryptionMode] = js.undefined
  
  /**
    * Sample configuration for profile jobs only. Determines the number of rows on which the profile job will be executed. If a JobSample value is not provided, the default value will be used. The default value is CUSTOM_ROWS for the mode parameter and 20000 for the size parameter.
    */
  var JobSample: js.UndefOr[typings.awsSdk.clientsDatabrewMod.JobSample] = js.undefined
  
  /**
    * Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one log stream for each job run.
    */
  var LogSubscription: js.UndefOr[typings.awsSdk.clientsDatabrewMod.LogSubscription] = js.undefined
  
  /**
    * The maximum number of nodes that DataBrew can use when the job processes data.
    */
  var MaxCapacity: js.UndefOr[typings.awsSdk.clientsDatabrewMod.MaxCapacity] = js.undefined
  
  /**
    * The maximum number of times to retry the job after a job run fails.
    */
  var MaxRetries: js.UndefOr[typings.awsSdk.clientsDatabrewMod.MaxRetries] = js.undefined
  
  /**
    * The name of the job to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and space.
    */
  var Name: JobName
  
  var OutputLocation: S3Location
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
    */
  var RoleArn: Arn
  
  /**
    * Metadata tags to apply to this job.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of TIMEOUT.
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Timeout] = js.undefined
  
  /**
    * List of validation configurations that are applied to the profile job.
    */
  var ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
}
object CreateProfileJobRequest {
  
  inline def apply(DatasetName: DatasetName, Name: JobName, OutputLocation: S3Location, RoleArn: Arn): CreateProfileJobRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutputLocation = OutputLocation.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProfileJobRequest] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: ProfileConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArn(value: EncryptionKeyArn): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    inline def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
    inline def setJobSample(value: JobSample): Self = StObject.set(x, "JobSample", value.asInstanceOf[js.Any])
    
    inline def setJobSampleUndefined: Self = StObject.set(x, "JobSample", js.undefined)
    
    inline def setLogSubscription(value: LogSubscription): Self = StObject.set(x, "LogSubscription", value.asInstanceOf[js.Any])
    
    inline def setLogSubscriptionUndefined: Self = StObject.set(x, "LogSubscription", js.undefined)
    
    inline def setMaxCapacity(value: MaxCapacity): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMaxRetries(value: MaxRetries): Self = StObject.set(x, "MaxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "MaxRetries", js.undefined)
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputLocation(value: S3Location): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setValidationConfigurations(value: ValidationConfigurationList): Self = StObject.set(x, "ValidationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setValidationConfigurationsUndefined: Self = StObject.set(x, "ValidationConfigurations", js.undefined)
    
    inline def setValidationConfigurationsVarargs(value: ValidationConfiguration*): Self = StObject.set(x, "ValidationConfigurations", js.Array(value*))
  }
}
