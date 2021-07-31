package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobResult extends StObject {
  
  var jobSummary: JobSummary
}
object DeleteJobResult {
  
  @scala.inline
  def apply(jobSummary: JobSummary): DeleteJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobResult]
  }
  
  @scala.inline
  implicit class DeleteJobResultMutableBuilder[Self <: DeleteJobResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobSummary(value: JobSummary): Self = StObject.set(x, "jobSummary", value.asInstanceOf[js.Any])
  }
}
