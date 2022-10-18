package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataIngestionJobResponse extends StObject {
  
  /**
    * The time at which the data ingestion job was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Indicates the latest timestamp corresponding to data that was successfully ingested during this specific ingestion job. 
    */
  var DataEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Gives statistics about a completed ingestion job. These statistics primarily relate to quantifying incorrect data such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats, InsufficientSensorData, and DuplicateTimeStamps. 
    */
  var DataQualitySummary: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DataQualitySummary] = js.undefined
  
  /**
    *  Indicates the earliest timestamp corresponding to data that was successfully ingested during this specific ingestion job. 
    */
  var DataStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset being used in the data ingestion job. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetArn] = js.undefined
  
  /**
    * Specifies the reason for failure when a data ingestion job has failed. 
    */
  var FailedReason: js.UndefOr[BoundedLengthString] = js.undefined
  
  /**
    *  Indicates the size of the ingested dataset. 
    */
  var IngestedDataSize: js.UndefOr[DataSizeInBytes] = js.undefined
  
  var IngestedFilesSummary: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.IngestedFilesSummary] = js.undefined
  
  /**
    * Specifies the S3 location configuration for the data input for the data ingestion job. 
    */
  var IngestionInputConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.IngestionInputConfiguration] = js.undefined
  
  /**
    * Indicates the job ID of the data ingestion job. 
    */
  var JobId: js.UndefOr[IngestionJobId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source being ingested. 
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Indicates the status of the DataIngestionJob operation. 
    */
  var Status: js.UndefOr[IngestionJobStatus] = js.undefined
  
  /**
    *  Provides details about status of the ingestion job that is currently in progress. 
    */
  var StatusDetail: js.UndefOr[BoundedLengthString] = js.undefined
}
object DescribeDataIngestionJobResponse {
  
  inline def apply(): DescribeDataIngestionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataIngestionJobResponse]
  }
  
  extension [Self <: DescribeDataIngestionJobResponse](x: Self) {
    
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
    
    inline def setFailedReason(value: BoundedLengthString): Self = StObject.set(x, "FailedReason", value.asInstanceOf[js.Any])
    
    inline def setFailedReasonUndefined: Self = StObject.set(x, "FailedReason", js.undefined)
    
    inline def setIngestedDataSize(value: DataSizeInBytes): Self = StObject.set(x, "IngestedDataSize", value.asInstanceOf[js.Any])
    
    inline def setIngestedDataSizeUndefined: Self = StObject.set(x, "IngestedDataSize", js.undefined)
    
    inline def setIngestedFilesSummary(value: IngestedFilesSummary): Self = StObject.set(x, "IngestedFilesSummary", value.asInstanceOf[js.Any])
    
    inline def setIngestedFilesSummaryUndefined: Self = StObject.set(x, "IngestedFilesSummary", js.undefined)
    
    inline def setIngestionInputConfiguration(value: IngestionInputConfiguration): Self = StObject.set(x, "IngestionInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIngestionInputConfigurationUndefined: Self = StObject.set(x, "IngestionInputConfiguration", js.undefined)
    
    inline def setJobId(value: IngestionJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStatus(value: IngestionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetail(value: BoundedLengthString): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
