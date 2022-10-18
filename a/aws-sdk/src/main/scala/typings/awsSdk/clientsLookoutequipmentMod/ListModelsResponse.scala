package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelsResponse extends StObject {
  
  /**
    * Provides information on the specified model, including created time, model and dataset ARNs, and status. 
    */
  var ModelSummaries: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.ModelSummaries] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of ML models. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListModelsResponse {
  
  inline def apply(): ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsResponse]
  }
  
  extension [Self <: ListModelsResponse](x: Self) {
    
    inline def setModelSummaries(value: ModelSummaries): Self = StObject.set(x, "ModelSummaries", value.asInstanceOf[js.Any])
    
    inline def setModelSummariesUndefined: Self = StObject.set(x, "ModelSummaries", js.undefined)
    
    inline def setModelSummariesVarargs(value: ModelSummary*): Self = StObject.set(x, "ModelSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
