package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFlowTemplatesResponse extends StObject {
  
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that contain summary information about each workflow in the result set.
    */
  var summaries: js.UndefOr[FlowTemplateSummaries] = js.undefined
}
object SearchFlowTemplatesResponse {
  
  inline def apply(): SearchFlowTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFlowTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFlowTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSummaries(value: FlowTemplateSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: FlowTemplateSummary*): Self = StObject.set(x, "summaries", js.Array(value*))
  }
}
