package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSimulationJobBatchRequest extends StObject {
  
  /**
    * The id of the batch to cancel.
    */
  var batch: Arn
}
object CancelSimulationJobBatchRequest {
  
  inline def apply(batch: Arn): CancelSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSimulationJobBatchRequest]
  }
  
  extension [Self <: CancelSimulationJobBatchRequest](x: Self) {
    
    inline def setBatch(value: Arn): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
  }
}
