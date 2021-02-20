package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListArchiveRulesRequest extends StObject {
  
  /**
    * The name of the analyzer to retrieve rules from.
    */
  var analyzerName: Name = js.native
  
  /**
    * The maximum number of results to return in the request.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}
object ListArchiveRulesRequest {
  
  @scala.inline
  def apply(analyzerName: Name): ListArchiveRulesRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArchiveRulesRequest]
  }
  
  @scala.inline
  implicit class ListArchiveRulesRequestMutableBuilder[Self <: ListArchiveRulesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
