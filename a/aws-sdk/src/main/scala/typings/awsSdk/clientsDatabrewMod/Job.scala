package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that owns the job.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsDatabrewMod.AccountId] = js.undefined
  
  /**
    * The date and time that the job was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who created the job.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.clientsDatabrewMod.CreatedBy] = js.undefined
  
  /**
    * One or more artifacts that represent the Glue Data Catalog output from running the job.
    */
  var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined
  
  /**
    * Represents a list of JDBC database output objects which defines the output destination for a DataBrew recipe job to write into.
    */
  var DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined
  
  /**
    * A dataset that the job is to process.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.clientsDatabrewMod.DatasetName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job output. For more information, see Encrypting data written by DataBrew jobs 
    */
  var EncryptionKeyArn: js.UndefOr[typings.awsSdk.clientsDatabrewMod.EncryptionKeyArn] = js.undefined
  
  /**
    * The encryption mode for the job, which can be one of the following:    SSE-KMS - Server-side encryption with keys managed by KMS.    SSE-S3 - Server-side encryption with keys managed by Amazon S3.  
    */
  var EncryptionMode: js.UndefOr[typings.awsSdk.clientsDatabrewMod.EncryptionMode] = js.undefined
  
  /**
    * A sample configuration for profile jobs only, which determines the number of rows on which the profile job is run. If a JobSample value isn't provided, the default value is used. The default value is CUSTOM_ROWS for the mode parameter and 20,000 for the size parameter.
    */
  var JobSample: js.UndefOr[typings.awsSdk.clientsDatabrewMod.JobSample] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who last modified the job.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.clientsDatabrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The modification date and time of the job.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of Amazon CloudWatch logging for the job.
    */
  var LogSubscription: js.UndefOr[typings.awsSdk.clientsDatabrewMod.LogSubscription] = js.undefined
  
  /**
    * The maximum number of nodes that can be consumed when the job processes data.
    */
  var MaxCapacity: js.UndefOr[typings.awsSdk.clientsDatabrewMod.MaxCapacity] = js.undefined
  
  /**
    * The maximum number of times to retry the job after a job run fails.
    */
  var MaxRetries: js.UndefOr[typings.awsSdk.clientsDatabrewMod.MaxRetries] = js.undefined
  
  /**
    * The unique name of the job.
    */
  var Name: JobName
  
  /**
    * One or more artifacts that represent output from running the job.
    */
  var Outputs: js.UndefOr[OutputList] = js.undefined
  
  /**
    * The name of the project that the job is associated with.
    */
  var ProjectName: js.UndefOr[typings.awsSdk.clientsDatabrewMod.ProjectName] = js.undefined
  
  /**
    * A set of steps that the job runs.
    */
  var RecipeReference: js.UndefOr[typings.awsSdk.clientsDatabrewMod.RecipeReference] = js.undefined
  
  /**
    * The unique Amazon Resource Name (ARN) for the job.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role to be assumed for this job.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Metadata tags that have been applied to the job.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of TIMEOUT.
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Timeout] = js.undefined
  
  /**
    * The job type of the job, which must be one of the following:    PROFILE - A job to analyze a dataset, to determine its size, data types, data distribution, and more.    RECIPE - A job to apply one or more transformations to a dataset.  
    */
  var Type: js.UndefOr[JobType] = js.undefined
  
  /**
    * List of validation configurations that are applied to the profile job.
    */
  var ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
}
object Job {
  
  inline def apply(Name: JobName): Job = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  extension [Self <: Job](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDataCatalogOutputs(value: DataCatalogOutputList): Self = StObject.set(x, "DataCatalogOutputs", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogOutputsUndefined: Self = StObject.set(x, "DataCatalogOutputs", js.undefined)
    
    inline def setDataCatalogOutputsVarargs(value: DataCatalogOutput*): Self = StObject.set(x, "DataCatalogOutputs", js.Array(value*))
    
    inline def setDatabaseOutputs(value: DatabaseOutputList): Self = StObject.set(x, "DatabaseOutputs", value.asInstanceOf[js.Any])
    
    inline def setDatabaseOutputsUndefined: Self = StObject.set(x, "DatabaseOutputs", js.undefined)
    
    inline def setDatabaseOutputsVarargs(value: DatabaseOutput*): Self = StObject.set(x, "DatabaseOutputs", js.Array(value*))
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setEncryptionKeyArn(value: EncryptionKeyArn): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    inline def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
    inline def setJobSample(value: JobSample): Self = StObject.set(x, "JobSample", value.asInstanceOf[js.Any])
    
    inline def setJobSampleUndefined: Self = StObject.set(x, "JobSample", js.undefined)
    
    inline def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setLogSubscription(value: LogSubscription): Self = StObject.set(x, "LogSubscription", value.asInstanceOf[js.Any])
    
    inline def setLogSubscriptionUndefined: Self = StObject.set(x, "LogSubscription", js.undefined)
    
    inline def setMaxCapacity(value: MaxCapacity): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMaxRetries(value: MaxRetries): Self = StObject.set(x, "MaxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "MaxRetries", js.undefined)
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: OutputList): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    inline def setRecipeReference(value: RecipeReference): Self = StObject.set(x, "RecipeReference", value.asInstanceOf[js.Any])
    
    inline def setRecipeReferenceUndefined: Self = StObject.set(x, "RecipeReference", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setType(value: JobType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValidationConfigurations(value: ValidationConfigurationList): Self = StObject.set(x, "ValidationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setValidationConfigurationsUndefined: Self = StObject.set(x, "ValidationConfigurations", js.undefined)
    
    inline def setValidationConfigurationsVarargs(value: ValidationConfiguration*): Self = StObject.set(x, "ValidationConfigurations", js.Array(value*))
  }
}
