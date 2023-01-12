package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFlowTemplateResponse extends StObject {
  
  /**
    * The object that describes the specified workflow.
    */
  var description: js.UndefOr[FlowTemplateDescription] = js.undefined
}
object GetFlowTemplateResponse {
  
  inline def apply(): GetFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFlowTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFlowTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: FlowTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
