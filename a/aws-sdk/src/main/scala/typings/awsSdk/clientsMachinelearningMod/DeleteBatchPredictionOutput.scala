package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBatchPredictionOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction. This value should be identical to the value of the BatchPredictionID in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
}
object DeleteBatchPredictionOutput {
  
  inline def apply(): DeleteBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBatchPredictionOutput]
  }
  
  extension [Self <: DeleteBatchPredictionOutput](x: Self) {
    
    inline def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
    
    inline def setBatchPredictionIdUndefined: Self = StObject.set(x, "BatchPredictionId", js.undefined)
  }
}
