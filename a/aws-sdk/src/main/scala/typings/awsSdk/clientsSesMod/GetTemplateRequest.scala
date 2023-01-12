package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateRequest extends StObject {
  
  /**
    * The name of the template you want to retrieve.
    */
  var TemplateName: typings.awsSdk.clientsSesMod.TemplateName
}
object GetTemplateRequest {
  
  inline def apply(TemplateName: TemplateName): GetTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
