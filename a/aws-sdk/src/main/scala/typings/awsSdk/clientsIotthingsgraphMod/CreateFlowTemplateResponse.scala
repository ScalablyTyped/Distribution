package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowTemplateResponse extends StObject {
  
  /**
    * The summary object that describes the created workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.undefined
}
object CreateFlowTemplateResponse {
  
  inline def apply(): CreateFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowTemplateResponse]
  }
  
  extension [Self <: CreateFlowTemplateResponse](x: Self) {
    
    inline def setSummary(value: FlowTemplateSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
