package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobResult extends StObject {
  
  var jobSummary: JobSummary
}
object DeleteJobResult {
  
  inline def apply(jobSummary: JobSummary): DeleteJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobResult]
  }
  
  extension [Self <: DeleteJobResult](x: Self) {
    
    inline def setJobSummary(value: JobSummary): Self = StObject.set(x, "jobSummary", value.asInstanceOf[js.Any])
  }
}
