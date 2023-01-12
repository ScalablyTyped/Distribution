package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobTemplateRequest extends StObject {
  
  /**
    * The unique identifier of the job template to delete.
    */
  var jobTemplateId: JobTemplateId
}
object DeleteJobTemplateRequest {
  
  inline def apply(jobTemplateId: JobTemplateId): DeleteJobTemplateRequest = {
    val __obj = js.Dynamic.literal(jobTemplateId = jobTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteJobTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setJobTemplateId(value: JobTemplateId): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
  }
}
