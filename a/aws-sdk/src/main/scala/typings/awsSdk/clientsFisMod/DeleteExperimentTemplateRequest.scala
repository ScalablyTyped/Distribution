package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExperimentTemplateRequest extends StObject {
  
  /**
    * The ID of the experiment template.
    */
  var id: ExperimentTemplateId
}
object DeleteExperimentTemplateRequest {
  
  inline def apply(id: ExperimentTemplateId): DeleteExperimentTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExperimentTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteExperimentTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ExperimentTemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
