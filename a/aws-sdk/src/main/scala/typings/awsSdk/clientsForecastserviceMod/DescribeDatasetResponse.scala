package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetResponse extends StObject {
  
  /**
    * When the dataset was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The frequency of data collection. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every month and "30min" indicates every 30 minutes.
    */
  var DataFrequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[Name] = js.undefined
  
  /**
    * The dataset type.
    */
  var DatasetType: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DatasetType] = js.undefined
  
  /**
    * The domain associated with the dataset.
    */
  var Domain: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Domain] = js.undefined
  
  /**
    * The AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.EncryptionConfig] = js.undefined
  
  /**
    * When you create a dataset, LastModificationTime is the same as CreationTime. While data is being imported to the dataset, LastModificationTime is the current time of the DescribeDataset call. After a CreateDatasetImportJob operation has finished, LastModificationTime is when the import job completed or failed.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An array of SchemaAttribute objects that specify the dataset fields. Each SchemaAttribute specifies the name and data type of a field.
    */
  var Schema: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Schema] = js.undefined
  
  /**
    * The status of the dataset. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED    The UPDATE states apply while data is imported to the dataset from a call to the CreateDatasetImportJob operation and reflect the status of the dataset import job. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS.  The Status of the dataset must be ACTIVE before you can import training data. 
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object DescribeDatasetResponse {
  
  inline def apply(): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  
  extension [Self <: DescribeDatasetResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataFrequency(value: Frequency): Self = StObject.set(x, "DataFrequency", value.asInstanceOf[js.Any])
    
    inline def setDataFrequencyUndefined: Self = StObject.set(x, "DataFrequency", js.undefined)
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetName(value: Name): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setDatasetTypeUndefined: Self = StObject.set(x, "DatasetType", js.undefined)
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
