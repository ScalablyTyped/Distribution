package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataViewRequest extends StObject {
  
  /**
    * Beginning time to use for the Dataview. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var asOfTimestamp: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Flag to indicate Dataview should be updated automatically.
    */
  var autoUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The unique Dataset identifier that is used to create a Dataview.
    */
  var datasetId: DatasetId
  
  /**
    * Options that define the destination type for the Dataview.
    */
  var destinationTypeParams: DataViewDestinationTypeParams
  
  /**
    * Ordered set of column names used to partition data.
    */
  var partitionColumns: js.UndefOr[PartitionColumnList] = js.undefined
  
  /**
    * Columns to be used for sorting the data.
    */
  var sortColumns: js.UndefOr[SortColumnList] = js.undefined
}
object CreateDataViewRequest {
  
  inline def apply(datasetId: DatasetId, destinationTypeParams: DataViewDestinationTypeParams): CreateDataViewRequest = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], destinationTypeParams = destinationTypeParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataViewRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDataViewRequest] (val x: Self) extends AnyVal {
    
    inline def setAsOfTimestamp(value: TimestampEpoch): Self = StObject.set(x, "asOfTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAsOfTimestampUndefined: Self = StObject.set(x, "asOfTimestamp", js.undefined)
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeParams(value: DataViewDestinationTypeParams): Self = StObject.set(x, "destinationTypeParams", value.asInstanceOf[js.Any])
    
    inline def setPartitionColumns(value: PartitionColumnList): Self = StObject.set(x, "partitionColumns", value.asInstanceOf[js.Any])
    
    inline def setPartitionColumnsUndefined: Self = StObject.set(x, "partitionColumns", js.undefined)
    
    inline def setPartitionColumnsVarargs(value: StringValueLength1to255_ *): Self = StObject.set(x, "partitionColumns", js.Array(value*))
    
    inline def setSortColumns(value: SortColumnList): Self = StObject.set(x, "sortColumns", value.asInstanceOf[js.Any])
    
    inline def setSortColumnsUndefined: Self = StObject.set(x, "sortColumns", js.undefined)
    
    inline def setSortColumnsVarargs(value: StringValueLength1to255_ *): Self = StObject.set(x, "sortColumns", js.Array(value*))
  }
}
