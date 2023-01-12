package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataIngestionJobsResponse extends StObject {
  
  /**
    * Specifies information about the specific data ingestion job, including dataset name and status. 
    */
  var DataIngestionJobSummaries: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DataIngestionJobSummaries] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of data ingestion jobs. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListDataIngestionJobsResponse {
  
  inline def apply(): ListDataIngestionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataIngestionJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataIngestionJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setDataIngestionJobSummaries(value: DataIngestionJobSummaries): Self = StObject.set(x, "DataIngestionJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setDataIngestionJobSummariesUndefined: Self = StObject.set(x, "DataIngestionJobSummaries", js.undefined)
    
    inline def setDataIngestionJobSummariesVarargs(value: DataIngestionJobSummary*): Self = StObject.set(x, "DataIngestionJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
