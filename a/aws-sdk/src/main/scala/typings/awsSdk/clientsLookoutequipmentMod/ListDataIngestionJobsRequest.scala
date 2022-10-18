package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataIngestionJobsRequest extends StObject {
  
  /**
    * The name of the dataset being used for the data ingestion job. 
    */
  var DatasetName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetName] = js.undefined
  
  /**
    *  Specifies the maximum number of data ingestion jobs to list. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    * An opaque pagination token indicating where to continue the listing of data ingestion jobs. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
  
  /**
    * Indicates the status of the data ingestion job. 
    */
  var Status: js.UndefOr[IngestionJobStatus] = js.undefined
}
object ListDataIngestionJobsRequest {
  
  inline def apply(): ListDataIngestionJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataIngestionJobsRequest]
  }
  
  extension [Self <: ListDataIngestionJobsRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: IngestionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
