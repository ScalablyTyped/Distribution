package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecipeJobRequest extends StObject {
  
  /**
    * One or more artifacts that represent the Glue Data Catalog output from running the job.
    */
  var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined
  
  /**
    * Represents a list of JDBC database output objects which defines the output destination for a DataBrew recipe job to write into.
    */
  var DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
    */
  var EncryptionKeyArn: js.UndefOr[typings.awsSdk.clientsDatabrewMod.EncryptionKeyArn] = js.undefined
  
  /**
    * The encryption mode for the job, which can be one of the following:    SSE-KMS - Server-side encryption with keys managed by KMS.    SSE-S3 - Server-side encryption with keys managed by Amazon S3.  
    */
  var EncryptionMode: js.UndefOr[typings.awsSdk.clientsDatabrewMod.EncryptionMode] = js.undefined
  
  /**
    * Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one log stream for each job run.
    */
  var LogSubscription: js.UndefOr[typings.awsSdk.clientsDatabrewMod.LogSubscription] = js.undefined
  
  /**
    * The maximum number of nodes that DataBrew can consume when the job processes data.
    */
  var MaxCapacity: js.UndefOr[typings.awsSdk.clientsDatabrewMod.MaxCapacity] = js.undefined
  
  /**
    * The maximum number of times to retry the job after a job run fails.
    */
  var MaxRetries: js.UndefOr[typings.awsSdk.clientsDatabrewMod.MaxRetries] = js.undefined
  
  /**
    * The name of the job to update.
    */
  var Name: JobName
  
  /**
    * One or more artifacts that represent the output from running the job. 
    */
  var Outputs: js.UndefOr[OutputList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when DataBrew runs the job.
    */
  var RoleArn: Arn
  
  /**
    * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of TIMEOUT.
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Timeout] = js.undefined
}
object UpdateRecipeJobRequest {
  
  inline def apply(Name: JobName, RoleArn: Arn): UpdateRecipeJobRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecipeJobRequest]
  }
  
  extension [Self <: UpdateRecipeJobRequest](x: Self) {
    
    inline def setDataCatalogOutputs(value: DataCatalogOutputList): Self = StObject.set(x, "DataCatalogOutputs", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogOutputsUndefined: Self = StObject.set(x, "DataCatalogOutputs", js.undefined)
    
    inline def setDataCatalogOutputsVarargs(value: DataCatalogOutput*): Self = StObject.set(x, "DataCatalogOutputs", js.Array(value*))
    
    inline def setDatabaseOutputs(value: DatabaseOutputList): Self = StObject.set(x, "DatabaseOutputs", value.asInstanceOf[js.Any])
    
    inline def setDatabaseOutputsUndefined: Self = StObject.set(x, "DatabaseOutputs", js.undefined)
    
    inline def setDatabaseOutputsVarargs(value: DatabaseOutput*): Self = StObject.set(x, "DatabaseOutputs", js.Array(value*))
    
    inline def setEncryptionKeyArn(value: EncryptionKeyArn): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
    
    inline def setEncryptionMode(value: EncryptionMode): Self = StObject.set(x, "EncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setEncryptionModeUndefined: Self = StObject.set(x, "EncryptionMode", js.undefined)
    
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
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
