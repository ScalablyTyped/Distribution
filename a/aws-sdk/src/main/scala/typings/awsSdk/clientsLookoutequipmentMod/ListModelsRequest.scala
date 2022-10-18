package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelsRequest extends StObject {
  
  /**
    * The beginning of the name of the dataset of the ML models to be listed. 
    */
  var DatasetNameBeginsWith: js.UndefOr[DatasetName] = js.undefined
  
  /**
    *  Specifies the maximum number of ML models to list. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    * The beginning of the name of the ML models being listed. 
    */
  var ModelNameBeginsWith: js.UndefOr[ModelName] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of ML models. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
  
  /**
    * The status of the ML model. 
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
}
object ListModelsRequest {
  
  inline def apply(): ListModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsRequest]
  }
  
  extension [Self <: ListModelsRequest](x: Self) {
    
    inline def setDatasetNameBeginsWith(value: DatasetName): Self = StObject.set(x, "DatasetNameBeginsWith", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameBeginsWithUndefined: Self = StObject.set(x, "DatasetNameBeginsWith", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModelNameBeginsWith(value: ModelName): Self = StObject.set(x, "ModelNameBeginsWith", value.asInstanceOf[js.Any])
    
    inline def setModelNameBeginsWithUndefined: Self = StObject.set(x, "ModelNameBeginsWith", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
