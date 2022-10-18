package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTemplateRequest extends StObject {
  
  /**
    * The name of the template to be deleted.
    */
  var TemplateName: typings.awsSdk.clientsSesMod.TemplateName
}
object DeleteTemplateRequest {
  
  inline def apply(TemplateName: TemplateName): DeleteTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTemplateRequest]
  }
  
  extension [Self <: DeleteTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
