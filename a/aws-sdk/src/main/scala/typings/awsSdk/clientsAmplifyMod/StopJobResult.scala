package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopJobResult extends StObject {
  
  /**
    *  The summary for the job. 
    */
  var jobSummary: JobSummary
}
object StopJobResult {
  
  inline def apply(jobSummary: JobSummary): StopJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobResult]
  }
  
  extension [Self <: StopJobResult](x: Self) {
    
    inline def setJobSummary(value: JobSummary): Self = StObject.set(x, "jobSummary", value.asInstanceOf[js.Any])
  }
}
