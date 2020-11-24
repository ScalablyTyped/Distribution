package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAnalyzersResponse extends js.Object {
  
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
  implicit class ListAnalyzersResponseOps[Self <: ListAnalyzersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalyzersVarargs(value: AnalyzerSummary*): Self = this.set("analyzers", js.Array(value :_*))
    
    @scala.inline
    def setAnalyzers(value: AnalyzersList): Self = this.set("analyzers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
