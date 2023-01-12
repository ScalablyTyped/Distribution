package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeSimulationJobResponse extends StObject {
  
  /**
    * A list of simulation jobs.
    */
  var jobs: js.UndefOr[SimulationJobs] = js.undefined
  
  /**
    * A list of unprocessed simulation job Amazon Resource Names (ARNs).
    */
  var unprocessedJobs: js.UndefOr[Arns] = js.undefined
}
object BatchDescribeSimulationJobResponse {
  
  inline def apply(): BatchDescribeSimulationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDescribeSimulationJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDescribeSimulationJobResponse] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: SimulationJobs): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SimulationJob*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setUnprocessedJobs(value: Arns): Self = StObject.set(x, "unprocessedJobs", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedJobsUndefined: Self = StObject.set(x, "unprocessedJobs", js.undefined)
    
    inline def setUnprocessedJobsVarargs(value: Arn*): Self = StObject.set(x, "unprocessedJobs", js.Array(value*))
  }
}
