package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExperimentTemplateRequest extends StObject {
  
  /**
    * The ID of the experiment template.
    */
  var id: ExperimentTemplateId
}
object GetExperimentTemplateRequest {
  
  inline def apply(id: ExperimentTemplateId): GetExperimentTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExperimentTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetExperimentTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ExperimentTemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
