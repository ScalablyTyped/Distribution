package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobResponse extends StObject {
  
  /**
    * The requested job definition.
    */
  var Job: js.UndefOr[typings.awsSdk.clientsGlueMod.Job] = js.undefined
}
object GetJobResponse {
  
  inline def apply(): GetJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobResponse]
  }
  
  extension [Self <: GetJobResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
