package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobResult extends StObject {
  
  var job: Job
}
object GetJobResult {
  
  inline def apply(job: Job): GetJobResult = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobResult] (val x: Self) extends AnyVal {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
