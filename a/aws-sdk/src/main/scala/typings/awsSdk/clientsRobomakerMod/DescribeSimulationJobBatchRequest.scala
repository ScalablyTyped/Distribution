package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSimulationJobBatchRequest extends StObject {
  
  /**
    * The id of the batch to describe.
    */
  var batch: Arn
}
object DescribeSimulationJobBatchRequest {
  
  inline def apply(batch: Arn): DescribeSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSimulationJobBatchRequest]
  }
  
  extension [Self <: DescribeSimulationJobBatchRequest](x: Self) {
    
    inline def setBatch(value: Arn): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
  }
}
