package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperimentTemplatesResponse extends StObject {
  
  /**
    * The experiment templates.
    */
  var experimentTemplates: js.UndefOr[ExperimentTemplateSummaryList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListExperimentTemplatesResponse {
  
  inline def apply(): ListExperimentTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentTemplatesResponse]
  }
  
  extension [Self <: ListExperimentTemplatesResponse](x: Self) {
    
    inline def setExperimentTemplates(value: ExperimentTemplateSummaryList): Self = StObject.set(x, "experimentTemplates", value.asInstanceOf[js.Any])
    
    inline def setExperimentTemplatesUndefined: Self = StObject.set(x, "experimentTemplates", js.undefined)
    
    inline def setExperimentTemplatesVarargs(value: ExperimentTemplateSummary*): Self = StObject.set(x, "experimentTemplates", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
