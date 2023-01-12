package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMigrationWorkflowTemplatesResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The summary of the template.
    */
  var templateSummary: TemplateSummaryList
}
object ListMigrationWorkflowTemplatesResponse {
  
  inline def apply(templateSummary: TemplateSummaryList): ListMigrationWorkflowTemplatesResponse = {
    val __obj = js.Dynamic.literal(templateSummary = templateSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMigrationWorkflowTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMigrationWorkflowTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplateSummary(value: TemplateSummaryList): Self = StObject.set(x, "templateSummary", value.asInstanceOf[js.Any])
    
    inline def setTemplateSummaryVarargs(value: TemplateSummary*): Self = StObject.set(x, "templateSummary", js.Array(value*))
  }
}
