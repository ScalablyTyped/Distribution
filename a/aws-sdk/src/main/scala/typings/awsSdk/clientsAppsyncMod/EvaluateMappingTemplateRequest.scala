package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateMappingTemplateRequest extends StObject {
  
  /**
    * The map that holds all of the contextual information for your resolver invocation. A context is required for this action.
    */
  var context: Context
  
  /**
    * The mapping template; this can be a request or response template. A template is required for this action.
    */
  var template: Template
}
object EvaluateMappingTemplateRequest {
  
  inline def apply(context: Context, template: Template): EvaluateMappingTemplateRequest = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateMappingTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluateMappingTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
