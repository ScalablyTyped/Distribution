package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictInput extends StObject {
  
  /**
    * A unique identifier of the MLModel.
    */
  var MLModelId: EntityId
  
  var PredictEndpoint: VipURL
  
  var Record: typings.awsSdk.clientsMachinelearningMod.Record
}
object PredictInput {
  
  inline def apply(MLModelId: EntityId, PredictEndpoint: VipURL, Record: Record): PredictInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any], PredictEndpoint = PredictEndpoint.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictInput] (val x: Self) extends AnyVal {
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    inline def setPredictEndpoint(value: VipURL): Self = StObject.set(x, "PredictEndpoint", value.asInstanceOf[js.Any])
    
    inline def setRecord(value: Record): Self = StObject.set(x, "Record", value.asInstanceOf[js.Any])
  }
}
