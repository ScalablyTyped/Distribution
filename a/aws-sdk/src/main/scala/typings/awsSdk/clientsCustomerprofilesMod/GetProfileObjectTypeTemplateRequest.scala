package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProfileObjectTypeTemplateRequest extends StObject {
  
  /**
    * A unique identifier for the object template.
    */
  var TemplateId: name
}
object GetProfileObjectTypeTemplateRequest {
  
  inline def apply(TemplateId: name): GetProfileObjectTypeTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileObjectTypeTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProfileObjectTypeTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateId(value: name): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
  }
}
