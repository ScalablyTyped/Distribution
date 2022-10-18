package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetResponse extends StObject {
  
  /**
    * Specifies the time the dataset was created in Lookout for Equipment. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Indicates the latest timestamp corresponding to data that was successfully ingested during the most recent ingestion of this particular dataset. 
    */
  var DataEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Gives statistics associated with the given dataset for the latest successful associated ingestion job id. These statistics primarily relate to quantifying incorrect data such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats, InsufficientSensorData, and DuplicateTimeStamps. 
    */
  var DataQualitySummary: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DataQualitySummary] = js.undefined
  
  /**
    *  Indicates the earliest timestamp corresponding to data that was successfully ingested during the most recent ingestion of this particular dataset. 
    */
  var DataStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset being described. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetArn] = js.undefined
  
  /**
    * The name of the dataset being described. 
    */
  var DatasetName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetName] = js.undefined
  
  /**
    *  IngestedFilesSummary associated with the given dataset for the latest successful associated ingestion job id. 
    */
  var IngestedFilesSummary: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.IngestedFilesSummary] = js.undefined
  
  /**
    * Specifies the S3 location configuration for the data input for the data ingestion job. 
    */
  var IngestionInputConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.IngestionInputConfiguration] = js.undefined
  
  /**
    * Specifies the time the dataset was last updated, if it was. 
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role that you are using for this the data ingestion job. 
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * A JSON description of the data that is in each time series dataset, including names, column names, and data types. 
    */
  var Schema: js.UndefOr[InlineDataSchema] = js.undefined
  
  /**
    * Provides the identifier of the KMS key used to encrypt dataset data by Amazon Lookout for Equipment. 
    */
  var ServerSideKmsKeyId: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * Indicates the status of the dataset. 
    */
  var Status: js.UndefOr[DatasetStatus] = js.undefined
}
object DescribeDatasetResponse {
  
  inline def apply(): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  
  extension [Self <: DescribeDatasetResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataEndTime(value: js.Date): Self = StObject.set(x, "DataEndTime", value.asInstanceOf[js.Any])
    
    inline def setDataEndTimeUndefined: Self = StObject.set(x, "DataEndTime", js.undefined)
    
    inline def setDataQualitySummary(value: DataQualitySummary): Self = StObject.set(x, "DataQualitySummary", value.asInstanceOf[js.Any])
    
    inline def setDataQualitySummaryUndefined: Self = StObject.set(x, "DataQualitySummary", js.undefined)
    
    inline def setDataStartTime(value: js.Date): Self = StObject.set(x, "DataStartTime", value.asInstanceOf[js.Any])
    
    inline def setDataStartTimeUndefined: Self = StObject.set(x, "DataStartTime", js.undefined)
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setIngestedFilesSummary(value: IngestedFilesSummary): Self = StObject.set(x, "IngestedFilesSummary", value.asInstanceOf[js.Any])
    
    inline def setIngestedFilesSummaryUndefined: Self = StObject.set(x, "IngestedFilesSummary", js.undefined)
    
    inline def setIngestionInputConfiguration(value: IngestionInputConfiguration): Self = StObject.set(x, "IngestionInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIngestionInputConfigurationUndefined: Self = StObject.set(x, "IngestionInputConfiguration", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchema(value: InlineDataSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setServerSideKmsKeyId(value: KmsKeyArn): Self = StObject.set(x, "ServerSideKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerSideKmsKeyIdUndefined: Self = StObject.set(x, "ServerSideKmsKeyId", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
