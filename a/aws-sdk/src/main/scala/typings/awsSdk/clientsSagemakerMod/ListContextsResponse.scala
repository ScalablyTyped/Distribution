package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContextsResponse extends StObject {
  
  /**
    * A list of contexts and their properties.
    */
  var ContextSummaries: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContextSummaries] = js.undefined
  
  /**
    * A token for getting the next set of contexts, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListContextsResponse {
  
  inline def apply(): ListContextsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContextsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContextsResponse] (val x: Self) extends AnyVal {
    
    inline def setContextSummaries(value: ContextSummaries): Self = StObject.set(x, "ContextSummaries", value.asInstanceOf[js.Any])
    
    inline def setContextSummariesUndefined: Self = StObject.set(x, "ContextSummaries", js.undefined)
    
    inline def setContextSummariesVarargs(value: ContextSummary*): Self = StObject.set(x, "ContextSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
