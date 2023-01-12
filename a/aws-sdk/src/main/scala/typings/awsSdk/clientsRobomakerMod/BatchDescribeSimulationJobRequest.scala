package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeSimulationJobRequest extends StObject {
  
  /**
    * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
    */
  var jobs: Arns
}
object BatchDescribeSimulationJobRequest {
  
  inline def apply(jobs: Arns): BatchDescribeSimulationJobRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeSimulationJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDescribeSimulationJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: Arns): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: Arn*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
