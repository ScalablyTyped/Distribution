package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBatchPredictionInput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction.
    */
  var BatchPredictionId: EntityId
}
object DeleteBatchPredictionInput {
  
  inline def apply(BatchPredictionId: EntityId): DeleteBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBatchPredictionInput]
  }
  
  extension [Self <: DeleteBatchPredictionInput](x: Self) {
    
    inline def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
  }
}
