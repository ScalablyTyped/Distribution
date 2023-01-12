package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsOutput extends StObject {
  
  /**
    * A list of job objects. Each job object contains metadata describing the job.
    */
  var JobList: js.UndefOr[typings.awsSdk.clientsGlacierMod.JobList] = js.undefined
  
  /**
    *  An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of the results started in a previous List Jobs request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ListJobsOutput {
  
  inline def apply(): ListJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobsOutput] (val x: Self) extends AnyVal {
    
    inline def setJobList(value: JobList): Self = StObject.set(x, "JobList", value.asInstanceOf[js.Any])
    
    inline def setJobListUndefined: Self = StObject.set(x, "JobList", js.undefined)
    
    inline def setJobListVarargs(value: GlacierJobDescription*): Self = StObject.set(x, "JobList", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
