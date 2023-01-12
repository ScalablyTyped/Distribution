package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsResponse extends StObject {
  
  /**
    * Provides information about the specified dataset, including creation time, dataset ARN, and status. 
    */
  var DatasetSummaries: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DatasetSummaries] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of datasets. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListDatasetsResponse {
  
  inline def apply(): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatasetsResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetSummaries(value: DatasetSummaries): Self = StObject.set(x, "DatasetSummaries", value.asInstanceOf[js.Any])
    
    inline def setDatasetSummariesUndefined: Self = StObject.set(x, "DatasetSummaries", js.undefined)
    
    inline def setDatasetSummariesVarargs(value: DatasetSummary*): Self = StObject.set(x, "DatasetSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
