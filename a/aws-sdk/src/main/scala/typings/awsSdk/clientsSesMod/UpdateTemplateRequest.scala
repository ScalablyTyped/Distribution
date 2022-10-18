package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplateRequest extends StObject {
  
  var Template: typings.awsSdk.clientsSesMod.Template
}
object UpdateTemplateRequest {
  
  inline def apply(Template: Template): UpdateTemplateRequest = {
    val __obj = js.Dynamic.literal(Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateRequest]
  }
  
  extension [Self <: UpdateTemplateRequest](x: Self) {
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
  }
}
