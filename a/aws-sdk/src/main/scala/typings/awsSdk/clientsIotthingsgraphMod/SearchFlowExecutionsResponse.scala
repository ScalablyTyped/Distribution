package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFlowExecutionsResponse extends StObject {
  
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that contain summary information about each workflow execution in the result set.
    */
  var summaries: js.UndefOr[FlowExecutionSummaries] = js.undefined
}
object SearchFlowExecutionsResponse {
  
  inline def apply(): SearchFlowExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFlowExecutionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFlowExecutionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSummaries(value: FlowExecutionSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: FlowExecutionSummary*): Self = StObject.set(x, "summaries", js.Array(value*))
  }
}
