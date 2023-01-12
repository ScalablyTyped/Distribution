package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBatchPredictionInput extends StObject {
  
  /**
    * The ID assigned to the BatchPrediction during creation.
    */
  var BatchPredictionId: EntityId
  
  /**
    * A new user-supplied name or description of the BatchPrediction.
    */
  var BatchPredictionName: EntityName
}
object UpdateBatchPredictionInput {
  
  inline def apply(BatchPredictionId: EntityId, BatchPredictionName: EntityName): UpdateBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any], BatchPredictionName = BatchPredictionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchPredictionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBatchPredictionInput] (val x: Self) extends AnyVal {
    
    inline def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
    
    inline def setBatchPredictionName(value: EntityName): Self = StObject.set(x, "BatchPredictionName", value.asInstanceOf[js.Any])
  }
}
