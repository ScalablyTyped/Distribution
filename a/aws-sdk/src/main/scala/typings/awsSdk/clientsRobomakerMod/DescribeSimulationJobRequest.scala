package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSimulationJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation job to be described.
    */
  var job: Arn
}
object DescribeSimulationJobRequest {
  
  inline def apply(job: Arn): DescribeSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSimulationJobRequest]
  }
  
  extension [Self <: DescribeSimulationJobRequest](x: Self) {
    
    inline def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
