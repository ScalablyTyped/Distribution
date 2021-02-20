package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAnalyzersResponse extends StObject {
  
  /**
    * The analyzers retrieved.
    */
  var analyzers: AnalyzersList = js.native
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}
object ListAnalyzersResponse {
  
  @scala.inline
  def apply(analyzers: AnalyzersList): ListAnalyzersResponse = {
    val __obj = js.Dynamic.literal(analyzers = analyzers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzersResponse]
  }
  
  @scala.inline
  implicit class ListAnalyzersResponseMutableBuilder[Self <: ListAnalyzersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzers(value: AnalyzersList): Self = StObject.set(x, "analyzers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzersVarargs(value: AnalyzerSummary*): Self = StObject.set(x, "analyzers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
