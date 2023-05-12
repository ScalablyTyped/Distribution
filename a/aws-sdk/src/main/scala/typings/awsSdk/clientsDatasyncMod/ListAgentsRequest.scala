package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAgentsRequest extends StObject {
  
  /**
    * Specifies the maximum number of DataSync agents to list in a response. By default, a response shows a maximum of 100 agents.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsDatasyncMod.MaxResults] = js.undefined
  
  /**
    * Specifies an opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDatasyncMod.NextToken] = js.undefined
}
object ListAgentsRequest {
  
  inline def apply(): ListAgentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAgentsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
