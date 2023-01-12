package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobTemplateRequest extends StObject {
  
  /**
    * The ID of the job template that will be deleted.
    */
  var id: ResourceIdString
}
object DeleteJobTemplateRequest {
  
  inline def apply(id: ResourceIdString): DeleteJobTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteJobTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
