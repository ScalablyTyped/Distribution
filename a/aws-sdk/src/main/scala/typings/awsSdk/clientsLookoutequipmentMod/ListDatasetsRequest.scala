package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsRequest extends StObject {
  
  /**
    * The beginning of the name of the datasets to be listed. 
    */
  var DatasetNameBeginsWith: js.UndefOr[DatasetName] = js.undefined
  
  /**
    *  Specifies the maximum number of datasets to list. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of datasets. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListDatasetsRequest {
  
  inline def apply(): ListDatasetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatasetsRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetNameBeginsWith(value: DatasetName): Self = StObject.set(x, "DatasetNameBeginsWith", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameBeginsWithUndefined: Self = StObject.set(x, "DatasetNameBeginsWith", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
