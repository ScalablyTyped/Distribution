package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateJobOutput extends StObject {
  
  /**
    * The ID of the job.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the location of where the select results are stored.
    */
  var jobOutputPath: js.UndefOr[String] = js.undefined
  
  /**
    * The relative URI path of the job.
    */
  var location: js.UndefOr[String] = js.undefined
}
object InitiateJobOutput {
  
  inline def apply(): InitiateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateJobOutput]
  }
  
  extension [Self <: InitiateJobOutput](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setJobOutputPath(value: String): Self = StObject.set(x, "jobOutputPath", value.asInstanceOf[js.Any])
    
    inline def setJobOutputPathUndefined: Self = StObject.set(x, "jobOutputPath", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
