package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobRequest extends StObject {
  
  /**
    * The name of the job definition to delete.
    */
  var JobName: NameString
}
object DeleteJobRequest {
  
  inline def apply(JobName: NameString): DeleteJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
  }
}
