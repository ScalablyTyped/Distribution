package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobRunResponse extends StObject {
  
  /**
    * The output displays information about a job run.
    */
  var jobRun: js.UndefOr[JobRun] = js.undefined
}
object DescribeJobRunResponse {
  
  inline def apply(): DescribeJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobRunResponse]
  }
  
  extension [Self <: DescribeJobRunResponse](x: Self) {
    
    inline def setJobRun(value: JobRun): Self = StObject.set(x, "jobRun", value.asInstanceOf[js.Any])
    
    inline def setJobRunUndefined: Self = StObject.set(x, "jobRun", js.undefined)
  }
}
