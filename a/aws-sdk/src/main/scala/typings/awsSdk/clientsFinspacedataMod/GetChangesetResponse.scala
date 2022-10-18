package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangesetResponse extends StObject {
  
  /**
    * Beginning time from which the Changeset is active. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var activeFromTimestamp: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Time until which the Changeset is active. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var activeUntilTimestamp: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Type that indicates how a Changeset is applied to a Dataset.    REPLACE – Changeset is considered as a replacement to all prior loaded Changesets.    APPEND – Changeset is considered as an addition to the end of all prior loaded Changesets.    MODIFY – Changeset is considered as a replacement to a specific prior ingested Changeset.  
    */
  var changeType: js.UndefOr[ChangeType] = js.undefined
  
  /**
    * The ARN identifier of the Changeset.
    */
  var changesetArn: js.UndefOr[ChangesetArn] = js.undefined
  
  /**
    * The unique identifier for a Changeset.
    */
  var changesetId: js.UndefOr[ChangesetId] = js.undefined
  
  /**
    * The timestamp at which the Changeset was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var createTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * The unique identifier for the FinSpace Dataset where the Changeset is created.
    */
  var datasetId: js.UndefOr[DatasetId] = js.undefined
  
  /**
    * The structure with error messages.
    */
  var errorInfo: js.UndefOr[ChangesetErrorInfo] = js.undefined
  
  /**
    * Structure of the source file(s).
    */
  var formatParams: js.UndefOr[FormatParams] = js.undefined
  
  /**
    * Options that define the location of the data being ingested.
    */
  var sourceParams: js.UndefOr[SourceParams] = js.undefined
  
  /**
    * The status of Changeset creation operation.
    */
  var status: js.UndefOr[IngestionStatus] = js.undefined
  
  /**
    * The unique identifier of the updated Changeset.
    */
  var updatedByChangesetId: js.UndefOr[ChangesetId] = js.undefined
  
  /**
    * The unique identifier of the Changeset that is being updated.
    */
  var updatesChangesetId: js.UndefOr[ChangesetId] = js.undefined
}
object GetChangesetResponse {
  
  inline def apply(): GetChangesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChangesetResponse]
  }
  
  extension [Self <: GetChangesetResponse](x: Self) {
    
    inline def setActiveFromTimestamp(value: TimestampEpoch): Self = StObject.set(x, "activeFromTimestamp", value.asInstanceOf[js.Any])
    
    inline def setActiveFromTimestampUndefined: Self = StObject.set(x, "activeFromTimestamp", js.undefined)
    
    inline def setActiveUntilTimestamp(value: TimestampEpoch): Self = StObject.set(x, "activeUntilTimestamp", value.asInstanceOf[js.Any])
    
    inline def setActiveUntilTimestampUndefined: Self = StObject.set(x, "activeUntilTimestamp", js.undefined)
    
    inline def setChangeType(value: ChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setChangesetArn(value: ChangesetArn): Self = StObject.set(x, "changesetArn", value.asInstanceOf[js.Any])
    
    inline def setChangesetArnUndefined: Self = StObject.set(x, "changesetArn", js.undefined)
    
    inline def setChangesetId(value: ChangesetId): Self = StObject.set(x, "changesetId", value.asInstanceOf[js.Any])
    
    inline def setChangesetIdUndefined: Self = StObject.set(x, "changesetId", js.undefined)
    
    inline def setCreateTime(value: TimestampEpoch): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setErrorInfo(value: ChangesetErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setFormatParams(value: FormatParams): Self = StObject.set(x, "formatParams", value.asInstanceOf[js.Any])
    
    inline def setFormatParamsUndefined: Self = StObject.set(x, "formatParams", js.undefined)
    
    inline def setSourceParams(value: SourceParams): Self = StObject.set(x, "sourceParams", value.asInstanceOf[js.Any])
    
    inline def setSourceParamsUndefined: Self = StObject.set(x, "sourceParams", js.undefined)
    
    inline def setStatus(value: IngestionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdatedByChangesetId(value: ChangesetId): Self = StObject.set(x, "updatedByChangesetId", value.asInstanceOf[js.Any])
    
    inline def setUpdatedByChangesetIdUndefined: Self = StObject.set(x, "updatedByChangesetId", js.undefined)
    
    inline def setUpdatesChangesetId(value: ChangesetId): Self = StObject.set(x, "updatesChangesetId", value.asInstanceOf[js.Any])
    
    inline def setUpdatesChangesetIdUndefined: Self = StObject.set(x, "updatesChangesetId", js.undefined)
  }
}
