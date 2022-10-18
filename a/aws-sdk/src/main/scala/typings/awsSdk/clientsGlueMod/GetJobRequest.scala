package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRequest extends StObject {
  
  /**
    * The name of the job definition to retrieve.
    */
  var JobName: NameString
}
object GetJobRequest {
  
  inline def apply(JobName: NameString): GetJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRequest]
  }
  
  extension [Self <: GetJobRequest](x: Self) {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
  }
}
