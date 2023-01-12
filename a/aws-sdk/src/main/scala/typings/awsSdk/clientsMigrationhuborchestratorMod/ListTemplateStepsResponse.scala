package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateStepsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The list of summaries of steps in a template.
    */
  var templateStepSummaryList: js.UndefOr[TemplateStepSummaryList] = js.undefined
}
object ListTemplateStepsResponse {
  
  inline def apply(): ListTemplateStepsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateStepsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplateStepsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplateStepSummaryList(value: TemplateStepSummaryList): Self = StObject.set(x, "templateStepSummaryList", value.asInstanceOf[js.Any])
    
    inline def setTemplateStepSummaryListUndefined: Self = StObject.set(x, "templateStepSummaryList", js.undefined)
    
    inline def setTemplateStepSummaryListVarargs(value: TemplateStepSummary*): Self = StObject.set(x, "templateStepSummaryList", js.Array(value*))
  }
}
