package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    *  The parameter is true if statistics need to be generated from the observation data. 
    */
  var ComputeStatistics: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.ComputeStatistics] = js.undefined
  
  var ComputeTime: js.UndefOr[LongType] = js.undefined
  
  /**
    * The time that the DataSource was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The AWS user account from which the DataSource was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
  
  /**
    * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a DataSource.
    */
  var DataLocationS3: js.UndefOr[S3Url] = js.undefined
  
  /**
    * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
    */
  var DataRearrangement: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.DataRearrangement] = js.undefined
  
  /**
    * The total number of observations contained in the data files that the DataSource references.
    */
  var DataSizeInBytes: js.UndefOr[LongType] = js.undefined
  
  /**
    * The ID that is assigned to the DataSource during creation.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
  
  var FinishedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the most recent details about creating the DataSource.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.Message] = js.undefined
  
  /**
    * A user-supplied name or description of the DataSource.
    */
  var Name: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The number of data files referenced by the DataSource.
    */
  var NumberOfFiles: js.UndefOr[LongType] = js.undefined
  
  var RDSMetadata: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.RDSMetadata] = js.undefined
  
  var RedshiftMetadata: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.RedshiftMetadata] = js.undefined
  
  var RoleARN: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.RoleARN] = js.undefined
  
  var StartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of the DataSource. This element can have one of the following values:    PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a DataSource.   INPROGRESS - The creation process is underway.   FAILED - The request to create a DataSource did not run to completion. It is not usable.   COMPLETED - The creation process completed successfully.   DELETED - The DataSource is marked as deleted. It is not usable.  
    */
  var Status: js.UndefOr[EntityStatus] = js.undefined
}
object DataSource {
  
  inline def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    inline def setComputeStatistics(value: ComputeStatistics): Self = StObject.set(x, "ComputeStatistics", value.asInstanceOf[js.Any])
    
    inline def setComputeStatisticsUndefined: Self = StObject.set(x, "ComputeStatistics", js.undefined)
    
    inline def setComputeTime(value: LongType): Self = StObject.set(x, "ComputeTime", value.asInstanceOf[js.Any])
    
    inline def setComputeTimeUndefined: Self = StObject.set(x, "ComputeTime", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setCreatedByIamUser(value: AwsUserArn): Self = StObject.set(x, "CreatedByIamUser", value.asInstanceOf[js.Any])
    
    inline def setCreatedByIamUserUndefined: Self = StObject.set(x, "CreatedByIamUser", js.undefined)
    
    inline def setDataLocationS3(value: S3Url): Self = StObject.set(x, "DataLocationS3", value.asInstanceOf[js.Any])
    
    inline def setDataLocationS3Undefined: Self = StObject.set(x, "DataLocationS3", js.undefined)
    
    inline def setDataRearrangement(value: DataRearrangement): Self = StObject.set(x, "DataRearrangement", value.asInstanceOf[js.Any])
    
    inline def setDataRearrangementUndefined: Self = StObject.set(x, "DataRearrangement", js.undefined)
    
    inline def setDataSizeInBytes(value: LongType): Self = StObject.set(x, "DataSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setDataSizeInBytesUndefined: Self = StObject.set(x, "DataSizeInBytes", js.undefined)
    
    inline def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    inline def setFinishedAt(value: js.Date): Self = StObject.set(x, "FinishedAt", value.asInstanceOf[js.Any])
    
    inline def setFinishedAtUndefined: Self = StObject.set(x, "FinishedAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNumberOfFiles(value: LongType): Self = StObject.set(x, "NumberOfFiles", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFilesUndefined: Self = StObject.set(x, "NumberOfFiles", js.undefined)
    
    inline def setRDSMetadata(value: RDSMetadata): Self = StObject.set(x, "RDSMetadata", value.asInstanceOf[js.Any])
    
    inline def setRDSMetadataUndefined: Self = StObject.set(x, "RDSMetadata", js.undefined)
    
    inline def setRedshiftMetadata(value: RedshiftMetadata): Self = StObject.set(x, "RedshiftMetadata", value.asInstanceOf[js.Any])
    
    inline def setRedshiftMetadataUndefined: Self = StObject.set(x, "RedshiftMetadata", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    inline def setStatus(value: EntityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
